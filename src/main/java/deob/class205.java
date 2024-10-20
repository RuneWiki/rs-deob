package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class205 implements Iterator {

    @ObfuscatedName("gj.j")
    public class202 field3097;

    @ObfuscatedName("gj.m")
    public class208 field3096;

    @ObfuscatedName("gj.f")
    public class208 field3095 = null;

    public class205(class202 arg0) {
        this.field3097 = arg0;
        this.field3096 = this.field3097.field3091.field3103;
        this.field3095 = null;
    }

    public Object next() {
        class208 var1 = this.field3096;
        if (this.field3097.field3091 == var1) {
            var1 = null;
            this.field3096 = null;
        } else {
            this.field3096 = var1.field3103;
        }
        this.field3095 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3097.field3091 != this.field3096;
    }

    public void remove() {
        if (this.field3095 == null) {
            throw new IllegalStateException();
        }
        this.field3095.method3700();
        this.field3095 = null;
    }
}
