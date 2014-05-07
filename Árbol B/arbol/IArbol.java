/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Framework: Cupi2Collections
 * Autor: Juan Erasmo G�mez - Marzo 14, 2008
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package arbol;

/**
 * Representa un arbol. 
 * @param <T> Tipo de informaci�n almacenada por el �rbol.
 */
public interface IArbol<T>
{
    
    /**
     * Retorna la altura del �rbol.
     * @return La altura del �rbol.
     */
    public int darAltura();
    
    /**
     * Retorna el n�mero de elementos del �rbol.
     * @return El n�mero de elementos del �rbol.
     */
    public int darPeso();
    
    /**
     * Busca un elemento en el �rbol dado su modelo.
     * @param modelo Descripci�n del elemento que se va a buscar en el �rbol. Debe contener por lo menos la informaci�n m�nima necesaria para que el m�todo de comparaci�n del
     *        nodo pueda establecer una relaci�n de orden.
     * @return T elemento del �rbol que corresponde al modelo o <code>null</code> si este no existe.
     */
    public T buscar(T modelo);
    
}
