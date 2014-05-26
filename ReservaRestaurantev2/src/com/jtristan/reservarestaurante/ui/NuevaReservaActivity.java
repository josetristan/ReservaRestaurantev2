package com.jtristan.reservarestaurante.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.jtristan.reservarestaurante.thread.EndPointAltaReservaTask;
import com.jtristan.reservarestaurante.thread.EndPointRestauranteTask;
import com.jtristan.reservarestaurante.thread.EndPointUsuarioTask;
import com.jtristan.reservarestaurantev2.R;
import com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva;
import com.jtristan.reservarestaurantev2.entidades.restauranteendpoint.model.Restaurante;
import com.jtristan.reservarestaurantev2.entidades.usuarioendpoint.model.Usuario;


public class NuevaReservaActivity extends Activity implements  OnClickListener, OnItemSelectedListener{
		
	private final static String TAG = NuevaReservaActivity.class.getSimpleName();		
			
	private EditText etUsuario;
	private static Spinner spRestaurante;
	private EditText etFecha;
	private EditText etNumeroComensales;
	private static Spinner spComensal1;
	private static Spinner spComensal2;
	private Button btAceptar;
	private static String[] restaurantesArray = null;
	private static String[] comensalesArray = null;
	private static List<Restaurante> restaurantes;	
	private static List<Usuario> usuarios;
	private Integer restauranteSeleccionado=null;
	private Integer comensal1Seleccionado=null;
	private Integer comensal2Seleccionado=null;
	private Activity contexto;
	EndPointAltaReservaTask reservaTask;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reserva);
		
		contexto = this;
				
		etUsuario = (EditText)this.findViewById(R.id.etUsuario);
		spRestaurante = (Spinner)this.findViewById(R.id.spRestaurante);
		etFecha = (EditText)this.findViewById(R.id.etFecha);
		etNumeroComensales = (EditText)this.findViewById(R.id.etNumeroComensales);
		spComensal1 = (Spinner)this.findViewById(R.id.spComensal1);
		spComensal2 = (Spinner)this.findViewById(R.id.spComensal2);
		btAceptar = (Button)this.findViewById(R.id.btAceptar);
		
	
		btAceptar.setOnClickListener(this);
		spRestaurante.setOnItemSelectedListener(this);
		spComensal1.setOnItemSelectedListener(this);
		spComensal2.setOnItemSelectedListener(this);
				
				
		EndPointRestauranteTask restauranteTask = new EndPointRestauranteTask(new EndPointRestauranteTask.AsyncTaskListener() {
			
			@Override
			public void onProgressUpdate() {}
			
			@Override
			public void onInit() {}
			
			@Override
			public void onFinish(List<Restaurante> restaurantes) {
				
				if (restaurantes!=null){
					NuevaReservaActivity.restaurantes = restaurantes;
					int i=0;
					NuevaReservaActivity.restaurantesArray = new String[restaurantes.size()];
					for (Restaurante restaurante: restaurantes){
						NuevaReservaActivity.restaurantesArray[i] = restaurante.getNombre();
						i++;
					}
				}	
				spRestaurante.setAdapter(getAdaptador(restaurantesArray));
			}
			
			@Override
			public void onCancel() {}
		}); 
		
		restauranteTask.execute();
		
		
		EndPointUsuarioTask comensalTask = new EndPointUsuarioTask(new EndPointUsuarioTask.AsyncTaskListener() {
			
			@Override
			public void onProgressUpdate() {}
			
			@Override
			public void onInit() {}
			
			@Override
			public void onFinish(List<Usuario> usuarios) {
				NuevaReservaActivity.usuarios = usuarios;
				
				int i=0;
				NuevaReservaActivity.comensalesArray = new String[usuarios.size()];
				for (Usuario usuario: usuarios){
					NuevaReservaActivity.comensalesArray[i] = usuario.getNombre() + " " + usuario.getApellidos();
					i++;
				}		
								
				spComensal1.setAdapter(getAdaptador(comensalesArray));
				spComensal2.setAdapter(getAdaptador(comensalesArray));
			}

			@Override
			public void onCancel() {}
			
		});
		
		comensalTask.execute();
		
		reservaTask = new EndPointAltaReservaTask(new EndPointAltaReservaTask.AsyncTaskListener() {
			
			@Override
			public void onProgressUpdate() {}
			
			@Override
			public void onInit() {}
			
			@Override
			public void onFinish(Reserva reserva) {
				if (reserva!=null)
					Toast.makeText(contexto, "Reserva realizada con éxito: " + reserva.getId(), Toast.LENGTH_LONG).show();					
			}
			
			@Override
			public void onCancel() {				}
		});
														    	    
																		
	}

	
	private ArrayAdapter<CharSequence> getAdaptador(CharSequence[] arary) {
		
		ArrayAdapter<CharSequence> adaptador = new ArrayAdapter<CharSequence>(this,
		         android.R.layout.simple_spinner_item, arary);							
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		return adaptador;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btAceptar:
			pasarAEntidad();
			break;		
		}

		
	}

	private void pasarAEntidad() {
					
		
		List<String> nombresComensales = new ArrayList<String>();
		Reserva reserva = new Reserva();
		Usuario usuario;
		reserva.setNumeroPersonas(Integer.parseInt(etNumeroComensales.getText().toString()));	
						
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		Date fecha=null;
		try {
			fecha = sdf.parse(etFecha.getText().toString());
		} catch (ParseException e) {
			Log.e(TAG, e.getMessage());
		}
		
		com.google.api.client.util.DateTime datetime = new com.google.api.client.util.DateTime(fecha);
		
		reserva.setHoraReserva(datetime);
		
		reserva.setNombreUsuario(etUsuario.getText().toString());
		Restaurante restaurante = NuevaReservaActivity.restaurantes.get(restauranteSeleccionado);
		reserva.setNombreRestaurante(restaurante.getNombre());
		reserva.setEstrellas(restaurante.getEstrellas());
		reserva.setDireccionCalle(restaurante.getDireccion().getDireccion());
		reserva.setDireccionTipo(restaurante.getDireccion().getTipo());
		reserva.setDireccionNumero(restaurante.getDireccion().getNumero());
									
		if (comensal1Seleccionado!=null){
			usuario = usuarios.get(comensal1Seleccionado);
			nombresComensales.add(usuario.getNombre() + " " + usuario.getApellidos());			
		}
		if (comensal2Seleccionado!=null){			
			usuario = usuarios.get(comensal2Seleccionado);
			nombresComensales.add(usuario.getNombre() + " " + usuario.getApellidos());
		}
		if (nombresComensales.size()>0){
			reserva.setNombreComensales(nombresComensales);
		}
				
		reservaTask.execute(reserva);
		
		
	}


	@Override
	public void onItemSelected(AdapterView<?> arg0, View view, int posicion, long id) {
		
		switch (arg0.getId()) {
		case R.id.spRestaurante:
			restauranteSeleccionado = posicion;
			break;
		case R.id.spComensal1:
			comensal1Seleccionado = posicion;
			break;
		case R.id.spComensal2:
			comensal2Seleccionado = posicion;
			break;
		default:
			break;
		}
				
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		
	}
	
	
	

	 

}
