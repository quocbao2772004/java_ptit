package j06004;

public class Management implements Comparable<Management>
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

    public void setEx_name(String ex_name) {
        this.ex_name = ex_name;
    }
    
    public int getGroup() 
    {
        return group;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s %s %d %s", this.id, this.name, this.phone_number, this.group, this.ex_name);
    }
    
    @Override
    public int compareTo(Management o)
    {
        return this.id.compareTo(o.id);
    }
    
}
