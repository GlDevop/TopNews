package gabriellee.project.topnews.requests.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsResponse {

    @SerializedName("results")
    @Expose()
    private List<News> news;

    public List<News> getNews() {
        return news;
    }

    @Override
    public String toString() {
        return "NewsResponse{" +
                "news=" + news +
                '}';
    }
}
