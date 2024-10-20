package deob;

import java.util.Iterator;

@ObfuscatedName("ha")
public class class209 implements Iterable {

    @ObfuscatedName("ha.m")
    public class202 field2582 = new class202();

    public class209() {
        this.field2582.field2567 = this.field2582;
        this.field2582.field2568 = this.field2582;
    }

    @ObfuscatedName("ha.m()V")
    public void method3544() {
        while (this.field2582.field2567 != this.field2582) {
            this.field2582.field2567.method3513();
        }
    }

    @ObfuscatedName("ha.p(Lgu;)V")
    public void method3549(class202 arg0) {
        if (arg0.field2568 != null) {
            arg0.method3513();
        }
        arg0.field2568 = this.field2582.field2568;
        arg0.field2567 = this.field2582;
        arg0.field2568.field2567 = arg0;
        arg0.field2567.field2568 = arg0;
    }

    public Iterator iterator() {
        return new class208(this);
    }
}
