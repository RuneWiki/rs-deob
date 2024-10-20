package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class189 implements Iterator {

    @ObfuscatedName("gp.d")
    public class192 field2426;

    @ObfuscatedName("gp.q")
    public class193 field2425;

    @ObfuscatedName("gp.x")
    public class193 field2424 = null;

    public class189(class192 arg0) {
        this.field2426 = arg0;
        this.field2425 = this.field2426.field2437.field2440;
        this.field2424 = null;
    }

    public Object next() {
        class193 var1 = this.field2425;
        if (this.field2426.field2437 == var1) {
            var1 = null;
            this.field2425 = null;
        } else {
            this.field2425 = var1.field2440;
        }
        this.field2424 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2426.field2437 != this.field2425;
    }

    public void remove() {
        if (this.field2424 == null) {
            throw new IllegalStateException();
        }
        this.field2424.method3312();
        this.field2424 = null;
    }
}
