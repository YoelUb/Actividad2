package FactoryMethod;

import com.Actividad2.FactoryMethod.RecomendacionFactory;
import com.Actividad2.FactoryMethod.RecomendacionSimpleFactory;
import core.IRecomendacion;
import org.junit.jupiter.api.Test;
import strategy.RecomendacionHistorica;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacionFactoryTest {

    @Test
    public void testCrearRecomendacion() {
        // Crear una instancia de la fábrica
        RecomendacionFactory factory = new RecomendacionSimpleFactory();

        // Crear una recomendación utilizando una estrategia histórica
        IRecomendacion recomendacion = factory.crearRecomendacion(new RecomendacionHistorica());

        // Verificar que la recomendación no sea nula
        assertNotNull(recomendacion, "La recomendación no debería ser nula");
    }
}