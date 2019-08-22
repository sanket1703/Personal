package com.example.randadd;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button add1 = findViewById(R.id.easy);

        add1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), level.class);
                i.putExtra("MY_KEY", 1);
                startActivity(i);


            }
        });
        final Button mul = findViewById(R.id.diff);

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i2 = new Intent(view.getContext(), level.class);
                i2.putExtra("MY_KEY", 2);
                startActivity(i2);

            }
        });
        final Button div = findViewById(R.id.med);

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i3 = new Intent(view.getContext(), level.class);
                i3.putExtra("MY_KEY", 3);
                startActivity(i3);

            }
        });



        // @Override
        // public boolean onCreateOptionsMenu(Menu addi) {
        // Inflate the addi; this adds items to the addi bar if it is present.
        //   getMenuInflater().inflate(R.addi.main, addi);
        // return true;
        //}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}