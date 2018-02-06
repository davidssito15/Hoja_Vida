/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.sicoa.accesodatos.rnegocio.dao;
import ec.edu.unach.sicoa.accesodatos.rnegocio.entidades.*;
import java.util.*;
public interface ITitulo_posgrado {
    public int insertar(Titulo_Posgrado titulo_posgrado) throws Exception;
    public int modificar(Titulo_Posgrado titulo_posgrado) throws Exception;
    public int eliminar(Titulo_Posgrado titulo_posgrado) throws Exception;
    public Titulo_Posgrado obtener(int titulo_posgrado) throws Exception;
    public List <Titulo_Posgrado> obtener() throws Exception;
}
