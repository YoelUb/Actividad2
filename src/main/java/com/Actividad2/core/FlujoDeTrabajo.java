package com.Actividad2.core;

public class FlujoDeTrabajo {

    private IRecomendacion recomendacion;
    private IRetraso retraso;

    public FlujoDeTrabajo(IRecomendacion recomendacion, IRetraso retraso) {
        this.recomendacion = recomendacion;
        this.retraso = retraso;
    }

    public void ejecutar() {
        recomendacion.generarRecomendacion();
        retraso.gestionarRetraso();
    }
}
