/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
private ArrayList<Trabajador> trabajadores;

    public Empresa(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void addTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
    public double calcularSalarioTotal(){
        double salarioTotal = 0;
        for (Trabajador Trabajador : trabajadores) {
            salarioTotal+= Trabajador.calcularSalario();
        }
        return salarioTotal;
    }
    
    public String listarInformacion(){
        String informacion = " ";
        for(Trabajador Trabajador: trabajadores){
            informacion+=" "+ Trabajador.listarInformacion();
        }
        return informacion;
    }
}
