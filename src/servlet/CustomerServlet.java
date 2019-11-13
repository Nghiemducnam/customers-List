package servlet;

import models.Customers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(name = "CustomerServlet", urlPatterns = "/Customers")
public class CustomerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customers> customers = new ArrayList<>();
//        customers.add(new Customers("Donal Trump", "1946", "United State","https://upload.wikimedia.org/wikipedia/commons/5/56/Donald_Trump_official_portrait.jpg"));
//        customers.add(new Customers("Tập Cận Bình", "1953", "China","https://trithucvn.net/wp-content/uploads/2019/06/shutterstock_677148799.jpg"));
//        customers.add(new Customers("Nguyễn Phú Trọng","1944","Vietnam","https://vcdn-vnexpress.vnecdn.net/2018/10/23/tuyen-the-5165-1540287082.jpg"));
//
        Customers a1 = new Customers("Donal Trump", "1946", "United State","https://upload.wikimedia.org/wikipedia/commons/5/56/Donald_Trump_official_portrait.jpg");
        Customers a2 = new Customers("Tập Cận Bình", "1953", "China","https://trithucvn.net/wp-content/uploads/2019/06/shutterstock_677148799.jpg");
        customers.add(a1);
        customers.add(a2);
        req.setAttribute("customers", customers);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, resp);

   }
}
