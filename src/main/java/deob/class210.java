package deob;

import java.util.Iterator;

@ObfuscatedName("hv")
public class class210 implements Iterator {

    @ObfuscatedName("hv.l")
    public class204 field3169;

    @ObfuscatedName("hv.g")
    public class208 field3170;

    @ObfuscatedName("hv.r")
    public class208 field3171 = null;

    public class210(class204 arg0) {
        this.field3169 = arg0;
        this.field3170 = this.field3169.field3159.field3165;
        this.field3171 = null;
    }

    public Object next() {
        class208 var1 = this.field3170;
        if (this.field3169.field3159 == var1) {
            var1 = null;
            this.field3170 = null;
        } else {
            this.field3170 = var1.field3165;
        }
        this.field3171 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3169.field3159 != this.field3170;
    }

    public void remove() {
        if (this.field3171 == null) {
            throw new IllegalStateException();
        }
        this.field3171.method3793();
        this.field3171 = null;
    }
}
