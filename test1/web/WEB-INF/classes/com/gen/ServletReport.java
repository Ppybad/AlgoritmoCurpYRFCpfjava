/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gen;

import com.conexion.ConexionOracle;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRTextExporter;
import net.sf.jasperreports.engine.export.JRTextExporterParameter;
 

/**
 *
 * @author Pepe Ybad
 */
public class ServletReport extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
       JspFactory _jspxFactory;
    PageContext pageContext;
    ServletContext application;
    try
    {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response, null, true, 8192, true);
      
      application = pageContext.getServletContext();
      
      int numFiles = 1;
      OutputStream outStream = response.getOutputStream();
      DataOutputStream dataOut = new DataOutputStream(outStream);
      
      dataOut.writeInt(numFiles);
      
      request.setAttribute("db_user", "dbtrab_soc");
      
      ConexionOracle con = new ConexionOracle();
      Connection conn;
      conn = con.conectar(); 

      HttpSession session = request.getSession();
      String nombreReporte = request.getParameter("nombreReporte") != null ? request.getParameter("nombreReporte") : "";
      String chkseleccionavalues = request.getParameter("chkseleccionavalues") != null ? request.getParameter("chkseleccionavalues") : "";
      String filtro;
      String id_centro_medico = "";
      if (session.getAttribute("ID_CENTRO_MEDICO") != null) {
        id_centro_medico = (String)session.getAttribute("ID_CENTRO_MEDICO");
      }
      filtro = " AND c.id_cita IN (" + chkseleccionavalues + ")";

      
      File reportFile = new File(application.getRealPath("/"  + "\\" +  nombreReporte + ".jasper"));
      if (!reportFile.exists()) {
        throw new JRRuntimeException("File WebappReport.jasper not found. The report design must be compiled first.");
      }
      
      
      Map<String,String> parameters = new HashMap<>();
//      parameters.put("parameter1", chkseleccionavalues);
      parameters.put("IDENTIFICADORES", chkseleccionavalues);
//      parameters.put("FILTRO", filtro);
//      parameters.put("ID_CENTRO_MEDICO", "1");
      
        System.out.println("sou?t");
      
      JasperPrint print = JasperFillManager.fillReport(reportFile.getPath(), parameters, conn);
      File file = null;
      try
      {
        JRTextExporter exporter = new JRTextExporter();

        file = new File(application.getRealPath("/") + "\\" + nombreReporte + ".txt");
        exporter.setParameter(JRTextExporterParameter.JASPER_PRINT, print);
        exporter.setParameter(JRTextExporterParameter.OUTPUT_FILE, file);
//        exporter.setParameter(JRTextExporterParameter.PAGE_HEIGHT,20);
//        exporter.setParameter(JRTextExporterParameter.PAGE_WIDTH, 50);
        exporter.setParameter(JRTextExporterParameter.PAGE_HEIGHT,11);
        exporter.setParameter(JRTextExporterParameter.PAGE_WIDTH, 57);
//        exporter.setParameter(JRTextExporterParameter.CHARACTER_WIDTH, 7);
//        exporter.setParameter(JRTextExporterParameter.CHARACTER_HEIGHT, 10);
//        exporter.setParameter(JRTextExporterParameter.PAGE_HEIGHT, 50);
//        exporter.setParameter(JRTextExporterParameter.PAGE_WIDTH, 50);
//        exporter.setParameter(JRTextExporterParameter.CHARACTER_WIDTH, 12);
//        exporter.setParameter(JRTextExporterParameter.CHARACTER_HEIGHT, 10);
//        exporter.setParameter(JRTextExporterParameter.CHARACTER_ENCODING, 8);
        exporter.exportReport();
      }
      catch (JRException jRException)
      {
        System.out.println("TS_UMF ServletReportException, jRException: " + jRException.toString());
      }
      if (conn != null) {
        conn.close();
      }
      conn = null;
      
      File[] files = new File[numFiles];
        System.out.println("ss"+ files.length);
      files[0] = file;
      FileInputStream fileStrm;
      BufferedInputStream bufferStrm;
      for (int k = 0; k < numFiles; k++)
      {
//        dataOut.writeUTF(files[k].getName());
        
//        dataOut.writeLong(files[k].length());
        
        fileStrm = new FileInputStream(files[k]);
        
        bufferStrm = new BufferedInputStream(fileStrm);
        int in;
        while ((in = bufferStrm.read()) != -1) {
          dataOut.write(in);
        }
        outStream.flush();
        fileStrm.close();
        bufferStrm.close();
      }
      outStream.close();
      dataOut.close();
      outStream = null;
      bufferStrm = null;
      fileStrm = null;
      dataOut = null;
//      
      ///
      
    PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
//        // Crear una lista para mostrar al usuario
        String[] nombresImpresoras = new String[services.length];
        for (int i = 0; i < services.length; i++) {
            nombresImpresoras[i] = services[i].getName();
            System.out.println("nombre servicio impresion: "+services[i].getName());
        }
//        
//         // Pedir al usuario que elija la impresora
//        String nombreImpresora = (String) JOptionPane.showInputDialog(null, "Elige la impresora:",
//            "Selección de Impresora", JOptionPane.QUESTION_MESSAGE, null, nombresImpresoras, nombresImpresoras[0]);
//        // Buscar el servicio de impresión por nombre
        PrintService impresoraSeleccionada = null;
        for (PrintService service : services) {
            if (service.getName().equals("ZDesigner GK420d (EPL)")) {
                impresoraSeleccionada = service;
                break;
            }
        }
//        // Crear un trabajo de impresión
        if (impresoraSeleccionada != null) {
//            try {
//                String nombreArchivo = application.getRealPath("/").toString() + "\\" + nombreReporte + ".txt";
//                BufferedReader reader = new BufferedReader(new FileReader(application.getRealPath("/").toString() + "\\" + nombreReporte + ".txt"));
//            StringBuilder texto = new StringBuilder();
//            String linea;
//            while ((linea = reader.readLine()) != null) {
//                texto.append(linea).append("\n");
//            }
//            reader.close();
              
//                DocPrintJob job = impresoraSeleccionada.createPrintJob();
//                String texto = "Texto de prueba para imprimir";
//                byte[] by = texto.getBytes();
//                DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
////                DocFlavor flavor = DocFlavor.STRING.TEXT_PLAIN;
//                Doc doc = new SimpleDoc(by, flavor, null);
////                 Doc doc = new SimpleDoc(texto.toString(), flavor, null);
//                PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
//////                
//                job.print(doc, pras);
//                  JOptionPane.showMessageDialog(null, "Enviado a la impresora: "); 
//                System.out.println(flavor);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        } else {
//            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna impresora.");
              System.out.println("No se seleccionó ninguna impresora.");
        }
      
      
      
      
      
      
    }
    catch (Exception e)
    {
      System.out.println("TS_UMF ServletReportException, Exception e: " + e.toString());
      e.printStackTrace();
    }
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

}
