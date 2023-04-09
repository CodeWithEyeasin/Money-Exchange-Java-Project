import jdk.jfr.Unsigned;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Enter the user name: ");
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        System.out.println("Enter the password: ");
        String pass = sc.next();
        moneyexchanceselection b = new moneyexchanceselection();
        b.setUsername("Eyeasin");
        b.setPass("pass");
        String x = b.getUsername();
        String y = b.getPass();
        int a = x.compareTo(user);
        int c = y.compareTo(pass);
        if (a == 0 && c == 0) {
            b.logindiplay();

            moneyexchanceselection money = new moneyexchanceselection();
            System.out.println("Select Which Currency You Want To Exchange");
            System.out.println("1. Taka" + "\n" + "2. Rupee" + "\n" + "3. Dollar" + "\n" + "4. Qatari Rial" +
                    "\n" + "5. Kuwaiti Dinar" + "\n" + "6. Euro" + "\n" + "7. Egyptian Pound");
        }
        else
        {
            Login l2 = new Login();
            l2.logindiplay();
        }
    }
}