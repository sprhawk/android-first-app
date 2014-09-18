package me.yang.firstapp;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuInflater;
import android.app.Activity;
// import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.content.Intent;
import android.widget.EditText;

import me.yang.firstapp.DisplayMessageActivity;

public class MainActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "me.yang.firstapp.MESSAGE";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    // @Override
    // public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState) {
    //     setHasOptionsMenu(true);
    // }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        // Log.d("create options menu ...");
        return super.onCreateOptionsMenu(menu);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSearch() {}

    private void openSettings() {}

}
