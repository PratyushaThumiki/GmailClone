package com.example.thumikipratyusha.gmailclone.network;

import java.util.List;

import com.example.thumikipratyusha.gmailclone.model.Message;
import retrofit2.Call;
import retrofit2.http.GET;



public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
