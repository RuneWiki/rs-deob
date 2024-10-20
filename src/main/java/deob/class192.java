package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class192 implements Iterator {

    @ObfuscatedName("gp.w")
    public class195 field2474;

    @ObfuscatedName("gp.o")
    public class196 field2473;

    @ObfuscatedName("gp.x")
    public class196 field2475 = null;

    public class192(class195 arg0) {
        this.field2474 = arg0;
        this.field2473 = this.field2474.field2486.field2489;
        this.field2475 = null;
    }

    public Object next() {
        class196 var1 = this.field2473;
        if (this.field2474.field2486 == var1) {
            var1 = null;
            this.field2473 = null;
        } else {
            this.field2473 = var1.field2489;
        }
        this.field2475 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2474.field2486 != this.field2473;
    }

    public void remove() {
        if (this.field2475 == null) {
            throw new IllegalStateException();
        }
        this.field2475.method3294();
        this.field2475 = null;
    }
}
