package lfernando.firebasechatapp.helper;

import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by fernando on 01/03/2018.
 */

public class ChatConfigs {
    public static LinearLayout.LayoutParams sender(){
        LinearLayout.LayoutParams senderParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        senderParams.setMargins(400, 0, 0, 5);
        senderParams.gravity = Gravity.RIGHT;
        return senderParams;
    }

    public static LinearLayout.LayoutParams receiver() {
        LinearLayout.LayoutParams receiverParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        receiverParams.setMargins(0, 0, 400, 5);
        return receiverParams;
    }


}
