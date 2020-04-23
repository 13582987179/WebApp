package com.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.GoodsDaoImpl;
import com.po.GoodsBean;
import com.service.GoodsService;
import com.service.impl.GoodsSeviceimpl;
/**
 * Servlet implementation class GoodsServlet
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("action");
		if(action!=null)
		{
			if(action.equals("add")) {
				add(request,response);
			}else if(action.equals("findbyid")){
				findbyid(request,response);
			}else if(action.equals("updata")){
				updata(request,response);
			}
		}
	}
	private void updata(HttpServletRequest request, HttpServletResponse response) throws IOException {
		GoodsBean p=new GoodsBean();
		p.setId(Integer.valueOf(request.getParameter("id")));
		p.setName(request.getParameter("name"));
        p.setPrice(Double.valueOf(request.getParameter("price")));
		p.setCategory(request.getParameter("category"));
		p.setPnum(Integer.valueOf(request.getParameter("pnum")));
		p.setImgurl(request.getParameter("imgurl"));
		p.setDescription(request.getParameter("description"));
		GoodsService goodsService=new GoodsSeviceimpl();
		int b=goodsService.updata(p);
		if(b>0)
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("findbyid.jsp");
		}
	}

	private void findbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id=Integer.valueOf(request.getParameter("id"));
		   GoodsService goodsService=new GoodsSeviceimpl();
		    GoodsBean p = goodsService.findbyid(id);
		    	request.setAttribute("pd", p);
		    	request.getRequestDispatcher("updata.jsp").forward(request, response);
		
	}

	private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		GoodsBean g=new GoodsBean();
		g.setName(request.getParameter("name"));
		g.setPrice(Double.valueOf(request.getParameter("price")));
		g.setCategory(request.getParameter("category"));
		g.setPnum(Integer.valueOf(request.getParameter("pnum")));
		g.setImgurl(request.getParameter("imgurl"));
		g.setDescription(request.getParameter("description"));
		GoodsService goodsService=new GoodsSeviceimpl();
		int d=goodsService.add(g);
		if(d>0)
		{
			response.sendRedirect("log.jsp");
		}
		else {
			{
				response.sendRedirect("reg.jsp");
			}
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
