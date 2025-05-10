package com.example.toolbarsample;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

            //Toolbarを取得。
            Toolbar toolbar = findViewById(R.id.toolbar);
            //ツールバーにロゴを設定。
            toolbar.setLogo(R.mipmap.ic_launcher);
            //アクションバーにツールバーを設定。
            setSupportActionBar(toolbar);
            //CollapsingToolbarLayoutを取得。
            CollapsingToolbarLayout toolbarLayout = findViewById(R.id.toolbarLayout);
            //タイトルを設定。
            toolbarLayout.setTitle(getString(R.string.toolbar_title));
            //通常サイズ時の文字色を設定。
            toolbarLayout.setExpandedTitleColor(Color.WHITE);
            //縮小サイズ時の文字色を設定。
            toolbarLayout.setCollapsedTitleTextColor(Color.LTGRAY);
    }
}