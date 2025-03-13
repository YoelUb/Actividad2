package strategy;

import com.actividad2.strategy.EstrategiaRecomendacion;
import com.actividad2.strategy.Recomendacion;
import com.actividad2.strategy.RecomendacionHistorica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacionTest {

    @Test
    public void testGenerarRecomendacionConEstrategia() {
        EstrategiaRecomendacion estrategia = new RecomendacionHistorica();
        Recomendacion recomendacion = new Recomendacion(estrategia);
        assertDoesNotThrow(recomendacion::generarRecomendacion);
    }
}
