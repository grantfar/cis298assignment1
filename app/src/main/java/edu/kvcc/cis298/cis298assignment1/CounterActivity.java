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
        //Increment button
        mMinusButton = (Button) findViewById(R.id.minusButton);
        //Decrement button
        mAdditionButton = (Button) findViewById(R.id.plusButton);
        //The display for counter
        mDisplayText = (TextView) findViewById(R.id.displayTextView);
        //what counter is at
        counterInt = 0;
        mDisplayText.setText("0");
        //Increases Counter when + button is clicked
        mAdditionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //displays Toast if counter is going to be equal to 20
                if(counterInt == 20)
                {
                    Toast.makeText(CounterActivity.this,"21!",Toast.LENGTH_SHORT).show();
                }
                counterInt++;
                mDisplayText.setText((Integer.toString( counterInt)));
            }
        });
        //Decreases Counter when - button is clicked
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterInt--;
                mDisplayText.setText((Integer.toString( counterInt)));
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
