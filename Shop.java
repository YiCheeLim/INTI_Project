package intiproject.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.widget.EditText;

public class Shop extends AppCompatActivity {

    private EditText textBox;
    private SearchView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        textBox = (EditText)findViewById(R.id.text);
        textBox.getText();

        search = (SearchView)findViewById(R.id.search);

    }
}
