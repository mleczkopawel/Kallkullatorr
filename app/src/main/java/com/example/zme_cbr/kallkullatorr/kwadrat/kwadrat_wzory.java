package com.example.zme_cbr.kallkullatorr.kwadrat;

import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.zme_cbr.kallkullatorr.GeometryActivity;
import com.example.zme_cbr.kallkullatorr.MainActivity;
import com.example.zme_cbr.kallkullatorr.R;
import com.example.zme_cbr.kallkullatorr.Settings;

public class kwadrat_wzory extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwadrat_wzory);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings){
            context = getApplicationContext();
            Intent intent = new Intent(context, Settings.class);
            startActivity(intent);
        }
        if (id == R.id.action_geometry) {
            context = getApplicationContext();
            Intent intent = new Intent(context, GeometryActivity.class);
            startActivity(intent);
        }
        if (id == R.id.action_calc){
            context = getApplicationContext();
            Intent intent = new Intent(context, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
