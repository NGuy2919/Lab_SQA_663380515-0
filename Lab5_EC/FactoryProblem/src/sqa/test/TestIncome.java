package sqa.test;

import sqa.main.Income;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIncome {

    @ParameterizedTest
    @CsvSource({
        "3000, 500, 1500, 46000.0",        
        "3000, 500, 400, -1.0",     
        "3000, 500, 3100, -1.0",      
        "3000, 200, 1500, -1.0",           
        "3000, 900, 1500, -1.0",          
        "3000, 200, 400, -1.0",          
        "900, 500, 1500, -1.0",          
        "5100, 500, 1500, -1.0",          
        "900, 200, 1500, -1.0",         
        "900, 900, 1500, -1.0",           
        "5100, 900, 1500, -1.0", 
        "5100, 200, 1500, -1.0",     
        "900, 500, 400, -1.0",      
        "900, 500, 3100, -1.0",           
        "900, 200, 400, -1.0",          
        "900, 200, 3100, -1.0",          
        "900, 900, 400, -1.0",          
        "900, 900, 3100, -1.0",          
        "5100, 500, 400, -1.0",         
        "5100, 500, 3100, -1.0",           
        "5100, 200, 400, -1.0", 
        "5100, 200, 3100, -1.0",          
        "5100, 900, 400, -1.0",          
        "5100, 900, 3100, -1.0",          
        "3000, 900, 400, -1.0",         
        "3000, 900, 3100, -1.0",           
        "3000, 200, 3100, -1.0", 
    })
    public void testCalculateIncome(int impeller, int motor, int cover, double expectedIncome) {
        Income income = new Income();
        double actual = income.calculateIncome(impeller, motor, cover);
        assertEquals(expectedIncome, actual);
    }
}
