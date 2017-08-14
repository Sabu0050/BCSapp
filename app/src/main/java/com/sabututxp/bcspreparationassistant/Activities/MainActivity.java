package com.sabututxp.bcspreparationassistant.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

import com.sabututxp.bcspreparationassistant.R;

public class MainActivity extends AppCompatActivity {


    Button subButton;
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        subButton = (Button) findViewById(R.id.button);

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent intent = new Intent(MainActivity.this,SubjectListActivity.class);
                startActivity(intent);

            }
        });

    }
}
