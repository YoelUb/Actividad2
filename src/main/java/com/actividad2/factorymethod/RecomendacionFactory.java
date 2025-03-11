package com.actividad2.factorymethod;

import com.actividad2.strategy.EstrategiaRecomendacion;
import com.actividad2.core.IRecomendacion;

public interface RecomendacionFactory {

    IRecomendacion crearRecomendacion();

    IRecomendacion crearRecomendacion(EstrategiaRecomendacion estrategia);
}