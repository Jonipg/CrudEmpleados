package com.empleado.test;

import com.empleado.bo.EmpleadoBO;
import com.empleado.entidad.Empleado;

/**
 *
 * @author Arely
 */
public class Test {

    EmpleadoBO ebo = new EmpleadoBO();
    Empleado emp = new Empleado();
    String mensaje = "";

    public void insertar() {

//       emp.setNombres("ARELY");
//        emp.setApellidos("CID");
//       emp.setCedula("250701");
//       emp.setEstadoCivil('S');
//       emp.setGenero('F');
//        emp.setEdad(21);
//        
        emp.setNombres("Andrea");
        emp.setApellidos("CID");
        emp.setCedula("250701");
        emp.setEstadoCivil('S');
        emp.setGenero('F');
        emp.setEdad(21);

        mensaje = ebo.agregarEmpleado(emp);
        System.out.println(mensaje);

    }

    public void modificar() {
        emp.setIdEmpleado(1);
        emp.setNombres("Maria");
        emp.setApellidos("Perez");
        emp.setCedula("250701");
        emp.setEstadoCivil('S');
        emp.setGenero('F');
        emp.setEdad(21);

        mensaje = ebo.modificarEmpleado(emp);
        System.out.println(mensaje);

    }

    public void eliminar() {

        mensaje = ebo.eliminarEmpleado(1);
        System.out.println(mensaje);

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();
        //test.modificar();
        //test.eliminar();

    }

}
