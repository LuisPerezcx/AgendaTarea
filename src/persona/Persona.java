package persona;

public abstract class Persona {
    private String  nombre;
    private String apellidos;
    private String telefono;
    private String correo;

    public Persona(String nombre, String apellido,String telefono,String correo){
        this.nombre=nombre;
        this.apellidos=apellido;
        this.telefono=telefono;
        this.correo=correo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public abstract String metodoAbstracto();
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nTelefono: "+ telefono +
                "\nCorreo:" + correo;
    }

}
