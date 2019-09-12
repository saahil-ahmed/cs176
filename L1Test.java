package s1219200.cs176.lab02;

public class L1Test {

 public static void main(String[] args) { 
  System.out.println( "Lab 1"); 
  
  // instantiate Student List Class 
  
  StudentList cs176List = new StudentList(15); 
  
  // instantiate a student 
  
  Student s1 = new Student ("Ahmed, Saahil", "1219200", "s1219200@monmouth.edu", "CS", 2, "E.Cesario", 1.0, 2022);
  Student s2 = new Student ("Berardis, Anthony William", "1297598", "s1297598@monmouth.edu", "CS", 2, "R.Scherl", 1.0,2022);
  Student s3 = new Student ("Clappsy , Thomas V" , "1218375", "s1218375@monmouth.edu", "CS",2, "J. Kretsch", 1.0,2022);
  Student s4 = new Student("Coyle, SHannon Kathryn", "1226097", "s1226097@monmouth.edu", "SE", 2, "J.Kretsch", 1.0,2022); 
  Student s5 = new Student("Fahad, Muhammad", "1212339", "s1212339@monmouth.edu", "CS", 2, "E. Cesario", 1.0,2022); 
  Student s6 = new Student("Johnson, Spencer Christian", "1224708", "s1224708@monmouth.edu", "CS", 2, "J. Chung", 1.0,2022);
  Student s7 = new Student("Jones, Matthew Aubyn", "1095689", "s1095689@monmouth.edu", "CS",2, "R. Scherl", 1.0,2022);
  Student s8 = new Student("Kliks, Angela", "1137151", "s1137151", "CS", 2, "L. Zheng", 1.0,2022); 
  Student s9 = new Student("Krempa, Ian Edward","1233625", "s1233625@monmouth.edu", "CS", 2, "C.Yu", 1.0,2022); 
  Student s10 = new Student("Marquez, Veronica" , "1125739", "s1125739@monmouth.edu", "CS", 3, "J. Kretsch", 1.0,2022);
  Student s11 = new Student("McKnight, Anthony M", "1249736", "s1249736@monmouth.edu", "CS", 2, "C. Yu", 1.0,2022);
  Student s12 = new Student("Patel, Premkumar K", "1205153", "s1205153@monmouth.edu", "CS", 2, "L. Zheng", 1.0,2022);
  Student s13 = new Student("Patel, Sahil T", "1245759", "s1245759@monmouth.edu", "CS", 2, "J. Kretsch", 1.0,2022);
  Student s14 = new Student("Robinson, Annabelle Indiana", "1212304", "s1212304@monmouth.edu", "CS", 2, "J. Kretsch", 1.0,2022); 
  Student s15 = new Student("Vella, Nicholas James", "0999371", "s0999371@monmouth.edu", "CS", 4, "G. Eckert", 1.0,2022); 
  
  cs176List.addStudent(s1);
  cs176List.addStudent(s2);
  cs176List.addStudent(s3);
  cs176List.addStudent(s4);
  cs176List.addStudent(s5);
  cs176List.addStudent(s6);
  cs176List.addStudent(s7);
  cs176List.addStudent(s8);
  cs176List.addStudent(s9);
  cs176List.addStudent(s10);
  cs176List.addStudent(s11);
  cs176List.addStudent(s12);
  cs176List.addStudent(s13);
  cs176List.addStudent(s14);
  cs176List.addStudent(s15);

  cs176List.listStudents(); 
  
  Integer CS = cs176List.studentCount("CS");
  Integer HIS = cs176List.studentCount("HIS");
  Integer SE = cs176List.studentCount("SE");
  
  System.out.println("Total students in CS: " + CS);
  System.out.println("Total students in HIS: " + HIS);
  System.out.println("Total students in SE: " + SE);
  
  
 
 }
}