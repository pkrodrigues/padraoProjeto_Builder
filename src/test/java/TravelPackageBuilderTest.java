import org.junit.jupiter.api.Test;
import patternofprojects.builder.classes.TravelPackage;
import patternofprojects.builder.classes.TravelPackageBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class TravelPackageBuilderTest {
    @Test
    void deveRetornarExececaoParaPacoteSemId() {
        try{
            TravelPackageBuilder  travelPackageBuilder = new TravelPackageBuilder();
            TravelPackage travelPackage = travelPackageBuilder.setPackage_name("Roma além filmes")
                    .setDescription("Lorem ipsum dolor sit amet. Ea sint libero 33 nesciunt facere aut suscipit illum At unde quasi qui labore sequi.")
                    .build();
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Id para pacote de viagem inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacoteSemNome() {
        try{
            TravelPackageBuilder  travelPackageBuilder = new TravelPackageBuilder();
            TravelPackage travelPackage = travelPackageBuilder.setId_travel_package(1)
                    .setDescription("Lorem ipsum dolor sit amet. Ea sint libero 33 nesciunt facere aut suscipit illum At unde quasi qui labore sequi.")
                    .build();
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Nome de pacote de viagem inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPacoteDeViagemValido()
    {
        TravelPackageBuilder  travelPackageBuilder = new TravelPackageBuilder();
        TravelPackage travelPackage = travelPackageBuilder.setId_travel_package(1)
                .setPackage_name("Roma além filmes")
                .setDescription("Lorem ipsum dolor sit amet. Ea sint libero 33 nesciunt facere aut suscipit illum At unde quasi qui labore sequi.")
                .build();

        assertNotNull(travelPackage);
    }
}
