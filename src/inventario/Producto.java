package inventario;

/**
 * Clase que representa un producto en el inventario.
 * 
 * @author Stasiy Korets
 * @version 1.0
 * @since 2024-03-07
 */
public class Producto {

    /**
     * Método de fábrica para crear un producto.
     * 
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad disponible en inventario.
     * @return Una nueva instancia de Producto.
     */
    public static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre Nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio Precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el stock del producto.
     * 
     * @return La cantidad disponible en inventario.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock del producto.
     * 
     * @param stock Cantidad disponible en inventario.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor privado de la clase Producto.
     * 
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad disponible en inventario.
     */
    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Muestra la información del producto en la consola.
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }

}
