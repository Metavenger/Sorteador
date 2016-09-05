/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author Luiz Armando
 */
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import negocio.SorteadorLocal;

@Named
@RequestScoped
public class PaginaDaSorteBean {

    @EJB(name = "sorteadorBean")
    private SorteadorLocal sorteadorBean;
    private int valor1, valor2;
    public int getNumero() {
        int numero = 0;
        do{
            numero = sorteadorBean.getNumero();
        }while(valor1 > numero || valor2 < numero);
        return numero;
    }
    public void setValor1(int valor1){
        this.valor1 = valor1;
    }
    public void setValor2(int valor2){
        this.valor2 = valor2;
    }
    public int getValor1(){
        return valor1;
    }
    public int getValor2(){
        return valor2;
    }
}
