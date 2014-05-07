import arbol.ElementoExisteException;
import arbol.ElementoNoExisteException;
import arbolB.ArbolB;


public class Pruebas {

    /**
     * @param args
     * @throws ElementoExisteException 
     * @throws ElementoNoExisteException 
     */
    public static void main(String[] args) throws ElementoExisteException, ElementoNoExisteException {
        // TODO Auto-generated method stub
        ArbolB<Integer> test = new ArbolB<Integer>(5);
        test.insertar(78);
        test.insertar(7);
        test.insertar(8);
        test.insertar(20);
        System.out.println(test.cardinal());
        test.eliminar(8);
        System.out.println(test.cardinal());
    }

}
