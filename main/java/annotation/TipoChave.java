package annotation;

import java.lang.annotation.*;

/**
 * @author gustavohmdm
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
