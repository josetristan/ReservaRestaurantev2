package com.jtristan.reservarestaurante.thread;

import java.io.IOException;
import java.util.List;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.jtristan.reservarestaurantev2.CloudEndpointUtils;
import com.jtristan.reservarestaurantev2.entidades.restauranteendpoint.Restauranteendpoint;
import com.jtristan.reservarestaurantev2.entidades.restauranteendpoint.model.CollectionResponseRestaurante;
import com.jtristan.reservarestaurantev2.entidades.restauranteendpoint.model.Restaurante;

	
public class EndPointRestauranteTask extends AsyncTask<String, Integer, List<Restaurante>> {
	
	private final static String TAG = EndPointRestauranteTask.class.getSimpleName();	

	public interface AsyncTaskListener{ void onInit(); void onProgressUpdate(); void onCancel(); void onFinish(List<Restaurante> restaurantes);}
	private AsyncTaskListener asyncTaskListener;
	
	public EndPointRestauranteTask(AsyncTaskListener asyncTaskListener){
		this.asyncTaskListener = asyncTaskListener;
	}

	protected List<Restaurante> doInBackground(String... nombres) {

		List<Restaurante> restaurantes=null;
		CollectionResponseRestaurante collectionRestaurante=null;

		Restauranteendpoint.Builder endpointBuilder = new Restauranteendpoint.Builder(
				AndroidHttp.newCompatibleTransport(),
				new JacksonFactory(),
				new HttpRequestInitializer() {
					public void initialize(HttpRequest httpRequest) { }
				});

		
			Restauranteendpoint endpoint = CloudEndpointUtils.updateBuilder(
				endpointBuilder).build();		

		try {
			if (nombres!=null & nombres.length>0){
				collectionRestaurante = endpoint.listRestaurante().setNombre(nombres[0]).execute();
			}else{																							
				collectionRestaurante = endpoint.listRestaurante().execute();				
			}
						
			restaurantes = collectionRestaurante.getItems();


		} catch (IOException e) {
			Log.e(TAG, e.getMessage());            
		}
		return restaurantes;
	}

	@Override
	protected void onPostExecute(List<Restaurante> result) {
		super.onPostExecute(result);
		asyncTaskListener.onFinish(result);
	}
}


