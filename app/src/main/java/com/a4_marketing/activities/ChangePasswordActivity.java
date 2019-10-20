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

public class ChangePasswordActivity extends AppCompatActivity {

    @BindView(R.id.currentPassword_ed_id)
    EditText currentPassword_ed;
    @BindView(R.id.newPassword_ed_id)
    EditText newPassword_ed;
    @BindView(R.id.confirm_newPass_ed_id)
    EditText confirm_newPass_ed;

    private NetworkAvailable networkAvailable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        ButterKnife.bind(this);

        networkAvailable = new NetworkAvailable(this);
    }

    @OnClick(R.id.change_password_btn_id)
    void changePassword() {
        if (networkAvailable.isNetworkAvailable()) {
            if (!FUtilsValidation.isEmpty(currentPassword_ed, getString(R.string.required)) &&
                    (!FUtilsValidation.isEmpty(newPassword_ed, getString(R.string.required)) &&
                            (!FUtilsValidation.isEmpty(confirm_newPass_ed, getString(R.string.required))
                            ))) {

            }
        } else
            Toast.makeText(this, getString(R.string.error_connection), Toast.LENGTH_SHORT).show();
    }
}