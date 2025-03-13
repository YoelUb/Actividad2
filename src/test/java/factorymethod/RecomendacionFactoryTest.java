package factorymethod;

import com.actividad2.factorymethod.RecomendacionFactory;
import com.actividad2.factorymethod.RecomendacionSimpleFactory;
import com.actividad2.core.IRecomendacion;
import org.junit.jupiter.api.Test;
import com.actividad2.strategy.RecomendacionHistorica;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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