package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class202 implements Iterable {

    @ObfuscatedName("gx.i")
    public class195 field2493 = new class195();

    public class202() {
        this.field2493.field2478 = this.field2493;
        this.field2493.field2479 = this.field2493;
    }

    @ObfuscatedName("gx.i()V")
    public void method3364() {
        while (this.field2493.field2478 != this.field2493) {
            this.field2493.field2478.method3323();
        }
    }

    @ObfuscatedName("gx.w(Lgc;)V")
    public void method3361(class195 arg0) {
        if (arg0.field2479 != null) {
            arg0.method3323();
        }
        arg0.field2479 = this.field2493.field2479;
        arg0.field2478 = this.field2493;
        arg0.field2479.field2478 = arg0;
        arg0.field2478.field2479 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
