package android.example.fitnessapplication.activities.ui.Plans;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.example.fitnessapplication.activities.ProfileActivity;
import android.example.fitnessapplication.activities.WeekActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class PlansFragment extends Fragment {

    private PlansViewModel galleryViewModel;
    private ImageView week1Img;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(PlansViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_plans, container, false);
        ProfileActivity.DrawerTitle = "plans";
        ProfileActivity.titleTV.setText(ProfileActivity.DrawerTitle);
//        ProfileActivity.isSett = false;
//        ProfileActivity.isEdit = false;
//        ProfileActivity.isCal = false;
        /*action_item.setVisible(false);
        edit_item.setVisible(false);
        cal_item.setVisible(false);*/

        week1Img = root.findViewById(R.id.week1Img);
        week1Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getActivity(), WeekActivity.class);
                startActivity(myInt);
            }
        });
        return root;
    }
}