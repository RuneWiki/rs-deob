package deob;

import java.util.Iterator;

@ObfuscatedName("hb")
public class class212 implements Iterator {

    @ObfuscatedName("hb.s")
    public class213 field2602;

    @ObfuscatedName("hb.g")
    public class206 field2601;

    @ObfuscatedName("hb.m")
    public class206 field2603 = null;

    public class212(class213 arg0) {
        this.field2602 = arg0;
        this.field2601 = this.field2602.field2604.field2590;
        this.field2603 = null;
    }

    public Object next() {
        class206 var1 = this.field2601;
        if (this.field2602.field2604 == var1) {
            var1 = null;
            this.field2601 = null;
        } else {
            this.field2601 = var1.field2590;
        }
        this.field2603 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2602.field2604 != this.field2601;
    }

    public void remove() {
        if (this.field2603 == null) {
            throw new IllegalStateException();
        }
        this.field2603.method3781();
        this.field2603 = null;
    }
}
