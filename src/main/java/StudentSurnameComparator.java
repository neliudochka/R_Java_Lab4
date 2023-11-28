import java.util.Comparator;

/**
 * Comparator for sorting Students based on their surnames in descending order.
 */
public class StudentSurnameComparator implements Comparator<Student> {
    /**
     * Compares two students based on their surnames.
     * @param s1 The first Student object to compare.
     * @param s2 The second Student object to compare.
     * @return An integer value: positive if s2's surname is lexicographically greater,
     *         negative if s1's surname is lexicographically greater,
     *         zero if both surnames are equal.
     */
    @Override
    public int compare(Student s1, Student s2) {
        String surname1 = s1.surname;
        String surname2 = s2.surname;
        return surname2.compareTo(surname1);
    }

}
