package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class202 implements Iterator {

    @ObfuscatedName("gm.g")
    public class206 field2479;

    @ObfuscatedName("gm.r")
    public class207 field2478;

    @ObfuscatedName("gm.e")
    public class207 field2477 = null;

    public class202(class206 arg0) {
        this.field2479 = arg0;
        this.field2478 = this.field2479.field2494.field2496;
        this.field2477 = null;
    }

    public Object next() {
        class207 var1 = this.field2478;
        if (this.field2479.field2494 == var1) {
            var1 = null;
            this.field2478 = null;
        } else {
            this.field2478 = var1.field2496;
        }
        this.field2477 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2479.field2494 != this.field2478;
    }

    public void remove() {
        if (this.field2477 == null) {
            throw new IllegalStateException();
        }
        this.field2477.method3952();
        this.field2477 = null;
    }
}
