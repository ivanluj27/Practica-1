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
public class Cuestionario {
    private ArrayList<Pregunta> preguntas;

    public Cuestionario(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    

    /**
     * @return the preguntas
     */
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * @param preguntas the preguntas to set
     */
    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
