package com.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.study.model.estudiante;

import jakarta.annotation.PostConstruct;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController // que nos permitirá instanciar la clase como un servicio web RestFull en Spring.En el controlador, procedemos a crear alguno datos de pruebas.
public class controlador {
    private List<estudiante> listadoEstudiantes;
    @PostConstruct //nos permite que se ejecute la función justo después del constructor y contar con los datos para los servicios.
    public void init(){
        listadoEstudiantes = new ArrayList<>();
        listadoEstudiantes.add(new estudiante(123, "Martha Chaguendo", true));
        listadoEstudiantes.add(new estudiante(143, "Jose Muñoz", true));
        listadoEstudiantes.add(new estudiante(223, "Mariana Dominguez", false));
    }
    // el value sin nada es un get con valores es un post ejemplo localhost:8080/consultaEstudiantes post crear, put editar, get recuperar, delete borrar 
    @GetMapping(value = "consultaEstudiantes", produces = MediaType.APPLICATION_JSON_VALUE) //junto con los parametros “value” y “produces”. En value ponemos el nombre que nos va a permitir consumir el servicio, en este caso “/consultaEstudiantes, y el formato de la respuesta a entregar con “produces”, en este caso “MediaType.APPLICATION_JSON_VALUE”.
    public List<estudiante> consulEstudiantes() { // produces enviar algo 
        return listadoEstudiantes;
    }
    //Método Post con la anotación @PostMapping, junto al nombre que nos va apermitir cosumir el servicio, en este caso “/pokemon”, y el formato de los datos que vamos a recibir en “consumes”, en este caso “ MediaType.APPLICATION_JSON_VALUE”.
    @PostMapping(value = "consultaEstudiantes", consumes = MediaType.APPLICATION_JSON_VALUE) // consumes consume algo un cuerpo de tipo json 
    public List<estudiante> crearEstudiantes(@RequestBody estudiante estudiante) {
        listadoEstudiantes.add(estudiante);
        return listadoEstudiantes;
    }
}
