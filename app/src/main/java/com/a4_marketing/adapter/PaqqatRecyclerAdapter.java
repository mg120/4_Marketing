package com.a4_marketing.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.a4_marketing.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PaqqatRecyclerAdapter extends RecyclerView.Adapter<PaqqatRecyclerAdapter.ViewHolder> {

    private Context mContext;

    public PaqqatRecyclerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public PaqqatRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.paqqa_row_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaqqatRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.baqa_type_txtV_id)
        TextView baqa_type_txtV;
        @BindView(R.id.baqa_txtV_1_id)
        TextView baqa_txtV_1;
        @BindView(R.id.baqa_txtV_2_id)
        TextView baqa_txtV_2;
        @BindView(R.id.baqa_image_imageV_id)
        ImageView baqa_image_imageV;
        @BindView(R.id.baqa_subscribe_btn_id)
        Button baqa_subscribe_btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
