package thebloez.lab.expense.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum Type {
    EX("EXPENSE"),
    IN("INCOME");

    private final String code;

    Type(String code) {
        this.code = code;
    }

    @JsonCreator
    public static Type decode(final String code){
        return Stream.of(Type.values()).filter(targetEnum -> targetEnum.code.equals(code))
                .findFirst().orElse(null);
    }

    @JsonValue
    public String getCode(){
        return code;
    }
}
