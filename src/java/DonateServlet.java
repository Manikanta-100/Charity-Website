import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class DonateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String amount = request.getParameter("amount");

        // Save the donation to the database (code for this below)
        Donation donation = new Donation(name, email, Double.parseDouble(amount));
        DonationDAO donationDAO = new DonationDAO();
        donationDAO.save(donation);

        // Redirect to a JSP page to confirm the donation
        RequestDispatcher dispatcher = request.getRequestDispatcher("donation_confirmation.jsp");
        request.setAttribute("name", name);
        request.setAttribute("amount", amount);
        dispatcher.forward(request, response);

    }
}
