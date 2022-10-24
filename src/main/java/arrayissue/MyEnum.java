package arrayissue;

import io.micronaut.core.annotation.Introspected;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator;

enum MyEnum {
    FOO("FOO"),
    BAR("BAR");

    private String value;

    MyEnum(String value) {
        this.value = value;
    }

    @JsonCreator
    public static MyEnum fromValue(String text) {
        System.out.println("-- CONVERTING FROM: " + text);
        return MyEnum.FOO;
    }
}
