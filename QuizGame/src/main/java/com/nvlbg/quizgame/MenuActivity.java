package com.nvlbg.quizgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity implements View.OnClickListener {

    private Button playButton;
    private Button statsButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_menu);

        this.playButton = (Button) this.findViewById(R.id.btn_play);
        this.statsButton = (Button) this.findViewById(R.id.btn_stats);
        this.settingsButton = (Button) this.findViewById(R.id.btn_settings);

        this.playButton.setOnClickListener(this);
        this.statsButton.setOnClickListener(this);
        this.settingsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_play) {
            this.startActivity( new Intent(MenuActivity.this, PlayActivity.class) );
        } else if (view.getId() == R.id.btn_stats) {

        } else if (view.getId() == R.id.btn_settings) {

        }
    }
}
