import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    /*
    Los símbolos se escriben y leen de izquierda a derecha, de mayor a menor valor.
    Cuando se coloca un símbolo de valor menor a la izquierda de otro, se resta.
    Los símbolos 5 y sus múltiplos (V 5, L 50 , D 500) siempre suman y no pueden estar a la
    izquierda de uno de mayor valor.
    Se permiten como mucho tres repeticiones consecutivas del mismo símbolo.
    Un símbolo que aparece restando solo se puede repetir cuando su repetición
    esté colocada a más de un símbolo de distancia a su derecha.
    Solo se puede restar un símbolo de tipo 1 (I, X, C, M) sobre el inmediato mayor
    de tipo 1 o de tipo 5 (V, L, D).
    */

    @Test
    public void shouldReturnCorrectNumber (){
        Roman roman = new Roman ();
        String result = roman.convert(15);
        assertEquals("XV", result);
        assertEquals("XIX", roman.convert(19));




    }
    @Test
    public void shouldReturnBasicNumber(){
        Roman roman = new Roman ();
        assertEquals("I", roman.convert(1));
        assertEquals("II", roman.convert(2));
        assertEquals("III", roman.convert(3));
        assertEquals("IV", roman.convert(4));
        assertEquals("V", roman.convert(5));
        assertEquals("VI", roman.convert(6));
        assertEquals("VII", roman.convert(7));
        assertEquals("VIII", roman.convert(8));
        assertEquals("IX", roman.convert(9));
        assertEquals("X", roman.convert(10));
        assertEquals("L", roman.convert(50));
        assertEquals("C", roman.convert(100));
        assertEquals("D", roman.convert(500));
        assertEquals("M", roman.convert(1000));

    }
}
