package com.example.kangjisung.likeroom.FragmentNotice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kangjisung.likeroom.DefineManager;
import com.example.kangjisung.likeroom.R;

public class FragmentNoticeMain extends Fragment {
//스탬프,공지사항,매장정보 중 공지사항 부분.
    private View view;
    private RecyclerView noticeRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private NoticeRecyclerViewAdapter mAdapter;
    String[] selectedShopInfoData;
    TextView txtStoreName;
    ImageView hamburgerMenu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notice_main, container, false);

        mAdapter = new NoticeRecyclerViewAdapter(DefineManager.showNoticeList, getActivity().getApplicationContext());
        mLayoutManager = new LinearLayoutManager(getActivity());
        txtStoreName = (TextView) view.findViewById(R.id.txtStoreName);
        noticeRecyclerView = (RecyclerView) view.findViewById((R.id.recyclerView));
        hamburgerMenu = (ImageView) view.findViewById(R.id.hamburgerMenu);

        hamburgerMenu.setVisibility(View.INVISIBLE);
        selectedShopInfoData = getArguments().getStringArray("shopInfoData");

        noticeRecyclerView.setAdapter(mAdapter);
        noticeRecyclerView.setLayoutManager(mLayoutManager);
        txtStoreName.setText(selectedShopInfoData[DefineManager.shopNameSavedPoint]);

        /*mAdapter.addItem("제목1", "내용1", new GregorianCalendar(2016, 1, 1), new GregorianCalendar(2016, 12, 30), 1);
        mAdapter.addItem("제목2", "내용2", new GregorianCalendar(2015, 1, 1), new GregorianCalendar(2015, 12, 30), 2);
        mAdapter.addItem("제목3", "내용3", new GregorianCalendar(2014, 1, 1), new GregorianCalendar(2014, 12, 30), 3);*/


        return view;
    }
}