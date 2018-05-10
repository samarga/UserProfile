package com.example.samarg.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView pictureImageView = (ImageView) findViewById(R.id.profile_picture);
        pictureImageView.setImageResource(R.drawable.picture);

        TextView nameTextView = (TextView) findViewById(
                R.id.name);
        nameTextView.setText("Jessica");

        TextView birthdayTextView = (TextView) findViewById(
                R.id.birthday);
        birthdayTextView.setText("01/01/1970");

        TextView countryTextView = (TextView) findViewById(
                R.id.country);
        countryTextView.setText("United States of America");
    }
}
