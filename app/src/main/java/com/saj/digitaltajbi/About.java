package com.saj.digitaltajbi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class About extends AppCompatActivity {

    private ImageView fbId,linkedinId,fbPageId, fbPageWebId,fbGroupWebId;
    private TextView sajLinkId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        fbId = findViewById(R.id.fbId);
        linkedinId = findViewById(R.id.linkedinId);
        fbPageId = findViewById(R.id.fbPageId);
        sajLinkId = findViewById(R.id.sajLinkId);

        fbId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.facebook.com/saj0cse"));
                startActivity(intent);
            }
        });


        linkedinId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.linkedin.com/in/saj0cse"));
                startActivity(intent);
            }
        });

        fbPageId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.facebook.com/saj.developer"));
                startActivity(intent);
            }
        });

        sajLinkId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.facebook.com/saj.developer"));
                startActivity(intent);
            }
        });

    }
}