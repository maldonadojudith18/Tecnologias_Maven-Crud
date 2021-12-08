/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.data;

/**
 *
 * @author judit
 */
public class empresaDao {
    public enum TYPE_DAO{EMPLEADO};
    
    public static DaoGeneral getDao(TYPE_DAO type){
        DaoGeneral componente = null;
        switch(type){
            
            case EMPLEADO:
                componente = new DaoEmpleado();
                break;
        }                
        return componente;
    }
}
