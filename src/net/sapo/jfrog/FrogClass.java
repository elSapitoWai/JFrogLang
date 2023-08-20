package net.sapo.jfrog;

import java.util.List;
import java.util.Map;

public class FrogClass implements FrogCallable {
    final String name;
    private final Map<String, FrogFunction> methods;

    FrogClass(String name, Map<String, FrogFunction> methods) {
        this.name = name;
        this.methods = methods;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        FrogInstance instance = new FrogInstance(this);
        return instance;
    }

    FrogFunction findMethod(String name) {
        if (methods.containsKey(name)) return methods.get(name);

        return null;
    }
}
