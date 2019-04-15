package gabriellee.project.topnews.requests;

import gabriellee.project.topnews.requests.responses.NewsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {

    @GET("svc/topstories/v2/home.json")
    Call<NewsResponse> searchNew(@Query("api-key") String key);

}
