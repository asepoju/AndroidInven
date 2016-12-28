package com.example.kangjisung.likeroom;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class StoreAddDialog extends Dialog
{
    private TextView mTitleView;
    private TextView mContentView;
    private Button mLeftButton;
    private Button mRightButton;
    private String mTitle;
    private String mContent;

    private View.OnClickListener mLeftClickListener;
    private View.OnClickListener mRightClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 다이얼로그 외부 화면 흐리게 표현
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);

        View addNewStoreDialogView = View.inflate(getContext(), R.layout.store_add_dialog, null);
        setContentView(addNewStoreDialogView);
        //setContentView(R.layout.store_add_dialog);

        mTitleView = (TextView) addNewStoreDialogView.findViewById(R.id.txt_title);
        mContentView = (TextView) addNewStoreDialogView.findViewById(R.id.txt_content);
        mLeftButton = (Button) addNewStoreDialogView.findViewById(R.id.btn_left);
        mRightButton = (Button) addNewStoreDialogView.findViewById(R.id.btn_right);

        // 제목과 내용을 생성자에서 셋팅한다.
        // null값을 가지는거에 셋팅을하려 하여 에러가 남
        Log.d(getContext().getString(R.string.app_name), "title: " + mTitleView + " content: " + mContentView);
        //mTitleView.setText(getContext().getString(R.string.addNewStoreTitle));
        //mContentView.setText(getContext().getString(R.string.addNewStoreContent));

        // 클릭 이벤트 셋팅
        if (mLeftClickListener != null && mRightClickListener != null) {
            mLeftButton.setOnClickListener(mLeftClickListener);
            mRightButton.setOnClickListener(mRightClickListener);
        } else if (mLeftClickListener != null
                && mRightClickListener == null) {
            mLeftButton.setOnClickListener(mLeftClickListener);
        } else {

        }
    }

    // 클릭버튼이 하나일때 생성자 함수로 클릭이벤트를 받는다.
    public StoreAddDialog(Context context, String title, View.OnClickListener singleListener) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.mTitle = title;
        this.mLeftClickListener = singleListener;
    }

    // 클릭버튼이 확인과 취소 두개일때 생성자 함수로 이벤트를 받는다
    public StoreAddDialog(Context context, String title, String content, View.OnClickListener leftListener, View.OnClickListener rightListener) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.mTitle = title;
        this.mContent = content;
        this.mLeftClickListener = leftListener;
        this.mRightClickListener = rightListener;
    }
}