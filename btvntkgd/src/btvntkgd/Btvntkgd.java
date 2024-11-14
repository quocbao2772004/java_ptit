
package btvntkgd;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Btvntkgd 
{

    public static ArrayList<String> save_un = new ArrayList<>();
    public static ArrayList<String> save_pd = new ArrayList<>();
    public static int checkusn(String usrn) throws FileNotFoundException, IOException 
    {
        int ok = -1;
        usrn = usrn.trim();
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("information.txt"))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] sets = line.split("\\s+");
                if (sets[0].equals("Username:")) 
                {
                    count+=1;
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < sets.length; i++) 
                    {
                        sb.append(sets[i]);
                        sb.append(" ");
                    }
                    String usrn2 = sb.toString().trim();
                    if (usrn2.equals(usrn)) 
                    {
                        ok = count; 
                        break;
                    }
                }
            }
        }   
        catch (IOException e) 
        {
            System.out.println("Error reading the file: " + e.getMessage());
        }
            return ok; 
    }
    public static void check_password(String usrn, String pawd, JFrame myFrame) throws FileNotFoundException, IOException
    {
        int ok = -1;
        usrn = usrn.trim();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("information.txt"))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] sets = line.split("\\s+");
                if (sets[0].equals("Username:")) 
                {
                    
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < sets.length; i++) 
                    {
                        sb.append(sets[i]);
                        sb.append(" ");
                    }          
                    save_un.add(sb.toString().trim());
                }
                else if (sets[0].equals("Password:")) 
                {
                    
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < sets.length; i++) 
                    {
                        sb.append(sets[i]);
                        sb.append(" ");
                    }          
                    save_pd.add(sb.toString().trim());
                } 
                
            }
            for(int i=0;i<=save_un.size()-1;i++)
            {
                if(save_un.get(i).equals(usrn))
                {
                    if(save_pd.get(i).equals(pawd))
                    {
                        JOptionPane.showMessageDialog(myFrame, "Login successfully!");
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(myFrame,"Wrong username or password!");
                    }
                    break;
                }
            }
        }   
        catch (IOException e) 
        {
            System.out.println("Error reading the file: " + e.getMessage());
        }
             
    }
    public static void Register_Frame()
    {
        JFrame myFrame = new JFrame();
        myFrame.setSize(750,450);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BoxLayout(myFrame.getContentPane(), BoxLayout.Y_AXIS));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        JLabel myLabel = new JLabel("New User Register");
        myLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        myLabel.setFont(new Font("Arial", Font.BOLD, 24));
        p1.add(myLabel);
        p1.setBorder(BorderFactory.createEmptyBorder(20, 0, 15, 0));
        myFrame.add(p1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3,2, 20,20));
        p2.setBorder(BorderFactory.createEmptyBorder(30, 20, 70, 30));
        String[] words = {"First name", "Username", "Last name", "Password", "Email address", "Mobile number"};
        JTextField firstname = new JTextField(20);
        JTextField username = new JTextField(20);
        JTextField lastname = new JTextField(20);
        JTextField password = new JTextField(20);
        JTextField email = new JTextField(20);
        JTextField mobilePhone = new JTextField(20);
        ArrayList<JTextField> arl = new ArrayList<>();
        arl.add(firstname);
        arl.add(username);
        arl.add(lastname);
        arl.add(password);
        arl.add(email);
        arl.add(mobilePhone);
        for(int i=1;i<=6;i++)
        {
            p2.add(new JLabel(words[i-1]));
            p2.add(arl.get(i-1));                   
        }
        myFrame.add(p2);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNewPage();
            }
        });
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FN = firstname.getText();
                String UN = username.getText();
                String LN = lastname.getText();
                String PW = password.getText();
                String EM = email.getText();
                String MP = mobilePhone.getText();

                try {
                    if (checkusn(UN)==-1) {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("information.txt", true))) {
                            writer.write("First_name: " + FN);
                            writer.newLine();
                            writer.write("Username: " + UN);
                            writer.newLine();
                            writer.write("Last_name: " + LN);
                            writer.newLine();
                            writer.write("Password: " + PW);
                            writer.newLine();
                            writer.write("Email: " + EM);
                            writer.newLine();
                            writer.write("Mobile_phone: " + MP);
                            writer.newLine();
                            JOptionPane.showMessageDialog(myFrame, "Registration Successful!");
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(myFrame, "Error saving information.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(myFrame, "Username is already taken");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Btvntkgd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        p3.add(registerButton);
        p3.add(Box.createHorizontalStrut(500));
        p3.add(loginButton);
        myFrame.add(p3);
        myFrame.setVisible(true);
    }
    public static void main(String[] args) 
    {
        
        Register_Frame();
        
    }
    public static void openNewPage()
    {
        JFrame newFrame = new JFrame();
        newFrame.setSize(550, 300);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setLayout(new BoxLayout(newFrame.getContentPane(), BoxLayout.Y_AXIS));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p1.setBorder(BorderFactory.createEmptyBorder(10, 0, 15, 0));
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 24));
        p1.add(loginLabel);
        newFrame.add(p1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1, 30, 30));
        p2.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
        JTextField username = new JTextField(20);
        JTextField password = new JTextField(20);
        p2.add(new JLabel("Username")); 
        p2.add(username);
        p2.add(new JLabel("Password"));
        p2.add(password);
        newFrame.add(p2);
        
        
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.setBorder(BorderFactory.createEmptyBorder(20,0,30,0));
        JButton loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(220, 50));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String UN = username.getText();
                String PW = password.getText();
                try {
                    check_password(UN, PW, newFrame);
                } catch (IOException ex) {
                    Logger.getLogger(Btvntkgd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        p3.add(loginButton);
        newFrame.add(p3);
        
        newFrame.setVisible(true);
    }
    
}
