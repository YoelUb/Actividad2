package com.actividad2.strategy;

import com.actividad2.core.IRecomendacion;

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