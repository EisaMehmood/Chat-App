package com.app.echat.view.fragments;

import com.app.echat.services.notifications.MyResponse;
import com.app.echat.services.notifications.Sender;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAozxPr8Y:APA91bFXejd9wRI0YqT8mrdOQuBa7yFVru0ZA-PBNRPntWx_vPpYXGicCtleJazluC4PTPPrHOfxmRKlnU59VlWa6dev10wSldw4v4z4VKNSMUMB_LSMoxabwa55yDoPsK2H_6r-ZaHe"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

