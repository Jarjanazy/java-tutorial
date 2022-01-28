package annotationTutorial;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

@CoolAnnotation(name = "CoolAnnotation")
public class AnnotationTutorialTest {

    @Test
    public void test(){
        CoolAnnotation annotation = AnnotationTutorialTest.class.getAnnotation(CoolAnnotation.class);

        assertEquals(annotation.name(), "CoolAnnotation");
    }
}
