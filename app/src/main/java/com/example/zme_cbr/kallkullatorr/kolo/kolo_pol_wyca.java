package com.example.zme_cbr.kallkullatorr.kolo;

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

public class kolo_pol_wyca extends AppCompatActivity {
    TextView textView;
    EditText editText, editText2;
    String rs, as;
    Context context;
    double r, S, a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolo_pol_wyca);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
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
            rs = editText.getText().toString();
            r = Integer.valueOf(rs);
        } catch (NumberFormatException rs) {
            return;
        }
        try {
            as = editText.getText().toString();
            a = Integer.valueOf(as);
        } catch (NumberFormatException as) {
            return;
        }
        S = (a / 360) * Math.PI * r * r;
        textView.setText(String.valueOf(S) + " cm2");
    }
}
