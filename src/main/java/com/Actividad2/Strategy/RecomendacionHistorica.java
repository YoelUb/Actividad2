package com.Actividad2.Strategy;

public class RecomendacionHistorica implements EstrategiaRecomendacion {
    @Override
    public void generar() {
        System.out.println("Recomendación basada en datos históricos.");
    }
}