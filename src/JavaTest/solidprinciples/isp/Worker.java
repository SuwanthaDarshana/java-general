package JavaTest.solidprinciples.isp;

public class Worker {
}

/// //wrong

/*


interface Worker {
    void work();
    void eat();
}
class Robot implements Worker {
    public void work() { }
    public void eat() {  } /// not applicable

}

 */

/*
interface Workable { void work(); }
interface Eatable { void eat(); }

class Human implements Workable, Eatable { ... }
class Robot implements Workable { ... }

 */