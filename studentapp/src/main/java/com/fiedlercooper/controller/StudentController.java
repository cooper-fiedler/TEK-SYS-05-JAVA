package com.fiedlercooper.controller;

import com.fiedlercooper.model.StudentModel;
import com.fiedlercooper.view.StudentView;

public class StudentController {

	private StudentModel model;
	private StudentView view;

	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public StudentModel getModel() {
		return model;
	}

	public StudentView getView() {
		return view;
	}

	public void setModel(StudentModel model) {
		this.model = model;
	}

	public void setView(StudentView view) {
		this.view = view;
	}

}
