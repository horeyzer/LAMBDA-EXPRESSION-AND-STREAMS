import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StudentsScoreFunctional
{
    static void fillTheList(ArrayList<Student> students)
    {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("studentsEN.txt")))
        {
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] words = line.split("\\s");
                String surname = words[0].trim();
                String name = words[1].trim();
                String score = words[2].trim();
                students.add(new Student(name, surname, Double.parseDouble(score)));
            }
        }
        catch (IOException e)
        {
            System.out.println("Error IO");
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        fillTheList(students);

        //printing students with score 5
        System.out.println("Students with score 5:");
        students.stream()
                .filter((student -> student.getScore() == 5))
                .forEach(System.out::println);

        //calculating average score
        System.out.println("Average score: " +
                students.stream()
                        .mapToDouble(Student::getScore)
                        .average()
                        .getAsDouble());

        //calculating number of students with score 5
        System.out.println("Number of students with score 5: " +
                students.stream()
                        .filter((student -> student.getScore() == 5))
                        .count());
    }
}
