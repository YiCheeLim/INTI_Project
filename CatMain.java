package intiproject.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CatMain extends AppCompatActivity {

    private TextView catInfo;
    private Button mType;
    private Button mCatCare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_main);

        catInfo = (TextView)findViewById(R.id.cat_info);
        catInfo.setText("Cat is a small, typically furry carnivorous mammal that often called as house cats which kept as indoor pets.\n" +
                "Cats are often valued by humans for companionship and for their ability to hunt vermin.\n" +
                "There is more than 70 kind of cat breeds in the world.\n" +
                "Cats having high breeding rate as a cat will have 1-8 kittens every litter and it can give birth about 2-3 times per years.\n" +
                "A cat commonly will live for 12-18 years of age and the oldest cat lived for 28 years old.\n" +
                "\n\n");

        mType = (Button)findViewById(R.id.cat_type);
        mType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //still empty
            }
        });

        mCatCare = (Button)findViewById(R.id.cat_type);
        mCatCare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //future add
            }
        });

    }
}
