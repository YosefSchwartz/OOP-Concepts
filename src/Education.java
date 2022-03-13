enum Role {
    TEACHER,
    PROFESSOR
}

public abstract class Education extends Person implements MyJob {
    String interest;
    Role role;

    public Education(String name, float age, Sex sex, String interest, double salary){
        super(name,age,sex, salary);
        this.setJobType("Education");
        this.setInterest(interest);
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        String ans =  super.toString() +
                "Job Type: " + getJobType() + "\n" + "Interest: " + getInterest() + "\n" + "Role: ";
        if(getRole() == Role.PROFESSOR)
            ans+= "Professor\n";
        else
            ans += "Teacher\n";
        return ans;
    }
}
