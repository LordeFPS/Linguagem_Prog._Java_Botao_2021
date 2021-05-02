/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import java.sql.ResultSet;
/**
 *
 * @author 69146
 */
public interface DaoInterface {
    public boolean salvar();
    public boolean editar();
    public ResultSet getAll(String filtro);
    public Object getById(int id);
}
