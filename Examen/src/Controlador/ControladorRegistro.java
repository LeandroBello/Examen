/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Leandro
 */
import Modelo.MetodosRegistro;
import Vista.FRM_MenuPrincipal;
import Vista.GUI_Informacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorRegistro implements ActionListener {

    MetodosRegistro metodosRedistro;//Instancia.
    FRM_MenuPrincipal mantenimientoMenuPrincipal;//Instancia.
    GUI_Informacion gUI_Informacion;

    public ControladorRegistro(FRM_MenuPrincipal mantenimientoMenuPrincipal)//Contructor.
    {
        this.mantenimientoMenuPrincipal = mantenimientoMenuPrincipal;//Se agrega el mantenimiento estudiante del que llega de parametro al metodo constructor.
        metodosRedistro = new MetodosRegistro();
    }

    public void actionPerformed(ActionEvent e)//Escuchador
    {
        System.out.print("AGREGA");
        if (e.getActionCommand().equals("Agregar")) {
            if (metodosRedistro.existeRegistro(mantenimientoMenuPrincipal.devolverInformacion()) == false) {
                metodosRedistro.agregarRegistro(mantenimientoMenuPrincipal.devolverInformacion());
                metodosRedistro.mostrarInformacionRegistroTemporal();
                metodosRedistro.mensajeExitoso();
            } else {
                metodosRedistro.existeRegistro();
            }
        }
        if (e.getActionCommand().equals("Buscar"))
        {
            if (metodosRedistro.consultarEstudiantes(mantenimientoMenuPrincipal.devolverInformacion())) {
                mantenimientoMenuPrincipal.mostrarInformacion(metodosRedistro.devolverArreglo());
            } else {
                System.out.println("No se encontró el Alumno");
                mantenimientoMenuPrincipal.limpiarInformacion();
            }
        }      
        if (e.getActionCommand().equals("Modificar")) 
        {
          metodosRedistro.modificarEstudiante(mantenimientoMenuPrincipal.devolverInformacion());
        }
        if (e.getActionCommand().equals("Eliminar")) {
           metodosRedistro.eliminarRegistro(mantenimientoMenuPrincipal.devolverInformacion());
        }

    }//Fin del action performed
}
/*




    
    

    public void actionPerformed(ActionEvent e)//Escuchador
    {
      
        
        
    
        
    }
}
 */
