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
 * Representa un arbol que ordene sus elementos de alguna forma.
 * @param <T> Tipo de elemento a guardar en el arbol.
 */
public interface IArbolOrdenado<T extends Comparable<? super T>> extends IArbol<T>
{

    /**
     * Inserta un nuevo elemento en el �rbol.
     * 
     * @param elem Elemento a insertar.
     * @throws ElementoExisteException Si el elemento a insertar ya se encuentra en el �rbol
     */
    public void insertar( T elem ) throws ElementoExisteException;

    /**
     * Eliminar un elemento del �rbol.
     * 
     * @param elem Elemento a eliminar del �rbol.
     * @throws ElementoNoExisteException Si el elemento a eliminar no es encontrado en el �rbol.
     */
    public void eliminar( T elem ) throws ElementoNoExisteException;

}
