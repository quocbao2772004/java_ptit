package j05021;


public class Student implements Comparable<Student>
{
    private String id, name, Class, email;
    public Student(String id, String name, String Class, String email)
    {
        this.id = id;
        this.name = name;
        this.Class = Class;
        this.email = email;
    }
    @Override
    public int compareTo(Student o)
    {
        return this.id.compareTo(o.id);
    }
    @Override
    public String toString()
    {
        return String.format("%s %s %s %s", this.id, this.name, this.Class, this.email);
    }
}
