package com.a4_marketing.activities;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.a4_marketing.R;
import com.google.gson.Gson;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);


    }
}
