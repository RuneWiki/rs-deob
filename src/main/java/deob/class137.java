package deob;

import java.util.Iterator;

@ObfuscatedName("ew")
public class class137 implements Iterable {

    @ObfuscatedName("ew.k")
    public class130 field1893 = new class130();

    public class137() {
        this.field1893.field1878 = this.field1893;
        this.field1893.field1879 = this.field1893;
    }

    @ObfuscatedName("ew.k()V")
    public void method2286() {
        while (this.field1893.field1878 != this.field1893) {
            this.field1893.field1878.method2251();
        }
    }

    @ObfuscatedName("ew.y(Ldh;)V")
    public void method2287(class130 arg0) {
        if (arg0.field1879 != null) {
            arg0.method2251();
        }
        arg0.field1879 = this.field1893.field1879;
        arg0.field1878 = this.field1893;
        arg0.field1879.field1878 = arg0;
        arg0.field1878.field1879 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
