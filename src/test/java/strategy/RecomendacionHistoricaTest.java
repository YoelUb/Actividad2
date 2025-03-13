package strategy;

import com.actividad2.strategy.EstrategiaRecomendacion;
import com.actividad2.strategy.RecomendacionHistorica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacionHistoricaTest {
    @Test
    public void testGenerarRecomendacionHistorica() {
        EstrategiaRecomendacion estrategia = new RecomendacionHistorica();
        assertDoesNotThrow(estrategia::generar);
    }
}