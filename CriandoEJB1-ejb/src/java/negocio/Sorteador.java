/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;
import javax.ejb.Stateless;

/**
 *
 * @author Luiz Armando
 */
@Stateless
public class Sorteador implements SorteadorLocal {

    @Override
    public int getNumero() {
        Random gerador = new Random();
        return gerador.nextInt(10);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
