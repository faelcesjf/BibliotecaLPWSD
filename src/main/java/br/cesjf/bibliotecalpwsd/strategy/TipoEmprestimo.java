/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.bibliotecalpwsd.strategy;

import java.util.Date;

/**
 *
 * @author rafael
 */
public interface TipoEmprestimo {
    
    
    public Date calculaDataDevolucao(Date dataEmprestimo);
    
}
