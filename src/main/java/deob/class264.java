package deob;

import java.util.Iterator;

@ObfuscatedName("jd")
public class class264 implements Iterator {

    @ObfuscatedName("jd.a")
    public class266 field3533;

    @ObfuscatedName("jd.t")
    public class176 field3531;

    @ObfuscatedName("jd.n")
    public class176 field3532 = null;

    public class264(class266 arg0) {
        this.field3533 = arg0;
        this.field3531 = this.field3533.field3537.field2082;
        this.field3532 = null;
    }

    public Object next() {
        class176 var1 = this.field3531;
        if (this.field3533.field3537 == var1) {
            var1 = null;
            this.field3531 = null;
        } else {
            this.field3531 = var1.field2082;
        }
        this.field3532 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3533.field3537 != this.field3531;
    }

    public void remove() {
        if (this.field3532 == null) {
            throw new IllegalStateException();
        }
        this.field3532.method3378();
        this.field3532 = null;
    }
}
