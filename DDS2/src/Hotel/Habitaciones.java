
package Hotel;

/**
 *
 * @author Lopez Chaidez Luis Enrique
 */
public class Habitaciones{
    int numCamas;
    double precio;
    String tipoHabitacion;
    boolean tv;
    boolean ac;
    int numCuarto;

    public Habitaciones(int numCamas, double precio, String tipoHabitacion, boolean tv, boolean ac, int numCuarto) {
        this.numCamas = numCamas;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.tv = tv;
        this.ac = ac;
        this.numCuarto = numCuarto;
    }
    
    public Habitaciones(double precio, String tipoHabitacion, int numCuarto) {
        this.numCamas = 2;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.tv = true;
        this.ac = true;
        this.numCuarto = numCuarto;
    }
}
