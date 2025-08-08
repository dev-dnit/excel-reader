package dnit.excel.reader.teste;

import dnit.excel.reader.api.Excel;


public class FwdMappingExcel {

    @Excel(headerName = "km")
    public Double km;


    @Excel(headerName = "sentido")
    public String sentido;


    @Excel(headerName = "faixa")
    public Integer faixa;

    @Override
    public String toString() {
        return "FwdMappingExcel{" +
                "km=" + km +
                ", sentido='" + sentido + '\'' +
                ", faixa=" + faixa +
                ", pista='" + pista + '\'' +
                ", local='" + local + '\'' +
                ", cargaFwd=" + cargaFwd +
                ", df1=" + df1 +
                ", df2=" + df2 +
                '}';
    }

    @Excel(headerName = "pista")
    public String pista;


    @Excel(headerName = "local")
    public String local;


    @Excel(headerName = "Força")
    public Double cargaFwd;


    @Excel(headerName = "D1")
    public Double df1;


    @Excel(headerName = "D2")
    public Double df2;


    @Excel(headerName = "D3")
    public Double df3;


    @Excel(headerName = "D4")
    public Double df4;


    @Excel(headerName = "D5")
    public Double df5;


    @Excel(headerName = "D6")
    public Double df6;


    @Excel(headerName = "D7")
    public Double df7;


    @Excel(headerName = "T ar")
    public Double tar;


    @Excel(headerName = "T pav")
    public Double tsup;


    @Excel(headerName = "Data")
    public String dataLevantamento;


    @Excel(headerName = "latitude")
    public Double latitude;


    @Excel(headerName = "longitude")
    public Double longitude;


    @Excel(headerName = "Observações")
    public String observacao;


}
