package dev.suncha.nepalimobiletools;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public int onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int flagforradio=0;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radionamaste:
                if (checked)
                    // set a flag for namaste
                    Toast.makeText(getApplicationContext(), "Namaste", Toast.LENGTH_SHORT).show();
                flagforradio=1;
            case R.id.radioncell:
                if (checked)
                    // set a flag for ncell
                    Toast.makeText(getApplicationContext(), "Ncell", Toast.LENGTH_SHORT).show();
                flagforradio=2;
        }
        return flagforradio;
    }

    public void checkBalance(View view){
        //check the provider
        //dial code to view balance as per provider
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
