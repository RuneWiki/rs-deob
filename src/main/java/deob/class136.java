package deob;

import java.util.Iterator;

@ObfuscatedName("ei")
public class class136 implements Iterator {

    @ObfuscatedName("ei.f")
    public class137 field1922;

    @ObfuscatedName("ei.i")
    public class130 field1923;

    @ObfuscatedName("ei.u")
    public class130 field1921 = null;

    public class136(class137 arg0) {
        this.field1922 = arg0;
        this.field1923 = this.field1922.field1924.field1910;
        this.field1921 = null;
    }

    public Object next() {
        class130 var1 = this.field1923;
        if (this.field1922.field1924 == var1) {
            var1 = null;
            this.field1923 = null;
        } else {
            this.field1923 = var1.field1910;
        }
        this.field1921 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1922.field1924 != this.field1923;
    }

    public void remove() {
        if (this.field1921 == null) {
            throw new IllegalStateException();
        }
        this.field1921.method2332();
        this.field1921 = null;
    }
}
