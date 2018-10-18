/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Probar {

    public static void main(String[] args) {

        Opcion op1 = new Opcion("Ecaterror", false);
        Opcion op2 = new Opcion("Mizcalco", false);
        Opcion op3 = new Opcion("Kiev", true);
        Opcion op4 = new Opcion("Chalco", false);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        Pregunta p1 = new Pregunta("1.-¿Cual es la capital de Ucrania?", opciones);
        ////////////////////////////////////////////////////////////////////////////////
        
        Opcion op11 = new Opcion("Mizcalco", false);
        Opcion op12 = new Opcion("NezaYork", false);
        Opcion op13 = new Opcion("Minezota", false);
        Opcion op14 = new Opcion("CDMX", true);
        ArrayList<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        
        Pregunta p2 = new Pregunta("2.-¿Cual es la capital de Mexico?", opciones1);
        ////////////////////////////////////////////////////////////////////////////////
        Opcion op21 = new Opcion("Septiembre", true);
        Opcion op22 = new Opcion("Diciembre", false);
        Opcion op23 = new Opcion("Marzo", false);
        Opcion op24 = new Opcion("Junio", false);
        ArrayList<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        
        Pregunta p3 = new Pregunta("3.-¿Que mes se considera el mes patrio?", opciones2);
        ////////////////////////////////////////////////////////////////////////////////
        Opcion op31 = new Opcion("Enero", false);
        Opcion op32 = new Opcion("Julio", false);
        Opcion op33 = new Opcion("Abril", false);
        Opcion op34 = new Opcion("Diciembre", true);
        ArrayList<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        
        Pregunta p4 = new Pregunta("4.-¿En que mes se celebra la navidad?", opciones3);
        ////////////////////////////////////////////////////////////////////////////////
        Opcion op41 = new Opcion("5", false);
        Opcion op42 = new Opcion("Xs Max", true);
        Opcion op43 = new Opcion("8 Plus", false);
        Opcion op44 = new Opcion("6s", false);
        ArrayList<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        
        Pregunta p5 = new Pregunta("5.-¿Que iphone es el mas reciente?", opciones4);
        ////////////////////////////////////////////////////////////////////////////////

        Opcion op51 = new Opcion("Morada", false);
        Opcion op52 = new Opcion("Amarillo", false);
        Opcion op53 = new Opcion("Azul", true);
        Opcion op54 = new Opcion("verde", false);
        ArrayList<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        
        Pregunta p6 = new Pregunta("6.-¿Que color es el cielo ?", opciones5);
          ////////////////////////////////////////////////////////////////////////////////
        
        Opcion op61 = new Opcion("Paola", true);
        Opcion op62 = new Opcion("Karla", false);
        Opcion op63 = new Opcion("Vania", false);
        Opcion op64 = new Opcion("Katherine", false);
        ArrayList<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(op61);
        opciones6.add(op62);
        opciones6.add(op63);
        opciones6.add(op64);
        
        Pregunta p7 = new Pregunta("7.-¿Como se llama mi novia?", opciones6);
        ////////////////////////////////////////////////////////////////////////////////
        
        Opcion op71 = new Opcion("Pepsi", false);
        Opcion op72 = new Opcion("Coca-cola", true);
        Opcion op73 = new Opcion("7up", false);
        Opcion op74 = new Opcion("Fanta", false);
        ArrayList<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(op71);
        opciones7.add(op72);
        opciones7.add(op73);
        opciones7.add(op74);
        
        Pregunta p8 = new Pregunta("8.-¿Cual es el mejor refresco?", opciones7);
        ////////////////////////////////////////////////////////////////////////////////
        
        Opcion op81 = new Opcion("EPN", true);
        Opcion op82 = new Opcion("AMLO", false);
        Opcion op83 = new Opcion("Calderon", false);
        Opcion op84 = new Opcion("FOX", false);
        ArrayList<Opcion> opciones8 = new ArrayList<>();
        opciones8.add(op81);
        opciones8.add(op82);
        opciones8.add(op83);
        opciones8.add(op84);
        
        Pregunta p9 = new Pregunta("9.-¿Quien es nuestro presidente actual?", opciones8);
        ////////////////////////////////////////////////////////////////////////////////
        
        Opcion op91 = new Opcion("Anaya", false);
        Opcion op92 = new Opcion("Margarita", false);
        Opcion op93 = new Opcion("Bronco", true);
        Opcion op94 = new Opcion("AMLO", false);
        ArrayList<Opcion> opciones9 = new ArrayList<>();
        opciones9.add(op91);
        opciones9.add(op92);
        opciones9.add(op93);
        opciones9.add(op94);
        
        Pregunta p10 = new Pregunta("10.-¿Quien gano las elecciones?", opciones9);
        ////////////////////////////////////////////////////////////////////////////////
        
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
        // ahora se probara el modelo 
        //El for mejorado se lee de dercha a izquierda, primero va el tipo de arreglo de preguntas
        //y despues el tipo con el nombre 
        for (Pregunta p : preguntas) {
            System.out.println("\n"+p.getTitulo());
            //se utilizo un for dentro del foro para un arreglo

            for (Opcion o : p.getOpciones()) {
                System.out.println(o.getTitulo());
            }

        }
    }
}
