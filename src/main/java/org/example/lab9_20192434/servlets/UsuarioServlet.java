package org.example.lab9_20192434.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import org.example.lab9_20192434.beans.UsuarioB;
import org.example.lab9_20192434.daos.UsuarioDao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
@WebServlet(name = "UsuarioServlet", value = "/UsuarioServlet")
public class UsuarioServlet extends  HttpServlet{


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        UsuarioDao usuario = new UsuarioDao();
        String vista ="";
        String action = request.getParameter("action") == null ? "listaUsuario" : request.getParameter("action");

        switch (action){
            case "listaUsuario":

                vista= "WEB-INF/Coordinadora/listaUsuario.jsp";
                ArrayList<UsuarioB> listarUsuariosO = usuario.listarUsuarios() ;
                request.setAttribute("lista", listarUsuariosO);
                request.getRequestDispatcher(vista).forward(request, response);
                break;




        }

    }



}
