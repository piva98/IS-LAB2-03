package solution;

/**
 *
 * @author Josué Pivaral
 */
public class Honda implements Carro, Movimiento {

       @Override
    public void arrancar() {
       //logica
    }

    @Override
    public void acelerar() {
        throw new UnsupportedOperationException("excepcion"); 
    }
}
