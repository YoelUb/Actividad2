package com.actividad2.factorymethod;

import com.actividad2.strategy.EstrategiaRecomendacion;
import com.actividad2.strategy.Recomendacion;
import com.actividad2.core.IRecomendacion;

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
