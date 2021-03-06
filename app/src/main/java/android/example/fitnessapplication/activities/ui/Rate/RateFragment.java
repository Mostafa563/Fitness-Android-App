package android.example.fitnessapplication.activities.ui.Rate;

import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


public class RateFragment extends Fragment {

    private RateViewModel rateViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rateViewModel =
                ViewModelProviders.of(this).get(RateViewModel.class);
        View root = inflater.inflate(R.layout.fragment_rate, container, false);
        final TextView textView = root.findViewById(R.id.text_rate);
        rateViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}