package com.Actividad2.FactoryMethod;

import com.Actividad2.core.IRecomendacion;

public class RecomendacionSimpleFactory implements RecomendacionFactory {

    @Override
    public IRecomendacion crearRecomendacion(EstrategiaRecomendacion estrategia) {
        return new Recomendacion(estrategia);
    }
}
