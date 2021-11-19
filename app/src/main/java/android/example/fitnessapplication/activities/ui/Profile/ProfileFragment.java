package android.example.fitnessapplication.activities.ui.Profile;

import android.example.fitnessapplication.R;
import android.example.fitnessapplication.activities.ProfileActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


public class ProfileFragment extends Fragment {

    private ProfileViewModel profileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_prof, container, false);
        ProfileActivity.DrawerTitle = "Profile";
//        ProfileActivity.titleTV.setText(ProfileActivity.DrawerTitle);
//        ProfileActivity.isSett = true;
//        ProfileActivity.isEdit = true;
//        ProfileActivity.isCal = false;
//        action_item.setVisible(true);
//        edit_item.setVisible(true);
//        cal_item.setVisible(false);

        return root;
    }

   /* @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }*/

   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }*/

   /* @Override
    public void onPrepareOptionsMenu(Menu menu) {
        MenuItem item=menu.findItem(R.id.action_settings);
        if(item!=null)
            item.setVisible(false);
    }*/
}