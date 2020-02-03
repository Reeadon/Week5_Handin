package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openActivity2(View view) {
        Intent intent = new Intent(this, page2.class);
        startActivity(intent);
    }

    public void openActivity3(View view) {
        Intent intent = new Intent(this, page3.class);
        startActivity(intent);
    }

    public void goToAboutPage(View view) {
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }
}
