import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        // A = 3,14 * r²
        double raio;
        double area;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        sc.close();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área desse círculo em cm² é " + area);
        
    }
    
}