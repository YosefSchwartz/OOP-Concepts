public class Nurse extends Medical implements MyJob {
    static int entityCounter = 0;
    static double sumSalary = 0;

    public Nurse(String name, float age, Sex sex, String specialization, double salary){
        super(name, age, sex, specialization, salary);
        entityCounter++;
        sumSalary += salary;
    }

    @Override
    public String shortDescribe() {
        return "My main job is to be assistance of the doctor, do small procedures and prepare the patients for the surgery";
    }

    @Override
    public double getAvgSalary() {
        return sumSalary/entityCounter;
    }
}
