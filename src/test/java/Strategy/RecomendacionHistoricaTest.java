package Strategy1;

import com.Actividad2.Strategy.EstrategiaRecomendacion;
import com.Actividad2.Strategy.RecomendacionHistorica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacionHistoricaTest {
    @Test
    public void testGenerarRecomendacionHistorica() {
        EstrategiaRecomendacion estrategia = new RecomendacionHistorica();
        assertDoesNotThrow(estrategia::generar);
    }
}