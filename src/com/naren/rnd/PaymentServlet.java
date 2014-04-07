package com.naren.rnd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Customer;

/**
 * Servlet implementation class PaymentServlet of stripe
 */
public class PaymentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      
	      String firstName = request.getParameter("FirstName");
	      String lastName = request.getParameter("LastName");
	      String email = request.getParameter("email");
	      String stripeToken = request.getParameter("stripeToken");
	      Stripe.apiKey = "sk_test_NanussBJ1qO7lkCbnQfGUMbl"; 
	      Map<String, Object> customerParams = new HashMap<String, Object>();
	       customerParams.put("description", email);
	       customerParams.put("card", stripeToken); 
	       // obtained with Stripe.js 
	       try 
	       {
			Customer cust = Customer.create(customerParams);
			System.out.println(cust.getId());
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       out.println("User successfully registered");
	}

}
