package deob;

import java.util.Iterator;

@ObfuscatedName("hx")
public class class209 implements Iterator {

    @ObfuscatedName("hx.i")
    public class206 field3166;

    @ObfuscatedName("hx.h")
    public class212 field3167;

    @ObfuscatedName("hx.e")
    public class212 field3168 = null;

    public class209(class206 arg0) {
        this.field3166 = arg0;
        this.field3167 = this.field3166.field3162.field3174;
        this.field3168 = null;
    }

    public Object next() {
        class212 var1 = this.field3167;
        if (this.field3166.field3162 == var1) {
            var1 = null;
            this.field3167 = null;
        } else {
            this.field3167 = var1.field3174;
        }
        this.field3168 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3166.field3162 != this.field3167;
    }

    public void remove() {
        if (this.field3168 == null) {
            throw new IllegalStateException();
        }
        this.field3168.method3706();
        this.field3168 = null;
    }
}
