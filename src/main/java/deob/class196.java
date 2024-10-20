package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class196 implements Iterator {

    @ObfuscatedName("gc.n")
    public class193 field3006;

    @ObfuscatedName("gc.w")
    public class199 field3005;

    @ObfuscatedName("gc.i")
    public class199 field3004 = null;

    public class196(class193 arg0) {
        this.field3006 = arg0;
        this.field3005 = this.field3006.field3000.field3014;
        this.field3004 = null;
    }

    public Object next() {
        class199 var1 = this.field3005;
        if (this.field3006.field3000 == var1) {
            var1 = null;
            this.field3005 = null;
        } else {
            this.field3005 = var1.field3014;
        }
        this.field3004 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3006.field3000 != this.field3005;
    }

    public void remove() {
        if (this.field3004 == null) {
            throw new IllegalStateException();
        }
        this.field3004.method3474();
        this.field3004 = null;
    }
}
