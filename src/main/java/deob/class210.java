package deob;

import java.util.Iterator;

@ObfuscatedName("hn")
public class class210 implements Iterator {

    @ObfuscatedName("hn.a")
    public class204 field3165;

    @ObfuscatedName("hn.d")
    public class208 field3166;

    @ObfuscatedName("hn.v")
    public class208 field3167 = null;

    public class210(class204 arg0) {
        this.field3165 = arg0;
        this.field3166 = this.field3165.field3155.field3160;
        this.field3167 = null;
    }

    public Object next() {
        class208 var1 = this.field3166;
        if (this.field3165.field3155 == var1) {
            var1 = null;
            this.field3166 = null;
        } else {
            this.field3166 = var1.field3160;
        }
        this.field3167 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3165.field3155 != this.field3166;
    }

    public void remove() {
        if (this.field3167 == null) {
            throw new IllegalStateException();
        }
        this.field3167.method3701();
        this.field3167 = null;
    }
}
