package com.Actividad2;


public class Main {
    public static void main(String[] args) {

        factory.RecomendacionFactory factory = new factory.RecomendacionSimpleFactory();
        strategy.EstrategiaRecomendacion estrategia = new strategy.RecomendacionHistorica();
        core.IRecomendacion recomendacion = factory.crearRecomendacion(estrategia);

        core.IRetraso retraso = new core.IRetraso() {
            public void gestionarRetraso() {
                System.out.println("Gestión de retraso estándar.");
            }
        };

        FlujoDeTrabajo flujo = new FlujoDeTrabajo(recomendacion, retraso);
        flujo.ejecutar();

    }
}