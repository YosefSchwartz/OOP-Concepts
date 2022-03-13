public class Teacher extends Education implements MyJob {
    static int entityCounter = 0;
    static double sumSalary = 0;

    public Teacher(String name, float age, Sex sex, String interest, double salary){
        super(name, age, sex, interest, salary);
        entityCounter++;
        sumSalary += salary;
        this.setRole(Role.TEACHER);
        this.setInterest(interest);

    }

    @Override
    public String shortDescribe() {
        return "I teach children at the local school, and my interest is " + super.getInterest();
    }

    @Override
    public double getAvgSalary() {
        return sumSalary/entityCounter;
    }
}
