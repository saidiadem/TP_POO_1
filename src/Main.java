
    public class Main {
    //develop some tests for all the classes
    public static void main(String[] args) {
        //create a new bank account
        BankAccount bankAccount = new BankAccount(100, "John Doe", 12345);
        //deposit some money into the account
        bankAccount.deposit(50);
        //withdraw some money from the account
        bankAccount.withdraw(25);
        //print the account balance to the screen
        System.out.println(bankAccount.getBalance());
        //create a new instructor
        Instructor instructor = new Instructor(1, "John", "Smith");
        //create a new course
        Course course = new Course(1, "Java Basics", instructor);
        //create a new student
        Student student = new Student(1, "John", "Doe");
        //enroll the student in the course
        student.enroll(course);
        //print the student's courses to the screen
        for (Course c : student.getCourses()) {
            System.out.println(c.getCourseName());
        }
        //test the customarraylist
        System.out.println("Testing the customarraylist");
        CustomArrayList customArrayList = new CustomArrayList();
        //add some elements to the customarraylist
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        //print the size of the custom-arraylist to the screen
        System.out.println(customArrayList.size());
        System.out.print("elements={");
        //print the elements of the customarraylist to the screen
        System.out.print(customArrayList.get(0)+",");
        System.out.print(customArrayList.get(1)+",");
        System.out.print(customArrayList.get(2));
        System.out.println("}");
        //add an element to the customarraylist at a specific index
        customArrayList.add(1, 4);
        //print the size of the customarraylist to the screen
        System.out.println(customArrayList.size());
        System.out.print("elements={");
        //print the elements of the customarraylist to the screen
        System.out.print(customArrayList.get(0)+",");
        System.out.print(customArrayList.get(1)+",");
        System.out.print(customArrayList.get(2)+",");
        System.out.print(customArrayList.get(3));
        System.out.println("}");
        //print whether the customarraylist is empty to the screen
        System.out.println(customArrayList.isEmpty());
        //print whether the customarraylist contains an element to the screen
        System.out.println(customArrayList.isIn(4));
        //print the index of an element in the customarraylist to the screen
        System.out.println("4 is at position "+customArrayList.find(4));
        //remove an element from the customarraylist
        customArrayList.remove(4);
        //print the size of the customarraylist to the screen
        System.out.println(customArrayList.size());
        System.out.print("elements={");
        //print the elements of the customarraylist to the screen
        System.out.print(customArrayList.get(0)+",");
        System.out.print(customArrayList.get(1)+",");
        System.out.print(customArrayList.get(2));
        System.out.print("}");






    }
}