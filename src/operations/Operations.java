package operations;

import menus.MenuRegistration;
import persona.Persona;

import java.util.Scanner;

public class Operations {
    Persona[] records;
    MenuRegistration menuRegistration = new MenuRegistration();
    public void regitrationOperation(Scanner scanner){
        int n = menuRegistration.numberRecords(scanner);
        records = new Persona[n];
        for(int i=0;i<n;i++){
            records[i]=insertData(scanner);
        }

    }
    public Persona[] requestStudents() {
        return records;
    }
    private Persona insertData(Scanner scanner){
        String nombre,apellido,empresa,correo,tono,tonoSms,direccionUrl,direccion,cumpleanos,fecha,relacion,
                perfilSocial,mensajeria,notas;
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
        System.out.println("Ingresa tono: ");
        tono=scanner.nextLine();
        System.out.println("Ingresa tono SMS: ");
        tonoSms=scanner.nextLine();
        System.out.println("Ingresa direccion  URL: ");
        direccionUrl= scanner.nextLine();
        System.out.println("Ingresa direccion: ");
        direccion= scanner.nextLine();
        System.out.println("Ingresa cumpleaños: ");
        cumpleanos= scanner.nextLine();
        System.out.println("Ingresa fecha: ");
        fecha= scanner.nextLine();
        System.out.println("Ingresa relacion: ");
        relacion= scanner.nextLine();
        System.out.println("Ingresa perfil social: ");
        perfilSocial= scanner.nextLine();
        System.out.println("Ingresa mensajeria instantanea: ");
        mensajeria= scanner.nextLine();
        System.out.println("Ingresa notas: ");
        notas=scanner.nextLine();
        return  new Persona(nombre,apellido,empresa,telefono,correo,tono,tonoSms,direccionUrl,direccion,cumpleanos,fecha,relacion,perfilSocial,mensajeria,notas);
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
