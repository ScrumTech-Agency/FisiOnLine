package com.FisiOnLine.main.models;

public class Empleado {
    string nombre_empleado;
    string correo_empleado;
    string empresa_empleado;
    string rol_empleado;

    public Empleado(string nombre_empleado, string correo_empleado, string empresa_empleado, string rol_empleado) {
        this.nombre_empleado = nombre_empleado;
        this.correo_empleado = correo_empleado;
        this.empresa_empleado = empresa_empleado;
        this.rol_empleado = rol_empleado;

    }

    public string getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(string nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public string getCorreo_empleado() {
        return correo_empleado;
    }

    public void setCorreo_empleado(string correo_empleado) {
        this.correo_empleado = correo_empleado;
    }

    public string getEmpresa_empleado() {
        return empresa_empleado;
    }

    public void setEmpresa_empleado(string empresa_empleado) {
        this.empresa_empleado = empresa_empleado;
    }

    public string getRol_empleado() {
        return rol_empleado;
    }

    public void setRol_empleado(string rol_empleado) {
        this.rol_empleado = rol_empleado;
    }
}

