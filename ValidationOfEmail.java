package assignment;
import java.util.regex.*;    
import java.util.*;    
public class ValidationOfEmail{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("sravani199@gmail.com");  
        emails.add("ramyapriya12@gmail.com");    
        emails.add("@prasanthi.gmail.com");  
        emails.add("lavanya#gmail.com");  
        String regex = "^(.+)@(.+)$";   
        Pattern pattern = Pattern.compile(regex);  
        for(String email : emails){    
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  