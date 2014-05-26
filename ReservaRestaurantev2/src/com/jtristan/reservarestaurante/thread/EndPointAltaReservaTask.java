package com.jtristan.reservarestaurante.thread;


import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.jtristan.reservarestaurantev2.CloudEndpointUtils;
import com.jtristan.reservarestaurantev2.entidades.reservaendpoint.Reservaendpoint;
import com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva;



	
public class EndPointAltaReservaTask extends AsyncTask<Reserva, Integer, Reserva> {
	
	private final static String TAG = EndPointAltaReservaTask.class.getSimpleName();	

	public interface AsyncTaskListener{ void onInit(); void onProgressUpdate(); void onCancel(); void onFinish(Reserva reserva);}
	private AsyncTaskListener asyncTaskListener;
	
	public EndPointAltaReservaTask(AsyncTaskListener asyncTaskListener){
		this.asyncTaskListener = asyncTaskListener;
	}

	protected Reserva doInBackground(Reserva... reservas) {
		
		Reserva reserva=null;
		
		Reservaendpoint.Builder endpointBuilder = new Reservaendpoint.Builder(		
				AndroidHttp.newCompatibleTransport(),
				new JacksonFactory(),
				new HttpRequestInitializer() {
					public void initialize(HttpRequest httpRequest) {
						
					}
				});


		Reservaendpoint endpoint = CloudEndpointUtils.updateBuilder(
				endpointBuilder).build();

		try {			
			reserva = endpoint.insertReserva(reservas[0]).execute();																				
			

		} catch (Exception e) {
			Log.e(TAG, e.getMessage());            
		}		
		return reserva;
	}

	@Override
	protected void onPostExecute(Reserva result) {
		super.onPostExecute(result);
		asyncTaskListener.onFinish(result);
	}

	
	
}


