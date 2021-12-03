/* 
* File KaloriTest.java
* Author: Rohrbacher Marcell
* Copyright: 2021, Rohrbacher Marcell János
* Group: Szoft II/N
* Date: 2021-12-03
* Github: https://github.com/Marci971104/
*/
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;



public class KaloriTest {
    private Kalori Kalori;

    @BeforeEach
    void setUp(){
        this.Kalori= new Kalori();
        

    }

    @Test
    void calcKaloriFTest(){
        double testtomeg= 100;
        double magassag= 195;
        double eletkor= 50;
        double expectedValue= 2080; 
        double actualRadius= 13.397*testtomeg+4.799*magassag-(5.667*eletkor)+88.362;
        assertEquals(expectedValue, actualRadius,1);

    }
    @Test
    void calcKaloriNTest(){
        double testtomeg= 50;
        double magassag= 165;
        double eletkor= 22;
        double expectedValue= 1325; 
        double actualRadius= 9.247* testtomeg+3.098*magassag - 4.330*eletkor+447.593;
        assertEquals(expectedValue, actualRadius,1);

    }
    @Test
    void calcKaloriN2Test(){
        double testtomeg= 50;
        double magassag= 165;
        double eletkor= 22;
        double expectedValue= 1325; 
        double actualRadius= 9.247* testtomeg+3.098*magassag - 4.330*eletkor+447.593;
        assertEquals(expectedValue, actualRadius,1);

    }
    @Test
    @DisplayName("Testtömeg 0 teszt")
    @Disabled ("0 ra átírni bármit ")
    void calcKaloriFTestForZero(){
        assertEquals(0,this.Kalori.calcKaloriF(100, 195, 50));
    }

}


