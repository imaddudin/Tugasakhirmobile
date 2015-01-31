package com.Sehat.ayohidupsehat;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JenisActivity extends Activity {
	 public void kk(View v){
		 Intent a= new Intent(getApplicationContext(),Kanker.class);
		 startActivity(a);
	 }
	 public void vertigo(View v){
		 Intent a= new Intent(getApplicationContext(),VertigoActivity.class);
		 startActivity(a);
	 }
	 public void demam(View v){
		 Intent a= new Intent(getApplicationContext(),DemamActivity.class);
		 startActivity(a);
	 }
	 public void asma(View v){
		 Intent a= new Intent(getApplicationContext(),AsmaActivity.class);
		 startActivity(a);
	 }
	 public void amandel (View s){
	    	Intent i= new Intent(getApplicationContext(),AmandelActivity.class);
	    	startActivity(i);
	 }
	 public void aborsi (View s){
		    	Intent i= new Intent(getApplicationContext(),AborsiActivity.class);
		    	startActivity(i);
	    }
	 public void flu(View s){
	    	Intent i= new Intent(getApplicationContext(),FluActivity.class);
	    	startActivity(i);
	 }
	 public void malaria(View s){
	    	Intent i= new Intent(getApplicationContext(),MalariaActivity.class);
	    	startActivity(i);
	 }
	 public void usus(View s){
	    	Intent i= new Intent(getApplicationContext(),UsusBUntuActivity.class);
	    	startActivity(i);
	 }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jenis);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.relativelayout, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jenis, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

	
		
			
			
		}
	}


