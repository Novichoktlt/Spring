package ru.gb.servlet;

import ru.gb.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletProduct", urlPatterns = "/Product")
public class ServletProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", createProduct());
        getServletContext().getRequestDispatcher("/product.jsp")
                .forward(req, resp);
    }

    private List<Product> createProduct() {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Tea", "45.20"));
        products.add(new Product(2, "Coffee", "52.20"));
        products.add(new Product(3, "Cocoa", "85.50"));
        products.add(new Product(4, "Tomato", "52.20"));
        products.add(new Product(5, "Onion", "41.40"));
        products.add(new Product(6, "Potato", "62.40"));
        products.add(new Product(7, "Flour", "12.20"));
        products.add(new Product(8, "Sugar", "63.30"));
        products.add(new Product(9, "Salt", "96.20"));
        products.add(new Product(10, "Carrot", "3.30"));
        return products;
    }
}
