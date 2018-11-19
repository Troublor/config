# config
General configuration package, meant to be used as a tool to save configurations in large Java projects.

---
### Requirements:

Java JDK 11

### Usage: 

```java
public class Test {
    public static void main(String[] args) throws ValueTypeNotMatchException, ConfigNotExistException {
        //GeneralConfig can save Object key - Object value configurations
        var config = GeneralConfig.getInstance();
        var a = new A();
        var b = new B();
        config.add(a, b);
        var value1 = config.get(a, new B());
        var value2 = config.get(a, B.class);
        
        //StringConfig can save String key-value configurations
        var config2 = StringConfig.getInstance();
        config2.add("a", "b");
        var value3 = config.get("a");
        var value4 = config.get("a", "a");
    }

    static class A {
    }

    static class B {
    }
}
```

### Package

Jar package is released in out/artifacts/config_jar