package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class208 implements Iterator {

    @ObfuscatedName("gk.b")
    public class209 field2574;

    @ObfuscatedName("gk.s")
    public class202 field2572;

    @ObfuscatedName("gk.r")
    public class202 field2573 = null;

    public class208(class209 arg0) {
        this.field2574 = arg0;
        this.field2572 = this.field2574.field2575.field2561;
        this.field2573 = null;
    }

    public Object next() {
        class202 var1 = this.field2572;
        if (this.field2574.field2575 == var1) {
            var1 = null;
            this.field2572 = null;
        } else {
            this.field2572 = var1.field2561;
        }
        this.field2573 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2574.field2575 != this.field2572;
    }

    public void remove() {
        if (this.field2573 == null) {
            throw new IllegalStateException();
        }
        this.field2573.method3428();
        this.field2573 = null;
    }
}
