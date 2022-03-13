import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /**
         * Create- 3 Doctors, 2 Nurses, 0 Paramedics (in the next section will explained), 3 Teachers, 2 Professors
         *
         * Print - Some Persons, shortDescription() and getSalary()
         */
        Person p1 = new Doctor("Hadar Biton", 29, Sex.FEMALE, "Gynecology", 7000);
        Person p2 = new Nurse("Dvir Lavi", 22, Sex.MALE, "Dermatology", 8000);
        Person p3 = new Doctor("Adi Greenvald", 34, Sex.FEMALE, "Orthopedic", 7000);
        Person p4 = new Professor("Elnatan Berenson", 54, Sex.MALE, "Mathematics", 8000);
        Person p5 = new Teacher("Oded Ganim", 31, Sex.MALE, "Geographic", 7000);
        Person p6 = new Teacher("Raanan Albus", 22, Sex.MALE, "Bible", 8000);
        Person p7 = new Doctor("Tehila Zrihan", 29, Sex.FEMALE, "Cardiology", 18000);
        Person p8 = new Professor("Yair Zohar", 62, Sex.MALE, "Physics", 21000);
        Person p9 = new Nurse("Naama Korakin", 30, Sex.FEMALE, "Gynecology", 7000);
        Person p10 = new Teacher("Chen Nato", 22, Sex.FEMALE, "Sport", 6400);

        // Array of Persons, each element is different class
        Person[] arr = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};

        System.out.println("All persons:\n");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("################################################################################");

        System.out.println("All Teachers:\n");
        Arrays.stream(arr).filter(p -> p.getJobType().compareTo("Education") == 0)
                .map(p -> (Education) p)
                .filter(p -> p.getRole() == Role.TEACHER)
                .forEach(System.out::println);

        Optional<Education> opt = Arrays.stream(arr).filter(p -> p.getJobType().compareTo("Education") == 0)
                .map(p -> (Education) p)
                .filter(p -> p.getRole() == Role.TEACHER)
                .findFirst();

        Teacher t = null;
        if (opt.isPresent())
            t = (Teacher) opt.get();

        System.out.println("The average salary of teachers is: " + String.format("%.2f",t.getAvgSalary()));
    }
}
