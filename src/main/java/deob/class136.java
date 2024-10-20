package deob;

import java.util.Iterator;

@ObfuscatedName("eb")
public class class136 implements Iterator {

    @ObfuscatedName("eb.b")
    public class137 field1896;

    @ObfuscatedName("eb.l")
    public class130 field1895;

    @ObfuscatedName("eb.i")
    public class130 field1894 = null;

    public class136(class137 arg0) {
        this.field1896 = arg0;
        this.field1895 = this.field1896.field1897.field1882;
        this.field1894 = null;
    }

    public Object next() {
        class130 var1 = this.field1895;
        if (this.field1896.field1897 == var1) {
            var1 = null;
            this.field1895 = null;
        } else {
            this.field1895 = var1.field1882;
        }
        this.field1894 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1896.field1897 != this.field1895;
    }

    public void remove() {
        if (this.field1894 == null) {
            throw new IllegalStateException();
        }
        this.field1894.method2349();
        this.field1894 = null;
    }
}
