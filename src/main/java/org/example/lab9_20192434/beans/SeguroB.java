package org.example.lab9_20192434.beans;

public class SeguroB {

    private  int idseguro;
    private  String  empresa_aseguradora;
    private  double  cobertura_maxima;
    private  double  tarifa;

    public int getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(int idseguro) {
        this.idseguro = idseguro;
    }

    public String getEmpresa_aseguradora() {
        return empresa_aseguradora;
    }

    public void setEmpresa_aseguradora(String empresa_aseguradora) {
        this.empresa_aseguradora = empresa_aseguradora;
    }

    public double getCobertura_maxima() {
        return cobertura_maxima;
    }

    public void setCobertura_maxima(double cobertura_maxima) {
        this.cobertura_maxima = cobertura_maxima;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
