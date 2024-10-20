package deob;

import java.util.Iterator;

@ObfuscatedName("jz")
public class class264 implements Iterator {

    @ObfuscatedName("jz.s")
    public class266 field3520;

    @ObfuscatedName("jz.j")
    public class176 field3519;

    @ObfuscatedName("jz.i")
    public class176 field3518 = null;

    public class264(class266 arg0) {
        this.field3520 = arg0;
        this.field3519 = this.field3520.field3525.field2088;
        this.field3518 = null;
    }

    public Object next() {
        class176 var1 = this.field3519;
        if (this.field3520.field3525 == var1) {
            var1 = null;
            this.field3519 = null;
        } else {
            this.field3519 = var1.field2088;
        }
        this.field3518 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3520.field3525 != this.field3519;
    }

    public void remove() {
        if (this.field3518 == null) {
            throw new IllegalStateException();
        }
        this.field3518.method3297();
        this.field3518 = null;
    }
}
