package com.example.zme_cbr.kallkullatorr.kwadrat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.zme_cbr.kallkullatorr.GeometryActivity;
import com.example.zme_cbr.kallkullatorr.MainActivity;
import com.example.zme_cbr.kallkullatorr.R;
import com.example.zme_cbr.kallkullatorr.Settings;

public class KwadratActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwadrat);
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
        Intent intent = new Intent(context, kwadrat_wzory.class);
        startActivity(intent);
    }

    public void polea(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_polea.class);
        startActivity(intent);
    }

    public void poled(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_poled.class);
        startActivity(intent);
    }

    public void polead(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_polead.class);
        startActivity(intent);
    }


    public void pr_ok_wpi(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_pr_ok_wpi.class);
        startActivity(intent);
    }

    public void pr_ok_opia(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_pr_ok_opia.class);
        startActivity(intent);
    }

    public void pr_ok_opir(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_pr_ok_opir.class);
        startActivity(intent);
    }

    public void pr_ok_opid(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_pr_ok_opid.class);
        startActivity(intent);
    }

    public void dlu_bokr(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_dlu_bokr.class);
        startActivity(intent);
    }

    public void dlu_bokrr(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_dlu_bokrr.class);
        startActivity(intent);
    }

    public void dlu_bokd(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_dlu_bokd.class);
        startActivity(intent);
    }

    public void przek(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, kwadrat_przek.class);
        startActivity(intent);
    }
}
