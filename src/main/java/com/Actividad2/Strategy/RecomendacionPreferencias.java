package com.Actividad2.Strategy;

public class RecomendacionPreferencias implements EstrategiaRecomendacion {
    @Override
    public void generar() {
        System.out.println("Recomendación basada en preferencias del usuario.");
    }
}