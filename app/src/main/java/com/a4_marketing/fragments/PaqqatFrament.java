package com.a4_marketing.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.a4_marketing.R;
import com.a4_marketing.adapter.PaqqatRecyclerAdapter;


public class PaqqatFrament extends Fragment {

    @BindView(R.id.paqqat_noData_txtV_id)
    TextView paqqat_noData_txtV;
    @BindView(R.id.paqqat_progress_id)
    ProgressBar paqqat_progress;
    @BindView(R.id.paqqat_recyclerV_id)
    RecyclerView paqqat_recyclerV;

    private PaqqatRecyclerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(getString(R.string.paqqat));
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_paqqat_frament, container, false);
        ButterKnife.bind(this, view);

        paqqat_recyclerV.setLayoutManager(new LinearLayoutManager(getActivity()));
        paqqat_recyclerV.setHasFixedSize(true);
        adapter = new PaqqatRecyclerAdapter(getActivity());
        paqqat_recyclerV.setAdapter(adapter);
        return view;
    }
}
