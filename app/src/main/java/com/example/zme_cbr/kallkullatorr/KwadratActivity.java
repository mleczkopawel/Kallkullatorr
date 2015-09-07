package com.example.zme_cbr.kallkullatorr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;

public class KwadratActivity extends AppCompatActivity {
    Context context;
    EditText editText1,editText2,editText3,editText4,editText5,editText6;
    TextView wynik_view;
    double a,d,S,r,Rr,l;
    String as="0",ds="0",Ss="0",rs="0",Rrs="0",ls="0";
    double wynikw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwadrat);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);
        editText5 = (EditText)findViewById(R.id.editText5);
        editText6 = (EditText)findViewById(R.id.editText6);

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

    private void zmienne(){
        as = editText1.getText().toString();
        ds = editText2.getText().toString();
        ls = editText3.getText().toString();
        Ss = editText4.getText().toString();
        rs = editText5.getText().toString();
        Rrs = editText6.getText().toString();
    }

    public void pole(View view) {
        zmienne();
        a = Double.valueOf(as);
        wynikw = a*a;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void pr_wpi(View view) {
        zmienne();
        a = Double.valueOf(as);
        wynikw = a/2;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void pole2(View view) {
        zmienne();
        d = Double.valueOf(ds);
        wynikw = (d*d)/2;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void obw(View view) {
        zmienne();
        a = Double.valueOf(as);
        wynikw = 4*a;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void pole3(View view) {
        zmienne();
        a = Double.valueOf(as);
        d = Double.valueOf(ds);
        wynikw = (Math.sqrt(2)/2)*a*d;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void opi1(View view) {
        zmienne();
        d = Double.valueOf(ds);
        wynikw = d/2;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void opi2(View view) {
        zmienne();
        r = Double.valueOf(rs);
        wynikw = r*Math.sqrt(2);
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void opi3(View view) {
        zmienne();
        a = Double.valueOf(as);
        wynikw = (Math.sqrt(2)/2)*a;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void dl_bok(View view) {
        zmienne();
        r = Double.valueOf(rs);
        wynikw = 2*r;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void dl_bok2(View view) {
        zmienne();
        Rr = Double.valueOf(Rrs);
        wynikw = Rr*Math.sqrt(2);
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void dl_bok3(View view) {
        zmienne();
        d = Double.valueOf(ds);
        wynikw = (Math.sqrt(2)/2)*d;
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void przek(View view) {
        zmienne();
        a = Double.valueOf(as);
        wynikw = a*Math.sqrt(2);
        wynik_view.setText(String.valueOf(wynikw));
    }

    public void wzory(View view) {
        context = getApplicationContext();
        Intent intent = new Intent(context, wzory_kwadrat.class);
        startActivity(intent);
    }
}
