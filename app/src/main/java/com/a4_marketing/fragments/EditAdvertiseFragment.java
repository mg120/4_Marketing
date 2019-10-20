package com.a4_marketing.fragments;

import android.content.Context;
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

import com.a4_marketing.R;


public class EditAdvertiseFragment extends Fragment {

    @BindView(R.id.item_imageV_id)
    ImageView item_imageV;
    @BindView(R.id.editAdd_details_ed_id)
    EditText item_details_ed;
    @BindView(R.id.editAdd_address_ed_id)
    EditText item_address_ed;
    @BindView(R.id.editAdd_phone_ed_id)
    EditText item_phone_ed;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(getString(R.string.edit_add));
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_edit_advertise, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.editAdd_send_btn_id)
    void sendData(){

    }

    @OnClick(R.id.share_details_faceIcon_id)
    void face_Share(){

    }

    @OnClick(R.id.share_details_twitterIcon_id)
    void twitter_Share(){

    }
}
