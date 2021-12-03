/* 
* File Kalori.java
* Author: Rohrbacher Marcell
* Copyright: 2021, Rohrbacher Marcell János
* Group: Szoft II/N
* Date: 2021-12-03
* Github: https://github.com/Marci971104/
*/
public class Kalori {
    public double calcKaloriF(double testtomeg, double magassag, int eletkor ){
        return  13.397*testtomeg+4.799*magassag-(5.667*eletkor)+88.362;
    }
    public double calcKaloriN(double testtomeg, double magassag, double eletkor ){
        return 9.247* testtomeg+3.098*magassag - 4.330*eletkor+447.593;
    }

   
    
}
