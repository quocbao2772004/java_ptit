
package quanlyhoadonbanhang;
import java.util.*;

public class Customer 
{
    private String address, code, name;

    public Customer(String address, String code, String name) {
        this.address = address;
        this.code = code;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    
}
