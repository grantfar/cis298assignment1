package edu.kvcc.cis298.cis298assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    private Button mMinusButton;
    private Button mAdditionButton;
    private TextView mDisplayText;
    private int counterInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        mMinusButton = (Button) findViewById(R.id.minusButton);
        mAdditionButton = (Button) findViewById(R.id.plusButton);
        mDisplayText = (TextView) findViewById(R.id.displayTextView);
        counterInt = 0;
        mDisplayText.setText("0");
        mAdditionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterInt++;
                mDisplayText.setText((Integer.toString( counterInt)));
                if(counterInt > 20 || counterInt < -20)
                {
                    Toast.makeText(CounterActivity.this,Integer.toString( counterInt),Toast.LENGTH_SHORT).show();
                }
            }
        });
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterInt--;
                mDisplayText.setText((Integer.toString( counterInt)));
                if(counterInt > 20 || counterInt < -20)
                {
                    Toast.makeText(CounterActivity.this,Integer.toString( counterInt),Toast.LENGTH_SHORT).show();
                }
            }
        });
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
