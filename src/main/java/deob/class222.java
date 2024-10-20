package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class222 implements Iterator {

    @ObfuscatedName("hg.n")
    public class223 field2521;

    @ObfuscatedName("hg.h")
    public class214 field2520;

    @ObfuscatedName("hg.l")
    public class214 field2522 = null;

    public class222(class223 arg0) {
        this.field2521 = arg0;
        this.field2520 = this.field2521.field2523.field2506;
        this.field2522 = null;
    }

    public Object next() {
        class214 var1 = this.field2520;
        if (this.field2521.field2523 == var1) {
            var1 = null;
            this.field2520 = null;
        } else {
            this.field2520 = var1.field2506;
        }
        this.field2522 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2521.field2523 != this.field2520;
    }

    public void remove() {
        if (this.field2522 == null) {
            throw new IllegalStateException();
        }
        this.field2522.method4025();
        this.field2522 = null;
    }
}
