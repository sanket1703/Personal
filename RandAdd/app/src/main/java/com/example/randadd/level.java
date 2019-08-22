package com.example.randadd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        final Button easy = findViewById(R.id.easy);
        easy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int number = getIntent().getExtras().getInt("MY_KEY");

                switch (number)
                {
                    case 1: Intent i = new Intent(view.getContext(), addi.class);
                        i.putExtra("MY_KEY1", 10);
                        startActivity(i);
                        break;

                    case 2:  Intent i2 = new Intent(view.getContext(), mul.class);
                        i2.putExtra("MY_KEY1", 10);
                        startActivity(i2);
                        break;

                    case 3 :  Intent i3 = new Intent(view.getContext(), div.class);
                        i3.putExtra("MY_KEY1", 10);
                        startActivity(i3);
                        break;

                }



            }
        });
        final Button med = findViewById(R.id.med);
        med.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                int number = getIntent().getExtras().getInt("MY_KEY");

                switch (number)
                {
                    case 1: Intent i = new Intent(view.getContext(), addi.class);
                        i.putExtra("MY_KEY1", 20);
                        startActivity(i);
                        break;

                    case 2:  Intent i2 = new Intent(view.getContext(), mul.class);
                        i2.putExtra("MY_KEY1", 20);
                        startActivity(i2);
                        break;

                    case 3 :  Intent i3 = new Intent(view.getContext(), div.class);
                        i3.putExtra("MY_KEY1", 20);
                        startActivity(i3);
                        break;

                }

            }
        });
        final Button diff = findViewById(R.id.diff);
        diff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int number = getIntent().getExtras().getInt("MY_KEY");


                switch (number)
                {
                    case 1: Intent i = new Intent(view.getContext(), addi.class);
                        i.putExtra("MY_KEY1", 30);
                        startActivity(i);
                        break;

                    case 2:  Intent i2 = new Intent(view.getContext(), mul.class);
                        i2.putExtra("MY_KEY1", 30);
                        startActivity(i2);
                        break;


                    case 3 :  Intent i3 = new Intent(view.getContext(), div.class);
                        i3.putExtra("MY_KEY1", 30);
                        startActivity(i3);
                        break;
                }

            }
        });
    }
}
