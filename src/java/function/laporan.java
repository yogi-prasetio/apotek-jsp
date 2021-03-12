/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfReader;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Yogi
 */
@WebServlet(name = "laporan", urlPatterns = {"/laporan"})
public class laporan extends HttpServlet {

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
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        
        try {
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM `penjualan`");
            ResultSet rs=ps.executeQuery();
            
            try{
                Document doc = new Document();
                PdfWriter.getInstance(doc, out);
                doc.open();         
                Paragraph par = new Paragraph();
                par.add(new Phrase ("Laporan Penjualan Obat", new Font(Font.FontFamily.HELVETICA,16, Font.BOLD)));
                par.setAlignment(Element.ALIGN_CENTER);
                Paragraph par2 = new Paragraph();
                par2.add(new Phrase("Apotek Siaga", new Font(Font.FontFamily.HELVETICA,14, Font.BOLDITALIC, BaseColor.BLUE)));
                par2.setAlignment(Element.ALIGN_CENTER);
                PdfPTable table = new PdfPTable(5);
                
                Font font = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
                PdfPCell c1 = new PdfPCell (new Phrase("NO.",font));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(c1);
                PdfPCell c2 = new PdfPCell (new Phrase("KODE OBAT",font));
                c2.setHorizontalAlignment(Element.ALIGN_CENTER);
                c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(c2);
                PdfPCell c3 = new PdfPCell (new Phrase("JUMLAH",font));
                c3.setHorizontalAlignment(Element.ALIGN_CENTER);
                c3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(c3);
                PdfPCell c4 = new PdfPCell (new Phrase("TOTAL HARGA",font));
                c4.setHorizontalAlignment(Element.ALIGN_CENTER);
                c4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(c4);
                PdfPCell c5 = new PdfPCell (new Phrase("WAKTU TRANSAKSI",font));
                c5.setHorizontalAlignment(Element.ALIGN_CENTER);
                c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(c5);
                
                int x=0;
                while(rs.next()){
                    x++;
                    try{
                        table.addCell(String.valueOf(x));
                        table.addCell(rs.getString("kd_obat"));
                        table.addCell(String.valueOf(rs.getInt("qty")));
                        table.addCell(String.valueOf(rs.getInt("total_harga")));
                        table.addCell(rs.getString("waktu_transaksi"));
                    } catch(Exception ex){}
                }
                doc.addTitle("Laporan Penjualan Obat || Apotek Siaga");
                doc.add(par);
                doc.add(par2);
                doc.add(new Paragraph(" "));
                doc.add(table);
                doc.close();
            }
            catch(Exception ex){ System.out.println(ex); }
        } catch (Exception e){}
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
