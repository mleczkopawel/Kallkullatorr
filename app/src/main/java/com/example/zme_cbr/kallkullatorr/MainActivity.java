package com.example.zme_cbr.kallkullatorr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
            buttonR,buttonC,buttonCe,buttonP,buttonM,buttonMu,buttonD,buttonDot,buttonSqr,buttonSqrt;
    TextView view1;
    int clear_flag = 0, last_button = 0;
    String sign_flag = "";
    Double total = 0.0;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonR = (Button)findViewById(R.id.buttonR);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttonCe = (Button)findViewById(R.id.buttonCe);
        buttonP = (Button)findViewById(R.id.buttonP);
        buttonM = (Button)findViewById(R.id.buttonM);
        buttonMu = (Button)findViewById(R.id.buttonMu);
        buttonD = (Button)findViewById(R.id.buttonD);
        buttonDot = (Button)findViewById(R.id.buttonDot);
        buttonSqr = (Button)findViewById(R.id.buttonPr);
        buttonSqrt = (Button)findViewById(R.id.buttonSqrt);
        view1 = (TextView)findViewById(R.id.textView);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonR.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCe.setOnClickListener(this);
        buttonP.setOnClickListener(this);
        buttonM.setOnClickListener(this);
        buttonMu.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonSqr.setOnClickListener(this);
        buttonSqrt.setOnClickListener(this);
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

    public void shownum(String num){
        if (clear_flag==1){
            view1.setText("");
            clear_flag=0;
        }
        else if (view1.getText()=="0"){
            view1.setText("");
        }
        view1.setText(view1.getText()+num);
    }

    public void showsign(String sign){
        if (last_button == R.id.buttonP || last_button == R.id.buttonM || last_button == R.id.buttonMu || last_button == R.id.buttonD) {
            //do nothing
        }
        else {
            clear_flag = 1;
            Double newNumber = Double.parseDouble(view1.getText().toString());
            if (sign_flag == "" || sign_flag == "="){
                total = newNumber;
                view1.setText(total.toString());
            }
            else if (sign_flag == "+"){
                total = total + newNumber;
                view1.setText(total.toString());
            }
            else if (sign_flag == "-"){
                total = total - newNumber;
                view1.setText(total.toString());
            }
            else if (sign_flag == "*"){
                total = total * newNumber;
                view1.setText(total.toString());
            }
            else if (sign_flag == "/"){
                total = total / newNumber;
                view1.setText(total.toString());
            }
            else if (sign_flag == "%"){
                total = (total/newNumber)*100;
                view1.setText(total.toString());
            }
            else if (sign_flag == "√"){
                total = Math.sqrt(newNumber);
                view1.setText(total.toString());
            }
        }
        sign_flag = sign;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button0)
            shownum("0");
        else if (v.getId() == R.id.button1)
            shownum("1");
        else if (v.getId() == R.id.button2)
            shownum("2");
        else if (v.getId() == R.id.button3)
            shownum("3");
        else if (v.getId() == R.id.button4)
            shownum("4");
        else if (v.getId() == R.id.button5)
            shownum("5");
        else if (v.getId() == R.id.button6)
            shownum("6");
        else if (v.getId() == R.id.button7)
            shownum("7");
        else if (v.getId() == R.id.button8)
            shownum("8");
        else if (v.getId() == R.id.button9)
            shownum("9");
        else if (v.getId() == R.id.buttonC){
            view1.setText("0");
            total=0.0;
            sign_flag = "";
        }
        else if (v.getId() == R.id.buttonDot){
            if (clear_flag == 1){
                view1.setText("");
                clear_flag = 0;
            }
            if (view1.getText().toString().indexOf(".") < 0)
                view1.setText(view1.getText() + ".");
        }
        else if (v.getId() == R.id.buttonCe) {
            if (view1.getText().toString().length() > 0) {
                int start = 0;
                int end = view1.getText().toString().length() - 1;
                String newText = view1.getText().toString().substring(start, end);
                view1.setText(newText);
            }
        }
        else if (v.getId() == R.id.buttonP)
            showsign("+");
        else if (v.getId() == R.id.buttonM)
            showsign("-");
        else if (v.getId() == R.id.buttonMu)
            showsign("*");
        else if (v.getId() == R.id.buttonD)
            showsign("/");
        else if (v.getId() == R.id.buttonPr)
            showsign("%");
        else if (v.getId() == R.id.buttonSqrt)
            showsign("√");
        else if (v.getId() == R.id.buttonR){
            try {
                Double newNumber = Double.parseDouble(view1.getText().toString());
                if (sign_flag == "+") {
                    total = total + newNumber;
                    view1.setText(total.toString());
                }
                if (sign_flag == "-") {
                    total = total - newNumber;
                    view1.setText(total.toString());
                }
                if (sign_flag == "*") {
                    total = total * newNumber;
                    view1.setText(total.toString());
                }
                if (sign_flag == "/") {
                    total = total / newNumber;
                    view1.setText(total.toString());
                }
                if (sign_flag == "%") {
                    total = (total / newNumber) * 100;
                    view1.setText(total.toString() + "%");
                }
                if (sign_flag == "√") {
                    total = Math.sqrt(newNumber);
                    view1.setText(total.toString());
                }
                sign_flag = "=";
            }
            catch(NumberFormatException total){return;}
        }
    }
}


/* ten kalkulator będzie zawierał wszystko co potrzebne maturzyście, czyli:
* -pola powierzcni, długości boków, miary kątów figur płaskich oraz przestrzennych
* -funkcje oraz wykresy
* -tablice matematyczne
* -podstawowe działania na ułamkach, procentach, potęgach, pierwiastkach, logarytmach
* -wiele innych których sobie nie przypominam*/


