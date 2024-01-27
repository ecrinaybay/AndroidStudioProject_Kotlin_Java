package com.ecrinaybay.retrofitjava.service;

import com.ecrinaybay.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    /*Observable aslında gözlemlebilir mansını geliyor. Gözlemlenebilir bir obje oluşturacağız
    ve bu obje yayın yapacak. Veri setinde bir değişikilik olduğunda bu değişikliği başka bunu
    gözlemleyen objelre bildirme görevini üstleniyor diyebiliriz. Bunun aynısını call ile yapı-
    yorduk ardık observable ile yapacağız. Rx ile birlikte kullanacağız.
     */
    //Call<List<CryptoModel>> getData(); //RxJava ile işlem yapıyorsak Call işlemini yapmmaız gerekir artık

    Observable<List<CryptoModel>> getData();






}




































