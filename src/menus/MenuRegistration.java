package menus;

import java.util.Scanner;

public class MenuRegistration {
    public int numberRecords(Scanner scanner){
        System.out.println("ingresa el numero de registros que deseas hacer");
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }
}
