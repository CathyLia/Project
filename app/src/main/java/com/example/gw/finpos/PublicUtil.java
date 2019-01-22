package com.example.gw.finpos;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

class PublicUtil {

    public static ProgressDialog getDialog(Context context, String title,
                                           String text) {
        ProgressDialog mProgressDialog = new ProgressDialog(context);
        mProgressDialog.setTitle(title);
        mProgressDialog.setMessage(text);
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setCanceledOnTouchOutside(false);
        return mProgressDialog;
    }
    public static void showPassMode(final EditText et) {
        et.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    public static void sendHandler(Handler handler, int msg) {
        handler.sendMessage(handler.obtainMessage(msg));
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            if (i == src.length - 1) {
                stringBuilder.append(hv);
            } else {
                stringBuilder.append(hv + " ");
            }
        }
        return stringBuilder.toString();
    }
}
