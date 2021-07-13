package com.example.coursesdisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvCourses:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvCourses=findViewById(R.id.rvCourses)

        var courses= listOf<Courses>(
            Courses("Mobile development","177md","This is a computer programming that results to creation of mobile application","John Owuor"),
            Courses("UX research","177rs","This is a computer programming that results to creation of mobile application","Joy "),
            Courses("UX/UI development","179html","This is a computer programming that results to creation and styling of user side website","Wendy Orango"),
            Courses("Back-end development","178py","This is a computer programming that results to creation of server side application","James Mwai"),
            Courses("Front-end development","176js","This helps coders build interactive web applications","Purity Maina")
        )
        var coursesAdapter=RvCoursesAdapter(courses)
        rvCourses.adapter=coursesAdapter
        rvCourses.layoutManager=LinearLayoutManager(baseContext)
    }


}