/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.ClienteEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface IClienteDAO {
    
    void registrarCliente(ClienteEntidad cliente) throws PersistenciaException;
    
    boolean validarCliente(ClienteEntidad cliente) throws PersistenciaException;
    
    public int buscarIdCliente(ClienteEntidad cliente) throws PersistenciaException;
    
    public void comprarBoleto(int id, int cant) throws PersistenciaException;
    
    public List<ClienteEntidad> buscarClientesTabla() throws PersistenciaException;

    public ClienteEntidad convertirAEntidad(ResultSet resultado) throws SQLException ;
    
}
