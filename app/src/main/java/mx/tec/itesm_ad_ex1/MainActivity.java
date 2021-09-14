package mx.tec.itesm_ad_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    ImageView myImageView;
    TextView myTextView;
    EditText myEditText;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.myImageView);
        myTextView = findViewById(R.id.myTextView);
        myEditText = findViewById(R.id.myEditText);
        myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                        {
                            //I add the code that i want to execute when i click the button
                            Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                            myIntent.putExtra("nameExtra", myEditText.getText().toString());
                            myIntent.putExtra("ageExtra", 40);

                            startActivity(myIntent);
                            /*
			                myTextView.setText("You clicked");

			                if(myImageView.getVisibility() == View.VISIBLE)
			                {
				                myImageView.setVisibility(View.INVISIBLE);
			                }
			                else
			                {
				                myImageView.setVisibility(View.VISIBLE);
			                }
			                */
                        }
            }
        );
    }
}