package com.a4_marketing.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.a4_marketing.model.HomeHeaderModel;
import com.a4_marketing.R;
import com.a4_marketing.adapter.HomeHeaderAdapter;
import com.a4_marketing.adapter.HomeMainAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    @BindView(R.id.home_header_recyclerV_id)
    RecyclerView header_recyclerV;
    @BindView(R.id.all_adds_txtV_id)
    TextView all_adds_txtV;
    @BindView(R.id.fav_adds_txtV_id)
    TextView fav_adds_txtV;
    @BindView(R.id.home_main_recyclerV_id)
    RecyclerView main_recyclerV;

    private HomeHeaderAdapter headerAdapter;
    private HomeMainAdapter mainAdapter;
    private List<HomeHeaderModel> headerList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);

        // header Recycler View
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        header_recyclerV.setLayoutManager(linearLayoutManager);
        header_recyclerV.setHasFixedSize(true);
        headerAdapter = new HomeHeaderAdapter(headerList , getActivity());
        header_recyclerV.setAdapter(headerAdapter);

        // Main Recycler View
        main_recyclerV.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        main_recyclerV.setHasFixedSize(true);
        mainAdapter = new HomeMainAdapter(getActivity());
        main_recyclerV.setAdapter(mainAdapter);

        return view;
    }
}
