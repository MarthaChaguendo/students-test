package com.study.model;

public class estudiante {
    private int idEstudiante; 
    private String nombreEstudiante;
    private boolean estadoEstudiante;
    public estudiante (int idEstudiante, String nombreEstudiante,boolean estadoEstudiante){
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante =nombreEstudiante;
        this.estadoEstudiante = estadoEstudiante;
    }
    public estudiante(){}
    public int getIdEstudiante() {
        return idEstudiante;
    }
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public boolean isEstadoEstudiante() {
        return estadoEstudiante;
    }
    public void setEstadoEstudiante(boolean estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }

    
}
