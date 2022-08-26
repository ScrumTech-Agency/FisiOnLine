package com.FisiOnLine.main.business;

import com.FisiOnLine.main.models.Empleado;

import java.util.ArrayList;

public class GestorEmpleado {
    private ArrayList<Empleado> empleados;

    //Constructor


    public GestorEmpleado() {
        this.empleados = new ArrayList<>();
        this.empleados.add(new Empleado("Wilson","wahs_30@hotmail.com","FisiOnLine","administrador"));
    }
    public Empleado getEmpleado (String nombreEmpleado) throws Exception {
        for (Empleado empleado:empleados){
            if(empleado.getNombre_empleado().equals(nombreEmpleado)){
                return empleado;
            }
        }
        throw new Exception("El Empleado no Existe");
    }
    public ArrayList<Empleado>getEmpleados(){
        return empleados;
    }



}
