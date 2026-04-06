import modelo.Producto;
import modelo.Carrito;
import servicio.CarritoServicio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarritoServicio servicio = new CarritoServicio();
        Carrito carrito = new Carrito();
        Scanner scanner = new Scanner(System.in);

        // Agregar productos de ejemplo
        servicio.agregarProductoInventario(new Producto("Laptop", 800000, 3));
        servicio.agregarProductoInventario(new Producto("Mouse", 50000, 5));
        servicio.agregarProductoInventario(new Producto("Teclado", 120000, 4));

        int opcion;
        do {
            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar al carrito");
            System.out.println("3. Ver carrito");
            System.out.println("4. Comprar");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    servicio.listarProductos();
                    break;
                case 2:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    servicio.agregarAlCarrito(carrito, nombre, cantidad);
                    break;
                case 3:
                    carrito.listar();
                    break;
                case 4:
                    servicio.finalizarCompra(carrito);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}