# Java Frog Language interpreter

## To Do
- Add support to ```/* */``` type comments
- Add support to compare different types
- Add support to concatenate numbers to strings
- Add support to the REPL to let users type in both statements and expressions.
- Make it a runtime error to access a variable that has not been initialized or assigned.
- Add support for break statements.
- Add anonymous functions
- Extend the resolver to report an error if a local variable is never used.
- Add static methods to classes. _Make FrogClass extend FrogInstance_
- Add getters and setters like:
````
class a {
    init (b) {
        this.b = b;
    }
    
    c {
        return b + 2;
    }
}

var _a = a(2);
print _a.c; // Prints 4
````
- 