/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutualgrupo36;
import Datos.AfiliadoData;
import mutualgrupo36.Entidades.Afiliado;
import Datos.EspecialidadData;
import Datos.OrdenData;
import Datos.PrestadorData;
import vistas.OrdenVista;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import mutualgrupo36.Entidades.Especialidad;
import mutualgrupo36.Entidades.Orden;
import mutualgrupo36.Entidades.Prestador;
import vistas.PrestadorMedVista;
public class MutualGrupo36 {
 
    public static void main(String[] args) {
        
        AfiliadoData afiData=new AfiliadoData();//para usar metodos de alumno data
//Prueba agregar
//      Afiliado afiliado=new Afiliado("Soza","Dario",34664344,"Lacarra 89",1574457556,true);
//      afiData.guardarAfiliado(afiliado);
//Prueba buscar id
//      Afiliado afiliadoencontrado= afiData.buscarAfiliado(1);
//      System.out.println("idAfiliado " +afiliadoencontrado.getIdAfiliado());
//      System.out.println("DNI "+afiliadoencontrado.getDni());
//      System.out.println("Apellido "+afiliadoencontrado.getApellido());
//Prueba listar
//      for(Afiliado afiliado:afiData.listarAfiliados()){
//          System.out.println(afiliado.getDni());
//          System.out.println(afiliado.getNombre());
//          System.out.println(afiliado.getApellido());
//      }
//       afiData.listarAfiliados();
//Prueba modificar
//        afiData.modificarAfiliado(afiliado);
//Prueba eliminar
//        afiData.borrarAfiliado(2);

    EspecialidadData esData=new EspecialidadData();
//    Especialidad dentis=new Especialidad("Oculista");
//Pruba agregar    
//      espeData.guardarEspecialidad(dentis);
//Prueba buscar id
//      Especialidad espeEncon=espeData.buscarEspecialidad(3);
//        System.out.println("Id: "+espeEncon.getIdEspecialidad());
//        System.out.println("Especialidad: "+espeEncon.getTipoEspecialidad());
//Prueba listar
//        for(Especialidad espec:esData.listarEspecialidad()){
//            System.out.println(espec.getIdEspecialidad());
//            System.out.println(espec.getTipoEspecialidad());
//        }
      

//    Especialidad especialidad = esData.buscarEspecialidad(2);
    PrestadorData presData = new PrestadorData();
//        Prestador prestador = new Prestador(4,"Gustavo", 25227661, "Salta 250", 1577230815 ,especialidad, true);
//Pruba agregar    
//      presData.guardarPrestador(prestador);
//Prueba Modificar
//      presData.modificarPrestador(prestador);
//Prueba buscar id
//        Prestador prestadorEncontrado= presData.buscarPrestador(2);
//        System.out.println("nombre "+prestadorEncontrado.getNombre());
//        System.out.println("domicilio "+prestadorEncontrado.getDomicilio());
//Prueba Eliminar (idPrestador)
//        presData.eliminarPrestador(4);
//Prueba listar
//      List<Prestador> prestadores = presData.listarPrestadores();
//      for (Prestador prestador : prestadores) {
//          System.out.println(" ");
//          System.out.println(prestador.getDni());
//          System.out.println(prestador.getNombre());
//          System.out.println(prestador.getDomicilio());
//        } 
//Prueba desactivarPrestador      
//      presData.desactivarPrestador(2);
//Prueba BuscarPrestadorPorEspecialidad
//    Especialidad cardiologia = new Especialidad(5, "cardiologia");
//    List<Prestador> prestadoresPorEspecialidad = presData.buscarPrestadorPorEspecialidad(cardiologia.getIdEspecialidad());
//        for (Prestador prestador : prestadoresPorEspecialidad) {
//          System.out.println(" ");
//          System.out.println(prestador.getDni());
//          System.out.println(prestador.getNombre());
//          System.out.println(prestador.getDomicilio());
//        }
// 
          


//Prueba Guardar Orden
//      LocalDate fecha = LocalDate.of(2023, 10, 15);
//      Afiliado afiliado = afiData.buscarAfiliado(7);
//      Prestador prestador = presData.buscarPrestador(2);
//      Orden orden = new Orden(afiliado, prestador, fecha, "efectivo", 3500);
//      OrdenData orData = new OrdenData();
//      orData.guardarOrden(orden);
//Prueba modificarOrden
//      LocalDate fecha = LocalDate.of(2023, 10, 24);
//      Afiliado afiliado = afiData.buscarAfiliado(7);
//      Prestador prestador = presData.buscarPrestador(2);
//      Orden ordenAmodificar = new Orden(3, afiliado, prestador, fecha, "efectivo", 3500);
//      OrdenData orData = new OrdenData();
//      orData.modificarOrden(ordenAmodificar);
//Prueba eliminarOrden
//       OrdenData orData = new OrdenData();
//       orData.eliminarOrden(3);   
//Prueba listarXFecha
//        LocalDate fecha = LocalDate.of(2023, 10, 20);
//        List <Orden> ordenesFecha = orData.listarOrdenesXFecha(fecha);  
//        for (Orden orden : ordenesFecha) {
//            System.out.println(" ");
//            System.out.println(orden.getFecha());
//            System.out.println(orden.getIdOrden());
//            System.out.println(orden.getAfiliado().getIdAfiliado());
//        } 
//Prueba OrdenesXAfiliado
//      List <Orden> ordenesAfiliado = orData.listarOrdenesXAfiliado(1);  
//      for (Orden orden : ordenesAfiliado) {
//            System.out.println(" ");
//            System.out.println(orden.getFecha());
//            System.out.println(orden.getIdOrden());
//            System.out.println(orden.getAfiliado().getIdAfiliado());
//      }
//Prueba OrdenesXPrestador
//      List <Orden> ordenesPrestador = orData.listarOrdenesXPrestador(1);  
//      for (Orden orden : ordenesPrestador) {
//          System.out.println(" ");
//          System.out.println(orden.getFecha());
//          System.out.println(orden.getIdOrden());
//          System.out.println(orden.getAfiliado().getIdAfiliado());
//      }
//Prueba OrdenesAfiliadoPrestador
//      List <Orden> ordenesAfiliadoPrestador = orData.listarOrdenesAfiliadoPrestador(1,1);  
//      for (Orden orden : ordenesAfiliadoPrestador) {
//          System.out.println(" ");
//          System.out.println(orden.getFecha());
//          System.out.println(orden.getIdOrden());
//          System.out.println(orden.getAfiliado().getIdAfiliado());
//      }



////Prueba para abrir Vistas: Orden
//        SwingUtilities.invokeLater(() -> {
//        // Crear un JFrame para contener el JDesktopPane
//        JFrame frame = new JFrame("Prueba de OrdenVista");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800, 600);
//
//        // Crear un JDesktopPane
//        frame.setVisible(true);
//          
//        JDesktopPane desktop = new JDesktopPane();
//
//        // Crear un JInternalFrame (OrdenVista) y agregarlo al JDesktopPane
//        JInternalFrame ordenVistaFrame = new OrdenVista();
//        desktop.add(ordenVistaFrame);
//
//        // Configurar el tamaño y posición del JInternalFrame
//        ordenVistaFrame.setSize(400, 300);
//        ordenVistaFrame.setLocation(200, 150);
//
//        // Hacer visible el JInternalFrame
//        ordenVistaFrame.setVisible(true);
//
//        // Agregar el JDesktopPane al JFrame
//        frame.add(desktop);
//
//        // Hacer visible el JFrame
//        frame.setVisible(true);
//    });
//    }
        
    ////Prueba para abrir Vistas: Prestador    
//        SwingUtilities.invokeLater(() -> {
//        // Crear un JFrame para contener el JDesktopPane
//        JFrame frame = new JFrame("Prueba de PrestadorMedVista");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800, 600);
//
//        JDesktopPane desktop = new JDesktopPane();
//        JInternalFrame PrestadorMedVistaFrame = new PrestadorMedVista();
//        desktop.add(PrestadorMedVistaFrame);
//        
//        PrestadorMedVistaFrame.setSize(400, 300);
//        PrestadorMedVistaFrame.setLocation(200, 150);
//
//        // Hacer visible el JInternalFrame
//        PrestadorMedVistaFrame.setVisible(true);
//
//        // Agregar el JDesktopPane al JFrame
//        frame.add(desktop);
//
//        // Hacer visible el JFrame
//        frame.setVisible(true);
//    });


        }
    }