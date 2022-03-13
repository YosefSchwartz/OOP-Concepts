public class Doctor extends Medical implements MyJob {
    static int entityCounter = 0;
    static double sumSalary = 0;

    public Doctor(String name, float age, Sex sex, String specialization, double salary){
        super(name, age, sex, specialization, salary);
        entityCounter++;
        sumSalary += salary;
        this.setName("Dr. " + getName());

    }

    @Override
    public String shortDescribe() {
        return "My main job is to take care of patients, do surgery and prescribe medication";
    }

    @Override
    public double getAvgSalary() {
        return sumSalary/entityCounter;
    }
}
