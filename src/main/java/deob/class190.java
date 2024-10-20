package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class190 implements Iterator {

    @ObfuscatedName("gk.i")
    public class193 field2459;

    @ObfuscatedName("gk.j")
    public class194 field2458;

    @ObfuscatedName("gk.a")
    public class194 field2460 = null;

    public class190(class193 arg0) {
        this.field2459 = arg0;
        this.field2458 = this.field2459.field2471.field2474;
        this.field2460 = null;
    }

    public Object next() {
        class194 var1 = this.field2458;
        if (this.field2459.field2471 == var1) {
            var1 = null;
            this.field2458 = null;
        } else {
            this.field2458 = var1.field2474;
        }
        this.field2460 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2459.field2471 != this.field2458;
    }

    public void remove() {
        if (this.field2460 == null) {
            throw new IllegalStateException();
        }
        this.field2460.method3397();
        this.field2460 = null;
    }
}
