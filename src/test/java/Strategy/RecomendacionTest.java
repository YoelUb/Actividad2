package Strategy1;

import com.Actividad2.Strategy.EstrategiaRecomendacion;
import com.Actividad2.Strategy.Recomendacion;
import com.Actividad2.Strategy.RecomendacionHistorica;
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
