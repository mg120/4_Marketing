package com.a4_marketing.activities;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.a4_marketing.R;
import com.a4_marketing.utils.NetworkAvailable;
import com.fourhcode.forhutils.FUtilsValidation;

public class ForgetPasswordActivity extends AppCompatActivity {

    @BindView(R.id.forgetPass_email_ed_id)
    EditText email_ed;
    @BindView(R.id.send_email_btn_id)
    ImageView send_email_btn;

    private NetworkAvailable networkAvailable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        ButterKnife.bind(this);

        networkAvailable = new NetworkAvailable(this);
    }

    @OnClick(R.id.send_email_btn_id)
    void sendEmail(){
        if (networkAvailable.isNetworkAvailable()){
            if (!FUtilsValidation.isEmpty(email_ed, getString(R.string.required))) {

            }
        } else
            Toast.makeText(this, getString(R.string.error_connection), Toast.LENGTH_SHORT).show();
    }
}
