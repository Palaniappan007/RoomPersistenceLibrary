package com.example.yogeshwaraass.roompersistencelibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yogeshwaraa.ss on 8/29/2018.
 */

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TasksViewHolder> {
    private Context mCtx;
    private List<Task> tasklist;
    public TasksAdapter(Context mCtx,List<Task>tasklist){
        this.mCtx=mCtx;
        this.tasklist=tasklist;
    }
    @Override
    public TasksViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(mCtx).inflate(R.layout.recyclerview_tasks,parent,false);
        return new TasksViewHolder(view);
    }
    @Override
    public void onBindViewHolder(TasksViewHolder holder,int position){
        Task t = tasklist.get(position);
        holder.textViewTask.setText(t.getTask());
        holder.textViewDesc.setText(t.getDesc());
        holder.textViewFinishBy.setText(t.getFinishBy());

        if (t.isFinished())
            holder.textViewStatus.setText("Completed");
        else
            holder.textViewStatus.setText("Not Completed");
    }
    @Override
    public int getItemCount() {
        return tasklist.size();
    }
    class TasksViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewStatus, textViewTask, textViewDesc, textViewFinishBy;

        public TasksViewHolder(View itemView) {
            super(itemView);

            textViewStatus = itemView.findViewById(R.id.textViewStatus);
            textViewTask = itemView.findViewById(R.id.textViewTask);
            textViewDesc = itemView.findViewById(R.id.textViewDesc);
            textViewFinishBy = itemView.findViewById(R.id.textViewFinishBy);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Task task = tasklist.get(getAdapterPosition());

            Intent intent = new Intent(mCtx, UpdateTaskActivity.class);
            intent.putExtra("task", (Parcelable) task);

            mCtx.startActivity(intent);
        }
    }
    }
