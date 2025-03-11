package com.Actividad2.FactoryMethod;

import com.Actividad2.Strategy.EstrategiaRecomendacion;
import com.Actividad2.core.IRecomendacion;

public interface RecomendacionFactory {

    IRecomendacion crearRecomendacion();

    IRecomendacion crearRecomendacion(EstrategiaRecomendacion estrategia);
}