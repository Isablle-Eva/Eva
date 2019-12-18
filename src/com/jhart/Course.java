package com.jhart;

public class Course {
		private String course_id;//课程ID
		private	String coures_name;//课程名
		private	String coures_book;//参考教材
		public Course(String coures_name, String coures_book) {
			super();
			this.coures_name = coures_name;
			this.coures_book = coures_book;
		}
		public Course() {
			super();
			// TODO 自动生成的构造函数存根
		}
		public String getCourse_id() {
			return course_id;
		}
		public void setCourse_id(String course_id) {
			this.course_id = course_id;
		}
		public String getCoures_name() {
			return coures_name;
		}
		public void setCoures_name(String coures_name) {
			this.coures_name = coures_name;
		}
		public String getCoures_book() {
			return coures_book;
		}
		public void setCoures_book(String coures_book) {
			this.coures_book = coures_book;
		}
}
