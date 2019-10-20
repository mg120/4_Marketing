package com.a4_marketing.fragments;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.a4_marketing.R;


public class ProfileFragment extends Fragment {

    @BindView(R.id.profile_user_imageV_id)
    ImageView user_imageV;
    @BindView(R.id.userName_ed_id)
    TextView userName_txtV;
    @BindView(R.id.userPhone_ed_id)
    TextView userPhone_txtV;
    @BindView(R.id.userEmail_ed_id)
    TextView userEmail_txtV;
    @BindView(R.id.userAddress_ed_id)
    TextView userAddress_txtV;
    @BindView(R.id.userCity_ed_id)
    TextView userCity_txtV;
    @BindView(R.id.userPassword_txtV_id)
    TextView userPassword_txtV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(getString(R.string.profile));
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.profile_edit_userName_btn_id)
    void editName() {

    }

    @OnClick(R.id.profile_edit_userPhone_btn_id)
    void editPhone() {

    }

    @OnClick(R.id.profile_edit_userEmail_btn_id)
    void editEmail() {

    }

    @OnClick(R.id.profile_edit_userAddress_btn_id)
    void editAddress() {

    }

    @OnClick(R.id.profile_edit_userCity_btn_id)
    void editCity() {

    }
    @OnClick(R.id.profile_edit_userPassword_btn_id)
    void editPassword() {

    }

    @OnClick(R.id.editProfile_sure_btn_id)
    void sendChanges(){

    }
}
