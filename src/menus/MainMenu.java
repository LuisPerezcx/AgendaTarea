package menus;

import arrayList.ArrayListMenu;
import operations.Operations;
import operations.ShowRecords;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    Operations operations = new Operations();
    ShowRecords showRecords = new ShowRecords();
    ArrayListMenu arrayListMenu = new ArrayListMenu();
    public void menu(Scanner scanner){
        int opc = 0;
        while (opc != 5) {
            showOptions();
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc){
                case 1 -> operations.regitrationOperation(scanner);
                case 2 -> showRecords.showRecords(operations.requestStudents());
                case 3 -> operations.findPerson(scanner);
                case 4 -> arrayListMenu.menu(scanner);
                case 5 -> System.out.println("salir");
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
                4.- ArrayList Menu\s
                5.- Salir\s
                """);    }
}
