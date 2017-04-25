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
public class Lider extends Programador{
    private ArrayList<Programador> programadores;

    public Lider(ArrayList<Programador> programadores, String nombre, double salario, int id, String lenguaje) {
        super(nombre, salario, id, lenguaje);
        this.programadores = programadores;
    }
    public void addProgramador(Programador p){
        this.programadores.add(p);
    }
    @Override
    public double calcularSalario(){
        double salarioTotal = 0;
        salarioTotal +=super.calcularSalario()*(super.calcularSalario()*
                this.programadores.size() * 0.1);
        return salarioTotal;
    }
    @Override
    public String listarInformacion(){
        String informacion = super.listarInformacion();
        informacion+= "Programadores a cargo\n";
        for (Programador programador : programadores){
            informacion+=programador.listarInformacion();
        }
        return informacion;
    }
}
