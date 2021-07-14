package com.myfirst.recyclerviewivwe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvSenderMessage;

    public SenderViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        mTvSenderMessage = itemView.findViewById(R.id.tvSenderMessage);
    }
    public void setData(SenderModel senderModel){
        mTvSenderMessage.setText(senderModel.getSenderMessage());
    }
}
