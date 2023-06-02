package operations;

import persona.Contacto;

public class ShowRecords {
    public void showRecords(Contacto[] records){
        System.out.println(records[0].metodoAbstracto());
        for(int i=0;i< records.length;i++){
            System.out.println(records[i]);
        }
    }
}
