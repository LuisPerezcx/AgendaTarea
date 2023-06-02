package arrayList;

import persona.Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class GetInfo {
    public void get(ArrayList<Contacto> lista){
        for (Contacto contacto : lista) {
            System.out.println(contacto);
        }
    }
    public Contacto findContact(ArrayList<Contacto> contactos, Scanner scanner){
        System.out.println("ingresa el nombre a buscar");
        String search = scanner.nextLine();
        for (Contacto currentContact : contactos) {
            if (currentContact.getNombre().equals(search)) {
                return currentContact;
            }
        }
        return null;
    }
}