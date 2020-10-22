package servlets;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Asad - 759175
 */
public class ShoppingListServlet extends HttpServlet {

   ArrayList<String> itemList = new ArrayList<>(); 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
       getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        HttpSession session = request.getSession();
        
        if(request.getParameter("action").equals("register") /*&& request.getParameter("user") != "" && request.getParameter("user") != null*/){
            //Creates session for logged in user
            itemList.clear();
            session.setAttribute("user", request.getParameter("user"));
         }
        
        if(request.getParameter("action").equals("logout")){
            //clears everyhting form array,invalidate session once user log out
            itemList.clear();
            session.invalidate();
            response.sendRedirect("register");        
         }
        
        if(request.getParameter("action").equals("Add") /*&& request.getParameter("inputItem") != "" && request.getParameter("inputItem") != null*/){
             //Adds item/radio button to the list  
             String itemFromRaju = (String) request.getParameter("inputItem");
             itemList.add(itemFromRaju);
             request.setAttribute("itemsList", itemList);        
         }
        
        if(request.getParameter("action").equals("Delete")){ 
            //Deletes item/radio button from the list
            String raju = request.getParameter("sList");
            itemList.remove(raju);
            request.setAttribute("itemsList", itemList);

         }
        
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

        
    }
}
