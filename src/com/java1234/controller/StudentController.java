package com.java1234.controller;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	private static LinkedList<Student> studentList = new LinkedList<Student>();
	static {
		studentList.add(new Student(1, "tom", 11));
		studentList.add(new Student(2, "jack", 12));
		studentList.add(new Student(3, "jerry", 13));
	}

	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("studentList", studentList);
		mav.setViewName("student/list");
		return mav;
	}

	@RequestMapping("/preSave")
	public ModelAndView preSave(@RequestParam(value = "id", required = false) String id) {
		ModelAndView mav = new ModelAndView();
		if (id != null) {
			mav.addObject("student", studentList.get(Integer.parseInt(id) - 1));
			mav.setViewName("student/update");
		} else {
			mav.setViewName("student/add");
		}
		return mav;
	}

	// @RequestMapping("/add")
	// public ModelAndView add(@RequestParam(value = "name") String name,
	// @RequestParam(value = "age") String age) {
	// ModelAndView mav = new ModelAndView();
	// studentList.add(new Student(studentList.size() + 1, name,
	// Integer.parseInt(age)));
	// mav.addObject("studentList", studentList);
	// mav.setViewName("student/list");
	// return mav;
	// }

	@RequestMapping("/update")
	public ModelAndView update(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name,
			@RequestParam(value = "age") String age) {
		ModelAndView mav = new ModelAndView();
		studentList.remove(Integer.parseInt(id) - 1);
		studentList.add(Integer.parseInt(id) - 1, new Student(Integer.parseInt(id), name, Integer.parseInt(age)));
		mav.addObject("studentList", studentList);
		mav.setViewName("student/list");
		return mav;
	}

	@RequestMapping("/save")
	public String save(Student student) {
		studentList.add(student);
		return "redirect:/student/list.do";
	}
}
