package intiproject.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pet extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new PetFragment();
    }
}
