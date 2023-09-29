package com.org;

public class rabbit {
	 static {
		 System.out.println("class loading");
	 }
	 {
	 System.out.println("object is created");
	 }
	 
	 public void init() {
		 System.out.println("init meyhod is created");
	 }
	 
	 public void destroy() {
		 System.out.println("destroy method is excute");
	 }
}
