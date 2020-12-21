package ru.devegang.retrofitsample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class DateModel
{

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("milliseconds_since_epoch")
    @Expose
    private long millisecondsSinceEpoch;
    @SerializedName("time")
    @Expose
    private String time;
    //private final static long serialVersionUID = -989906572776669488L;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getMillisecondsSinceEpoch() {
        return millisecondsSinceEpoch;
    }

    public void setMillisecondsSinceEpoch(long millisecondsSinceEpoch) {
        this.millisecondsSinceEpoch = millisecondsSinceEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
