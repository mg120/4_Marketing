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

public class EndedAddsFragment extends Fragment {

    @BindView(R.id.end_adds_noData_txtV_id)
    TextView endAdds_noData_txtV;
    @BindView(R.id.end_adds_progress_id)
    ProgressBar end_adds_progress;
    @BindView(R.id.end_adds_recyclerV_id)
    RecyclerView endAdds_recyclerV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(getString(R.string.endded_ads));
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ended_adds, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
