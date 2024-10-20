package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class196 implements Iterator {

    @ObfuscatedName("gy.b")
    public class199 field2541;

    @ObfuscatedName("gy.s")
    public class200 field2540;

    @ObfuscatedName("gy.r")
    public class200 field2542 = null;

    public class196(class199 arg0) {
        this.field2541 = arg0;
        this.field2540 = this.field2541.field2553.field2556;
        this.field2542 = null;
    }

    public Object next() {
        class200 var1 = this.field2540;
        if (this.field2541.field2553 == var1) {
            var1 = null;
            this.field2540 = null;
        } else {
            this.field2540 = var1.field2556;
        }
        this.field2542 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2541.field2553 != this.field2540;
    }

    public void remove() {
        if (this.field2542 == null) {
            throw new IllegalStateException();
        }
        this.field2542.method3392();
        this.field2542 = null;
    }
}
