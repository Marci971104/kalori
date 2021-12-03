/* 
* File App.java
* Author: Rohrbacher Marcell
* Copyright: 2021, Rohrbacher Marcell János
* Group: Szoft II/N
* Date: 2021-12-03
* Github: https://github.com/Marci971104/
*/
public class App {
    
        public static void main(String[] args) throws Exception {
            Kalori kalori = new Kalori();
            System.out.println(kalori.calcKaloriF(100,195,50));
            System.out.println(kalori.calcKaloriN(50,165,22));
            System.out.print("A program a revideált Harris-Bendict képletet felhasználásával kiszámolja az alap kcal bevitelt ");
            System.out.print("Rohrbacher Marcell János ");
            System.out.print("2021-12-03 ");
        }
    }
    

