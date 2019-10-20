package com.a4_marketing.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.a4_marketing.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MyAddsAdapter extends RecyclerView.Adapter<MyAddsAdapter.ViewHolder> {
    private Context mContext;

    public MyAddsAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyAddsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.my_add_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAddsAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.advertise_date_txtV_id)
        TextView date_txtV;
        @BindView(R.id.advertise_category_txtV_id)
        TextView category_txtV;
        @BindView(R.id.advertise_price_txtV_id)
        TextView price_txtV;
        @BindView(R.id.advertise_title_txtV_id)
        TextView title_txtV;
        @BindView(R.id.advertise_duration_txtV_id)
        TextView duration_txtV;
        @BindView(R.id.advertise_views_txtV_id)
        TextView views_txtV;
        @BindView(R.id.advertise_rating_bar_id)
        RatingBar rating_bar;
        @BindView(R.id.advertise_main_imageV_id)
        ImageView advertise_main_imageV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
