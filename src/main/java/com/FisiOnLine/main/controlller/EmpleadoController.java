package com.FisiOnLine.main.controlller;

import com.FisiOnLine.main.business.GestorEmpleado;
import com.FisiOnLine.main.models.Empleado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpleadoController {
    private GestorEmpleado gestorEmpleado =new GestorEmpleado();

    @GetMapping("/empleados")
    public ResponseEntity<ArrayList<Empleado>> getEmpleados(){
        return new ResponseEntity<>(gestorEmpleado.getEmpleados(), HttpStatus.ACCEPTED);
    }
}
