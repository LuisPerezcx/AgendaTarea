package persona;

public class Contacto extends Persona {
    private String empresa;

    public Contacto(String nombre, String apellidos, String empresa, String telefono, String correo){
        super(nombre,apellidos,telefono,correo);
        this.empresa = empresa;

    }
    @Override
    public String toString(){
        return super.toString() + "\nEmpresa:" + empresa;
    }
    public String getNombre(){
        return super.getNombre();
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String metodoAbstracto() {
        return "metodo abstracto que no es util para nada pero es abstracto :)";
    }
}

