package controller;

import model.HoKhau;
import model.ThanhVien;
import service.HoKhauService;
import service.ThanhVienService;
import service.impl.HoKhauServiceImpl;
import service.impl.ThanhVienServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HoKhauServlet", urlPatterns = "/hokhaus")

public class HoKhauServlet extends HttpServlet {

    static ThanhVienService thanhVienService = new ThanhVienServiceImpl();

    static HoKhauService hoKhauService = new HoKhauServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {

            case "create":
                showCreateForm(request, response);
                break;

            case "edit":
                showEditForm(request, response);
                break;

            case "Search":
                showFindForm(request, response);
                break;

            default:
                listHoKhau(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createHoKhau(request, response);
                break;

            case "edit":
                editHoKhau(request, response);
                break;

            case "delete":
                deleteHoKhau(request, response);
                break;

            default:
                listHoKhau(request, response);
                break;
        }
    }

    private void listHoKhau(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<HoKhau> hoKhaus = hoKhauService.listHoKhau();
        request.setAttribute("hoKhaus", hoKhaus);

        List<ThanhVien> thanhViens = thanhVienService.listThanhVien();
        request.setAttribute("thanhViens", thanhViens);

        request.getRequestDispatcher("view/hokhau/list.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ThanhVien> thanhViens = thanhVienService.listThanhVien();
        request.setAttribute("thanhViens", thanhViens);

        request.getRequestDispatcher("view/hokhau/create.jsp").forward(request, response);
    }

    private void createHoKhau(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<HoKhau> hoKhaus = hoKhauService.listHoKhau();

        String maHoKhau = request.getParameter("maHoKhau");

        String tenChuHo = request.getParameter("tenChuHo");

        int soThanhVien = Integer.parseInt(request.getParameter("soThanhVien"));

        String ngayLapHoKhau = request.getParameter("ngayLapHoKhau");

        String diaChi = request.getParameter("diaChi");

//        int max = 0;
//        for (HoKhau item : hoKhaus) {
//            if (max < item.getMa()) {
//                max = item.getId();
//            }
//        }
//        int id = max + 1;

        HoKhau hoKhau = new HoKhau(maHoKhau, tenChuHo, soThanhVien, ngayLapHoKhau, diaChi);

        hoKhauService.createHoKhau(hoKhau);

        request.getRequestDispatcher("view/hokhau/create.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String maHoKhau = request.getParameter("maHoKhau");

        HoKhau hoKhaus = hoKhauService.findByMaHoKhau(maHoKhau);

        List<ThanhVien> thanhViens = thanhVienService.listThanhVien();

        request.setAttribute("hoKhaus", hoKhaus);

        request.setAttribute("thanhViens", thanhViens);

        request.getRequestDispatcher("view/hokhau/edit.jsp").forward(request, response);
    }

    private void editHoKhau(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String maHoKhau = request.getParameter("maHoKhau");

        String tenChuHo = request.getParameter("tenChuHo");

        int soThanhVien = Integer.parseInt(request.getParameter("soThanhVien"));

        String ngayLapHoKhau = request.getParameter("ngayLapHoKhau");

        String diaChi = request.getParameter("diaChi");

        HoKhau hoKhaus = new HoKhau(maHoKhau, tenChuHo, soThanhVien, ngayLapHoKhau, diaChi);

        hoKhauService.editHoKhau(hoKhaus);

        request.getRequestDispatcher("view/hokhau/edit.jsp").forward(request, response);
    }

    private void showFindForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String nameFind = request.getParameter("nameFind");
//
//        List<model.HoKhau> customers = hoKhauService.findCustomers(nameFind);
//
//        request.setAttribute("customers", customers);
//
//        request.getRequestDispatcher("view/hoKhaus/list.jsp").forward(request, response);
    }

    private void deleteHoKhau(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        int id = Integer.parseInt(request.getParameter("idDelete"));
//
//        hoKhauService.deleteCustomer(id);
//
//        List<model.HoKhau> customers = hoKhauService.listCustomers();
//
//        request.setAttribute("customers", customers);
//
//        request.getRequestDispatcher("view/hoKhaus/list.jsp").forward(request, response);
    }
}
