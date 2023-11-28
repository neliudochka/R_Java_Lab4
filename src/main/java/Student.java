/**
 * The Student class represents student object.
 */
public class Student implements Comparable<Student> {
    /**
     * Student's name.
     */
    public String name;
    /**
     * Student's surname.
     */
    public String surname;
    /**
     * Student's number of braincells.
     */
    public int numberOfBrainCells;
    /**
     * The perfect present for student.
     */
    public String perfectPresent;

    /**
     * The number of sleepless nights student had this semester.
     */
    public int numberOfSleeplessNightsInThisSemester;

    /**
     * Creates a Student with specified attributes.
     *
     * @param name Student's name.
     * @param surname Student's surname.
     * @param numberOfBrainCells Student's number of braincells.
     * @param perfectPresent The perfect present for student.
     * @param numberOfSleeplessNightsInThisSemester The number of sleepless nights student had this semester.
     */
    public Student(String name, String surname, int numberOfBrainCells, String perfectPresent, int numberOfSleeplessNightsInThisSemester) {
        this.name = name;
        this.surname = surname;
        this.numberOfBrainCells = numberOfBrainCells;
        this.perfectPresent = perfectPresent;
        this.numberOfSleeplessNightsInThisSemester = numberOfSleeplessNightsInThisSemester;
    }


    /**
     * Compares this student to the other student based on the number of braincells.
     * @param o The other Student object to compare.
     * @return An integer value: 0 if equal, positive if greater, negative if lesser.
     */
    @Override
    public int compareTo(Student o) {
        if(this.numberOfBrainCells > o.numberOfBrainCells) return 1;
        if(this.numberOfBrainCells < o.numberOfBrainCells) return -1;
        return 0;
    }

    /**
     * Generates a string representation of the Student.
     * @return A formatted string representing the Student's attributes.
     */
    @Override
    public String toString()
    {
        return "\n" + "---" + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Number of braincells: " + numberOfBrainCells + "\n" +
                "Perfect Present: " + perfectPresent + "\n" +
                "Number of sleepless nights (in this semester) : " + numberOfSleeplessNightsInThisSemester + "\n" +
                "---" + "\n";
    }
}
