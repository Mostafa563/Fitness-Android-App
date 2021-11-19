package android.example.fitnessapplication.activities.ui.Calories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CaloriesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CaloriesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Calories fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}