package intiproject.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DogMain extends AppCompatActivity {

    private TextView dogInfo;
    private Button mType;
    private Button mDogCare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_main);

        dogInfo = (TextView)findViewById(R.id.dog_info);
        dogInfo.setText("Dog is a member of a genus Canis that froms part of the wolf-like canids and most widely abundant carnivore.\n" +
                "Dog was the first domesticated species and has been selectively bred over millennia for various behaviors, sensory capabilities and physical attributes.\n" +
                "Dogs perform many roles for people such as hunting, herding, pulling loads, protection, assisting police and military, companionship and more other jobs and recently there are dogs for aiding handicapped individuals.\n" +
                "This is why dogs had been given a name of the \"Man's Best Friend\"\n" +
                "A dog will having about 10-13 years of lifespan with proper care.");

        mType = (Button)findViewById(R.id.dog_type);
        mType.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(
                        DogMain.this,
                        DType.class);
                startActivity(i);
            }
        });

        mDogCare = (Button)findViewById(R.id.dog_care);
        mDogCare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //empty
            }
        });

    }
}
