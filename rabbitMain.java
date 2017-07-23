package intiproject.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rabbitMain extends AppCompatActivity {

    private TextView rabbitInfo;
    private Button mRabbitType;
    private Button mRabbitCare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit_main);

        rabbitInfo = (TextView)findViewById(R.id.rabbitInfo);
        rabbitInfo.setText("Rabbits are small mammals in the family Leporidae.\n" +
                "There are eigth different genera in the family classified as rabbit.\n" +
                "The male rabbit is called buck and female is called doe. Young rabbit is called kitten or kit.\n" +
                "A pet rabbit having about 9 years of lifespan with proper care.");

        mRabbitType = (Button)findViewById(R.id.rabbitType);
        mRabbitType.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //empty
            }
        });
        mRabbitCare = (Button)findViewById(R.id.rabbitCare);
        mRabbitCare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //empty
            }
        });

    }
}
