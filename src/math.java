import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char f;

        System.out.println("Choose any letter from A to E:");
        f=sc.next().charAt(0);
        System.out.println("You choose:"+f);
        char x ='a';
        switch (f)
        {
            case 'a':
                System.out.println("apple");
                break;
            case 'b':
                System.out.println("banana");
                break;
            case 'c':
                System.out.println("cherries");
                break;
            case 'd':
                System.out.println("dragon fruit");
                break;
            case 'e':
                System.out.println("elder berry");
                break;

            default:
                System.out.println("not in a fruit");
        }
        System.out.println(f);
    }
}
