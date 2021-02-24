package com.example.calcgitsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcOnClick(View view){
        EditText tankaInput = findViewById(R.id.tanka);
        EditText numInput = findViewById(R.id.num);

        double discount = 0.9;
        boolean discountflg = false;
        int total = 0;

        int tanka = Integer.parseInt(tankaInput.getText().toString());
        int num = Integer.parseInt(numInput.getText().toString());

        if (num >= 10){
            discountflg = true;
        }

        if(discountflg == true){
            total = discountCalc(tanka, num, discount);
        }else{
            total = calc(tanka, num);
        }

        String toastMessage = String.format("合計金額は%,d円です。", total);
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }

    private int discountCalc(int tanka, int num, double discount) {
        int total = (int) (tanka * num * discount);
        return total;
    }

    private int calc(int tanka, int num) {
        int total;
        total = tanka * num;
        return total;
    }
}