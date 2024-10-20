package deob;

import java.util.Iterator;

@ObfuscatedName("hu")
public class class209 implements Iterable {

    @ObfuscatedName("hu.d")
    public class202 field2584 = new class202();

    public class209() {
        this.field2584.field2569 = this.field2584;
        this.field2584.field2570 = this.field2584;
    }

    @ObfuscatedName("hu.d()V")
    public void method3551() {
        while (this.field2584.field2569 != this.field2584) {
            this.field2584.field2569.method3514();
        }
    }

    @ObfuscatedName("hu.x(Lgt;)V")
    public void method3552(class202 arg0) {
        if (arg0.field2570 != null) {
            arg0.method3514();
        }
        arg0.field2570 = this.field2584.field2570;
        arg0.field2569 = this.field2584;
        arg0.field2570.field2569 = arg0;
        arg0.field2569.field2570 = arg0;
    }

    public Iterator iterator() {
        return new class208(this);
    }
}
