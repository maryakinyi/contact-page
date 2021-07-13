package com.example.coursesdisplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RvCoursesAdapter(var course_list: List<Courses>) : RecyclerView.Adapter<CoursesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.course_list_item,parent,false)
        return CoursesViewHolder(itemView )

    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        //var currentCourse=course_list.get(position)
        holder.tvCourseName.text=course_list.get(position).toString()
        holder.tvCourseCode.text=course_list.get(position).toString()
        holder.tvDescribe.text=course_list.get(position).toString()
        holder.tvTrainer.text=course_list.get(position).toString()
    }

    override fun getItemCount(): Int {
        //list of items that can be able to be displayed by our Recycleview at a go
        return course_list.size
    }
}

class CoursesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvCourseName = itemView.findViewById<TextView>(R.id.tvCourseName)
    var tvCourseCode = itemView.findViewById<TextView>(R.id.tvCourseCode)
    var tvDescribe = itemView.findViewById<TextView>(R.id.tvDescribe)
    var tvTrainer = itemView.findViewById<TextView>(R.id.tvTrainer)


}