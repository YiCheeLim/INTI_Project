package intiproject.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView intro;
    private Button mPetInfo;
    private Button mNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intro = (TextView)findViewById(R.id.Intro);
        intro.setText("Pet is the best and royal companies for human\n" +
                "Take care of your pet just like taking care of your own children\n" +
                "Be a good owner to your pet and not abandon them after you get bored of them\n" +
                "Think wisely before bring them back home");

        mPetInfo = (Button)findViewById(R.id.Pet_Info);
        mPetInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(
                        MainActivity.this,
                        PetInfo.class);
                startActivity(i);
            }
        });
        mNote = (Button)findViewById(R.id.Note);
        mNote.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(
                        MainActivity.this,
                        Pet.class);
                startActivity(i);
            }
        });
    }
}
