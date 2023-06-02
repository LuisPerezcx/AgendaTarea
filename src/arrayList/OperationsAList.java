package arrayList;

import operations.Operations;
import persona.Contacto;

import java.util.ArrayList;
import java.util.Scanner;
public class OperationsAList {
    ArrayList<Contacto> contactoArrayList;
    Operations operations = new Operations();
    public void arrayListIngresar(Scanner scanner){
        contactoArrayList = new java.util.ArrayList<>();
        System.out.println("cuantos Contactos deseas agregar");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<n;i++){
            contactoArrayList.add(operations.insertData(scanner));
        }
    }
    public ArrayList<Contacto> requestList(){
        if(contactoArrayList==null)
            return null;
        return contactoArrayList;
    }
}
