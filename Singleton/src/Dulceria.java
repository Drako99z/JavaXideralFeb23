
public class Dulceria {
    // Creamos una instancia privada de la clase Dulceria
    private static Dulceria instanciaDulceria;

    // Creamos un constructor privado para evitar que se creen instancias desde fuera de la clase
    private Dulceria() {}

    // Creamos un método público para acceder a la instancia única de la clase Dulceria
    public static Dulceria obtenerInstancia() {
        // Si no hay una instancia de la clase, la creamos
        if (instanciaDulceria == null) {
            instanciaDulceria = new Dulceria();
        }
        // Devolvemos la instancia de la clase
        return instanciaDulceria;
    }

    // Métodos de negocio de la dulcería
    public void venderDulces(int cantidad) {
        // Lógica para vender dulces
    }

    public void reponerInventario() {
        // Lógica para reponer el inventario de la dulcería
    }
}
