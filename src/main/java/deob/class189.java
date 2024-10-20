package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class189 implements Iterator {

    @ObfuscatedName("go.a")
    public class192 field2450;

    @ObfuscatedName("go.j")
    public class193 field2451;

    @ObfuscatedName("go.n")
    public class193 field2452 = null;

    public class189(class192 arg0) {
        this.field2450 = arg0;
        this.field2451 = this.field2450.field2463.field2466;
        this.field2452 = null;
    }

    public Object next() {
        class193 var1 = this.field2451;
        if (this.field2450.field2463 == var1) {
            var1 = null;
            this.field2451 = null;
        } else {
            this.field2451 = var1.field2466;
        }
        this.field2452 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2450.field2463 != this.field2451;
    }

    public void remove() {
        if (this.field2452 == null) {
            throw new IllegalStateException();
        }
        this.field2452.method3308();
        this.field2452 = null;
    }
}
