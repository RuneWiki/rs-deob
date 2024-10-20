package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class200 implements Iterator {

    @ObfuscatedName("ga.w")
    public class204 field2430;

    @ObfuscatedName("ga.m")
    public class205 field2429;

    @ObfuscatedName("ga.q")
    public class205 field2431 = null;

    public class200(class204 arg0) {
        this.field2430 = arg0;
        this.field2429 = this.field2430.field2447.field2448;
        this.field2431 = null;
    }

    public Object next() {
        class205 var1 = this.field2429;
        if (this.field2430.field2447 == var1) {
            var1 = null;
            this.field2429 = null;
        } else {
            this.field2429 = var1.field2448;
        }
        this.field2431 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2430.field2447 != this.field2429;
    }

    public void remove() {
        if (this.field2431 == null) {
            throw new IllegalStateException();
        }
        this.field2431.method3782();
        this.field2431 = null;
    }
}
