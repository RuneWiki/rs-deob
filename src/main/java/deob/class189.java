package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class189 implements Iterator {

    @ObfuscatedName("go.i")
    public class192 field2458;

    @ObfuscatedName("go.w")
    public class193 field2459;

    @ObfuscatedName("go.a")
    public class193 field2460 = null;

    public class189(class192 arg0) {
        this.field2458 = arg0;
        this.field2459 = this.field2458.field2472.field2474;
        this.field2460 = null;
    }

    public Object next() {
        class193 var1 = this.field2459;
        if (this.field2458.field2472 == var1) {
            var1 = null;
            this.field2459 = null;
        } else {
            this.field2459 = var1.field2474;
        }
        this.field2460 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2458.field2472 != this.field2459;
    }

    public void remove() {
        if (this.field2460 == null) {
            throw new IllegalStateException();
        }
        this.field2460.method3290();
        this.field2460 = null;
    }
}
