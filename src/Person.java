enum Sex{
    MALE,
    FEMALE
}
abstract class Person implements MyJob {
    String name;
    float age;
    Sex sex;
    String jobType = null;
    double salary;

    public Person(String name, float age,Sex sex, double salary){
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setSalary(salary);
    }

    public float getAge() {
        return age;
    }

    protected void setAge(float age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    protected void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getJobType() {
        return jobType;
    }

    protected void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    protected void setSalary(double salary) {
        this.salary = salary;
    }


    public String toString(){
        String out_name = "Name: " + this.getName() + "\n";
        String out_age = "Age: " + this.getAge() + "\n";
        String out_sex = "Sex: ";
        if (getSex() == Sex.FEMALE)
            out_sex += "F\n";
        else
            out_sex += "M\n";
        String out_salary = "Salary: " + this.getSalary() + "\n";

        return out_name + out_age + out_sex + out_salary;
    }
    @Override
    public abstract String shortDescribe();
    @Override
    public abstract double getAvgSalary();


}
