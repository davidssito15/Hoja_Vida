
package ec.edu.unach.sicoa.accesodatos.rnegocio.entidades;

public class Formacion_Academica {
    private int cod_Formacion;
    private Docente docente;
    private String pais;
    private String titulo_pregado;
    private String titulo_posgrado;
    private String universidad;

    public Formacion_Academica() {
    }

    public Formacion_Academica(int cod_Formacion, Docente docente, String pais, String Titulo_Pregado, String Titulo_Posgrado, String Universidad) {
        this.cod_Formacion = cod_Formacion;
        this.docente = docente;
        this.pais = pais;
        this.titulo_pregado = titulo_pregado;
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

    public String getTitulo_Pregado() {
        return titulo_pregado;
    }

    public void setTitulo_Pregado(String Titulo_Pregado) {
        this.titulo_pregado = titulo_pregado;
    }

    public String getTitulo_Posgrado() {
        return titulo_posgrado;
    }

    public void setTitulo_Posgrado(String Titulo_Posgrado) {
        this.titulo_posgrado = titulo_posgrado;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String Universidad) {
        this.universidad = universidad;
    }
    
}