package Strategy1;

import com.Actividad2.Strategy.EstrategiaRecomendacion;
import com.Actividad2.Strategy.RecomendacionPreferencias;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacionPreferenciasTest {
    @Test
    public void testGenerarRecomendacionPreferencias() {
        EstrategiaRecomendacion estrategia = new RecomendacionPreferencias();
        assertDoesNotThrow(estrategia::generar);
    }
}