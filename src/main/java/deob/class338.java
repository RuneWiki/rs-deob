package deob;

import java.util.Iterator;

@ObfuscatedName("ld")
public class class338 implements Iterator {

    @ObfuscatedName("ld.c")
    public class339 field4133;

    @ObfuscatedName("ld.v")
    public class405 field4132;

    @ObfuscatedName("ld.q")
    public class405 field4134 = null;

    public class338(class339 arg0) {
        this.field4133 = arg0;
        this.field4132 = this.field4133.field4136.field4456;
        this.field4134 = null;
    }

    public Object next() {
        class405 var1 = this.field4132;
        if (this.field4133.field4136 == var1) {
            var1 = null;
            this.field4132 = null;
        } else {
            this.field4132 = var1.field4456;
        }
        this.field4134 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4133.field4136 != this.field4132;
    }

    public void remove() {
        if (this.field4134 == null) {
            throw new IllegalStateException();
        }
        this.field4134.method6493();
        this.field4134 = null;
    }
}
