package com.jtristan.reservarestaurante.ui;

import java.util.ArrayList;
import java.util.List;

import com.jtristan.reservarestaurante.thread.EndPointOfertaTask;
import com.jtristan.reservarestaurantev2.R;
import com.jtristan.reservarestaurantev2.entidades.ofertaendpoint.model.Oferta;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Muestra todas las ofertas en un listview. Si seleccionas una de ellas te muestra 
 * el restaurante o restaurantes que la tienen.
 * @author josemaria.tristan
 *
 */
public class OfertaActivity extends Activity implements AdapterView.OnItemClickListener{
		
	private final static String TAG = OfertaActivity.class.getSimpleName();
	public final static String BUNDLE_ID_OFERTA = "com.jtristan.reservarestaurante.ui.OfertaActivity.ID";
	
	ListView listView;	
	static List<Oferta> ofertas = new ArrayList<Oferta>();
	static Activity contexto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurantes);
		
		contexto = this;
		listView = (ListView)this.findViewById(R.id.listView);
				
		
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[0]);
    	listView.setAdapter(adaptador); 
    	listView.setOnItemClickListener(this);
    	
    	
    	    	    
		EndPointOfertaTask endPointOfertaTask = new EndPointOfertaTask(new EndPointOfertaTask.AsyncTaskListener() {
			
			@Override
			public void onProgressUpdate() {}
			
			@Override
			public void onInit() {}
			
			@Override
			public void onFinish(List<Oferta> ofertas) {
				String[] arrayOfertas = new String[ofertas.size()];
				int i=0;
				OfertaActivity.ofertas = ofertas;
				for (Oferta oferta: ofertas){
					arrayOfertas[i] = oferta.getDescripcion();
					i++;
				}
		    	listView.setAdapter(new ArrayAdapter<String>(OfertaActivity.contexto, android.R.layout.simple_spinner_item, arrayOfertas));    				
			}
			
			@Override
			public void onCancel() {}
		});
		
		endPointOfertaTask.execute();
								
																		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	/**
	 * Click para ver la carta.
	 */
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		
		Toast.makeText(this, ofertas.get(position).getNombreRestaurante().toString(), Toast.LENGTH_LONG).show();		
										
		
	}
	
	
	

}
