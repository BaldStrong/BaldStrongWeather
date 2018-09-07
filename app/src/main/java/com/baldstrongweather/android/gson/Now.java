package com.baldstrongweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 现在的天气
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;         //现在的天气情况
    }
}
