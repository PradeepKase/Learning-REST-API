package Dao;

import beans.Course;

public interface DAOInt {
	public void addCourse(Course course);
	public void getStudent(int roll_no)throws Exception;
	public void getCourse(int course_id)throws Exception;
}
