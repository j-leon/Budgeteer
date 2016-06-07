package com.jleon.budgeteer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mBudgetEntries;
    private TextView mBalance;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolBar = ((Toolbar) findViewById(R.id.BudgetToolbar));
        if (mToolBar != null) {
            mToolBar.setTitle(R.string.app_name);
            setSupportActionBar(mToolBar);
        }
        mBudgetEntries = ((RecyclerView) findViewById(R.id.BudgetEntries));
        mBalance = ((TextView) findViewById(R.id.BudgetBalance));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
