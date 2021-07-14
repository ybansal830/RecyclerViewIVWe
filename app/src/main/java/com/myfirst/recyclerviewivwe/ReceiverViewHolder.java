package com.myfirst.recyclerviewivwe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvReceiverMessage;

    public ReceiverViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        mTvReceiverMessage = itemView.findViewById(R.id.tvReceiverMessage);
    }
    public void setData(ReceiverModel receiverModel){
        mTvReceiverMessage.setText(receiverModel.getReceiverMessage());
    }
}
