/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @author Pepe Ybad
 */
public class Utilities {
    
    public static String encriptPass(String pass) {
        byte[] newPassword = null;
        try {
            newPassword = MessageDigest.getInstance("SHA").digest(pass.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("error "+ e);
        } catch (UnsupportedEncodingException e) {
            System.out.println("error "+ e);
        }
        String encrip = Base64.getEncoder().encodeToString(newPassword);
        return encrip;
    }
    
    
    
    
        public static String asignadorCociResi (int numero){
        String respuesta = "";
    String numText = String.valueOf(numero);
    
    switch (numText) {
        
        case "0":
           respuesta = "1";
           break;
        case "1":
           respuesta = "2";
           break;
        case "2":
           respuesta = "3";
           break;
        case "3":
           respuesta = "4";
           break;
        case "4":
           respuesta = "5";
           break;
        case "5":
           respuesta = "6";
           break;
        case "6":
           respuesta = "7";
           break;
        case "7":
           respuesta = "8";
           break;   
        case "8":
           respuesta = "9";
           break;   
        case "9":
           respuesta = "A";
           break;
        case "10":
           respuesta = "B";
           break;
        case "11":
           respuesta = "C";
           break;
        case "12":
           respuesta = "D";
           break;
        case "13":
           respuesta = "E";
           break;
        case "14":
           respuesta = "F";
           break;
        case "15":
           respuesta = "G";
           break;
        case "16":
           respuesta = "H";
           break;
        case "17":
           respuesta = "I";
           break;
        case "18":
           respuesta = "J";
           break;
        case "19":
           respuesta = "K";
           break;
        case "20":
           respuesta = "L";
           break;
        case "21":
           respuesta = "M";
           break;
        case "22":
           respuesta = "N";
           break;
        case "23":
           respuesta = "P";
           break;
        case "24":
           respuesta = "Q";
           break;
        case "25":
           respuesta = "R";
           break;
        case "26":
           respuesta = "S";
           break;
        case "27":
           respuesta = "T";
           break;
        case "28":
           respuesta = "U";
           break;
        case "29":
           respuesta = "V";
           break;
        case "30":
           respuesta = "W";
           break;
        case "31":
           respuesta = "X";
           break;
        case "32":
           respuesta = "Y";
           break;
        case "33":
           respuesta = "Z";
           break;  
    }
    return respuesta;
    
    }
    
       public static String obtenParametro(HttpServletRequest request, String name_parameter) {
        String dato = "";
        if (request.getParameter(name_parameter) != null) {
            dato = request.getParameter(name_parameter);
        } else if (request.getAttribute(name_parameter) != null) {
            dato = (String) request.getAttribute(name_parameter);
        }
        return dato;
    }
       
          public static String asignadorRFC(int letr, int let)
{
    String respuesta = "";
    
    String cociente = asignadorCociResi(letr);
    String residuo =  asignadorCociResi(let);
    
    asignadorCociResi(letr);
    asignadorCociResi(let);
    
     respuesta = cociente+residuo;
   return respuesta;
  

}
  
      public static String digVer (String n, String gen) {
        String respuesta = "";
        String rsc = "";
        int numVE =0;
        int ress= 0;
        int pos = 0;
        pos= n.length()+1;
        
            int araay[] = new int[n.length()];
            for (int i =0 ; i<n.length(); i++ ){
                
                char letra = n.charAt(i);
                String letr = String.valueOf(letra);  
                 
                            
                switch (letr) {
                    case "0":
                          araay[i] = 0;
                          break;
                       case "1":
                          araay[i] = 1;
                          break;
                       case "2":
                          araay[i] = 2;
                          break;
                       case "3":
                          araay[i] = 3;
                          break;
                       case "4":
                          araay[i] = 4;
                          break;
                       case "5":
                          araay[i] = 5;
                          break;
                       case "6":
                          araay[i] = 6;
                          break;
                       case "7":
                          araay[i] = 7;
                          break;   
                       case "8":
                          araay[i] = 8;
                          break;   
                       case "9":
                          araay[i] = 9;
                          break;
                       case "A":
                          araay[i] = 10;
                          break;
                       case "B":
                          araay[i] = 11;
                          break;
                       case "C":
                          araay[i] = 12;
                          break;
                       case "D":
                          araay[i] = 13;
                          break;
                       case "E":
                          araay[i] = 14;
                          break;
                       case "F":
                          araay[i] = 15;
                          break;
                       case "G":
                          araay[i] = 16;
                          break;
                       case "H":
                          araay[i] = 17;
                          break;
                       case "I":
                          araay[i] = 18;
                          break;
                       case "J":
                          araay[i] = 19;
                          break;
                       case "K":
                          araay[i] = 20;
                          break;
                       case "L":
                          araay[i] = 21;
                          break;
                       case "M":
                          araay[i] = 22;
                          break;
                       case "N":
                          araay[i] = 23;
                          break;
                       case "&":
                          araay[i] = 24;
                          break;
                       case "O":
                          araay[i] = 25;
                          break;
                       case "P":
                          araay[i] = 26;
                          break;
                       case "Q":
                          araay[i] = 27;
                          break;
                       case "R":
                          araay[i] = 28;
                          break;
                       case "S":
                          araay[i] = 29;
                          break;
                       case "30":
                          araay[i] = 30;
                          break;
                       case "U":
                          araay[i] = 31;
                          break;
                       case "V":
                          araay[i] = 32;
                          break;
                       case "W":
                          araay[i] = 33;
                          break;
                       case "X":
                          araay[i] = 34;
                          break;  
                       case "Y":
                          araay[i] = 35;
                          break;     
                       case "Z":
                          araay[i] = 36;
                          break;
                        case " ":
                          araay[i] = 37;
                          break;
                        case "Ñ":
                          araay[i] = 38;
                          break;                          
                   }
                
                int nm = araay[i];
                if(pos > 2){
                    int s = pos - i;
                    ress+=nm*s;
                
                }
               
            } 
            
            
//             String digVer = "" ;
//             numVE = 11-ress%11; 
////             numVE = ress%11; 
//              if (ress%11==10){
//            respuesta = n+"A";
//            } else  if (ress%11 == 0){
//            respuesta = n+0;
//            } else{
//             
//              digVer = String.valueOf(numVE);
//              respuesta = n+digVer;
//            }
            
//             numVE = 11-ress%11;
//             System.out.println(numVE);
//             String digVer = String.valueOf(numVE);
//            respuesta = n+digVer;
//            if (numVE == 0){
//            respuesta = n+0;
//            
//                System.out.println("???");
//            }if (numVE==10){
//            respuesta = n+"A";
//            }
            
            
            
            
//            System.out.println("SSS");
//              System.out.println(ress%11);
//            
//             numVE = 11-ress%11;
//             String digVer = String.valueOf(numVE);
//            respuesta = n+digVer;
//            if (numVE == 0){
//            respuesta = n+0;
//            }if (numVE==10){
//            respuesta = n+"A";
//            }



//                  actual
  
            int residuo = ress%11;
            System.out.println("residuo1:"+ residuo);
           if (residuo == 0){
               respuesta = n+0;
           }
           if (residuo > 0){
               
               if (residuo == 10 && gen == "M") {
                   respuesta = n+"A";
               
               }else{
                   
                   int numerorestado  = 11-residuo;
                   System.out.println("numerorestado:"+ numerorestado);
                   
               
               respuesta = n+String.valueOf(numerorestado);
               
               if(numerorestado == 10){
                respuesta = n+"A";
               }
               
               }
           }
           

      
      
      
      
          return respuesta;}


public static  Boolean ejecQuerys (String query){
    
    System.out.println("query"+ query);
//    while (){}
    
return true;
}

public static  String clveEstado (String cleEstado){
      String estado = cleEstado;
      String respuesta = "";
      
       switch (estado) {

                case "AGUASCALIENTES":
                    respuesta = "AS";
                    break;
                case "BAJA CALIFORNIA":
                    respuesta = "BC";
                    break;
                case "BAJA CALIFORNIA SUR":
                    respuesta = "BS";
                    break;
                case "CAMPECHE":
                    respuesta = "CC";
                    break;
                case "COAHUILA":
                    respuesta = "CL";
                    break;
                case "COLIMA":
                    respuesta = "CM";
                    break;
                case "CHIAPAS":
                    respuesta = "CS";
                    break;
                case "CHIHUAHUA":
                    respuesta = "CH";
                    break;
                case "DISTRITO FEDERAL":
                    respuesta = "DF";
                    break;
                case "CIUDAD DE MÉXICO":
                    respuesta = "DF";
                    break;
                case "DURANGO":
                    respuesta = "DG";
                    break; 
                case "GUANAJUATO":
                    respuesta = "GT";
                    break; 
                case "GUERRERO":
                    respuesta = "GR";
                    break; 
                case "HIDALGO":
                    respuesta = "HG";
                    break;
                case "JALISCO":
                    respuesta = "JC";
                    break; 
                case "MÉXICO":
                    respuesta = "MC";
                    break; 
                case "MICHOACÁN":
                    respuesta = "MN";
                    break; 
                case "MICHOACÁN DE OCAMPO":
                    respuesta = "MN";
                    break;
                case "MORELOS":
                    respuesta = "MS";
                    break; 
                case "NAYARIT":
                    respuesta = "NT";
                    break; 
                case "NUEVO LEÓN":
                    respuesta = "NL";
                    break; 
                case "OAXACA":
                    respuesta = "OC";
                    break; 
                case "PUEBLA":
                    respuesta = "PL";
                    break;                    
                case "QUERÉTARO":
                    respuesta = "QT";
                    break;   
                case "QUINTANA ROO":
                    respuesta = "QR";
                    break;         
                case "SAN LUIS POTOSÍ":
                    respuesta = "SP";
                    break;         
                case "SINALOA":
                    respuesta = "SL";
                    break;         
                case "SONORA":
                    respuesta = "SR";
                    break;         
                case "TABASCO":
                    respuesta = "TC";
                    break;         
                case "TAMAULIPAS":
                    respuesta = "TS";
                    break;         
                case "TLAXCALA":
                    respuesta = "TL";
                    break;         
                case "VERACRUZ":
                    respuesta = "VZ";
                    break;         
                case "VERACRUZ DE IGNACIO DE LA LLAVE":
                    respuesta = "VZ";
                    break;         
                case "YUCATÁN":
                    respuesta = "YN";
                    break;         
                case "ZACATECAS":
                    respuesta = "ZS";
                    break;         

       }
      
          return respuesta;
      }

public static String genCurp (String cNombre, String cApellidoPaterno, String cApellidoMaterno, String dia, String mes, String ano,String generoMod,String clave ){
      String respuesta = "";
        CURP crp = new CURP(cNombre, cApellidoPaterno, cApellidoMaterno,dia ,mes ,ano ,generoMod, clave);
          respuesta =crp.get();
        
      
        
    return  respuesta;
    
    
    }
}
