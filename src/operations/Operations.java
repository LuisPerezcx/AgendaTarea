package operations;

import menus.MenuRegistration;
import persona.Contacto;

import java.util.Scanner;

public class Operations {
    Contacto[] records;
    MenuRegistration menuRegistration = new MenuRegistration();
    public void regitrationOperation(Scanner scanner){
        int n = menuRegistration.numberRecords(scanner);
        records = new Contacto[n];
        for(int i=0;i<n;i++){
            records[i]=insertData(scanner);
        }

    }
    public Contacto[] requestStudents() {
        return records;
    }
    public Contacto insertData(Scanner scanner){
        String nombre,apellido,empresa,correo;
        int telefono;
        System.out.println("Ingresa nombre: ");
        nombre=scanner.nextLine();
        System.out.println("Ingresa apellido: ");
        apellido=scanner.nextLine();
        System.out.println("Ingresa empresa: ");
        empresa=scanner.nextLine();
        System.out.println("Ingresa telefono: ");
        telefono=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa correo: ");
        correo=scanner.nextLine();
        return  new Contacto(nombre,apellido,empresa,"",correo);
    }
    public void findPerson(Scanner scanner){
        int x=0;
        System.out.println("ingresa el nombre del conatcto a buscar");
        String nombre = scanner.nextLine();
        while (!nombre.equals(records[x].getNombre())){
            x++;
            if(x>=records.length){
                System.out.println("--NO SE ENCONTRO EL ID--");
                return;
            }
        }
        System.out.println(records[x]);
    }
}
