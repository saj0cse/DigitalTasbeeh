package com.saj.digitaltajbi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    ProgressBar progressBar;
    TextView textView;
    int valueProgress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        progressBar = findViewById(R.id.progressBarID);
        textView = findViewById(R.id.textViewID);
        updateProgressBar();

    }

    private void updateProgressBar(){
        progressBar.setProgress(valueProgress);
        textView.setText(valueProgress+"");
    }

    public void minus (View view){
    if (valueProgress>=1){
        valueProgress-=1;
        updateProgressBar();
    }
    }

    public void plus (View view){
        if (valueProgress<=99){
            valueProgress+=1;
            updateProgressBar();
        }
    }
    public void reset (View view){
        valueProgress=0;
            updateProgressBar();
        }


    public void information (View view){
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }

}