package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public class class178 implements Iterable {

    @ObfuscatedName("fz.b")
    public class181 field2850 = new class181();

    public class178() {
        this.field2850.field2853 = this.field2850;
        this.field2850.field2854 = this.field2850;
    }

    @ObfuscatedName("fz.b()V")
    public void method3219() {
        while (this.field2850.field2853 != this.field2850) {
            this.field2850.field2853.method3243();
        }
    }

    @ObfuscatedName("fz.u(Lff;)V")
    public void method3220(class181 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3243();
        }
        arg0.field2854 = this.field2850.field2854;
        arg0.field2853 = this.field2850;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    public Iterator iterator() {
        return new class182(this);
    }
}
