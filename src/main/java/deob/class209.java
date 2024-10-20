package deob;

import java.util.Iterator;

@ObfuscatedName("he")
public class class209 implements Iterator {

    @ObfuscatedName("he.l")
    public class206 field3167;

    @ObfuscatedName("he.g")
    public class212 field3166;

    @ObfuscatedName("he.r")
    public class212 field3168 = null;

    public class209(class206 arg0) {
        this.field3167 = arg0;
        this.field3166 = this.field3167.field3162.field3174;
        this.field3168 = null;
    }

    public Object next() {
        class212 var1 = this.field3166;
        if (this.field3167.field3162 == var1) {
            var1 = null;
            this.field3166 = null;
        } else {
            this.field3166 = var1.field3174;
        }
        this.field3168 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3167.field3162 != this.field3166;
    }

    public void remove() {
        if (this.field3168 == null) {
            throw new IllegalStateException();
        }
        this.field3168.method3815();
        this.field3168 = null;
    }
}
