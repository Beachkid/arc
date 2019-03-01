
package tienda;

/**
 * @author Lopez Chaidez Luis Enrique
 */
public class Ventas {
    
    public static void main(String[] args) {
        Vendedor cesar = new Vendedor("Cesar", "hombre");
        Vendedor carlos = new Vendedor("Carlos", "hombre");
        Vendedor salma = new Vendedor("Salma", "mujer");
        
        Cacahuates enchilosoChico = new Cacahuates(15,30,"Enchilosos");
        Cacahuates enchilosoGrande = new Cacahuates(25,100,"Enchilosos");
        Naranjas naranjasChica = new Naranjas(15,10,"Enchilosa");
        Naranjas naranjasGrande = new Naranjas(30,20,"dulce");
         
    }
    
}
