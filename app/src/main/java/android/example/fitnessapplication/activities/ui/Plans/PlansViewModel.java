package android.example.fitnessapplication.activities.ui.Plans;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlansViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PlansViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Plans fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}