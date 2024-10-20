package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class212 implements Iterator {

    @ObfuscatedName("hg.p")
    public class213 field2579;

    @ObfuscatedName("hg.i")
    public class206 field2578;

    @ObfuscatedName("hg.w")
    public class206 field2580 = null;

    public class212(class213 arg0) {
        this.field2579 = arg0;
        this.field2578 = this.field2579.field2581.field2566;
        this.field2580 = null;
    }

    public Object next() {
        class206 var1 = this.field2578;
        if (this.field2579.field2581 == var1) {
            var1 = null;
            this.field2578 = null;
        } else {
            this.field2578 = var1.field2566;
        }
        this.field2580 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2579.field2581 != this.field2578;
    }

    public void remove() {
        if (this.field2580 == null) {
            throw new IllegalStateException();
        }
        this.field2580.method3604();
        this.field2580 = null;
    }
}
