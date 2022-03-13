public class Paramedic extends Medical implements MyJob {
    static int entityCounter = 0;
    static double sumSalary = 0;


    public Paramedic(String name, float age, Sex sex, String specialization, double salary){
        super(name, age, sex, specialization, salary);
        entityCounter++;
        sumSalary += salary;
    }

    @Override
    public String shortDescribe() {
        return "My main job is to give first care in the ambulance";
    }

    @Override
    public double getAvgSalary() {
        return sumSalary/entityCounter;
    }
}
