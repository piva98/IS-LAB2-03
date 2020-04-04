
package problem;

/**
 *
 * @author Josué Pivaral
 */
public class Honda implements Carro {

       @Override
    public void arrancar() {
       //logica
    }

    @Override
    public void acelerar() {
        throw new UnsupportedOperationException("excepcion"); 
    }
}
