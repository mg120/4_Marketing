package com.a4_marketing.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.a4_marketing.R;
import com.google.android.material.textfield.TextInputLayout;

public class CurrentAddsFragment extends Fragment {


    @BindView(R.id.current_adds_noData_txtV_id)
    TextView current_noData_txtV;
    @BindView(R.id.current_adds_progress_id)
    ProgressBar current_adds_progress;
    @BindView(R.id.current_adds_recyclerV_id)
    RecyclerView current_adds_recyclerV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(getString(R.string.current_ads));
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_current_adds, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
