import java.util.Scanner;

public class TinhCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("nhap vao can nang cua ban:");
        weight = scanner.nextDouble();
        System.out.print("nhap vao chieu cao cua ban:");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20s%s", bmi, "may gay qua");
        else if (bmi < 25.0)
            System.out.printf("%-20s%s",bmi,"May ngon day" );
        else if (bmi<30.0)
            System.out.printf("%-20s%s",bmi,"so big");
        else
            System.out.printf("may bi beo phi day");
    }
}
