import java.util.ArrayList;
import java.util.Scanner;
public class studentmanagesys {
public static void main(String[] args) {
    
//today we are working on student managment system using  array list in java

Scanner sc = new Scanner(System.in);


// array list bnayenge
ArrayList<String>list = new ArrayList<String>();


// loop lagayenge  for run and repaet programme
while (true) {
    System.out.println("1 add");
    System.out.println("2 show");
    System.out.println("3 remove");
    System.out.println("4 update");
    System.out.println("5 Serch");
    System.out.println("6 exit");
    // menu show krne ke lie


int choice = sc.nextInt();   // user se choice lene ke lie
 sc.nextLine();
switch (choice) {
    case 1: 
    System.out.println("Enter student name");   // student ka name add krne ke lie
    String name = sc.nextLine();
    list.add(name);
    break;
    case 2:
        System.out.println(list);  // sb student show krne ke lie
break;

case 3:
    System.err.println("enter index for remove");  // index remove krne ke lie
    int remv = sc.nextInt();
    if (remv<list.size()) {
        list.remove(remv);
        break;
    }
case 4:
    System.out.println("Enter Index");       // kon sa update krna h 
int i = sc.nextInt();

System.out.println("Enter new name"); // new name add krne ke lie
String nam = sc.next();


if (i < list.size()) {
    list.set(i, nam);          // value channge krega
}
break;
case 5: 
System.out.println("Enter Name");
String src = sc.next();
if (list.contains(src)) {  //  list m word serching krne ke lie
    System.out.println("found");
}
else{
    System.out.println("not found");
}
break;
case 6:
    return;
 



}

}
}    
}
