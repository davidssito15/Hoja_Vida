
package ec.edu.unach.sicoa.accesodatos.rnegocio.impl;

import ec.edu.unach.sicoa.accesodatos.Conexion;
import ec.edu.unach.sicoa.accesodatos.Parametro;
import ec.edu.unach.sicoa.accesodatos.rnegocio.dao.IDocente;
import ec.edu.unach.sicoa.accesodatos.rnegocio.entidades.Docente;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DocenteImpl implements IDocente{

    @Override
    public int insertar(Docente docente) throws Exception {
        int numFilasAfectadas=0;
        String sql="insert into docente(codigo,cedula,nombres,apellidos,direccion,fecha_nac,email,telefono) values (?),(?),(?),(?),(?),(?),(?),(?)";
        List<Parametro>lstPar=new ArrayList<>();
        lstPar.add(new Parametro(1, docente.getCodigo()));
        lstPar.add(new Parametro(2, docente.getCedula()));
        lstPar.add(new Parametro(3, docente.getNombres()));
        lstPar.add(new Parametro(4, docente.getApellidos()));
        lstPar.add(new Parametro(5, docente.getDireccion()));
        lstPar.add(new Parametro(6, docente.getFecha_nac()));
        lstPar.add(new Parametro(7, docente.getEmail()));
        lstPar.add(new Parametro(8, docente.getTelefono()));
        
        
        Conexion con=null;
        try{
            con=new Conexion();
            con.conectar();
            numFilasAfectadas=con.ejecutaComando(sql, lstPar);
        }catch(Exception e){
            throw e;
        }finally{
            con.desconectar();
        }
        return numFilasAfectadas;
    }

    @Override
    public int modificar(Docente docente) throws Exception {
        int numFilasAfectadas=0;
        String sql="update docente set nombre=? where codigo=?";
        List<Parametro>lstPar=new ArrayList<>();
        lstPar.add(new Parametro(1, docente.getCodigo()));
        lstPar.add(new Parametro(2, docente.getCedula()));
        Conexion con=null;
        try{
            con=new Conexion();
            con.conectar();
            numFilasAfectadas=con.ejecutaComando(sql, lstPar);
        }catch(Exception e){
            throw e;
        }finally{
            con.desconectar();
        }
        return numFilasAfectadas;
        }

    @Override
    public int eliminar(Docente docente) throws Exception {
         int numFilasAfectadas=0;
        return numFilasAfectadas;
       }

    @Override
    public Docente obtener(int codigo) throws Exception {
        Docente docente=null;
        String sql="select codigo,cedula,nombres,apellidos,direccion,fecha_nac,email,telefono from docente where codigo=?";
        List<Parametro>lstPar=new ArrayList<>();
        lstPar.add(new Parametro(1,codigo));
        Conexion con=null;
        try{
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutaQuery(sql,null);
            
            while(rst.next()){
                docente=new Docente();
                docente.setCodigo(rst.getInt(1));
                docente.setCedula(rst.getString(2));
                docente.setNombres(rst.getString(3));
                docente.setApellidos(rst.getString(4));
                docente.setDireccion(rst.getString(5));
                docente.setFecha_nac(rst.getDate(6));
                docente.setEmail(rst.getString(7));
                docente.setTelefono(rst.getString(8));
             
            }
            
        }catch(Exception e){
            throw e;
        }finally{
            con.desconectar();
        }
        return docente;
        }

    @Override
    public List<Docente> obtener() throws Exception {
        List<Docente> lista=new ArrayList<>();
        String sql="select codigo,cedula,nombres,apellidos,direccion,fecha_nac,email,telefono from docente";
        Conexion con=null;
        try{
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutaQuery(sql,null);
            Docente docente=null;
            while(rst.next()){
                docente=new Docente();
                docente.setCodigo(rst.getInt(1));
                docente.setCedula(rst.getString(2));
                docente.setNombres(rst.getString(3));
                docente.setApellidos(rst.getString(4));
                docente.setDireccion(rst.getString(5));
                docente.setFecha_nac(rst.getDate(6));
                docente.setEmail(rst.getString(7));
                docente.setTelefono(rst.getString(8));
                lista.add(docente);
            }
            
        }catch(Exception e){
            throw e;
        }finally{
            con.desconectar();
        }
        return lista;
    }
  
}
