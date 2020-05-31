package com.emergentes.controlador;

import com.emergente.modelo.Producto;
import com.emergentes.dao.ProductoDao;
import com.emergentes.dao.ProductoDaoImp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {   
                ProductoDao dao = new ProductoDaoImp();
               // recibir el numero de id
               int id;
               // para gestionar los registros 
               Producto pro = new Producto();
                String accion = (request.getParameter("accion")!= null) ? request.getParameter("accion") : "view";
                switch (accion){
                    case "nuevo": // nuevo registro
                        request.setAttribute("producto", pro);
                        request.getRequestDispatcher("frmproducto.jsp").forward(request, response);
                    break;
                    case "editar": // editar registro
                            id = Integer.parseInt(request.getParameter("id"));
                            pro = dao.getById(id);
                            request.setAttribute("producto", pro);
                            request.getRequestDispatcher("frmproducto.jsp").forward(request, response);
                    break;
                    case "eliminar": //elimina registro
                            id = Integer.parseInt(request.getParameter("id"));
                            dao.delete(id);
                            response.sendRedirect(request.getContextPath()+"/Controlador");                            
                    break;
                    default:
                        //listar los registros
                        List<Producto> lista = dao.getAll();
                        request.setAttribute("productos", lista);
                        request.getRequestDispatcher("control.jsp").forward(request, response);
                    break;           
                }                    
        } catch (Exception e) {
            System.out.println("error "+e.getMessage());;
        } 
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ProductoDao dao = new ProductoDaoImp();
        String descripcion = request.getParameter("descripcion");
        int stock = Integer.parseInt(request.getParameter("stock"));
        Producto pro = new Producto();
        pro.setId(id);
        pro.setDescripcion(descripcion);
        pro.setStock(stock);
        if (id == 0 )// si es nuevo registro
        {         
            try {
                dao.insert(pro);
                response.sendRedirect("Controlador");
            } catch (Exception ex) {
                System.out.println("error "+ex.getMessage());;
            }            
        }
        else // actualizacion de un registro ya existente
        {
            try {
                dao.update(pro);
                response.sendRedirect("Controlador");
            } catch (Exception ex) {
                System.out.println("error "+ex.getMessage());;
            }
        }           
    }
}
