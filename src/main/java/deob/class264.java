package deob;

import java.util.Iterator;

@ObfuscatedName("jt")
public class class264 implements Iterator {

    @ObfuscatedName("jt.z")
    public class266 field3530;

    @ObfuscatedName("jt.n")
    public class176 field3528;

    @ObfuscatedName("jt.v")
    public class176 field3529 = null;

    public class264(class266 arg0) {
        this.field3530 = arg0;
        this.field3528 = this.field3530.field3535.field2086;
        this.field3529 = null;
    }

    public Object next() {
        class176 var1 = this.field3528;
        if (this.field3530.field3535 == var1) {
            var1 = null;
            this.field3528 = null;
        } else {
            this.field3528 = var1.field2086;
        }
        this.field3529 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3530.field3535 != this.field3528;
    }

    public void remove() {
        if (this.field3529 == null) {
            throw new IllegalStateException();
        }
        this.field3529.method3240();
        this.field3529 = null;
    }
}
