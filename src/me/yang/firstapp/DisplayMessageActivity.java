package me.yang.firstapp;

import android.view.View;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.app.ActionBar;
import android.app.Fragment;
// import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.widget.TextView;
import android.content.Intent;


import android.os.Bundle;

public class DisplayMessageActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        setContentView(textView);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
