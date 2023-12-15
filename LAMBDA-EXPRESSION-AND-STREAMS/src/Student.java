public class Student
{
    private String name;
    private String surname;
    private double score;

    public Student(String name, String surname, double score)
    {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public Double getScore() { return score; }

    public void setScore(double score) { this.score = score; }

    public boolean isNerd() { return this. score == 5; }

    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", score=" + score + '}';
    }
}
