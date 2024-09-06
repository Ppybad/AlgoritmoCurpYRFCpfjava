/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;
import java.util.HashMap;


/**
 *
 * @author pepe
 */
public class CURP {
   
    private HashMap<String,String> codigoverificacion;

	private String[] palabrasnovalidas={
                "BACA",
                "BAKA",
                "BUEI",
                "BUEY",
		"CACA",
                "CACO",
		"CAGA",
                "CAGO",
		"CAKA",
                "CAKO",
		"COGE",
                "COGI",
                "COJA",
		"COJE",
                "COJI",
		"COJO",
                "COLA",
                "CULO",
                "FALO",
		"FETO",
                "GETA",
                "GUEI",
                "GUEY",
                "JETA",
		"JOTO",
                "KACA",
		"KACO",
                "KAGA",
		"KAGO",
                "KAKA",
                "KAKO",
                "KOGE",
                "KOGI",
                "KOJA",
                "KOJE",
                "KOJI",
		"KOJO",
                "KOLA",
		"KULO",
                "LILO",
                "LOCA",
                "LOCO",
                "LOKA",
                "LOKO",
                "MAME",
		"MAMO",
                "MEAR",
		"MEAS",
                "MEON",
                "MIAR",
		"MION",
                "MOCO",
                "MOKO",
		"MULA",
                "MULO",
                "NACA",
                "NACO",
                "PEDA",
		"PEDO",
                "PENE",
                "PIPI",
                "PITO",
                "POPO",
		"PUTA",
		"QULO",
                "RATA",
                "ROBA",
                "ROBO",
		"RUIN",
                "SENO",
                "TETA",
                "VACA",
                "VAGA",
                "VAGO",
                "VAKA",
                "VUEI",
                "VUEY",
                "WUEI",
                "WUEY"
        };
	private String[] nexosnovalidos={
		"LA",
		"SA DE CV",
		"LOS",
		"Y",
		"SA",
		"CIA",
		"SOC",
		"COOP",
		"A EN P",
		"S EN C",
		"EN",
		"CON",
		"SUS",
		"SC",
		"SCS",
		"THE",
		"AND",
		"CO",
		"MAC",
		"VAN",
		"A",
		"SA DE CV MI",
		"COMPAÑÍA",
		"SRL MI",
		"DE",
		"LA",
		"LAS",
		"MC",
		"VON",
		"DEL",
		"LOS",
		"Y",
		"MAC",
		"VAN",
		"MI",
                "JOSE",
                "J",
                "J.",
                "MARIA",
                "MA",
                "MA."
                
	};
	private String nombre,aP,aM,dia,mes,año,sexo,nac;
	public CURP(){
		setDefault();
	}

	public void setDefault(){
		codigoverificacion=new HashMap<String,String>();

		codigoverificacion.put("0","00");
		codigoverificacion.put("1","01");
		codigoverificacion.put("2","02");
		codigoverificacion.put("3","03");
		codigoverificacion.put("4","04");
		codigoverificacion.put("5","05");
		codigoverificacion.put("6","06");
		codigoverificacion.put("7","07");
		codigoverificacion.put("8","08");
		codigoverificacion.put("9","09");
		codigoverificacion.put("A","10");
		codigoverificacion.put("B","11");
		codigoverificacion.put("C","12");
		codigoverificacion.put("D","13");
		codigoverificacion.put("E","14");
		codigoverificacion.put("F","15");
		codigoverificacion.put("G","16");
		codigoverificacion.put("H","17");
		codigoverificacion.put("I","18");
		codigoverificacion.put("J","19");
		codigoverificacion.put("K","20");
		codigoverificacion.put("L","21");
		codigoverificacion.put("M","22");
		codigoverificacion.put("N","23");
		codigoverificacion.put("&","24");
		codigoverificacion.put("O","25");
		codigoverificacion.put("P","26");
		codigoverificacion.put("Q","27");
		codigoverificacion.put("R","28");
		codigoverificacion.put("S","29");
		codigoverificacion.put("T","30");
		codigoverificacion.put("U","31");
		codigoverificacion.put("V","32");
		codigoverificacion.put("W","33");
		codigoverificacion.put("X","34");
		codigoverificacion.put("Y","35");
		codigoverificacion.put("Z","36");
		codigoverificacion.put(" ","37");
		codigoverificacion.put("Ñ","38");
	}
	public CURP(String nombre,String aP,String aM,String dia,String mes,String año,String sexo,String nac){
		this.nombre=nombre;
		this.aP=aP;
		this.aM=aM;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.sexo=sexo;
		this.nac=nac;
		setDefault();
	}
	private String getFirstVocal(String cad){
        String cadAux = cad.substring(0, 1).toUpperCase();
        boolean firstIsVocal = false;
//        cad=cad.toUpperCase();
        String vocales="AEIOU";
        for (int i=0;i<cadAux.length();i++ ) {
            String c=cadAux.substring(i,i+1);
            for (int j = 0; j < vocales.length(); j++) {
                String vc=vocales.substring(j,j+1);
                if(c.equals(vc)) 
                    firstIsVocal = true;
                break;
            }           
        }
        if(firstIsVocal){
            cad=cad.substring(1,cad.length());
        }
        for (int i=0;i<cad.length();i++ ) {
            String c=cad.substring(i,i+1);
            for (int j = 0; j < vocales.length(); j++) {
                String vc=vocales.substring(j,j+1);
                if(c.equals(vc)) 
                    return vc;
            }           
        }
        return "";
    } 
    private String getFirstConsonate(String cad){
        cad=cad.toUpperCase();
        String vocales="AEIOU";
        for (int i=0;i<cad.length();i++ ) {
            String c=cad.substring(i,i+1);
            if(!vocales.contains(c)) return c;
            
        }
        return "";
    }
    
        private String getTerceraLetra(String cad){
        cad=cad.toUpperCase();
//        for (int i=0;i<cad.length();i++ ) {
            String c=cad.substring(2,3);
            System.out.println("c"+ c);
             return c;
            
//        }
//        return "";
    }
    public String quitarPalabras(String cad){
    	String nomaux=cad;
    	for (String v :nomaux.split(" ") ) {
	        for(String con:nexosnovalidos){
	        	if(v.equals(con))
	            	nomaux=nomaux.replace(con, "");
	        }
    	}
        return nomaux.toUpperCase();
    }
    private String formar4nombre(){
    	String aP_=quitarPalabras(aP.toUpperCase()).replaceAll(" ", "");
    	String aM_=quitarPalabras(aM.toUpperCase()).replaceAll(" ", "");
    	String nombre_=quitarPalabras(nombre.toUpperCase()).replace(" ","");
    	String cad=aP_.substring(0,1)+getFirstVocal(aP_)+aM_.substring(0,1)+nombre_.substring(0,1);
    	for (String mal : palabrasnovalidas) {
    		if(cad.equals(mal))
    			cad=cad.substring(0,3)+"X";
    	}
    	return cad;
    }
    private String formar6fecha(){
    	String cad=año.substring(2,4)+mes+dia;
    	return cad;
    }
    public String formar3Consonantes(){
    	String aP_=quitarPalabras(aP.toUpperCase()).replaceAll(" ", "");
    	String aM_=quitarPalabras(aM.toUpperCase()).replaceAll(" ", "");;
    	String nombre_=quitarPalabras(nombre.toUpperCase()).replace(" ","");

    	return getFirstConsonate(aP_.substring(1))+getFirstConsonate(aM_.substring(1))+getFirstConsonate(nombre_.substring(1));
    }
    public String formar1digito(String rfc){
    	String rfc_=rfc;
    	int suma=0;
    	int v=18;
    	for (int i=0;i<rfc_.length() ;i++ ) {
    		suma+=Integer.parseInt(codigoverificacion.get(rfc_.substring(i,i+1)))*v--;
    	}
    	int coeficinete=suma/10;
    	int residuo=suma%10;
    	residuo-=10;
    	residuo=(residuo==10 || residuo==-10)?0:Math.abs(residuo);
    	String penultimo=(Integer.parseInt(año)<=1999)? "0":"A";
    	return rfc+penultimo+residuo;
    }

	public String get(){
		return formar1digito(formar4nombre()+formar6fecha()+sexo+nac+formar3Consonantes());		
	}
	private static void print(Object a){
		System.out.println(a);
	}
//	public static void main(String[] args) {
//		CURP CURP=new CURP("Nombre","ApellidoPa","ApellidoMa","01","01","2016","H","DF");
//
//		print(CURP.get());
//
//
//	}

}
