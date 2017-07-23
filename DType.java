package intiproject.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DType extends AppCompatActivity {
    private Button mHusky;
    private TextView intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtype);

        mHusky=(Button)findViewById(R.id.Husky);
        mHusky.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //null
            }
        });

        intro=(TextView)findViewById(R.id.dogBF);
        intro.setText("Dog is human's bestfriend, don't abandon them although with reason");
    }
}
