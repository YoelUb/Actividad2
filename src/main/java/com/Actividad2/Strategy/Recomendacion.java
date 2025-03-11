package com.Actividad2.Strategy;

import com.Actividad2.core.IRecomendacion;

public class Recomendacion implements IRecomendacion {
    private EstrategiaRecomendacion estrategia;

    public Recomendacion(EstrategiaRecomendacion estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void generarRecomendacion() {
        estrategia.generar();
    }
}