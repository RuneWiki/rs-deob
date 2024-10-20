package deob;

import java.util.Iterator;

@ObfuscatedName("eq")
public class class137 implements Iterable {

    @ObfuscatedName("eq.f")
    public class130 field1924 = new class130();

    public class137() {
        this.field1924.field1910 = this.field1924;
        this.field1924.field1909 = this.field1924;
    }

    @ObfuscatedName("eq.f()V")
    public void method2371() {
        while (this.field1924.field1910 != this.field1924) {
            this.field1924.field1910.method2332();
        }
    }

    @ObfuscatedName("eq.i(Ldm;)V")
    public void method2372(class130 arg0) {
        if (arg0.field1909 != null) {
            arg0.method2332();
        }
        arg0.field1909 = this.field1924.field1909;
        arg0.field1910 = this.field1924;
        arg0.field1909.field1910 = arg0;
        arg0.field1910.field1909 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
