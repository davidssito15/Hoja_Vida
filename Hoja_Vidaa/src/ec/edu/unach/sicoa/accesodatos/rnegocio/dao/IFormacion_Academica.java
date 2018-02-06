
package ec.edu.unach.sicoa.accesodatos.rnegocio.dao;
import ec.edu.unach.sicoa.accesodatos.rnegocio.entidades.*;
import java.util.*;

public interface IFormacion_Academica {
    public int insertar(Formacion_Academica formacion_academica) throws Exception;
    public int modificar(Formacion_Academica formacion_academica) throws Exception;
    public int eliminar(Formacion_Academica formacion_academica) throws Exception;
    public Formacion_Academica obtener(int formacion_academica) throws Exception;
    public List <Formacion_Academica> obtener() throws Exception;
}
