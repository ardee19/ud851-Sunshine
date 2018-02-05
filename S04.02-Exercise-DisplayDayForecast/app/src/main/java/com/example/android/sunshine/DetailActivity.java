package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    TextView weatherDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        weatherDetails = (TextView)findViewById(R.id.tv_weather_details);
        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent intentFromParent = getIntent();
        if (intentFromParent != null) {
            if (intentFromParent.hasExtra(Intent.EXTRA_TEXT)) {
                weatherDetails.setText(intentFromParent.getStringExtra(Intent.EXTRA_TEXT));
            }
        }
    }
}