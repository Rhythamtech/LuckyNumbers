package com.luckyno.play;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   public TextView No1,No2,No3;
    Random RandNo = new Random();
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Luckybtn;
        result = findViewById(R.id.result);
        No1= findViewById(R.id.no1);
        No2= findViewById(R.id.no2);
        No3= findViewById(R.id.no3);
        Luckybtn = findViewById(R.id.Luckbutton);

        Luckybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luckyfuncn();
            }
        });

    }

     void luckyfuncn() {
        int num1 = RandNo.nextInt(9)+1;
        int num2 = RandNo.nextInt(9)+1;
        int num3 = RandNo.nextInt(9)+1;

        if((num1 == num2)&&(num2==num3))
        {
            result.setText("  Win!!  ");
        }
        else
        {
            result.setText("Loose");
        }

      No1.setText(""+num1);
      No2.setText(""+num2);
      No3.setText(""+num3);




     }
}