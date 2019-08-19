package EjemploPOO;
import javax.swing.JOptionPane;
/*Con el comando extends, se le explica al programa que la clase lego 
esta heredando los atributos y metodos de juguete
Con esto, estamos reutilizando el codigo desde la clase juguete*/
public class Lego extends Juguete{  
    private int NumeroSet;
    private int CantidadPiezas;
    
    //El constructor de la clase hija (lego), no es igual al de su clase padre
    public Lego(String color,int edad,int NumeroSet,int CantidadPiezas){
        //Ojo al dato: color y edad ya fueron inicializados desde la clase juguete
        super(color, edad);//Con esto, se indica al IDE que los atributos ya han sido inicializados con anterioridad
        
        //Ahora, se inicializan los nuevos atributos de la clase hija
        this.NumeroSet = NumeroSet;
        this.CantidadPiezas = CantidadPiezas;
    }
    
    //Ahora, veremos un metodo desde la clase hija en la cual se acceda 
    //a atributos de su clase padre
    public void info(){
        /*A traves de una ventana de dialogo, podemos mostrar atributos de la clase hija y de la clase padre 
        Tambien se accede a atributos de tipo private y protected directamente y desde su metodo Getter*/
        JOptionPane.showMessageDialog(null,"El set de lego #"+NumeroSet+" contiene "
                +CantidadPiezas+" piezas. \nTiene un color "+color+" y esta dirigido "
                        + "a personas mayores de "+getEdad()+" años de edad.");
    }
    
}
