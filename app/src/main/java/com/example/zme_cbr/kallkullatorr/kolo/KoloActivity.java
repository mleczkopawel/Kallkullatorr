package com.example.zme_cbr.kallkullatorr.kolo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;

import com.example.zme_cbr.kallkullatorr.GeometryActivity;
import com.example.zme_cbr.kallkullatorr.MainActivity;
import com.example.zme_cbr.kallkullatorr.R;
import com.example.zme_cbr.kallkullatorr.Settings;
import com.example.zme_cbr.kallkullatorr.kolo.kolo_pole;
import com.example.zme_cbr.kallkullatorr.kolo.wzory_kolo;

public class KoloActivity extends AppCompatActivity {
    Context context;
    EditText editText,editText2,editText3;
    TextView wynik_view;
    int r;
    String rs;
    double wynikw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolo);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        wynik_view = (TextView)findViewById(R.id.textView_wynik);
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
    public void wynik(View view) {
        rs = editText.getText().toString();
        r = Integer.valueOf(rs);
        wynikw = 3.14*r*r;
        wynik_view.setText(String.valueOf(wynikw));
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
}
