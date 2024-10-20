package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class190 implements Iterator {

    @ObfuscatedName("gj.j")
    public class193 field2453;

    @ObfuscatedName("gj.h")
    public class194 field2454;

    @ObfuscatedName("gj.f")
    public class194 field2455 = null;

    public class190(class193 arg0) {
        this.field2453 = arg0;
        this.field2454 = this.field2453.field2466.field2470;
        this.field2455 = null;
    }

    public Object next() {
        class194 var1 = this.field2454;
        if (this.field2453.field2466 == var1) {
            var1 = null;
            this.field2454 = null;
        } else {
            this.field2454 = var1.field2470;
        }
        this.field2455 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2453.field2466 != this.field2454;
    }

    public void remove() {
        if (this.field2455 == null) {
            throw new IllegalStateException();
        }
        this.field2455.method3314();
        this.field2455 = null;
    }
}
