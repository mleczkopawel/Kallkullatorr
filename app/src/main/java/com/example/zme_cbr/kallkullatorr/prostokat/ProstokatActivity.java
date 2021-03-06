package com.example.zme_cbr.kallkullatorr.prostokat;

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

public class ProstokatActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prostokat);
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
        if (id == R.id.action_settings) {
            context = getApplicationContext();
            Intent intent = new Intent(context, Settings.class);
            startActivity(intent);
        }
        if (id == R.id.action_geometry) {
            context = getApplicationContext();
            Intent intent = new Intent(context, GeometryActivity.class);
            startActivity(intent);
        }
        if (id == R.id.action_calc) {
            context = getApplicationContext();
            Intent intent = new Intent(context, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void wzory(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, prostokat_wzory.class);
        startActivity(intent);
    }

    public void poleab(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, prostokat_poleab.class);
        startActivity(intent);
    }

    public void poleda(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, prostokat_poleda.class);
        startActivity(intent);
    }

    public void poledwh(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, prostokat_poledwh.class);
        startActivity(intent);
    }

    public void obwod(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, prostokat_obwod.class);
        startActivity(intent);
    }

    public void przekatna(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, prostokat_przekatna.class);
        startActivity(intent);
    }
}
