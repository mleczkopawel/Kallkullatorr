package com.example.zme_cbr.kallkullatorr.kwadrat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zme_cbr.kallkullatorr.GeometryActivity;
import com.example.zme_cbr.kallkullatorr.MainActivity;
import com.example.zme_cbr.kallkullatorr.R;
import com.example.zme_cbr.kallkullatorr.Settings;

public class kwadrat_dlu_bokd extends AppCompatActivity {
    TextView textView;
    EditText editText;
    String ds;
    Context context;
    double S, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwadrat_dlu_bokd);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
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

    public void oblicz(View view) {
        try {
            ds = editText.getText().toString();
            d = Double.valueOf(ds);
        } catch (NumberFormatException ds) {
            return;
        }
        S = (Math.sqrt(2) / 2) * d;
        textView.setText(String.valueOf(S) + " cm2");
    }
}
