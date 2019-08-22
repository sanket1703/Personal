package com.example.randadd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class div extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);

        final Button gen = findViewById(R.id.gen);


        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final TextView rand1 = findViewById(R.id.rand1);
                final TextView rand2 = findViewById(R.id.rand2);
                final TextView ans = findViewById(R.id.ans);
                int x = 0;
                int number1 = getIntent().getExtras().getInt("MY_KEY1");
                switch (number1)
                {
                    case 10: x=9;
                    break;
                    case 20: x=99;
                    break;
                    case 30: x=999;
                    break;
                }

                Random r1 = new Random();
                int n1 = r1.nextInt(0+x);
                Random r2 = new Random();
                int n2 = r2.nextInt(0+x);
                String n11 = Integer.toString(n1);
                String n22 = Integer.toString(n2);
                rand1.setText(n11);

                rand2.setText(n22);
                float a = (float)n1 / (float)n2;
                String b = Float.toString(a);


                ans.setText(b);


            }

        });




    }
}
