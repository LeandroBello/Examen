/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Leandro
 */
public class Registro 
{
    private String numeroRegistro;
    private String nombreDueno;
    private String cedulaDueno;
    private String placaAuto;

    public Registro(String numeroRegistro, String nombreDueno, String cedulaDueno, String placaAuto) {
        this.numeroRegistro = numeroRegistro;
        this.nombreDueno = nombreDueno;
        this.cedulaDueno = cedulaDueno;
        this.placaAuto = placaAuto;
    }

    /**
     * @return the numeroDueno
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * @param numeroRegistro the numeroDueno to set
     */
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    /**
     * @return the nombreDueno
     */
    public String getNombreDueno() {
        return nombreDueno;
    }

    /**
     * @param nombreDueno the nombreDueno to set
     */
    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    /**
     * @return the cedulaDueno
     */
    public String getCedulaDueno() {
        return cedulaDueno;
    }

    /**
     * @param cedulaDueno the cedulaDueno to set
     */
    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    /**
     * @return the placaAuto
     */
    public String getPlacaAuto() {
        return placaAuto;
    }

    /**
     * @param placaAuto the placaAuto to set
     */
    public void setPlacaAuto(String placaAuto) 
    {
        this.placaAuto = placaAuto;
    }
    
     public String getInformacion() {
        return "Número de Registro: " + numeroRegistro + "\nNombre del Dueño: " + nombreDueno + "\nCédula del Dueño: " + cedulaDueno+ "\nPlaca del automovil: "+placaAuto;
    }
}
