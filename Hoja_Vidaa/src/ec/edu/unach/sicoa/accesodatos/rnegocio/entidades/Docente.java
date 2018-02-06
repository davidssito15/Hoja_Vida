
package ec.edu.unach.sicoa.accesodatos.rnegocio.entidades;

import java.util.Date;
import java.util.*;

public class Docente {
     private int codigo;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date fecha_nac;
    private String email;
    private String telefono;

    public Docente(int codigo, String cedula, String nombres, String apellidos, String direccion, Date fecha_nac, String email, String telefono) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
        this.email = email;
        this.telefono = telefono;
    }

     public Docente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}