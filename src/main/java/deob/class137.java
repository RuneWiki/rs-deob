package deob;

import java.util.Iterator;

@ObfuscatedName("ex")
public class class137 implements Iterable {

    @ObfuscatedName("ex.q")
    public class130 field1901 = new class130();

    public class137() {
        this.field1901.field1886 = this.field1901;
        this.field1901.field1887 = this.field1901;
    }

    @ObfuscatedName("ex.q()V")
    public void method2386() {
        while (this.field1901.field1886 != this.field1901) {
            this.field1901.field1886.method2345();
        }
    }

    @ObfuscatedName("ex.d(Ldr;)V")
    public void method2384(class130 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2345();
        }
        arg0.field1887 = this.field1901.field1887;
        arg0.field1886 = this.field1901;
        arg0.field1887.field1886 = arg0;
        arg0.field1886.field1887 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
