package com.example.zme_cbr.kallkullatorr.kolo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.zme_cbr.kallkullatorr.GeometryActivity;
import com.example.zme_cbr.kallkullatorr.MainActivity;
import com.example.zme_cbr.kallkullatorr.R;
import com.example.zme_cbr.kallkullatorr.Settings;

public class KoloActivity extends AppCompatActivity {
    Context context;
    TextView wynik_view;
    int r;
    String rs;
    double wynikw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolo);
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

    public void wzory(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, wzory_kolo.class);
        startActivity(intent);
    }

    public void pole(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kolo_pole.class);
        startActivity(intent);
    }

    public void obwod(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kolo_obwod.class);
        startActivity(intent);
    }

    public void pol_wyca(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kolo_pol_wyca.class);
        startActivity(intent);
    }

    public void pol_wycg(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kolo_pol_wycg.class);
        startActivity(intent);
    }

    public void pol_odca(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kolo_pol_odca.class);
        startActivity(intent);
    }

    public void pol_odcg(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kolo_pol_odcg.class);
        startActivity(intent);
    }
}
