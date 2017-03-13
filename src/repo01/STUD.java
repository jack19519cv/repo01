package repo01;
import java.util.ArrayList;


public class STUD {

	public static void main(String[] args) {
Student stud[] = new  Student[3];
for(int i=0 ;i<3;i++){

}

	}
	class Student{
		private  String name,id,email;
		private ArrayList<Course>courseList; 
		 public  Student(String name1,String id1,String email1){
		name= name1;
		id =id1;
		email =email1;
		courseList = new ArrayList<Course>();
		}
		 public void addCourse(Course course){
			 courseList.add(course);
		 }
		 class Course{
			 private String cousName,cousid,cousRoom;
			 private static int count=0;
			 public Course(String name,String id){
				 cousName=name;
				 cousid=id;
				 count++;
			 }
			 public static int getCount(){
				 return count;
			 }
		 }
		 public void setname(String name2){
			
			 name=name2;
		 }
		 public void setid(String id2){
			 id=id2;
		 }
		 public void setemail(String email2){
			 email=email2;
		 }
		 public String getname(){
				return name;
			}
		 public String getid(){
				return id;
			}
		 public String getemail(){
				return email;
			}
		 public void showAll(){
			 System.out.println("name:"+name);
			 System.out.println("id:"+id);
			 System.out.println("email:"+email);
		 }
		}
	

}
