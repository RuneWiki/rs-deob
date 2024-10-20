package deob;

import java.util.Iterator;

@ObfuscatedName("en")
public class class137 implements Iterable {

    @ObfuscatedName("en.n")
    public class130 field1898 = new class130();

    public class137() {
        this.field1898.field1883 = this.field1898;
        this.field1898.field1884 = this.field1898;
    }

    @ObfuscatedName("en.n()V")
    public void method2346() {
        while (this.field1898.field1883 != this.field1898) {
            this.field1898.field1883.method2307();
        }
    }

    @ObfuscatedName("en.d(Ldx;)V")
    public void method2345(class130 arg0) {
        if (arg0.field1884 != null) {
            arg0.method2307();
        }
        arg0.field1884 = this.field1898.field1884;
        arg0.field1883 = this.field1898;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
