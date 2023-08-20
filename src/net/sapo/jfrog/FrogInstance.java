package net.sapo.jfrog;

import java.util.HashMap;
import java.util.Map;

public class FrogInstance {
    private FrogClass klass;
    private final Map<String, Object> fields = new HashMap<>();

    FrogInstance(FrogClass klass) {
        this.klass = klass;
    }

    @Override
    public String toString() {
        return klass.name + " instance";
    }

    /*
    Returns the field called
     */
    Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        throw new RuntimeError(name,
                "Undefined property '" + name.lexeme + "'.");
    }

    /*
    Sets an instance value
     */
    void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }
}
