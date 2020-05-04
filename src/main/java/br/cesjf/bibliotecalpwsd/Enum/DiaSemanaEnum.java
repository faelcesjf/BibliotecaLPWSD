/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.bibliotecalpwsd.Enum;

import br.cesjf.bibliotecalpwsd.strategy.*;


/**
 *
 * @author rafael
 */
public enum DiaSemanaEnum {
    
    SUNDAY {
        @Override
        public DiaSemanaStrategy obterDiaSemana() {
           return new SundayStrategy();

        }
    },
    
    MONDAY {
        @Override
        public DiaSemanaStrategy obterDiaSemana() {
            return new MondayStrategy();
        }
    },

 
    TUESDAY {
        @Override
        public DiaSemanaStrategy obterDiaSemana() {
            return new TuesdayStrategy();
        }
    },

  
    WEDNESDAY {
        @Override
        public DiaSemanaStrategy obterDiaSemana() {
            return new WednesdayStrategy();
        }
    },

  
   THURSDAY {
        @Override
        public DiaSemanaStrategy obterDiaSemana() {
            return new ThursdayStrategy();

        }
    },

 
   FRIDAY {
        @Override
        public DiaSemanaStrategy obterDiaSemana() {
            return new FridayStrategy();
        }
    },
    SATURDAY {
        @Override
        public DiaSemanaStrategy obterDiaSemana() {
            return new SaturdayStrategy();
        }
    };
    
    public abstract DiaSemanaStrategy obterDiaSemana();

    
}
