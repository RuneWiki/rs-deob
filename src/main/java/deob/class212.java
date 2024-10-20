package deob;

import java.util.Iterator;

@ObfuscatedName("hx")
public class class212 implements Iterator {

    @ObfuscatedName("hx.n")
    public class213 field2615;

    @ObfuscatedName("hx.v")
    public class206 field2613;

    @ObfuscatedName("hx.y")
    public class206 field2614 = null;

    public class212(class213 arg0) {
        this.field2615 = arg0;
        this.field2613 = this.field2615.field2616.field2601;
        this.field2614 = null;
    }

    public Object next() {
        class206 var1 = this.field2613;
        if (this.field2615.field2616 == var1) {
            var1 = null;
            this.field2613 = null;
        } else {
            this.field2613 = var1.field2601;
        }
        this.field2614 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2615.field2616 != this.field2613;
    }

    public void remove() {
        if (this.field2614 == null) {
            throw new IllegalStateException();
        }
        this.field2614.method3515();
        this.field2614 = null;
    }
}
