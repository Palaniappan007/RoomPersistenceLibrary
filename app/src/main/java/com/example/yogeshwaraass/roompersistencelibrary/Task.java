package com.example.yogeshwaraass.roompersistencelibrary;

/**
 * Created by Yogeshwaraa.ss on 8/29/2018.
 */
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import java.io.Serializable;
@Entity
public class Task {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "task")
    private String Task;
    @ColumnInfo(name = "desc")
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFinishBy() {
        return finishBy;
    }

    public void setFinishBy(String finishBy) {
        this.finishBy = finishBy;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @ColumnInfo(name = "finish_by")

    private String finishBy;
    @ColumnInfo(name = "finished")
    private boolean finished;
}
