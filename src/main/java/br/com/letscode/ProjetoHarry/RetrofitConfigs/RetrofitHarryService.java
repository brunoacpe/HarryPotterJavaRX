package br.com.letscode.ProjetoHarry.RetrofitConfigs;

import br.com.letscode.ProjetoHarry.Entity.House;
import br.com.letscode.ProjetoHarry.Entity.HouseID;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import rx.Single;

public interface RetrofitHarryService {

    @GET("sortinghat")
    Single<HouseID> getSortingHat();

    @GET("house/{idHouse}")
    Observable<House> getHousesById(@Path("idHouse") String idHouse);
}
