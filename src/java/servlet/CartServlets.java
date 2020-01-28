package servlet;

import bean.BeanLocal;
import cart.Shoppingcart;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CartServlets", urlPatterns = {"/CartServlets"})
public class CartServlets extends HttpServlet {
    
    BeanLocal bean = aBeanLocal();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        Enumeration items = null;
        HttpSession session = request.getSession(false);
        long phone = (long)session.getAttribute("phone");
        items = request.getParameterNames();
        String p = "" + phone;
        
        while(items.hasMoreElements()){
            String iname = (String)items.nextElement();
            bean.add(iname, p);
        }
            List<Shoppingcart> cart = bean.returnproducts(p, 1);
            session.setAttribute("cart", cart);
            long total = 0;
            for(Shoppingcart i:cart){
                total += i.getPrice();
            }
            session.setAttribute("total",total);
            long gtotal = total + 100;
            session.setAttribute("gtotal", gtotal);
        RequestDispatcher rd = request.getRequestDispatcher("ShoppingCart.jsp");
        rd.forward(request, response);
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

    private BeanLocal aBeanLocal() {
        try {
            Context c = new InitialContext();
            return (BeanLocal) c.lookup("java:global/DAmazon_site/DAmazon_site-ejb/Bean!bean.BeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
