package com.jtristan.reservarestaurante.thread;

import java.util.Arrays;
import java.util.List;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.jtristan.reservarestaurantev2.CloudEndpointUtils;
import com.jtristan.reservarestaurantev2.entidades.cartaendpoint.Cartaendpoint;
import com.jtristan.reservarestaurantev2.entidades.cartaendpoint.model.Carta;
import com.jtristan.reservarestaurantev2.entidades.cartaendpoint.model.CollectionResponseCarta;



	
public class EndPointCartaTask extends AsyncTask<String, Integer, List<Carta>> {
	
	private final static String TAG = EndPointOfertaTask.class.getSimpleName();	

	public interface AsyncTaskListener{ void onInit(); void onProgressUpdate(); void onCancel(); void onFinish(List<Carta> carta);}
	private AsyncTaskListener asyncTaskListener;
	
	public EndPointCartaTask(AsyncTaskListener asyncTaskListener){
		this.asyncTaskListener = asyncTaskListener;
	}

	protected List<Carta> doInBackground(String... ids) {

		List<Carta> carta=null;
		
		Cartaendpoint.Builder endpointBuilder = new Cartaendpoint.Builder(		
				AndroidHttp.newCompatibleTransport(),
				new JacksonFactory(),
				new HttpRequestInitializer() {
					public void initialize(HttpRequest httpRequest) {
						
					}
				});


		Cartaendpoint endpoint = CloudEndpointUtils.updateBuilder(
				endpointBuilder).build();

		try {
																	
			CollectionResponseCarta cartas = endpoint.listCarta().setCadenaIds(Arrays.asList(ids)).execute();	
			carta = cartas.getItems();

		} catch (Exception e) {
			Log.e(TAG, e.getMessage());            
		}
		return carta;
	}

	@Override
	protected void onPostExecute(List<Carta> result) {
		super.onPostExecute(result);
		asyncTaskListener.onFinish(result);
	}

	
	
}


