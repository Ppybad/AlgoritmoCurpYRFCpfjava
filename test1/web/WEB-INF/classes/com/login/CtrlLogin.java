/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.Utilities;
import javax.servlet.annotation.WebServlet;
import com.conexion.ConexionOracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;

/**
 *
 * @author Pepe Ybad
 */
@WebServlet(name = "CtrlLog", urlPatterns = {"/CtrlLogin"})
public class CtrlLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=ISO-8859-1");
/*  47 */     PrintWriter out = response.getWriter();
/*     */     try {
/*  49 */       int bnd = Integer.parseInt(Utilities.obtenParametro(request, "bnd"));
/*     */ 
/*  51 */       switch (bnd) {
/*     */       case 1:
/*  53 */         out.print(login(request));
/*  54 */         break;
/*     */       case 2:
/*  56 */         out.print(cargarEstados(request));
/*  57 */         break;
/*     */       case 3:
/*  59 */         out.print(genRfc(request));
/*  60 */         break;
/*     */       case 4:
  /*  62 */         out.print(loginFar(request));
/*  63 */         break;
/*     */       case 5:
/*  65 */         out.print(ejecutaraAplet(request, response));
/*  66 */         break;
/*     */       case 6:
///*  68 */         out.print(ConsultarRecetaFechaLink(request));
/*  69 */         break;
/*     */       case 7:
///*  71 */         out.print(ConsultarRecetaFechaLink(request));
/*     */       }
/*     */     }
/*     */     finally {
/*  75 */       out.close();
/*     */     }
        
        
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CtrlLogin</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CtrlLogin at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }
  

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
    
     private String login(HttpServletRequest request) throws ServletException, IOException {
        String ret = "{success: true}";
                 String J = valSeisset(request);
         
//         TsCEM LOGIN CONSULTA;
//         SELECT NOMBRE_USUARIO, CONTRASENIA, ID_USUARIO FROM USUARIO WHERE ESTATUS = 1 AND NOMBRE_USUARIO='ROLIVA' AND CONTRASENIA_ENCRIPT='259871293bb9db22546ea3119c451a6417d1b269'

//         username and password match - this is a valid user

//         SELECT rol.id_rol, C_PER.id_personal FROM usuario U, rol_usuario R_USE, rol , CAT_PERSONAL C_PER 
//         WHERE rol.id_rol = r_use.id_rol and R_USE.id_usuario = u.id_usuario 
//         AND U.ID_PERSONAL = C_PER.ID_PERSONAL (+) 
//         AND U.ESTATUS = 1 
//         AND rol.estatus = '1' 
//         and R_USE.estatus = '1' 
//         and u.NOMBRE_USUARIO = 'ROLIVA';



//         seceisset LOGIN CONSULTA;
//         SELECT U.NOMBRE_USUARIO, U.CONTRASENIA_ENCRIPT, U.ID_USUARIO, RU.ID_ROL FROM USUARIO U, ROL_USUARIO RU WHERE (RU.ID_USUARIO(+) = U.ID_USUARIO) AND (RU.ID_ROL(+) = 147 AND RU.ESTATUS(+) = 1) AND (U.ESTATUS = 1 AND U.NOMBRE_USUARIO='ROLIVA' AND U.CONTRASENIA_ENCRIPT='259871293bb9db22546ea3119c451a6417d1b269')
//



//     ISSET AUDITORIA 
//           SELECT * FROM cat_medico WHERE id_usuario = ?
//     ISSET AUDITORIA  VALID
//           SELECT r.id_rol FROM usuario u, rol_usuario ru, rol r 
//           WHERE r.id_rol = ru.id_rol 
//           and ru.id_usuario = u.id_usuario 
//           and r.estatus = '1' 
//           and ru.estatus = '1' 
//           and r.aplicativo = 'AUDITORIA' 
//           and u.id_usuario = ?;
//         System.out.println("username: "+request.getParameter("username"));
//         System.out.println("password: "+request.getParameter("password"));
//         System.out.println("passEncript: "+request.getParameter("passEncript"));
         
         
         String usename = request.getParameter("username");
         String passEncript = request.getParameter("passEncript");
         
         
         
         ConexionOracle conn = new ConexionOracle();
         ResultSet res = null;
         PreparedStatement pstmt = null;
         Connection con = null;
         
         try {
             

            String query2 = "SELECT NOMBRE_USUARIO, CONTRASENIA, ID_USUARIO FROM USUARIO WHERE ESTATUS = 1 AND NOMBRE_USUARIO= ? AND CONTRASENIA_ENCRIPT= ? ";

             con = conn.conectar(); 
             pstmt = con.prepareStatement(query2);
             pstmt.setString(1,usename);
             pstmt.setString(2,passEncript);
             res = pstmt.executeQuery();
             
             if (res.next()) {
                 System.out.println("ID_USUARIO: "+ res.getString("ID_USUARIO"));
                 ret = "{success: true}";
             } else {
                 System.out.println("error");
                 ret = "{success: false}";  
             
             }
                
             
              res.close();
              pstmt.close();
              conn.desconectar();
              con = null;
             
         } catch (SQLException e) {
         }
         
    return ret;
    
    }
      private String ejecutaraAplet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              String ret = "{success: true}";
              ejecutaraApletInit(request, response);
              return ret;
      }
      private void ejecutaraApletInit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          System.out.println("?");
      
      }
     
       private String loginFar(HttpServletRequest request) throws ServletException, IOException {
        String ret = "{success: true}";
                 
         String usename = request.getParameter("username");
         String password = request.getParameter("password");
         
         
         ConexionOracle conn = new ConexionOracle();
         CallableStatement cs = null;
         ResultSet res = null;
         PreparedStatement pstmt = null;
         Connection con = null;
         String passEncript = Utilities.encriptPass(password);
           
         
         try {
             
            String query = "SELECT * FROM usuarios where id_user = ? and id_password =  ? ";
            

             con = conn.conectarG(); 
             pstmt = con.prepareStatement(query);
             pstmt.setString(1,usename);
             pstmt.setString(2,passEncript);
             res = pstmt.executeQuery();
             
             if (res.next()) {
                 System.out.println("NOMBRE: "+ res.getString("NOMBRE"));
                 ret = "{success: true}";
             } else {
                 System.out.println("error");
                 ret = "{success: false}";
             
             }
//                
//             
              res.close();
              pstmt.close();
              conn.desconectarG();
              con = null;
//             while (res.next()) {
//                 String ClaveFormat = res.getString("clave");
//                 System.out.println("ID_USUARIO: "+ res.getString("ID_USUARIO"));
//             }
             
         } catch (SQLException e) {
         }
         
    return ret;
    
    }
     
     
     
     
     public String cargarEstados(HttpServletRequest request) throws ServletException, IOException {
         
          ConexionOracle conn = new ConexionOracle();
          Connection con = null;
          ResultSet res = null;
          PreparedStatement pstmt = null;
           String record = "{data:[]}";
          

         String queryE = "SELECT ID_ESTADO, DESCRIPCION FROM ESTADOS";
         
         
           try {
          con = conn.conectarG(); 
             pstmt = con.prepareStatement(queryE);
             res = pstmt.executeQuery();
              record = "{data:[";
             while (res.next()) {                 
                   record = record + "{";
                    record = record + "idestado:'" + res.getString("ID_ESTADO")+ "',";
                    record = record + "descripcion:'" + res.getString("DESCRIPCION")+ "'";
                    record = record + "},";
             }
              record = record.substring(0, record.length() - 1) + "]}";
                
             
              res.close();
              pstmt.close();
              conn.desconectar();
              con = null;
         
         
         
         } catch (SQLException e) {
                System.out.println("error" + e);
         }
         
               return record;}
     
     
     public String genRfc(HttpServletRequest request) {

        String respuesta = "{data:[]}";
         

        String cNombre = Utilities.obtenParametro(request, "cNombre");
        String cApellidoPaterno = Utilities.obtenParametro(request, "cApellidoPaterno");
        String cApellidoMaterno = Utilities.obtenParametro(request, "cApellidoMaterno");
        String generoMod = (Utilities.obtenParametro(request, "cSexo").equals("MASCULINO") ? "H" : "M");
        String cFechaNacimiento = Utilities.obtenParametro(request, "cFechaNacimiento");
        String str = cFechaNacimiento;
        String [] partes = str.split("/");
        String mes = partes[0];
        String dia = partes[1];
        String ano = partes[2];  
        String estado = Utilities.obtenParametro(request, "cLugarNacimiento");
        String clave = Utilities.clveEstado(estado);
         System.out.println("s"+clave);
        String curp = Utilities.genCurp(cNombre, cApellidoPaterno, cApellidoMaterno, dia, mes, ano, generoMod, clave);
        String nombreCompleto =" "+cNombre+" "+cApellidoPaterno+" "+cApellidoMaterno;
        
        int ress = 0;
        
                 
            int araay[] = new int[nombreCompleto.length()];
        for(int i = 0; i < nombreCompleto.length(); i++ ){
            char letra = nombreCompleto.charAt(i);
            String letr = String.valueOf(letra);  


                    switch (letr) {
                        case "A": 
                             araay[i] = 11;
                        break;
                        case "B":
                            araay[i] = 12;
                        break;
                        case "C":
                            araay[i] = 13;
                        break;
                        case "D":
                            araay[i] = 14;
                        break;
                        case "E":
                            araay[i] = 15;
                        break;
                        case "F":
                            araay[i] = 16;
                        break;
                        case "G":
                            araay[i] = 17;
                        break;
                        case "H":
                            araay[i] = 18;
                        break;
                        case "I":
                            araay[i] = 19;
                        break;
                        case "J":
                            araay[i] = 21;
                        break;
                        case "K":
                            araay[i] = 22;
                        break;
                        case "L":
                            araay[i] = 23;
                        break;
                        case "M":
                            araay[i] = 24;
                        break;
                        case "N":
                            araay[i] = 25;
                        break;
                        case "O":
                            araay[i] = 26;
                        break;
                        case "P":
                            araay[i] = 27;
                        break;
                        case "Q":
                            araay[i] = 28;
                        break;
                        case "R":
                            araay[i] = 29;
                        break;
                        case "S":
                            araay[i] = 32;
                        break;
                        case "T":
                            araay[i] = 33;
                        break;
                        case "U":
                            araay[i] = 34;
                        break;
                        case "V":
                            araay[i] = 35;
                        break;
                        case "W":
                            araay[i] = 36;
                        break;
                        case "X":
                            araay[i] = 37;
                        break;
                        case "Y":
                            araay[i] = 38;
                        break;
                        case "Z":
                            araay[i] = 39;
                        break;
                        case "Ñ":
                            araay[i] = 40;
                        break;
                        case " ":
                            araay[i] = 0;
                        break;
                    }
                    
                    int nm = araay[i];
                    String numC = String.valueOf(nm);
                      if (letr != " " && nm != 0 ){
                        int n = araay[i-1];
                        String nN = String.valueOf(n);
                        int mls = Integer.parseInt(numC.substring(1,2));

                        ress += nm*mls;
//                          System.out.println(n);
                    if (n== 0){

                    int muls = Integer.parseInt(nN.substring(0,1)+numC.substring(0,1));
                    int ml = Integer.parseInt(numC.substring(0,1));                  
                    ress += muls * ml;

                    }else
                    {
                        int mulss = Integer.parseInt(nN.substring(1,2)+numC.substring(0,1));  
                         String m = String.valueOf(mulss);
                         int l = Integer.parseInt(m.substring(1,2));
                         ress += mulss*l; 
                    }

                    }
        }
        
         String dig = String.valueOf(ress);
         int lp = Integer.parseInt(dig.substring(1,4));        
         
        String homonimia =  Utilities.asignadorRFC(lp/34,lp%34);
        String rfccompleto = Utilities.digVer(curp.substring(0,10)+homonimia, generoMod);

                    
                        respuesta = "{data:[";
                          
                   respuesta = respuesta + "{";
                    respuesta = respuesta + "CURP:'" + curp+ "',";
                    respuesta = respuesta + "RFC:'" + rfccompleto+ "'";
                    respuesta = respuesta + "},";
             
              respuesta = respuesta.substring(0, respuesta.length() - 1) + "]}";
          
          
          
          
          
    return respuesta;
          
 
      }
     
     
     
     
     private String valSeisset(HttpServletRequest request)  {
         
         String primeraQ = "",segundaQ="", terceraQ ="", cuartaQ ="";
           primeraQ = "SELECT U.NOMBRE_USUARIO," 
            + "U.CONTRASENIA_ENCRIPT," 
             + "U.ID_USUARIO," 
             +"RU.ID_ROL" 
             +"FROM USUARIO U, ROL_USUARIO RU" 
             +"WHERE (RU.ID_USUARIO(+) = U.ID_USUARIO)" 
             +"AND (RU.ID_ROL(+) = 147" 
             +"AND RU.ESTATUS(+) = 1)" 
             +"AND (U.ESTATUS = 1" 
             +"AND U.NOMBRE_USUARIO= ?" 
             +"AND U.CONTRASENIA_ENCRIPT = ?)";
           boolean resultado = Utilities.ejecQuerys(primeraQ);
           
           
           
           segundaQ= "SELECT C_PER.id_personal," 
           + "C_PER.ID_UNIDAD_ADMINISTRATIVA," 
           + "C_PER.ID_DEPARTAMENTO,"  
           + "TO_CHAR(SYSDATE,'YYYY') ANIO_USUARIO, "
           + "NVL(U.cve_unidad_responsable_ini,0) cve_unidad_responsable_ini," 
           + "NVL(U.cve_unidad_responsable_fin,0) cve_unidad_responsable_fin "
           + "FROM usuario U, CAT_PERSONAL C_PER WHERE U.ID_PERSONAL    = C_PER.ID_PERSONAL(+) AND U.ESTATUS = 1 and"
           + "u.NOMBRE_USUARIO = 'ERIKA.TRUJILLO' ";
            
         
         
         
         

         
         
         
         
         
         return "";}
     private String valAuditoria(HttpServletRequest request) throws ServletException, IOException {return "";}
     private String valCol(HttpServletRequest request) throws ServletException, IOException {return "";}
     private String valTsUmf(HttpServletRequest request) throws ServletException, IOException {return "";}
     private String valTsCm(HttpServletRequest request) throws ServletException, IOException {return "";}
}
