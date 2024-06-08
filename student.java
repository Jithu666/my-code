 class student {
    int rollNo;
    String studentName;
}
    class Student1 {
        public static void main(String[] args) {
            student obj1 = new student();
            student obj2 = new student();
            obj1.rollNo = 01;
            obj1.studentName = "micheal";
            obj2.rollNo = 02;
            obj2.studentName = "jackson";
            System.out.println(obj1.rollNo + " " + obj1.studentName);
            System.out.println(obj2.rollNo + " " + obj2.studentName);
        }
    }
