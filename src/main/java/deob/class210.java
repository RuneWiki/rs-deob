package deob;

import java.util.Iterator;

@ObfuscatedName("hy")
public class class210 implements Iterator {

    @ObfuscatedName("hy.i")
    public class204 field3170;

    @ObfuscatedName("hy.h")
    public class208 field3169;

    @ObfuscatedName("hy.e")
    public class208 field3171 = null;

    public class210(class204 arg0) {
        this.field3170 = arg0;
        this.field3169 = this.field3170.field3159.field3164;
        this.field3171 = null;
    }

    public Object next() {
        class208 var1 = this.field3169;
        if (this.field3170.field3159 == var1) {
            var1 = null;
            this.field3169 = null;
        } else {
            this.field3169 = var1.field3164;
        }
        this.field3171 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3170.field3159 != this.field3169;
    }

    public void remove() {
        if (this.field3171 == null) {
            throw new IllegalStateException();
        }
        this.field3171.method3676();
        this.field3171 = null;
    }
}
