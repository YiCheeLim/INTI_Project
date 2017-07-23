package intiproject.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PetInfo extends AppCompatActivity {

    private Button mCat;
    private Button mDog;
    private Button mRabbit;
    private Button mFish;
    private Button mMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_info);

        /*cat button*/
        mCat = (Button)findViewById(R.id.cat);
        mCat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(
                        PetInfo.this,
                        CatMain.class);
                startActivity(i);
            }
        });

        /*dog button*/
        mDog = (Button)findViewById(R.id.dog);
        mDog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(
                        PetInfo.this,
                        DogMain.class);
                startActivity(i);
            }
        });

        /*rabbit button*/
        mRabbit = (Button)findViewById(R.id.rabbit);
        mRabbit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(
                        PetInfo.this,
                        rabbitMain.class);
                startActivity(i);
            }
        });

        /*fish button*/
        mFish = (Button)findViewById(R.id.fish);
        mFish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(
                        PetInfo.this,
                        fishMain.class);
                startActivity(i);
            }
        });

        /*More button*/
        mMore = (Button)findViewById(R.id.more);
        mMore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        PetInfo.this,
                        PetInfo.class);
                startActivity(i);
            }
        });
    }

}
