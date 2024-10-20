package deob;

import java.util.Iterator;

@ObfuscatedName("hu")
public class class227 implements Iterator {

    @ObfuscatedName("hu.t")
    public class228 field2656;

    @ObfuscatedName("hu.q")
    public class219 field2657;

    @ObfuscatedName("hu.i")
    public class219 field2658 = null;

    public class227(class228 arg0) {
        this.field2656 = arg0;
        this.field2657 = this.field2656.field2660.field2643;
        this.field2658 = null;
    }

    public Object next() {
        class219 var1 = this.field2657;
        if (this.field2656.field2660 == var1) {
            var1 = null;
            this.field2657 = null;
        } else {
            this.field2657 = var1.field2643;
        }
        this.field2658 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2656.field2660 != this.field2657;
    }

    public void remove() {
        if (this.field2658 == null) {
            throw new IllegalStateException();
        }
        this.field2658.method3761();
        this.field2658 = null;
    }
}
