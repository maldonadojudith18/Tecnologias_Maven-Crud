/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.data;

import java.util.ArrayList;

/**
 *
 * @author judit
 */
public interface DaoGeneral <T>{
     public boolean add(T pojo);
    public boolean delete(T pojo);
    public boolean update(T pojo);
    public T read(int id );
    public ArrayList<T> readAll();
}
