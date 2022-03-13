public class Professor extends Education implements MyJob {
    static int entityCounter = 0;
    static double sumSalary = 0;

    public Professor(String name, float age, Sex sex, String interest, double salary){
        super(name, age, sex, interest, salary);
        entityCounter++;
        sumSalary += salary;
        this.setRole(Role.PROFESSOR);
        this.setInterest(interest);

    }

    @Override
    public String shortDescribe() {
        return "I teach students at some universities, my thesis is in " + super.getInterest();
    }

    @Override
    public double getAvgSalary() {
        return sumSalary/entityCounter;
    }
}
