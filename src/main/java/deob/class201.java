package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class201 implements Iterator {

    @ObfuscatedName("gu.d")
    public class202 field2458;

    @ObfuscatedName("gu.q")
    public class195 field2457;

    @ObfuscatedName("gu.x")
    public class195 field2456 = null;

    public class201(class202 arg0) {
        this.field2458 = arg0;
        this.field2457 = this.field2458.field2459.field2445;
        this.field2456 = null;
    }

    public Object next() {
        class195 var1 = this.field2457;
        if (this.field2458.field2459 == var1) {
            var1 = null;
            this.field2457 = null;
        } else {
            this.field2457 = var1.field2445;
        }
        this.field2456 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2458.field2459 != this.field2457;
    }

    public void remove() {
        if (this.field2456 == null) {
            throw new IllegalStateException();
        }
        this.field2456.method3350();
        this.field2456 = null;
    }
}
