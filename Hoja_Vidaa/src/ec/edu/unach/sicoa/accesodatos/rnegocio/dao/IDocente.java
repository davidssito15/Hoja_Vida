
package ec.edu.unach.sicoa.accesodatos.rnegocio.dao;

import ec.edu.unach.sicoa.accesodatos.rnegocio.entidades.Docente;
import java.util.*;


public interface IDocente {
    public int insertar(Docente docente) throws Exception;
    public int modificar(Docente docente) throws Exception;
    public int eliminar(Docente docente) throws Exception;
    public Docente obtener(int codigo) throws Exception;
    public List <Docente> obtener() throws Exception;
    
}
