package com.a4_marketing.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.a4_marketing.model.HomeHeaderModel;
import com.a4_marketing.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeHeaderAdapter extends RecyclerView.Adapter<HomeHeaderAdapter.ViewHolder> {

    private List<HomeHeaderModel> list;
    private Context mContext;

    public HomeHeaderAdapter(List<HomeHeaderModel> list, Context mcContext) {
        this.list = list;
        this.mContext = mcContext;
    }

    @NonNull
    @Override
    public HomeHeaderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.home_header_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHeaderAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.header_title_txtV_id)
        TextView title_txtV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
