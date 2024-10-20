package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class200 implements Iterator {

    @ObfuscatedName("gm.z")
    public class204 field2405;

    @ObfuscatedName("gm.w")
    public class205 field2404;

    @ObfuscatedName("gm.s")
    public class205 field2403 = null;

    public class200(class204 arg0) {
        this.field2405 = arg0;
        this.field2404 = this.field2405.field2420.field2423;
        this.field2403 = null;
    }

    public Object next() {
        class205 var1 = this.field2404;
        if (this.field2405.field2420 == var1) {
            var1 = null;
            this.field2404 = null;
        } else {
            this.field2404 = var1.field2423;
        }
        this.field2403 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2405.field2420 != this.field2404;
    }

    public void remove() {
        if (this.field2403 == null) {
            throw new IllegalStateException();
        }
        this.field2403.method3756();
        this.field2403 = null;
    }
}
