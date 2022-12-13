package beans;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo; 
	private String name;
	private String email; 
	private String mobile;
	
	@Embedded
	@ManyToOne(cascade = CascadeType.ALL)
	private int  courseId;

	public Student() {
		
	}
	public Student(String name, String email, String mobile, int courseId) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}


	public Student(int rollNo, String name, String email, String mobile, int courseId) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", courseId=" + courseId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseId, email, mobile, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return courseId == other.courseId && Objects.equals(email, other.email) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
	
	
	
	
}
