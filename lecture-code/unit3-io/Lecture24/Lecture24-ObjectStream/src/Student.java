class Student extends Person {
    String course;
    int fee;

    public Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }
}