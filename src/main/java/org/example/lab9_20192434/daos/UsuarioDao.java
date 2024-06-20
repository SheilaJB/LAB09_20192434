package org.example.lab9_20192434.daos;
import org.example.lab9_20192434.beans.MatricaB;
import org.example.lab9_20192434.beans.UsuarioB;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class UsuarioDao extends  BaseDao{
    //Listar usuarios

    public ArrayList<UsuarioB> listarUsuarios(){
        String sql ="select \n" +
                "u.idusuario as 'IdUsuario',\n" +
                "u.nombres as 'Nombres', u.apellidos as 'Apellidos', li.categoria as 'Tipo de licencia',\n" +
                "fecha_emision as 'Fecha emision',\n" +
                "fecha_caducidad as 'Fecha caducidad',\n" +
                "pa.nombre_pais as 'Pais de procedencia',\n" +
                "re.cancelada as 'Cantidad de cancelado'\n" +
                "from usuario u\n" +
                "JOIN licencia li ON u.licencia_idlicencia = li.idlicencia\n" +
                "JOIN pais pa ON li.pais_idpais = pa.idpais\n" +
                "JOIN renta_auto re ON u.idusuario = re.id_renta\n" +
                "where u.rol_idrol =1 or u.rol_idrol =3;";

        ArrayList<UsuarioB> listarUsuariosOperativos = new ArrayList<>();

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    UsuarioB usuario = new UsuarioB();
                    usuario.setIdusuario(rs.getInt("IdUsuario"));
                    usuario.setNombres(rs.getString("Nombres"));
                    usuario.setApellidos(rs.getString("Apellidos"));
                    usuario.setTipoLicencia(rs.getString("Tipo de licencia"));
                    usuario.setFecha_emision(rs.getString("Fecha emision"));
                    usuario.setFecha_caducidad(rs.getString("Fecha caducidad"));
                    usuario.setPaisProcedente(rs.getString("Pais de procedencia"));
                    usuario.setCantidadCancelado(rs.getInt("Cantidad de cancelado"));
                    listarUsuariosOperativos.add(usuario);
                }
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  listarUsuariosOperativos;
    }

    /*public ArrayList<MatricaB> listaMetrica(){


    }*/





}
