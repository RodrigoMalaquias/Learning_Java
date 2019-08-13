/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Rodrigo
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(int dia, int mes){
        this.dia = dia;
        this.mes = mes;
        this.ano = 2019;
    }
    
    public void getData() {
        if(dia < 10 && mes < 10)
            System.out.println ("0"+dia+"/"+"0"+mes+"/"+ano);
        else if(dia < 10 && mes > 10)
            System.out.println ("0"+dia+"/"+mes+"/"+ano);
        else if(dia > 10 && mes < 10)
            System.out.println (+dia+"/"+"0"+mes+"/"+ano);
        else if(dia > 10 && mes > 10)
            System.out.println (dia+"/"+mes+"/"+ano);
    }
  
    
    public static void main(String[] args)
    {
        Data data1 = new Data(06,03,2000);
        Data data2 = new Data(25,12);
        
        data1.getData();
        data2.getData();
        
       
    }
} 

