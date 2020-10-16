import { Component, OnInit } from '@angular/core';
import {CourseService} from '../service/course.service.client';

@Component({
  selector: 'app-course-navigator',
  templateUrl: './course-navigator.component.html',
  styleUrls: ['./course-navigator.component.css']
})
export class CourseNavigatorComponent implements OnInit {

  constructor(private courseService: CourseService) { }

  courses: [];
  selectedCourse = {
    modules: []
  };
  selectedModule = {
    lessons: []
  };
  selectedLesson = {};

  ngOnInit(): void {
    this.courseService.findAllCourses().then(courses => this.courses = courses);
    console.log(this.courses);
  }

  selectCourse(course: any) {
    this.selectedCourse = course;
  }

  selectModule(module: any) {
    this.selectedModule = module;
    console.log(this.selectedModule);
  }

  selectLesson(lesson: any) {
    this.selectedLesson = lesson;
    console.log(this.selectedLesson);
  }
}
