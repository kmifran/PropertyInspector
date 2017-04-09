package sit374_team17.propertyinspector;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button advanceToLoginActivity = (Button) findViewById(R.id.loginButton);
        advanceToLoginActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }

        });

        Button advanceToSearchActivity = (Button) findViewById(R.id.searchButton);
        advanceToSearchActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }

        });
        Button advanceToCreateActivity = (Button) findViewById(R.id.createButton);
        advanceToCreateActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, CreateActivity.class);
                startActivity(intent);
            }

        });
        Button advanceToSavedActivity = (Button) findViewById(R.id.savedButton);
        advanceToSavedActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SavedActivity.class);
                startActivity(intent);
            }

        });


    }
}