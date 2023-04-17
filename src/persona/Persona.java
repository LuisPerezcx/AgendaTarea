package persona;

public class Persona {
    String nombre;
    String apellidos;
    String empresa;
    int telefono;
    String correo;
    String tono;
    String tonoSms;
    String direccionUrl;
    String direccion;
    String cumpleanos;
    String fecha;
    String relacion;
    String perfilSocial;
    String mensajeriaInstantanea;
    String notas;


    public Persona(String nombre, String apellidos, String empresa, int telefono, String correo, String tono,
                   String tonoSms, String direccionUrl, String direccion, String cumpleanos, String fecha,
                   String relacion, String perfilSocial, String mensajeriaInstantanea, String notas){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.empresa = empresa;
        this.telefono = telefono;
        this.correo = correo;
        this.tono = tono;
        this.tonoSms = tonoSms;
        this.direccionUrl = direccionUrl;
        this.direccion = direccion;
        this.cumpleanos = cumpleanos;
        this.fecha = fecha;
        this.relacion = relacion;
        this.perfilSocial = perfilSocial;
        this.mensajeriaInstantanea = mensajeriaInstantanea;
        this.notas = notas;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEmpresa: " + empresa + "\nTelefono: "+ telefono +
                "\nCorreo:" + correo + "\nTono: " + tono + "\nTono SMS: " + tonoSms + "\nDireccion URL: " +direccionUrl +
                "\nDireccion: " + direccion + "\nCumpleaños: " + cumpleanos + "\nFecha: " + fecha +"\nRelacion: " + relacion +
                "\nPerfil social: " + perfilSocial + "\nMensajeria Instantanea" + mensajeriaInstantanea + "\nNotas" + notas;
    }
    public String getNombre(){
        return nombre;
    }
}

