package net.sapo.jfrog;

import java.util.List;

public interface FrogCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
