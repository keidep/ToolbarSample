package com.example.toolbarsample;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            //Toolbarを取得。
            Toolbar toolbar = findViewById(R.id.toolbar);
            //ツールバーにロゴを設定。
            toolbar.setLogo(R.mipmap.ic_launcher);
            //ツールバーにタイトル文字列を設定。
            toolbar.setTitle(R.string.toolbar_title);
            //ツールバーのタイトル文字色を設定。
            toolbar.setTitleTextColor(Color.WHITE);
            //ツールバーにサブタイトル文字列を設定。
            toolbar.setSubtitle(R.string.toolbar_subtitle);
            //ツールバーのサブタイトル文字色を設定。
            toolbar.setSubtitleTextColor(Color.LTGRAY);
            //アクションバーにツールバーを設定。
            setSupportActionBar(toolbar);
    }
}