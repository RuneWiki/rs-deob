package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class189 implements Iterator {

    @ObfuscatedName("gl.i")
    public class192 field2453;

    @ObfuscatedName("gl.h")
    public class193 field2451;

    @ObfuscatedName("gl.u")
    public class193 field2452 = null;

    public class189(class192 arg0) {
        this.field2453 = arg0;
        this.field2451 = this.field2453.field2465.field2468;
        this.field2452 = null;
    }

    public Object next() {
        class193 var1 = this.field2451;
        if (this.field2453.field2465 == var1) {
            var1 = null;
            this.field2451 = null;
        } else {
            this.field2451 = var1.field2468;
        }
        this.field2452 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2453.field2465 != this.field2451;
    }

    public void remove() {
        if (this.field2452 == null) {
            throw new IllegalStateException();
        }
        this.field2452.method3364();
        this.field2452 = null;
    }
}
