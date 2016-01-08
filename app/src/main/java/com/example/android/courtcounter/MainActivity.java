package com.example.android.courtcounter;

import android.os.Bundle;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    int aScore=0;
    int bScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void reset(View v)

    {
        aScore=0;
        bScore=0;
        displayForTeamA(aScore);
        displayForTeamB(bScore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsToA(View view)
    {
        aScore=aScore+3;
        displayForTeamA(aScore);
    }

    public void addTwoPointsToA(View view)
    {
        aScore=aScore+2;
        displayForTeamA(aScore);
    }

    public void addOnePointToA(View view)
    {
        aScore=aScore+1;
        displayForTeamA(aScore);
    }

    public void addThreePointsToB(View view)
    {
        bScore=bScore+3;
        displayForTeamB(bScore);
    }

    public void addTwoPointsToB(View view)
    {
        bScore=bScore+2;
        displayForTeamB(bScore);
    }

    public void addOnePointToB(View view)
    {
        bScore=bScore+1;
        displayForTeamB(bScore);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
