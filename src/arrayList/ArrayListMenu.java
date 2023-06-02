package arrayList;

import menus.MainMenu;

import java.util.Scanner;

public class ArrayListMenu {
    OperationsAList operationsAList = new OperationsAList();
    GetInfo getInfo = new GetInfo();
    public void menu(Scanner scanner){
        int opc = 0;
        while (opc != 4) {
            showOptions();
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc){
                case 1 -> operationsAList.arrayListIngresar(scanner);
                case 2 -> getInfo.get(operationsAList.requestList());
                case 3 -> System.out.println(getInfo.findContact(operationsAList.requestList(),scanner));
                case 4 -> new MainMenu().menu(scanner);
                default -> System.out.println("Opcion invalida");
            }
        }
    }
    private static void showOptions(){
        System.out.println("""
                +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\s
                - ARRAY LIST MENU -\s
                Escriba la operación de consulta a realizar:\s
                1.- Registar nuevo contacto \s
                2.- Mostrar contactos\s
                3.- Buscar\s
                4.- Regresar\s
                """);    }
}
