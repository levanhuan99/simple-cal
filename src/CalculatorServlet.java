import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int firstOperator = Integer.parseInt(request.getParameter("firstOperand"));
        int secondOperator = Integer.parseInt(request.getParameter("secondOperand"));
        String operation = String.valueOf(request.getParameter("operator"));
        Calculator calculator = new Calculator();
        int result = 0;
        try {
            result = calculator.calculator(firstOperator, secondOperator, operation);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        PrintWriter writer = response.getWriter();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
