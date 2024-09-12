import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int k;

        String text;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите текст: ");
        text = sc1.nextLine();

        while (true)
        {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите k: ");
            try
            {
                k = sc2.nextInt();
                break;
            }
            catch (InputMismatchException fg)
            {
                System.out.println("Вы ввели не число.");
            }
        }

        char sym;
        System.out.println("Введите символ для замены: ");
        sym = sc1.next().charAt(0);

        String[] arr = text.split(" ");

        for (int i = 0; i < arr.length; i++)
            if (arr[i].length() >= k)
                arr[i] = arr[i].substring(0, k - 1) + sym + arr[i].substring(k);

        System.out.println("Результат: " + String.join(" ", arr));
    }
}