package net.sapo.jfrog;

import java.util.List;

public class FrogClass implements FrogCallable {
    final String name;

    FrogClass(String name) {
        this.name = name;
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
}
