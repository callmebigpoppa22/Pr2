/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: ElementoNoExisteException.java,v 1.2 2008/09/22 20:21:25 alf-mora Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Framework: Cupi2Collections
 * Autor: Manuel Mu�oz - May 16, 2007
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package arbol;

/**
 * Excepci�n es lanzanda cuando un elemento del �rbol no es encontrado
 */
public class ElementoNoExisteException extends Exception
{
	// -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
	
    /**
	 * Constante para la serializaci�n
	 */
	private static final long serialVersionUID = 1L;

	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
	
    /**
     * Constructor con mensaje
     * 
     * @param mensaje Mensaje de error
     */
    public ElementoNoExisteException( String mensaje )
    {
        super( mensaje );
    }
}
