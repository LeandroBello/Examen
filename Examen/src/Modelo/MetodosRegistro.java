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
import java.util.ArrayList;
import Vista.GUI_Botones;
import Vista.GUI_Informacion;
import javax.swing.JOptionPane;
public class MetodosRegistro 
{
    String arregloDatos[];//arreglo nivel global.
    ArrayList<Registro> arrayListRegistro;
    GUI_Botones gUI_Botones;
    GUI_Informacion gUI_Informacion;
    public int numeroRegistro = 0;
public String numero=""+numeroRegistro;
public MetodosRegistro() //Metodo Constructor.
    {
        arrayListRegistro = new ArrayList<Registro>();//Intancia del array. 
    }

    //Metodos


 public void agregarRegistro(String informacion[])//MetodoAgregar.
    { arregloDatos = new String[4];//Instancia de arreglo. cuatro atributos.
        Registro temporal = new Registro(informacion[0], informacion[1], informacion[2], informacion[3]);
        arrayListRegistro.add(temporal);
        numeroRegistro++;
    }
 
   public void modificarEstudiante(String informacion[]) 
   {
        for (int contador = 0; contador < arrayListRegistro.size(); contador++) {
            if (arrayListRegistro.get(contador).getNumeroRegistro().equals(informacion[0])) {
                arrayListRegistro.get(contador).setNombreDueno(informacion[1]);
                arrayListRegistro.get(contador).setCedulaDueno(informacion[2]);
                arrayListRegistro.get(contador).setPlacaAuto((informacion[3]));
                contador = arrayListRegistro.size();
            }
        }
    }
    public boolean consultarEstudiantes(String informacion[])
    {
        boolean encontrado = false;
        for (int contador = 0; contador < arrayListRegistro.size(); contador++) {
            if (arrayListRegistro.get(contador).getNumeroRegistro().equals(informacion[0])) {
                arregloDatos[0] = arrayListRegistro.get(contador).getNumeroRegistro();
                arregloDatos[1] = arrayListRegistro.get(contador).getNombreDueno();
                arregloDatos[2] = arrayListRegistro.get(contador).getCedulaDueno();
                arregloDatos[3] = arrayListRegistro.get(contador).getPlacaAuto();
                encontrado = true;
              //  JOptionPane.showMessageDialog(null, arrayListRegistro.get(contador).getCarnet() + arrayListEstudiante.get(contador).getNombreEstudiante() + arrayListEstudiante.get(contador).getDireccion());
                contador = arrayListRegistro.size();
            }
        }
        return encontrado;
    }
   
    public void eliminarRegistro(String informacion[]) 
    {
        for (int contador = 0; contador < arrayListRegistro.size(); contador++) {
            if (arrayListRegistro.get(contador).getNumeroRegistro().equals(informacion[0])) {
                arrayListRegistro.remove(contador);
            }
        }
    }
   
    
    public String[] devolverArreglo() {
        return this.arregloDatos;
    }

    public int registrosAgregados() {
        return numeroRegistro;
    }
 
       public boolean existeRegistro(String informacion[])
    {
        boolean existe = false;
        for (int contador = 0; contador < arrayListRegistro.size(); contador++)
        {
            if (arrayListRegistro.get(contador).getNumeroRegistro().equals(informacion[0])) 
            {
                existe = true;
                contador = arrayListRegistro.size();
            }
        }
        return existe;//devuelve el booleano para comprovar si existe un registro o no ante el controlador.
    }
        public void mensajeExitoso() 
    {
        JOptionPane.showMessageDialog(null, "Proceso realizado con éxito");
    }
  
    public void existeRegistro() 
    {
        JOptionPane.showMessageDialog(null, "Proceso de Agregar fue Cancelado\nEl registro ya existe en la base de datos\n");
    }
   
    public void mostrarInformacionRegistroTemporal() //muestra cada vez que matricula un curso.
    {
        Registro registroTemporal;
        registroTemporal = arrayListRegistro.get(registrosAgregados() - 1);
        System.out.println(registroTemporal.getInformacion());
        JOptionPane.showMessageDialog(null, "Guardado con exito\n" + registroTemporal.getInformacion());
    }
    
}//Fin de la clase.

   