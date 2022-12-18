package com.rajsabari.addiiton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText numberOne=findViewById(R.id.numberOne);
        EditText numberTwo=findViewById(R.id.numberTwo);
        Button add=findViewById(R.id.add);
        Button sub=findViewById(R.id.sub);
        Button multi=findViewById(R.id.multi);
        Button divide=findViewById(R.id.divide);
        TextView result=findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String One = numberOne.getText().toString();
                String Two = numberTwo.getText().toString();
                if (!"".equals(One) && !"".equals(Two)) {
                    float numberOne = Float.parseFloat(One);
                float numberTwo = Float.parseFloat(Two);
                    result.setText(String.valueOf(numberOne + numberTwo));
                }
            }});
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String One = numberOne.getText().toString();
                String Two = numberTwo.getText().toString();
                if (!"".equals(One) && !"".equals(Two)) {
                    float numberOne = Float.parseFloat(One);
                    float numberTwo = Float.parseFloat(Two);
                    result.setText(String.valueOf(numberOne - numberTwo));
                }
            } });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String One = numberOne.getText().toString();
                String Two = numberTwo.getText().toString();
                if (!"".equals(One) && !"".equals(Two)) {
                    float numberOne = Float.parseFloat(One);
                    float numberTwo = Float.parseFloat(Two);
                    result.setText(String.valueOf(numberOne * numberTwo));
                }
            } });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String One = numberOne.getText().toString();
                String Two = numberTwo.getText().toString();
                if (!"".equals(One) && !"".equals(Two)) {
                    float numberOne = Float.parseFloat(One);
                    float numberTwo = Float.parseFloat(Two);
                    result.setText(String.valueOf(numberOne / numberTwo));
                }
            }});
    }
}
