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
        while (true){
            moneyexchanceselection money = new moneyexchanceselection();
            System.out.println("Select Which Currency You Want To Exchange");
            System.out.println("1. Taka" + "\n" + "2. Rupee" + "\n" + "3. Dollar" + "\n" + "4. Qatari Rial" +
                    "\n" + "5. Kuwaiti Dinar" + "\n" + "6. Euro" + "\n" + "7. Egyptian Pound");
            Scanner input = new Scanner(System.in);
            int k = input.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("Taka: ");
                    double taka = (int) input.nextDouble();
                    System.out.println("Choose Your Desired Currency");
                    System.out.println("1. Rupee" + "\n" + "2. Dollar" + "\n" + "3. Qatari Rial" +
                            "\n" + "4. Kuwaiti Dinar" + "\n" + "5. Euro" + "\n" + "6. Egyptian Pound");
                    int m = input.nextInt();
                    switch (m) {
                        case 1:
                            moneyexchanceselection.rupee(taka);
                            break;
                        case 2:
                            moneyexchanceselection.dollar(taka);
                            break;
                        case 3:
                            moneyexchanceselection.qataririal(taka);
                            break;
                        case 4:
                            moneyexchanceselection.kuwaitidinar(taka);
                            break;
                        case 5:
                            moneyexchanceselection.euro(taka);
                            break;
                        case 6:
                            moneyexchanceselection.egyptianpound(taka);
                    }
                    break;
                case 2:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("Rupee: ");
                    double rupee = (int) input.nextDouble();
                    System.out.println("Choose Your Desired Currency");
                    System.out.println("1. taka" + "\n" + "2. Dollar" + "\n" + "3. Qatari Rial" +
                            "\n" + "4. Kuwaiti Dinar" + "\n" + "5. Euro" + "\n" + "6. Egyptian Pound");
                    int d = input.nextInt();
                    switch (d) {
                        case 1:
                            moneyexchanceselection.taka(rupee);
                            break;
                        case 2:
                            moneyexchanceselection.dollar1(rupee);
                            break;
                        case 3:
                            moneyexchanceselection.qataririal1(rupee);
                            break;
                        case 4:
                            moneyexchanceselection.kuwaitidinar1(rupee);
                            break;
                        case 5:
                            moneyexchanceselection.euro1(rupee);
                            break;
                        case 6:
                            moneyexchanceselection.egyptianpound1(rupee);
                    }
                    break;
                case 3:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("Dollar: ");
                    double Dollar = (int) input.nextDouble();
                    System.out.println("Choose Your Desired Currency");
                    System.out.println("1. taka" + "\n" + "2. Rupee" + "\n" + "3. Qatari Rial" +
                            "\n" + "4. Kuwaiti Dinar" + "\n" + "5. Euro" + "\n" + "6. Egyptian Pound");
                    int e = input.nextInt();
                    switch (e) {
                        case 1:
                            moneyexchanceselection.taka1(Dollar);
                            break;
                        case 2:
                            moneyexchanceselection.rupee2(Dollar);
                            break;
                        case 3:
                            moneyexchanceselection.qataririal2(Dollar);
                            break;
                        case 4:
                            moneyexchanceselection.kuwaitidinar2(Dollar);
                            break;
                        case 5:
                            moneyexchanceselection.euro2(Dollar);
                            break;
                        case 6:
                            moneyexchanceselection.egyptianpound2(Dollar);
                    }
                    break;
                case 4:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("Qatar Riyal: ");
                    double qatarriyal = (int) input.nextDouble();
                    System.out.println("Choose Your Desired Currency");
                    System.out.println("1. taka" + "\n" + "2. Rupee" + "\n" + "3. Dollar" +
                            "\n" + "4. Kuwaiti Dinar" + "\n" + "5. Euro" + "\n" + "6. Egyptian Pound");
                    int f = input.nextInt();
                    switch (f) {
                        case 1:
                            moneyexchanceselection.taka2(qatarriyal);
                            break;
                        case 2:
                            moneyexchanceselection.rupee3(qatarriyal);
                            break;
                        case 3:
                            moneyexchanceselection.dollar3(qatarriyal);
                            break;
                        case 4:
                            moneyexchanceselection.kuwaitidinar3(qatarriyal);
                            break;
                        case 5:
                            moneyexchanceselection.euro3(qatarriyal);
                            break;
                        case 6:
                            moneyexchanceselection.egyptianpound3(qatarriyal);
                    }
                    break;
                case 5:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("Kuwaiti Dinar: ");
                    double KuwaitiDinar = (int) input.nextDouble();
                    System.out.println("Choose Your Desired Currency");
                    System.out.println("1. taka" + "\n" + "2. Rupee" + "\n" + "3. Dollar" +
                            "\n" + "4. Qatar Riyal" + "\n" + "5. Euro" + "\n" + "6. Egyptian Pound");
                    int g = input.nextInt();
                    switch (g) {
                        case 1:
                            moneyexchanceselection.taka4(KuwaitiDinar);
                            break;
                        case 2:
                            moneyexchanceselection.rupee4(KuwaitiDinar);
                            break;
                        case 3:
                            moneyexchanceselection.dollar4(KuwaitiDinar);
                            break;
                        case 4:
                            moneyexchanceselection.qataririal4(KuwaitiDinar);
                            break;
                        case 5:
                            moneyexchanceselection.euro4(KuwaitiDinar);
                            break;
                        case 6:
                            moneyexchanceselection.egyptianpound4(KuwaitiDinar);
                    }
                    break;
                case 6:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("Euro: ");
                    double Euro = (int) input.nextDouble();
                    System.out.println("Choose Your Desired Currency");
                    System.out.println("1. taka" + "\n" + "2. Rupee" + "\n" + "3. Dollar" +
                            "\n" + "4. Qatar Riyal" + "\n" + "5. Kuwaiti Dinar" + "\n" + "6. Egyptian Pound");
                    int h = input.nextInt();
                    switch (h) {
                        case 1:
                            moneyexchanceselection.taka5(Euro);
                            break;
                        case 2:
                            moneyexchanceselection.rupee5(Euro);
                            break;
                        case 3:
                            moneyexchanceselection.dollar5(Euro);
                            break;
                        case 4:
                            moneyexchanceselection.qataririal5(Euro);
                            break;
                        case 5:
                            moneyexchanceselection.kuwaitidinar5(Euro);
                            break;
                        case 6:
                            moneyexchanceselection.egyptianpound5(Euro);
                    }
                    break;
                case 7:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("Egyptian Pound: ");
                    double egyptianpound = (int) input.nextDouble();
                    System.out.println("Choose Your Desired Currency");
                    System.out.println("1. taka" + "\n" + "2. Rupee" + "\n" + "3. Dollar" +
                            "\n" + "4. Qatar Riyal" + "\n" + "5. Kuwaiti Dinar" + "\n" + "6. Euro");
                    int i = input.nextInt();
                    switch (i) {
                        case 1:
                            moneyexchanceselection.taka6(egyptianpound);
                            break;
                        case 2:
                            moneyexchanceselection.rupee6(egyptianpound);
                            break;
                        case 3:
                            moneyexchanceselection.dollar6(egyptianpound);
                            break;
                        case 4:
                            moneyexchanceselection.qataririal6(egyptianpound);
                            break;
                        case 5:
                            moneyexchanceselection.kuwaitidinar6(egyptianpound);
                            break;
                        case 6:
                            moneyexchanceselection.euro6(egyptianpound);
                    }
                    break;

            }

        }
        }

        else
        {
            Login l2 = new Login();
            l2.logindiplay();
        }
    }
}
