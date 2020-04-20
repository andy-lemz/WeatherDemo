package com.example.weatherdemo;

import android.annotation.SuppressLint;
import android.support.v4.app.ListFragment;

@SuppressLint("ValidFragment")
public class Cities extends ListFragment {
    String ID;
    String LocalizedName;
    String EnglishName;

    public Cities(String ID, String localizedName, String englishName) {
        this.ID = ID;
        LocalizedName = localizedName;
        EnglishName = englishName;
    }

    private static Cities[] GetAllRegions(){

        //Заготовка под получение списка регионов по АПИ

        //Пока добавляем пару регионов руками
        Cities[] regions = {new Cities("1", "Москва", "Moscow"),
                new Cities("2", "Санкт-Петербург", "Saint Petersburg"),
                new Cities("3", "Казань", "Kazan")};

        return regions;
    }

    public static String[] GetNameAllRegions(){

        Cities[] regions = GetAllRegions();
        String[] arr = new String[regions.length];

        for  (int i = 0; i < regions.length; i++) {
            arr[i] = regions[i].LocalizedName;
        }

        return arr;
    }

    public String GetIDByLocalizedName(String LocalizedName){

        return ID;
    }

}
