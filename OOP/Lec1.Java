import java.util.*;

public class Lec1 {

    public static class Student {
        String name;
        int rollNumber;
        int maths;
        int english;
        
        public Student(String n, int r, int m, int e) {
            this.name = n;
            this.rollNumber = r;
            this.maths = m;
            this.english = e;
        }
        
        public Student(int m, int e) {
            this.maths = m;
            this.english = e;
        }
        
        // default
        public Student() {
            this.name = "No_Name";
            this.rollNumber = 0;
            this.maths = 0;
            this.english = 0;
        }
        
        public int AvgMarks() {
            int avg = (this.maths + this.english) / 2;
            return avg;
        }
    }
    
	public static void main(String[] args) {
		Student std1 = new Student();
        System.out.println(std1.name + " " + std1.rollNumber);
        
        System.out.println(std1.AvgMarks());
        
        Student std2 = new Student(11, 22);
        System.out.println(std2.name + " " + std2.rollNumber);
        System.out.println(std2.AvgMarks());
    }
}