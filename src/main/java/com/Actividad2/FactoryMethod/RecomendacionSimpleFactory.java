package com.Actividad2.FactoryMethod;

import com.Actividad2.Strategy.EstrategiaRecomendacion;
import com.Actividad2.Strategy.Recomendacion;
import com.Actividad2.core.IRecomendacion;

public class RecomendacionSimpleFactory implements RecomendacionFactory {

    @Override
    public IRecomendacion crearRecomendacion(EstrategiaRecomendacion estrategia) {
        return new Recomendacion(estrategia);
    }

    @Override
    public IRecomendacion crearRecomendacion() {
        return null;
    }


}
