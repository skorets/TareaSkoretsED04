package inventario;

import java.util.ArrayList;

/**
 * Clase que representa un inventario de productos.
 *
 * @author Stasiy Korets
 * @version 1.0
 * @since 2024-03-07
 */
public class Inventario {

    /**
     * Lista que almacena los productos del inventario. Es un ArrayList de
     * objetos de la clase Producto.
     */

    public ArrayList<Producto> listaProductos;

    /**
     * Constructor que inicializa la lista de productos.
     */
    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    /**
     * Agrega un producto al inventario.
     *
     * @param p Producto a agregar.
     */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }

    /**
     * Muestra la información de todos los productos en el inventario.
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

    /**
     * Método principal para probar la funcionalidad del inventario.
     *
     * @param args Argumentos de la línea de comandos, aunque no se utilizan.
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);

        inventario.agregar(p1);
        inventario.agregar(p2);

        System.out.println("Inventario de productos:");
        inventario.mostrar();
    }
}
