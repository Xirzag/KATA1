package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KATA1 {

    public static void main(String[] args) {
        Calendar birthday = GregorianCalendar.getInstance();
        birthday.set(1995,1,26);
        
        Person persona = new Person("Alberto", "Casado", birthday);
        
        System.out.println(persona.getFullName() + " tiene " + persona.getAge() + " años.");
    }
    
}
