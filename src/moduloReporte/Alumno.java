package moduloReporte;

public class Alumno {
    private int codAlumno;
    private String nombres;
    private String apellidos;
    private String dni;
    private int edad;
    private int celular;
    private int estado;
    private int incrementoCodigoAlumno = 202010000;

    /*
    * Campo estado:

    0 = registrado
    1 = matriculado
    2 = retirado
    * */


    public Alumno() {
        this.codAlumno = ++incrementoCodigoAlumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodAlumno() {
        return codAlumno;
    }

    

}
