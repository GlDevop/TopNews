package gabriellee.project.topnews.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class NewsListViewModel extends AndroidViewModel {

    private static final String TAG = "NewsListViewModel";

    public NewsListViewModel(@NonNull Application application) {
        super(application);
    }

}
