package intiproject.project;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by user on 21/7/2017.
 */

public class PetLab {
    private static PetLab sPetLab;

    private List<PInfo> mPet;

    public static PetLab get(Context context){
        if (sPetLab == null){
            sPetLab = new PetLab(context);
        }
        return sPetLab;
    }
    private PetLab (Context context){
        mPet = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            PInfo pet = new PInfo();
            PInfo.setTitle("Pet #" + i);
            PInfo.setSolved(i%2 == 0);
            mPet.add(pet);
        }
    }
    public List<PInfo> getPet(){
        return mPet;
    }
    public PInfo getPet(UUID id){
        for (PInfo pet : mPet){
            if(PInfo.getID().equals(id)){
                return pet;
            }
        }
        return null;
    }
}
