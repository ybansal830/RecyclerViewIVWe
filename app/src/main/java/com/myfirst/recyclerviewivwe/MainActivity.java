package com.myfirst.recyclerviewivwe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private EditText mEtOption,mEtSendMessage;
    private ImageView mIvSend;
    private ArrayList<BaseModel> messageList = new ArrayList<>();
    ChatAdapter chatAdapter = new ChatAdapter(messageList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(chatAdapter);
    }

    private void buildList() {
        if(mEtOption.getText().toString().equals("0")){
            messageList.add(new SenderModel(mEtSendMessage.getText().toString()));
        }else if(mEtOption.getText().toString().equals("1")){
            messageList.add(new ReceiverModel(mEtSendMessage.getText().toString()));
        }
        chatAdapter.notifyDataSetChanged();
    }

    private void initViews() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mEtOption = findViewById(R.id.etChoice);
        mEtSendMessage = findViewById(R.id.etSendMessage);
        mIvSend = findViewById(R.id.ivSend);
        mIvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildList();
            }
        });
    }
}