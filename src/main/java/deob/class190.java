package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class190 implements Iterator {

    @ObfuscatedName("gc.e")
    public class193 field2437;

    @ObfuscatedName("gc.n")
    public class194 field2436;

    @ObfuscatedName("gc.g")
    public class194 field2438 = null;

    public class190(class193 arg0) {
        this.field2437 = arg0;
        this.field2436 = this.field2437.field2450.field2452;
        this.field2438 = null;
    }

    public Object next() {
        class194 var1 = this.field2436;
        if (this.field2437.field2450 == var1) {
            var1 = null;
            this.field2436 = null;
        } else {
            this.field2436 = var1.field2452;
        }
        this.field2438 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2437.field2450 != this.field2436;
    }

    public void remove() {
        if (this.field2438 == null) {
            throw new IllegalStateException();
        }
        this.field2438.method3333();
        this.field2438 = null;
    }
}
