package deob;

import java.util.Iterator;

@ObfuscatedName("ej")
public class class137 implements Iterable {

    @ObfuscatedName("ej.p")
    public class130 field1903 = new class130();

    public class137() {
        this.field1903.field1888 = this.field1903;
        this.field1903.field1889 = this.field1903;
    }

    @ObfuscatedName("ej.p()V")
    public void method2303() {
        while (this.field1903.field1888 != this.field1903) {
            this.field1903.field1888.method2265();
        }
    }

    @ObfuscatedName("ej.g(Ldp;)V")
    public void method2304(class130 arg0) {
        if (arg0.field1889 != null) {
            arg0.method2265();
        }
        arg0.field1889 = this.field1903.field1889;
        arg0.field1888 = this.field1903;
        arg0.field1889.field1888 = arg0;
        arg0.field1888.field1889 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
