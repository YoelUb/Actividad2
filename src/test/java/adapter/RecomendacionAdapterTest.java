package adapter;

import com.actividad2.adapter.RecomendacionAdapter;
import com.actividad2.adapter.ServicioRecomendacionExterno;
import com.actividad2.core.IRecomendacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacionAdapterTest {

    @Test
    public void testGenerarRecomendacionDesdeAdapter() {
        // Crear el servicio externo simulado
        ServicioRecomendacionExterno servicio = new ServicioRecomendacionExterno();

        // Crear el adaptador con el servicio externo
        IRecomendacion recomendacion = new RecomendacionAdapter(servicio);

        // Verificar que no se lance ninguna excepción al generar la recomendación
        assertDoesNotThrow(recomendacion::generarRecomendacion,
                "El adaptador debería generar la recomendación sin lanzar excepciones");
    }

    @Test
    public void testObtenerSugerenciaDesdeServicioExterno() {
        // Instancia del servicio externo
        ServicioRecomendacionExterno servicio = new ServicioRecomendacionExterno();

        // Verificar que el servicio externo devuelva la sugerencia correcta
        String sugerencia = servicio.obtenerSugerencia();
        assertEquals("Recomendación desde API externa", sugerencia,
                "La sugerencia del servicio externo no es la esperada");
    }

    @Test
    public void testAdaptadorNoEsNulo() {
        // Crear el servicio y adaptador
        ServicioRecomendacionExterno servicio = new ServicioRecomendacionExterno();
        IRecomendacion recomendacion = new RecomendacionAdapter(servicio);

        // Verificar que el adaptador no sea nulo
        assertNotNull(recomendacion, "El adaptador no debería ser nulo");
    }
}
