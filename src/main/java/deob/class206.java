package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class206 implements Iterator {

    @ObfuscatedName("gq.h")
    public class200 field3096;

    @ObfuscatedName("gq.m")
    public class204 field3095;

    @ObfuscatedName("gq.i")
    public class204 field3097 = null;

    public class206(class200 arg0) {
        this.field3096 = arg0;
        this.field3095 = this.field3096.field3086.field3090;
        this.field3097 = null;
    }

    public Object next() {
        class204 var1 = this.field3095;
        if (this.field3096.field3086 == var1) {
            var1 = null;
            this.field3095 = null;
        } else {
            this.field3095 = var1.field3090;
        }
        this.field3097 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3096.field3086 != this.field3095;
    }

    public void remove() {
        if (this.field3097 == null) {
            throw new IllegalStateException();
        }
        this.field3097.method3605();
        this.field3097 = null;
    }
}
