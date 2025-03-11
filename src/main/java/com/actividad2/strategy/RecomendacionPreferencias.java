package com.actividad2.strategy;

public class RecomendacionPreferencias implements EstrategiaRecomendacion {
    @Override
    public void generar() {
        System.out.println("Recomendación basada en preferencias del usuario.");
    }
}