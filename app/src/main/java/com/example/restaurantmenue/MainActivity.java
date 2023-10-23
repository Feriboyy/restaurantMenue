package com.example.restaurantmenue;

import com.example.restaurantmenue.R;
import com.example.restaurantmenue.apetizer_items;
import com.example.restaurantmenue.dessert_items;
import com.example.restaurantmenue.main_course_items;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button apetizerButton, main_courseButton, dessertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apetizerButton = (Button) findViewById(R.id.apetizerButton);
        apetizerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openapetizer_items();

            }
        });

        main_courseButton = (Button) findViewById(R.id.main_courseButton);
        main_courseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmain_corse_items();

            }
        });

        dessertButton = (Button) findViewById(R.id.dessertButton);
        dessertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendessert_items();

            }
        });

    }

    public void openapetizer_items() {
        Intent apetizer_items = new Intent(this, apetizer_items.class);
        startActivity(apetizer_items);
    }

    public void openmain_corse_items() {
        Intent main_course_items = new Intent(this, main_course_items.class);
        startActivity(main_course_items);
    }

    public void opendessert_items() {
        Intent dessert_items = new Intent(this, com.example.restaurantmenue.dessert_items.class);
        startActivity(dessert_items);
    }
}

