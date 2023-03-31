import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m_d;
        int m_l;
        int w_d;
        int w_l;




        System.out.print("Insert the number of men deposits: ");
        m_d = Integer.parseInt(sc.nextLine());
        System.out.print("Insert the number of men litters: ");
        m_l = Integer.parseInt(sc.nextLine());
        System.out.print("Insert the number of women deposits: ");
        w_d = Integer.parseInt(sc.nextLine());
        System.out.print("Insert the number of women litters: ");
        w_l = Integer.parseInt(sc.nextLine());

        User user1 = new User("M","D",m_d);
        User user2 = new User("M","L",m_l);
        User user3 = new User("F","D",w_d);
        User user4 = new User("F","L",w_l);


        int total_dep = m_d + w_d;
        int total_lit = m_l + w_l;
        int total_fem = w_d + w_l;
        int total_male = m_l + m_d;


        System.out.printf(" Percentage of Female who do not deposit: %.2f %% \n",((double) w_l/total_fem) *100);
        System.out.printf(" Percentage of Male who do not deposit: %.2f %% \n",((double) m_l/total_male) *100);




    }
}