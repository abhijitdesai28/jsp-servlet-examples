package in.demo.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import in.demo.dao.BookDAO;
import in.demo.dto.BookDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirect GET requests to your form page or another appropriate URL
        response.sendRedirect(request.getContextPath() + "/index.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Capture form data
            String id = request.getParameter("bookId");
            String bookName = request.getParameter("bookName");
            String price = request.getParameter("bookPrice");

            int bookid = Integer.parseInt(id);
            double bookprice = Double.parseDouble(price);

            BookDTO bdto = new BookDTO();
            bdto.setBookId(bookid);
            bdto.setBookName(bookName);
            bdto.setBookPrice(bookprice);

            // Call DAO method by giving form data
            BookDAO dao = new BookDAO();
            boolean status = dao.saveBook(bdto);

            // Send response to client
            String msg = null;
            if (status) {
                msg = "Record Inserted";
            } else {
                msg = "Insertion failed";
            }

            PrintWriter pw = response.getWriter();
            pw.append(msg);
        } catch (NumberFormatException e) {
            // Handle NumberFormatException (e.g., invalid input for bookId or bookPrice)
            e.printStackTrace();
            response.getWriter().append("Invalid input for Book Id or Book Price");
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
            response.getWriter().append("Error occurred: " + e.getMessage());
        }
    }
}
