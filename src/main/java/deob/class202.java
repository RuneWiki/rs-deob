package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class202 implements Iterable {

    @ObfuscatedName("gf.d")
    public class195 field2459 = new class195();

    public class202() {
        this.field2459.field2445 = this.field2459;
        this.field2459.field2444 = this.field2459;
    }

    @ObfuscatedName("gf.d()V")
    public void method3380() {
        while (this.field2459.field2445 != this.field2459) {
            this.field2459.field2445.method3350();
        }
    }

    @ObfuscatedName("gf.q(Lgq;)V")
    public void method3379(class195 arg0) {
        if (arg0.field2444 != null) {
            arg0.method3350();
        }
        arg0.field2444 = this.field2459.field2444;
        arg0.field2445 = this.field2459;
        arg0.field2444.field2445 = arg0;
        arg0.field2445.field2444 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
