package com.iir4g8.tpretrofit.network;

import com.iir4g8.tpretrofit.model.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("users")
    Call<List<User>> getUsers();
}