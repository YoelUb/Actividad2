package strategy;

import com.actividad2.strategy.EstrategiaRecomendacion;
import com.actividad2.strategy.RecomendacionPreferencias;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacionPreferenciasTest {
    @Test
    public void testGenerarRecomendacionPreferencias() {
        EstrategiaRecomendacion estrategia = new RecomendacionPreferencias();
        assertDoesNotThrow(estrategia::generar);
    }
}