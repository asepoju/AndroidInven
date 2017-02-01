package com.example.kangjisung.likeroom.FragmentItem;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.kangjisung.likeroom.Adapter.FragmentItemMainAdapter;
import com.example.kangjisung.likeroom.R;
import com.example.kangjisung.likeroom.Util.CustomViewPager;
import com.example.kangjisung.likeroom.Util.FirstPageFragmentListener;

public class FragmentItemMain extends Fragment implements View.OnClickListener{
    private ImageButton btnSellToday;
    private ImageButton btnMuchStore;
    public static CustomViewPager customViewPager;
    private TextView tvFragmentItemMain;
    private TextView tvFragmentItemMainDate;
    static public FirstPageFragmentListener firstPageListener;
    public FragmentItemMain() {
    }
    public FragmentItemMain(FirstPageFragmentListener listener) {
        firstPageListener=listener;
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView=inflater.inflate(R.layout.fragment_item_main,container,false);

        ///////init///////
        btnSellToday=(ImageButton)rootView.findViewById(R.id.btn_fragment_item_main_sell_today);
        btnMuchStore=(ImageButton)rootView.findViewById(R.id.btn_fragment_item_main_store_match);
        customViewPager=(CustomViewPager) rootView.findViewById(R.id.vp_fragment_item_main);
        tvFragmentItemMain=(TextView)rootView.findViewById(R.id.tv_fragment_item_main);
        tvFragmentItemMainDate=(TextView)rootView.findViewById(R.id.tv_fragment_item_main_date);

        final FragmentItemMainAdapter adapter = new FragmentItemMainAdapter(getFragmentManager());
        customViewPager.setAdapter(adapter);
        //스크롤 막기
        customViewPager.setPagingDisabled();
        customViewPager.setOffscreenPageLimit(3);
        btnMuchStore.setOnClickListener(this);
        btnSellToday.setOnClickListener(this);
        //////////////////
        return rootView;

    }

    @Override
    public void onClick(View view) {
        if(view==btnMuchStore){
            customViewPager.setCurrentItem(1,false);
            tvFragmentItemMain.setText("월 최적재고량");
            btnSellToday.setBackgroundResource(R.mipmap.disable_sell_today);
            btnMuchStore.setBackgroundResource(R.mipmap.enable_store_much);
            ((ViewGroup.MarginLayoutParams)btnSellToday.getLayoutParams()).bottomMargin=(int)DpToPx((float)42.0);
            ((ViewGroup.MarginLayoutParams)btnMuchStore.getLayoutParams()).bottomMargin=(int)DpToPx((float)20.0);

/*    여기서 날짜 갱신
      tvFragmentItemMainDate.setText("");
  */
        }
        else if(view==btnSellToday){
            customViewPager.setCurrentItem(0,false);
            tvFragmentItemMain.setText("월 일일판매량");

            btnSellToday.setBackgroundResource(R.mipmap.enable_sell_today);
            btnMuchStore.setBackgroundResource(R.mipmap.disable_store_much);
            ((ViewGroup.MarginLayoutParams)btnSellToday.getLayoutParams()).bottomMargin=(int)DpToPx((float)20.0);
            ((ViewGroup.MarginLayoutParams)btnMuchStore.getLayoutParams()).bottomMargin=(int)DpToPx((float)40.0);

            /*    여기서 날짜 갱신
      tvFragmentItemMainDate.setText("");
  */
        }
    }
    public static float DpToPx(float dp){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return Math.round(px);
    }
    public static FragmentItemMain createInstance(FirstPageFragmentListener listener){
        FragmentItemMain fragmentItemMain=new FragmentItemMain();
        fragmentItemMain.firstPageListener=listener;
        return fragmentItemMain;
    }

    /* 이벤트 코드는 여기서 */
}