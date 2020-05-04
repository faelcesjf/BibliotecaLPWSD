/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.bibliotecalpwsd.Enum;

import br.cesjf.bibliotecalpwsd.strategy.Circular;
import br.cesjf.bibliotecalpwsd.strategy.CircularVip;
import br.cesjf.bibliotecalpwsd.strategy.NaoCircular;
import br.cesjf.bibliotecalpwsd.strategy.TipoEmprestimo;

/**
 *
 * @author rafael
 */
public enum TipoEmprestimoEnum {

    CIRCULAR {
        @Override
        public TipoEmprestimo obterTipoEmprestimo() {
            return new Circular();
        }
    },
    CIRCULAR_VIP {
        @Override
        public TipoEmprestimo obterTipoEmprestimo() {
            return new CircularVip();
        }
    },
    NAO_CIRCULAR {
        @Override
        public TipoEmprestimo obterTipoEmprestimo() {
            return new NaoCircular();
        }
    };
    
            

    
    public abstract TipoEmprestimo obterTipoEmprestimo();
}
