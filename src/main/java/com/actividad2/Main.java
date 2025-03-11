package com.actividad2;

// Importaciones necesarias para que Java reconozca las clases
import com.actividad2.core.FlujoDeTrabajo;
import com.actividad2.core.IRecomendacion;
import com.actividad2.core.IRetraso;
import com.actividad2.factorymethod.RecomendacionFactory;
import com.actividad2.factorymethod.RecomendacionSimpleFactory;
import com.actividad2.strategy.EstrategiaRecomendacion;
import com.actividad2.strategy.RecomendacionHistorica;

public class Main {
    public static void main(String[] args) {

        // Usando la fábrica para crear una recomendación
        RecomendacionFactory factory = new RecomendacionSimpleFactory();
        EstrategiaRecomendacion estrategia = new RecomendacionHistorica();
        IRecomendacion recomendacion = factory.crearRecomendacion(estrategia);

        // Implementación anónima de IRetraso
        IRetraso retraso = new IRetraso() {
            public void gestionarRetraso() {
                System.out.println("Gestión de retraso estándar.");
            }
        };

        // Ejecutando el flujo de trabajo
        FlujoDeTrabajo flujo = new FlujoDeTrabajo(recomendacion, retraso);
        flujo.ejecutar();
    }
}
