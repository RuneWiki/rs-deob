package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class189 implements Iterator {

    @ObfuscatedName("go.e")
    public class192 field2439;

    @ObfuscatedName("go.o")
    public class193 field2438;

    @ObfuscatedName("go.m")
    public class193 field2437 = null;

    public class189(class192 arg0) {
        this.field2439 = arg0;
        this.field2438 = this.field2439.field2450.field2453;
        this.field2437 = null;
    }

    public Object next() {
        class193 var1 = this.field2438;
        if (this.field2439.field2450 == var1) {
            var1 = null;
            this.field2438 = null;
        } else {
            this.field2438 = var1.field2453;
        }
        this.field2437 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2439.field2450 != this.field2438;
    }

    public void remove() {
        if (this.field2437 == null) {
            throw new IllegalStateException();
        }
        this.field2437.method3304();
        this.field2437 = null;
    }
}
