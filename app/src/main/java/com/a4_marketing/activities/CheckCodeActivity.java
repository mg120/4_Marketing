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

public class CheckCodeActivity extends AppCompatActivity {

    @BindView(R.id.code_ed_id)
    EditText code_ed;
    @BindView(R.id.send_code_btn_id)
    ImageView send_code_btn;

    private NetworkAvailable networkAvailable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_code);
        ButterKnife.bind(this);

        networkAvailable = new NetworkAvailable(this);
    }

    @OnClick(R.id.send_code_btn_id)
    void sendCode(){
        if (networkAvailable.isNetworkAvailable()){
            if (!FUtilsValidation.isEmpty(code_ed, getString(R.string.required))) {
                // Show Progress Dialog

            }
        } else
            Toast.makeText(this, getString(R.string.error_connection), Toast.LENGTH_SHORT).show();
    }
}
