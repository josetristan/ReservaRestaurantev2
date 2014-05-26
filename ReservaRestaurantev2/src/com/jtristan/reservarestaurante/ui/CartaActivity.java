package com.jtristan.reservarestaurante.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.jtristan.reservarestaurante.adapter.CartaAdapter;
import com.jtristan.reservarestaurante.thread.EndPointCartaTask;
import com.jtristan.reservarestaurante.thread.EndPointCartaTask.AsyncTaskListener;
import com.jtristan.reservarestaurantev2.R;
import com.jtristan.reservarestaurantev2.entidades.cartaendpoint.model.Carta;

public class CartaActivity extends Activity implements AsyncTaskListener{
		
		private final static String TAG = CartaActivity.class.getSimpleName();
		
		ListView listView;	
 		List<Carta> platos = new ArrayList<Carta>();
		CartaAdapter adaptador;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.carta);
			
			Bundle bundle = this.getIntent().getExtras();
			String[] idsCartas = bundle.getStringArray(RestauranteActivity.BUNDLE_ID_RESTAURANTE);
			
						
			listView = (ListView)this.findViewById(R.id.listView);
			
			adaptador = new CartaAdapter(this, R.layout.carta_adapter, platos);
	    	listView.setAdapter(adaptador); 	    	
	    	    	    
			new EndPointCartaTask(this).execute(idsCartas);
																		
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}

		@Override
		public void onInit() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProgressUpdate() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCancel() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFinish(
				List<Carta> carta) {
			platos = carta;	
			listView.setAdapter(new CartaAdapter(this, R.layout.carta_adapter, platos));
			
		}

		

}
