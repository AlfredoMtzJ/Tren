
import javax.swing.JFrame;


public class frame extends JFrame{
    tren tren;
    
    public frame(){
    tren = new tren();
    add(tren);
    setSize(850,500);     //tamaño (alto,ancho)
    setDefaultCloseOperation(3);     // terminar el programa al cerrar
    setLocationRelativeTo(null);     //centrado en pantalla
    }
}
