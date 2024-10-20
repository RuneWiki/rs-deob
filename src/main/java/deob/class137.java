package deob;

import java.util.Iterator;

@ObfuscatedName("ej")
public class class137 implements Iterable {

    @ObfuscatedName("ej.b")
    public class130 field1884 = new class130();

    public class137() {
        this.field1884.field1870 = this.field1884;
        this.field1884.field1869 = this.field1884;
    }

    @ObfuscatedName("ej.b()V")
    public void method2377() {
        while (this.field1884.field1870 != this.field1884) {
            this.field1884.field1870.method2343();
        }
    }

    @ObfuscatedName("ej.e(Ldh;)V")
    public void method2379(class130 arg0) {
        if (arg0.field1869 != null) {
            arg0.method2343();
        }
        arg0.field1869 = this.field1884.field1869;
        arg0.field1870 = this.field1884;
        arg0.field1869.field1870 = arg0;
        arg0.field1870.field1869 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
