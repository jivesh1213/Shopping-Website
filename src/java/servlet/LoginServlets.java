package servlet;

import bean.BeanLocal;
import cart.Orderr;
import cart.Shoppingcart;
import db.JDBC;
import java.io.IOException;
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
import orderbean.OrderbeanLocal;

@WebServlet(name = "LoginServlets", urlPatterns = {"/LoginServlets"})
public class LoginServlets extends HttpServlet {
    OrderbeanLocal orderbean = lookupOrderbeanLocal();
    BeanLocal bean = lookupBeanLocal();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            long phone = Long.parseLong(request.getParameter("login_txt"));
            String password = request.getParameter("pass_txt");
            String p = ""+phone;
            JDBC j = new JDBC();
            String username = j.check(phone, password);
          
            if(!"".equals(username)){
                HttpSession session = request.getSession(true);
                session.setAttribute("username", username);
                session.setAttribute("phone", phone);
                List<Shoppingcart> cart = bean.returnproducts(p, 1);
                session.setAttribute("cart", cart);
                long total = 0;
                for(Shoppingcart i:cart){
                    total += i.getPrice();
                }
                session.setAttribute("total",total);
                
                List<Orderr> order = orderbean.returnorders(p);
                session.setAttribute("order", order);
                session.setMaxInactiveInterval(30*60);
        
                RequestDispatcher rd = request.getRequestDispatcher("Homejsp.jsp");
                rd.forward(request, response);
            }
            else{
                RequestDispatcher rd = request.getRequestDispatcher("Loginjsp.jsp");
                rd.forward(request, response);
            }    }

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

    private BeanLocal lookupBeanLocal() {
        try {
            Context c = new InitialContext();
            return (BeanLocal) c.lookup("java:global/DAmazon_site/DAmazon_site-ejb/Bean!bean.BeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private OrderbeanLocal lookupOrderbeanLocal() {
        try {
            Context c = new InitialContext();
            return (OrderbeanLocal) c.lookup("java:global/DAmazon_site/DAmazon_site-ejb/Orderbean!orderbean.OrderbeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
