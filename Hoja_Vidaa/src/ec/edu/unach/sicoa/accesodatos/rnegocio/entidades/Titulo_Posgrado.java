/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.sicoa.accesodatos.rnegocio.entidades;

 

public class Titulo_Posgrado {
    private int cod_Formacion;
    private Docente docente;
    private String pais;
    private String titulo_posgrado;
    private String universidad;

    public Titulo_Posgrado() {
    }

    public Titulo_Posgrado(int cod_Formacion, Docente docente, String pais, String titulo_posgrado, String universidad) {
        this.cod_Formacion = cod_Formacion;
        this.docente = docente;
        this.pais = pais;
        this.titulo_posgrado = titulo_posgrado;
        this.universidad = universidad;
    }

    public int getCod_Formacion() {
        return cod_Formacion;
    }

    public void setCod_Formacion(int cod_Formacion) {
        this.cod_Formacion = cod_Formacion;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTitulo_posgrado() {
        return titulo_posgrado;
    }

    public void setTitulo_posgrado(String titulo_posgrado) {
        this.titulo_posgrado = titulo_posgrado;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
}
