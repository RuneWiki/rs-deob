package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class200 implements Iterator {

    @ObfuscatedName("gx.s")
    public class203 field2570;

    @ObfuscatedName("gx.g")
    public class204 field2569;

    @ObfuscatedName("gx.m")
    public class204 field2571 = null;

    public class200(class203 arg0) {
        this.field2570 = arg0;
        this.field2569 = this.field2570.field2582.field2584;
        this.field2571 = null;
    }

    public Object next() {
        class204 var1 = this.field2569;
        if (this.field2570.field2582 == var1) {
            var1 = null;
            this.field2569 = null;
        } else {
            this.field2569 = var1.field2584;
        }
        this.field2571 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2570.field2582 != this.field2569;
    }

    public void remove() {
        if (this.field2571 == null) {
            throw new IllegalStateException();
        }
        this.field2571.method3740();
        this.field2571 = null;
    }
}
