package email;  // Этот пакет должен совпадать с расположением твоих исходных файлов

import org.junit.jupiter.api.Test;  // Импорт JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals;  // Импорт нужных методов для проверки

public class DummyTest {

    @Test
    void testSimpleMath() {  // Аннотация @Test указывает, что это тестовый метод
        assertEquals(4, 2 + 2);  // Пример теста: проверка, что 2 + 2 равно 4
    }

    @Test
    void testStringEquality() {
        String str = "hello";
        assertEquals("hello", str);  // Проверка равенства строк
    }
}