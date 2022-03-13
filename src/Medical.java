public abstract class Medical extends Person implements MyJob {
    String specialization;

    public Medical(String name, float age, Sex sex, String specialization, double salary){
        super(name,age,sex,salary);
        this.setJobType("Medical");
        this.setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    protected void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Job Type: " + getJobType() + "\n" + "Specialization: " + getSpecialization() + "\n";
    }
}
