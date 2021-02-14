/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 69146
 */
public class Carro {
    private String placa;
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private String cor;

    public Carro() {
    }

    public Carro(String placa, String modelo, String marca, int anoFabricacao, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", cor=" + cor + '}';
    }
    
    
}
