package com.a4_marketing.activities;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.a4_marketing.R;
import com.a4_marketing.utils.DialogUtil;
import com.a4_marketing.utils.NetworkAvailable;
import com.fourhcode.forhutils.FUtilsValidation;

public class LogInActivity extends AppCompatActivity {

    @BindView(R.id.login_email_ed_id)
    EditText email_ed;
    @BindView(R.id.login_password_ed_id)
    EditText password_ed;

    private NetworkAvailable networkAvailable;
    private DialogUtil dialogUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ButterKnife.bind(this);

        networkAvailable = new NetworkAvailable(this);
        dialogUtil = new DialogUtil();
    }

    @OnClick(R.id.login_btn_id)
    void loginClicked(){
        if (networkAvailable.isNetworkAvailable()) {
            if (!FUtilsValidation.isEmpty(email_ed, getString(R.string.required))
                    && !FUtilsValidation.isEmpty(password_ed, getString(R.string.required))) {


            }
        } else {
            Toast.makeText(this, getString(R.string.error_connection), Toast.LENGTH_SHORT).show();
        }
    }
}
