package com.fishfishfish.fishaccounting.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fishfishfish.fishaccounting.R;
import com.fishfishfish.fishaccounting.common.Constants;
import com.fishfishfish.fishaccounting.model.bean.local.FishPay;

import java.util.List;


public class PayEditAdapter extends RecyclerView.Adapter<PayEditAdapter.MyItemViewHolder> {

    private Context mContext;
    private List<FishPay> mData;

    public PayEditAdapter(Context mContext, List<FishPay> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_note_edit, parent, false);
        return new MyItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyItemViewHolder holder, int position) {
        holder.item_name.setText(mData.get(position).getPayName());
        Glide.with(mContext).load(Constants.BASE_URL + Constants.IMAGE_PAY + mData.get(position).getPayImg())
                .into(holder.item_img);
    }

    @Override
    public int getItemCount() {
        if (mData == null)
            return 0;
        return mData.size();
    }

    public static class MyItemViewHolder extends RecyclerView.ViewHolder {
        TextView item_name;
        ImageView item_img;

        MyItemViewHolder(View view) {
            super(view);
            item_img = (ImageView) view.findViewById(R.id.item_note_edit_iv);
            item_name = (TextView) view.findViewById(R.id.item_note_edit_tv);
        }
    }
}
