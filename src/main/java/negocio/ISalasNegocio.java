/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.SalaDTO;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ISalasNegocio {
 
    public List<SalaDTO> buscarSalasTabla() throws NegocioException;    
    
}
