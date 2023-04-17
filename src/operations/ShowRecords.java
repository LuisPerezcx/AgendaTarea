package operations;

import persona.Persona;

import java.util.Arrays;

public class ShowRecords {
    public void showRecords(Persona [] records){
        for(int i=0;i< records.length;i++){
            System.out.println(records[i]);
        }
    }
}
