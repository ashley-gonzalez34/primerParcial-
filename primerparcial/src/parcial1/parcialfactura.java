
package parcial1;

import com.ashli.factura.ClsFacturaporrateo;
import com.ashli.factura.ClsMatrices;
import java.util.Scanner;


public class parcialfactura {
    static ClsMatrices Matriz1 = new ClsMatrices ();
    static ClsFacturaporrateo Factura2 = new ClsFacturaporrateo();
    static Scanner t = new Scanner (System.in);
    
   
  
    
public static void productos(){
    //Primer elemento es la piel negra
    Factura2.setCantidad(10);
    Factura2.setDescripcion("piel negra  ");
    Factura2.setPrecio(200);
    Factura2.setProducto(360);
    Matriz1.llendoDatos(Factura2);
       
    //segundo elemento que es piel cafe 
    Factura2.setCantidad(20);
    Factura2.setDescripcion("piel cafe ");
    Factura2.setPrecio(150);
    Factura2.setProducto(500);
    Matriz1.llendoDatos(Factura2);
    
    //tercer elemento es la piel blanca 
    Factura2.setCantidad(9);
    Factura2.setDescripcion("piel blanca ");
    Factura2.setPrecio(140);
    Factura2.setProducto(270);
    Matriz1.llendoDatos(Factura2);
     
    
}
public static void Factura(){
    //calcula la suma de los productos 
    Matriz1.totalesdelProductos(0,2);
    //se calcula la suma de los  pesos
    Matriz1.totaldelPeso(0,3);
    //extrae los de gastos
    Matriz1.Gastos(5);
     // extra el coeficiente de peso  
    Matriz1.Peso(6);
    //hace el  total de la unidad
    Matriz1.costodeUnidad(7);
    //Y por ultimo se saca el total final de las operaciones 
    Matriz1.totalFinal(8);
    Matriz1.imprimirMatriz();
    Matriz1.granTotal();
}

  public static void main(String[] args) {
        
        productos();
        Factura();
        
        
             
    } 
    
}
