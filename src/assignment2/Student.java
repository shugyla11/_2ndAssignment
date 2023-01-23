package assignment2;

public class Student extends assignment2.Person {
    private double gpa;
    private static double Stipend = 36660.00;
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString(){
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67){
            return Stipend;
        } else
            return 0;
    }

    @Override
    public int compareTo(Person other) {
        return super.compareTo(other);
    }
}

