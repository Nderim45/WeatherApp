package com.example.weatherapp.Retrofit;

import com.example.weatherapp.Model.WeatherForecastResult;
import com.example.weatherapp.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherMap {

    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLon(@Query("lat")String lat,
                                                 @Query("lon")String lon,
                                                 @Query("appid")String appid,
                                                 @Query("units")String units);

    @GET("weather")
    Observable<WeatherResult> getWeatherByCityName(@Query("q")String cityName,
                                                   @Query("appid")String appid,
                                                   @Query("units")String units);

    @GET("forecast")
    Observable<WeatherForecastResult> getForecastWeatherByLatLon(@Query("lat")String lat,
                                                         @Query("lon")String lon,
                                                         @Query("appid")String appid,
                                                         @Query("units")String units);
}
