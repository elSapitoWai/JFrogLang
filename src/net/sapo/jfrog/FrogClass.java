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
        FrogFunction initializer = findMethod("init");

        if (initializer == null) return 0;

        return initializer.arity();
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        FrogInstance instance = new FrogInstance(this);
        FrogFunction initializer = findMethod("init");

        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }

        return instance;
    }

    FrogFunction findMethod(String name) {
        if (methods.containsKey(name)) return methods.get(name);

        return null;
    }
}
