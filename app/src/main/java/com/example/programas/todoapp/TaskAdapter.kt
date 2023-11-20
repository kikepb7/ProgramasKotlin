package com.example.programas.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.programas.R

class TaskAdapter(var tasks: List<Task>, private val onTaskSelected: (Int) -> Unit) :
    RecyclerView.Adapter<TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.render(tasks[position])
        holder.itemView.setOnCickListener { onTaskSelected }
    }

    override fun getItemCount() = tasks.size
}