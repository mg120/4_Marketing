package com.a4_marketing.activities;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.a4_marketing.R;
import com.a4_marketing.utils.NetworkAvailable;
import com.fourhcode.forhutils.FUtilsValidation;

public class NewPasswordActivity extends AppCompatActivity {

    @BindView(R.id.newPassword_ed_id)
    EditText password_ed;
    @BindView(R.id.confirm_newPassword_ed_id)
    EditText confirm_password_ed;

    private NetworkAvailable networkAvailable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.send_newPassword_btn_id)
    void sendNewPass() {
        if (networkAvailable.isNetworkAvailable()) {
            if (!FUtilsValidation.isEmpty(password_ed, getString(R.string.required)) &&
                    (!FUtilsValidation.isEmpty(confirm_password_ed, getString(R.string.required)))) {
                // Show Progress Dialog

            }
        } else
            Toast.makeText(this, getString(R.string.error_connection), Toast.LENGTH_SHORT).show();
    }
}
