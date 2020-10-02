
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import javax.swing.JOptionPane.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */

public class FechaHora {
 private int dia,mes,año,hora,minuto;
 private String mess;
 

 
 
    public  FechaHora(){
            Calendar  cal = Calendar.getInstance();
            this.año = cal.get(Calendar.YEAR);
            this.mes = mes+1;
            this.mes += cal.get(Calendar.MONTH);
            this.dia = cal.get(Calendar.DATE);
           
            this.hora = cal.get(Calendar.HOUR_OF_DAY);
            this.minuto = cal.get(Calendar.MINUTE);
             
            
             
            
       
    }
    
    public String fechalarga(){
        
           
         switch(mes){
             case 1: 
               mess ="enero";
              break; 
               case 2: 
               mess ="febrero";
              break; 
               case 3: 
               mess ="marzo";
              break; 
               case 4: 
               mess ="abril";
              break; 
               case 5: 
               mess ="mayo";
              break; 
               case 6: 
               mess ="junio";
              break; 
               case 7: 
               mess ="julio";
              break; 
               case 8: 
               mess ="agosto";
              break; 
               case 9: 
               mess ="septiembre";
              break; 
               case 10: 
               mess ="octubre";
              break; 
               case 11: 
               mess ="noviembre";
              break; 
               case 12: 
               mess ="diciembre";
              break; 
              
 }
        return   dia+"/"+mess+"/"+año;
    }
    
     public String  fechacorta(){
        
        return   dia+"/"+mes+"/"+año;
    }
     
     
      public String formato24(){
       
          
            return hora+":"+minuto;
    }
        public String formato12(){
            FechaHora f = new FechaHora();
            Calendar  cal = Calendar.getInstance();
            f.hora =cal.get(Calendar.HOUR);
            f.minuto = cal.get(Calendar.MINUTE);
             String r;
            if(hora>11){
                r=" P.M"; 
                return f.hora+":"+f.minuto+r;
            }
            else{
                  r=" A.M"; 
                return f.hora+":"+f.minuto+r;
            }
        
            
    }
}
