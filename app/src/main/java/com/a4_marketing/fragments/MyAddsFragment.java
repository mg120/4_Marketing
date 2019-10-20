package com.a4_marketing.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.a4_marketing.R;
import com.a4_marketing.adapter.MyAddsAdapter;


public class MyAddsFragment extends Fragment {

    @BindView(R.id.my_adds_noData_txtV_id)
    TextView noData_txtV;
    @BindView(R.id.my_adds_progress_id)
    ProgressBar adds_progress;
    @BindView(R.id.my_adds_recyclerV_id)
    RecyclerView adds_recyclerV;

    private MyAddsAdapter addsAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(getString(R.string.my_advertising));
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_adds, container, false);
        ButterKnife.bind(this, view);

        adds_recyclerV.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        adds_recyclerV.setHasFixedSize(true);
        addsAdapter = new MyAddsAdapter(getActivity());
        adds_recyclerV.setAdapter(addsAdapter);

        return view;
    }
}
