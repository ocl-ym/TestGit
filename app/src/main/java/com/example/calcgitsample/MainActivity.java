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

        int tanka = Integer.parseInt(tankaInput.getText().toString());
        int num = Integer.parseInt(numInput.getText().toString());

        int calc = calc(tanka, num);

        String toastMessage = String.format("合計金額は%,d円です。", calc);
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }

    private int calc(int tanka, int num) {
        int total;
        total = tanka * num;
        return total;
    }
}