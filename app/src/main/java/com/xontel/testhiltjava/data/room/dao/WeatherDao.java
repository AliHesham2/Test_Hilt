package com.xontel.testhiltjava.data.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.xontel.testhiltjava.data.room.model.WeatherDataDB;
import java.util.List;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

@Dao
public interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Single<Long> insertWeather(WeatherDataDB data);

    @Update
    void updateWeather(WeatherDataDB data);

    @Query("SELECT * FROM weather")
    Flowable<List<WeatherDataDB>> getAllCities();

    @Query("SELECT * FROM weather WHERE id =:id")
    Flowable<WeatherDataDB> getCity(int id);

    @Query("SELECT * FROM weather WHERE id =:weatherID")
    Single<WeatherDataDB> getCityOnce(int weatherID);

    @Delete
    void deleteCity(WeatherDataDB data);
}
