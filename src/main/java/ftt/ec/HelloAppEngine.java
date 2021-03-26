package ftt.ec;

import java.io.IOException;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/core"}
)
public class HelloAppEngine extends HttpServlet {
  private int counter = 0;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Go Corinthians from Google App Engine! - " + new Date() + " - " + counter + "\r\n");
    this.counter++;

  }
}