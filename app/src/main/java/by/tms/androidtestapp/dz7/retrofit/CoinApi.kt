package by.tms.androidtestapp.dz7.retrofit

import by.tms.androidtestapp.dz7.coins.Coins
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinApi {
    @GET("cryptocurrency/listings/latest")
    fun getTopCoins(
        @Query("limit") limit: Int,
        @Query("convert") currencyCode: String
    ) : Deferred<Response<Coins>>
}