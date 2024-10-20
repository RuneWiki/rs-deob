package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class201 implements Iterator {

    @ObfuscatedName("gm.e")
    public class202 field2471;

    @ObfuscatedName("gm.o")
    public class195 field2470;

    @ObfuscatedName("gm.m")
    public class195 field2469 = null;

    public class201(class202 arg0) {
        this.field2471 = arg0;
        this.field2470 = this.field2471.field2472.field2457;
        this.field2469 = null;
    }

    public Object next() {
        class195 var1 = this.field2470;
        if (this.field2471.field2472 == var1) {
            var1 = null;
            this.field2470 = null;
        } else {
            this.field2470 = var1.field2457;
        }
        this.field2469 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2471.field2472 != this.field2470;
    }

    public void remove() {
        if (this.field2469 == null) {
            throw new IllegalStateException();
        }
        this.field2469.method3351();
        this.field2469 = null;
    }
}
