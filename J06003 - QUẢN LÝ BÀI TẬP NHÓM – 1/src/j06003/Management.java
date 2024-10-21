package j06003;

public class Management 
{
    private String id, name, phone_number;
    private int group;
    private String ex_name;
    public Management(String id, String name, String phone_number, int group) 
    {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.group = group;
    }

    public int getGroup() 
    {
        return group;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s %s", this.id, this.name, this.phone_number);
    }
    
}
