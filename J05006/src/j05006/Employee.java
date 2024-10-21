package j05006;


public class Employee 
{
    private String id, name, gender, dob, addr, code, signing_date;

    public Employee(String id, String name, String gender, String dob, String addr, String code, String signing_date) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.addr = addr;
        this.code = code;
        this.signing_date = signing_date;
    }
    @Override
    public String toString()
    {
        return String.format("%s %s %s %s %s %s %s", id, name, gender, dob, addr, code, signing_date);
    }
}
