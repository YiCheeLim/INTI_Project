package intiproject.project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by user on 21/7/2017.
 */

public class PetListFragment extends Fragment{
    private RecyclerView mPetRecyclerView;
    private PetAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_pet_list,container,false);

        mPetRecyclerView = (RecyclerView)view.findViewById(R.id.pet_recycler_view);
        mPetRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    private class PetHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTitleTextView;
        private TextView mDateTextView;
        private CheckBox mSolvedCheckBox;

        private PInfo mPet;

        public PetHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);

            mTitleTextView = (TextView)itemView.findViewById(R.id.list_item_pet_title_text_view);
            mDateTextView = (TextView)itemView.findViewById(R.id.list_item_pet_date_text_view);
            mSolvedCheckBox = (CheckBox)itemView.findViewById(R.id.list_item_pet_solved_check_box);
        }

        public void bindPet(PInfo pet){
            mPet = pet;
            mTitleTextView.setText(mPet.getTitle());
            mDateTextView.setText(mPet.getDate().toString());
            mSolvedCheckBox.setChecked(mPet.isSolved());
        }

        @Override
        public void onClick(View v){
            Toast.makeText(getActivity(),mPet.getTitle()+ "clicked!",Toast.LENGTH_SHORT)
                    .show();
        }
    }
    private class PetAdapter extends RecyclerView.Adapter<PetHolder>{
        private List<PInfo> mPet;
        public PetAdapter(List<PInfo> pets){
            mPet = pets;
        }

        @Override
        public PetHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_pet,parent,false);

            return new PetHolder(view);
        }
        @Override
        public void onBindViewHolder(PetHolder holder, int position){
            PInfo pet = mPet.get(position);
            holder.bindPet(pet);
        }
        @Override
        public int getItemCount(){
            return mPet.size();
        }
    }
    private void updateUI(){
        PetLab petLab = PetLab.get(getActivity());
        List<PInfo> pets = petLab.getPet();

        mAdapter = new PetAdapter(pets);
        mPetRecyclerView.setAdapter(mAdapter);
    }
}
