package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class202 implements Iterable {

    @ObfuscatedName("gz.e")
    public class195 field2472 = new class195();

    public class202() {
        this.field2472.field2457 = this.field2472;
        this.field2472.field2458 = this.field2472;
    }

    @ObfuscatedName("gz.e()V")
    public void method3382() {
        while (this.field2472.field2457 != this.field2472) {
            this.field2472.field2457.method3351();
        }
    }

    @ObfuscatedName("gz.o(Lgt;)V")
    public void method3383(class195 arg0) {
        if (arg0.field2458 != null) {
            arg0.method3351();
        }
        arg0.field2458 = this.field2472.field2458;
        arg0.field2457 = this.field2472;
        arg0.field2458.field2457 = arg0;
        arg0.field2457.field2458 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
