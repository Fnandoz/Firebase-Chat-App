package lfernando.firebasechatapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import lfernando.firebasechatapp.helper.ChatConfigs;

public class ChatActivity extends AppCompatActivity {

    EditText inputEditText;
    Button sendButton;
    LinearLayout linearLayout;

    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        inputEditText = findViewById(R.id.inputEditText);
        sendButton = findViewById(R.id.sendButton);
        linearLayout = findViewById(R.id.linearLayoutScrollView);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newMsg(0, inputEditText.getText().toString());
            }
        });
    }

    public void newMsg(int who, String msg){
        TextView tv = new TextView(getApplicationContext());
        tv.setText(msg);
        if (who==0){
            tv.setBackgroundColor(Color.GREEN);
            tv.setTextColor(Color.BLACK);
            tv.setLayoutParams(ChatConfigs.sender());
        }else {
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            tv.setBackgroundColor(Color.BLUE);
            tv.setTextColor(Color.BLACK);
            tv.setLayoutParams(ChatConfigs.receiver());
        }
        putMsg(tv);
    }

    public void putMsg(TextView tv){
        linearLayout.addView(tv, i++);
        inputEditText.setText("");
    }
}
