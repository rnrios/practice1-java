import entities.Student;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static junit.framework.TestCase.assertEquals;

public class TestCalculateMean {

    @Test
    public void testZeros(){
        Map<String, Double> grade_map = new TreeMap<>(){{
            put("A", 0.0);
            put("B", 0.0);
            put("C", 0.0);
        }};
        Student student = new Student("a", 1, grade_map);
        assertEquals(0.0, student.calculateMean());
    }
}
