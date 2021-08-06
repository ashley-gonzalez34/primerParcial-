/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashli.factura;

import java.text.DecimalFormat;

/**
 *
 * @author usuario
 */
public class ClsMatrices {
    DecimalFormat d = new DecimalFormat ("###.##");
    private int unidades=0;
    private int descripcion=1;
    private int precio=2;
    private int kg=3;
    private int gastoPeso=4;
    private int gastoValor=5;
    private int costoUnidad=6;
    private int totalVenta=7;
    private String matriz [][] = new String [4][9];
    public int filaAct;
    
    //Variables para hacer cada calculo
    private double sumaVentas; 
    private double sumaPeso;
    private double coeficienteGasto;
    private double coeficientePeso;
    
    //Impuestos  como se iran sacando 
    private int seguro = 521;
    private int impuestos=952;
    private int comisiones=150;
    
    //aca se tomara en cuenta en el calculo los gastos del transporte
    private int fletes=5203;
    private int acarreo=6250;
    
    
public ClsMatrices(){
    
}
    
  
public void llendoDatos(ClsFacturaporrateo fa){
    if(1==1){
    matriz[filaAct][0]= fa.getCantidad()+"";
    matriz[filaAct][1]=fa.getDescripcion()+"";
    matriz[filaAct][2]=fa.getPrecio()+"";
    matriz[filaAct][3]=fa.getProducto()+"";
    matriz[filaAct][4]=" ----";
    filaAct++;
    }
    else{
        System.out.println("Error ");
    }
    
    
}


public void encabezado(){
    String arr[]={"uni ","Descripcion","peso", "Kg", "----","gastoporValor", "GastoTrans","ValorUni", "Total"};
    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
        if (i!=arr.length-1){
            System.out.print("    \t|");
        }
    }
}
public void imprimirMatriz(){
    encabezado();
    System.out.println("\n__________________________________________");
     for(int f=0; f<matriz.length; f++){
         
            for(int c=0; c<matriz[0].length; c++){
                System.out.print(matriz[f][c]+"\t"); 
                if (c!=matriz.length-1 ){
                    System.out.print("\t|");
                } 
                
            }
            System.out.println("\n___________________________________");
        }
}

public void totalesdelProductos(int cantidad, int  valor){
    double sumaProducto=0;
    double Total=0;
    for (int f=0; f<matriz.length; f++){
        
        sumaProducto=Double.parseDouble(matriz[f][cantidad])* Double.parseDouble(matriz[f][valor]);
        Total+=sumaProducto;
        
    }
    sumaVentas=Total;
}

public void Gastos(int col){
    int sumaImpuestos = seguro + impuestos + comisiones;
    coeficienteGasto= sumaImpuestos / sumaVentas;
    
    for (int f=0; f<matriz.length; f++){
        matriz[f][col] =(d.format(coeficienteGasto * Integer.parseInt(matriz[f][2]))+" ");
    }
}

public void totaldelPeso(int cantidad,int kg){
    double suma=0;
    double guardado=0;
    for(int f=0; f<matriz.length; f++){
        suma = Double.parseDouble(matriz[f][cantidad]) * Double.parseDouble(matriz[f][kg]);
        guardado+=suma;
    }
    sumaPeso=guardado;
}

public void Peso(int col){
    int sumaTransporte = fletes + acarreo;
    coeficientePeso= sumaTransporte / sumaPeso;
    
    for (int f=0; f<matriz.length; f++){
        matriz[f][col] =(d.format(coeficientePeso * Integer.parseInt(matriz[f][3]))+" ");
    }
}
public void costodeUnidad(int col){
    double suma;
    for(int f=0; f<matriz.length; f++){
       matriz[f][col]=d.format(Double.parseDouble(matriz[f][2])+ Double.parseDouble(matriz[f][5])+Double.parseDouble(matriz[f][6]))+"";
    }
}

public void totalFinal(int col){
    for (int f=0; f<matriz.length; f++){
        matriz[f][col]=(d.format(Double.parseDouble(matriz[f][0])* Double.parseDouble(matriz[f][7])))+"";
    }
}
public void granTotal(){
    int granTotal=0;
    for(int f=0; f<matriz.length; f++){
        granTotal+=Double.parseDouble(matriz[f][8]);
    }
    System.out.println("El resultado  es: Q."+d.format(granTotal));
}
        
}

