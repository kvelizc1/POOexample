package EjemploPOO;
import javax.swing.JOptionPane;
public class Juguete { //Clase padre
    protected String color; //Protected: A este atributo se puede acceder desde otras clases
    private int edad; // No se puede acceder a este metodo desde otra clase
                      //(Edades a las que se dirige el juguete)
    // Metodo constructor para el objeto Juguete, facilita la inicializacion de los atributos del objeto
    public Juguete(String color, int edad) { //Un metodo constructor no lleva ningun valor de retorno
        this.color = color;
        this.edad = edad;
    }
    //Se muestran metodos getters y setters para mi clase juguete (lo mismo que tu para ella :'v)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void jinfo(){
        JOptionPane.showMessageDialog(null,"Mi juguete es de color"+color+" y es para personas"
                + "mayores de "+edad);
    }
}

