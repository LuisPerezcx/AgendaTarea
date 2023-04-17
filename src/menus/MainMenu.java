package menus;

import operations.Operations;
import operations.ShowRecords;

import java.util.Scanner;

public class MainMenu {
    Operations operations = new Operations();
    ShowRecords showRecords = new ShowRecords();
    public void menu(Scanner scanner){
        int opc = 0;
        while (opc != 4) {
            showOptions();
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc){
                case 1 -> operations.regitrationOperation(scanner);
                case 2 -> showRecords.showRecords(operations.requestStudents());
                case 3 -> operations.findPerson(scanner);
                case 4 -> System.out.println("-SALIR-");
                default -> System.out.println("Opcion invalida");
            }
        }
    }
    private static void showOptions(){
        System.out.println("""
                +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\s
                Escriba la operación de consulta a realizar:\s
                1.- Registar nuevo contacto \s
                2.- Mostrar contactos\s
                3.- Buscar\s
                4.- Salir\s
                """);    }
}
