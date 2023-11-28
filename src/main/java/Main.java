import java.util.Arrays;

/**
 * Main class demonstrating sorting of Student objects based on different criteria.
 */
public class Main {
    /***
     * An entry point of the program. It creates an array of Students objects,
     * sorts them, and display sorted array.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alinochka", "Dubchak", 2147483646, "poster with student-kittens", 87),
                new Student("Milochka", "Gorbunova", -2, "two braincells", 44),
                new Student("Vita", "Andruhiv", 101, "coursework", 0 ),
                new Student("Vika", "Myts", 3, "Krk", 45),
                new Student("Svitlanka", "Barytska", 1000, "sleep", -2147483646)
        };

        Arrays.sort(students);
        System.out.println("By numberOfBrainCells (increase)");
        System.out.println(Arrays.toString(students));


        Arrays.sort(students, new StudentSurnameComparator());
        System.out.println("By Surname (decrease)");
        System.out.println(Arrays.toString(students));

    }



}
