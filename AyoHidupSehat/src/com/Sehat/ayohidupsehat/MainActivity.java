package com.Sehat.ayohidupsehat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void Tips(View amir) {
		// TODO Auto-generated method stub
    	Intent i = new Intent(getApplicationContext(), TipsHidupSehat.class);
    	startActivity(i);
	}
    public void manfaat(View A) {
    	Intent a = new Intent(getApplicationContext(), ManfaatHidupSehat.class);
    	startActivity(a);
    }
        public void l(View z) {
        	Intent k =new Intent(getApplicationContext(),JenisActivity.class);
        	startActivity(k);
    }
    public void kk (View s){
    	Intent i= new Intent(getApplicationContext(),Kanker.class);
    	startActivity(i);
    }
    public void btn (View s){
    	Intent i= new Intent(getApplicationContext(),Kanker.class);
    	startActivity(i);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
}
