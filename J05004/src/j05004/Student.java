package j05004;

public class Student 
{
    private String id, name, Class, dob;
    private double gpa;

    public Student(String id, String name, String Class, String dob, double gpa) {
        this.id = id;
        setName(name);
        this.Class = Class;
        setDob(dob);
        this.gpa = gpa;
    }

    public void setName(String name) {
        String[] set = name.toLowerCase().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String i:set)
        {
            String word = i.substring(0,1).toUpperCase() + i.substring(1, i.length());
            sb.append(word);
            sb.append(" ");
        }
        this.name = sb.toString().trim();
    }

    public void setDob(String dob) {
        String[] set = dob.trim().split("/");
        this.dob = String.format("%02d/", Integer.valueOf(set[0])) + String.format("%02d/", Integer.valueOf(set[1])) + String.format("%04d", Integer.valueOf(set[2]));
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s %s %s %.2f", this.id, this.name, this.Class, this.dob, this.gpa);
    }
}
