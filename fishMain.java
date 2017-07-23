package intiproject.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fishMain extends AppCompatActivity {

    private TextView info;
    private Button mtype;
    private Button mcare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_main);

        info = (TextView)findViewById(R.id.fishInfo);
        info.setText("Pet fish or being called as fishkeeping is a popular hobby which practiced by aquarists.\n" +
                "Keeping fish as a pet are much more easy than dogs or cats which required more spaces.\n" +
                "Fish are only required a space for aquarium or garden pond.\n" +
                "Nowaday there are people which keep saltwater fish as pet.");

        mtype = (Button)findViewById(R.id.FishType);
        mtype.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //empty
            }
        });

        mcare = (Button)findViewById(R.id.FishCare);
        mcare.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //empty
            }
        });
    }
}
