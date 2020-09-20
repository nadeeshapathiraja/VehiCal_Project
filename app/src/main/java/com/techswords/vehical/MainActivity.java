package com.techswords.vehical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v){
        EditText market_price = findViewById(R.id.market_price);
        EditText selling_price = findViewById(R.id.selling_price);
        EditText profit = findViewById(R.id.profit);
        EditText full_cost = findViewById(R.id.full_cost);

        //convert to String
        String m_price= market_price.getText().toString();
        String s_price = selling_price.getText().toString();

        //convert to Double
        double mark_price = Double.parseDouble(m_price);
        double sell_price = Double.parseDouble(s_price);

        //extra values
        double tax1 = 100;
        double tax2 = 20;

        //calculate full_cost
        double f_cost  = mark_price + tax1 + tax2;
        double profit_cal = sell_price - f_cost;

        //set to string
        String S_f_cost= String.valueOf(f_cost);
        String S_profit_cal = String.valueOf(profit_cal);

        //Send to text field
        profit.setText(S_profit_cal);
        full_cost.setText(S_f_cost);


    }
    public void sendMail(View v){

    }
    public void cancle(View v){

    }
}
