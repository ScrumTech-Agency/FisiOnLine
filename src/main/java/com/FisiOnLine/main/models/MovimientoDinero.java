package com.FisiOnLine.main.models;

public class MovimientoDinero {
    //Atributos
    private double montoMovimiento;
    private String conceptoMovimiento;
    private Empleado empleadoMovimiento;

    //Constructor
    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento, Empleado empleadoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleadoMovimiento = empleadoMovimiento;
    }

    //Constructor en blanco
    public MovimientoDinero() {
    }


    //Get y set
    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getEmpleadoMovimiento() {
        return empleadoMovimiento;
    }

    public void setEmpleadoMovimiento(Empleado empleadoMovimiento) {
        this.empleadoMovimiento = empleadoMovimiento;
    }
}
