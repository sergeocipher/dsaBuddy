# Pass-by-value

- Java is always pass by values.
- But what the value is depends on the type.


## Primitive Type

- int , double , boolean etc.
- When we pass them to a method , it gets a new copy of that data.
- So it can't changed the original.

## Reference types

- StrinBuider , ArrayList , customClass etc.

```
StringBuilder sb = new StringBuilder("hi");
foo(sb);
```

- The method recieves the copy of the reference , not the copy of the object.
- Both references still point to the same object in memory, so changing the object inside the method affects the      original.
- sb does not store the string data.
- It stores a reference to a StringBuilder object.