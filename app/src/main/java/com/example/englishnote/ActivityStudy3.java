package com.example.englishnote; // 토익단어

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityStudy3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordstudy2);

    }
    // 메뉴
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"sound on");
        menu.add(0,2,0,"sound off");
        menu.add(0,3,0,"");
        menu.add(0,4,0,"");
        return true;
    }

    // 옵션 itemselected


}
