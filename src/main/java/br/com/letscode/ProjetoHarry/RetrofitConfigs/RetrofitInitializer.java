package br.com.letscode.ProjetoHarry.RetrofitConfigs;

import br.com.letscode.ProjetoHarry.utils.Constants;
import lombok.Data;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

@Data
public class RetrofitInitializer {

    private static Retrofit retrofitInstance;

    public static Retrofit getRetrofit() {
        if(retrofitInstance == null ) {
            retrofitInstance = new Retrofit.Builder().baseUrl(Constants.URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return retrofitInstance;
    }
}
