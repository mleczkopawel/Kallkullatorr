package com.example.zme_cbr.kallkullatorr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.content.*;

import com.example.zme_cbr.kallkullatorr.kolo.KoloActivity;

public class GeometryActivity extends AppCompatActivity{
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);
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

    public void kwadrat(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, KwadratActivity.class);
        startActivity(intent);
    }

    public void trojkat(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, TrojkatActivity.class);
        startActivity(intent);
    }

    public void trapez(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, TrapezActivity.class);
        startActivity(intent);
    }

    public void kolo(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, KoloActivity.class);
        startActivity(intent);
    }
}