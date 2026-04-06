import modelo.Aprendiz;
import modelo.Equipo;
import servicio.InventarioPrestamos;
import java.util.Scanner;

public class MainSistema {
    public static void main(String[] args) {
        InventarioPrestamos inventario = new InventarioPrestamos();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== SISTEMA DE PRÉSTAMOS ===\n");
            
            // ========== DATOS DE EJEMPLO ==========
            System.out.println("--- REGISTRO INICIAL ---");
            
            // Registrar 2 aprendices
            Aprendiz a1 = new Aprendiz("12345678", "Juan Perez", "Ficha1", "3001234567");
            Aprendiz a2 = new Aprendiz("87654321", "Maria Gomez", "Ficha2", "3119876543");
            inventario.registrarAprendiz(a1);
            inventario.registrarAprendiz(a2);
            
            // Registrar 4 equipos
            Equipo e1 = new Equipo("EQ001", "Laptop Dell", "computador");
            Equipo e2 = new Equipo("EQ002", "Mouse Logitech", "electrónica");
            Equipo e3 = new Equipo("EQ003", "Pantalla", "herramienta");
            Equipo e4 = new Equipo("EQ004", "Proyector", "electrónica");
            inventario.registrarEquipo(e1);
            inventario.registrarEquipo(e2);
            inventario.registrarEquipo(e3);
            inventario.registrarEquipo(e4);
            
            System.out.println("\n✓ Sistema listo!\n");
            
            // ========== MENÚ PRINCIPAL ==========
            int opcion;
            do {
                mostrarMenu();
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                switch(opcion) {
                    case 1:
                        // Registrar aprendiz
                        System.out.print("Documento: ");
                        String doc = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nom = scanner.nextLine();
                        System.out.print("Ficha: ");
                        String ficha = scanner.nextLine();
                        System.out.print("Teléfono (10 dígitos): ");
                        String tel = scanner.nextLine();
                        Aprendiz nuevoAprendiz = new Aprendiz(doc, nom, ficha, tel);
                        inventario.registrarAprendiz(nuevoAprendiz);
                        break;
                        
                    case 2:
                        // Registrar equipo
                        System.out.print("Código: ");
                        String cod = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nomEq = scanner.nextLine();
                        System.out.print("Categoría (computador/electrónica/herramienta): ");
                        String cat = scanner.nextLine();
                        Equipo nuevoEquipo = new Equipo(cod, nomEq, cat);
                        inventario.registrarEquipo(nuevoEquipo);
                        break;
                        
                    case 3:
                        // Listar equipos
                        inventario.listarEquipos();
                        break;
                        
                    case 4:
                        // Prestar equipo
                        System.out.print("Código del equipo: ");
                        String codEq = scanner.nextLine();
                        System.out.print("Documento del aprendiz: ");
                        String docAp = scanner.nextLine();
                        inventario.prestarEquipo(codEq, docAp);
                        break;
                        
                    case 5:
                        // Listar préstamos activos
                        inventario.listarPrestamosActivos();
                        break;
                        
                    case 6:
                        // Devolver equipo
                        System.out.print("Código del equipo a devolver: ");
                        String codDev = scanner.nextLine();
                        inventario.devolverEquipo(codDev);
                        break;
                        
                    case 7:
                        System.out.println("¡Hasta luego!");
                        break;
                        
                    default:
                        System.out.println("Opción no válida");
                }
            } while(opcion != 7);
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n========== MENÚ ==========");
        System.out.println("1. Registrar aprendiz");
        System.out.println("2. Registrar equipo");
        System.out.println("3. Listar equipos");
        System.out.println("4. Prestar equipo");
        System.out.println("5. Listar préstamos activos");
        System.out.println("6. Devolver equipo");
        System.out.println("7. Salir");
        System.out.println("==========================");
    }
}