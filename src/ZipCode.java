import java.util.Scanner;

public class ZipCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Boolean adress = sc.hasNext("\\d{2}-\\d{3}");

        if (adress == true) {
            System.out.println("Correct Zip code");
        }else {
            System.out.println("wrong zip code");
        }

    }
}

