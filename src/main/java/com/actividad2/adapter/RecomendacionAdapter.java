package com.actividad2.adapter;


import com.actividad2.core.IRecomendacion;

public class RecomendacionAdapter implements IRecomendacion {
    private ServicioRecomendacionExterno servicioExterno;

    public RecomendacionAdapter(ServicioRecomendacionExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    @Override
    public void generarRecomendacion() {
        System.out.println(servicioExterno.obtenerSugerencia());
    }
}