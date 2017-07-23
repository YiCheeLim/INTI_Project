package intiproject.project;

import android.support.v4.app.Fragment;

/**
 * Created by user on 21/7/2017.
 */

public class PetListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new PetListFragment();
    }
}
