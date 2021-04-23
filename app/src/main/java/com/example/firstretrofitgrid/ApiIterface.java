package com.example.firstretrofitgrid;

        import java.util.List;

        import retrofit2.Call;
        import retrofit2.http.GET;

public interface ApiIterface {

    @GET("images/")
    Call<List<ImagesResponse>> getAllImages();




}
