package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class202 implements Iterator {

    @ObfuscatedName("gp.f")
    public class206 field2467;

    @ObfuscatedName("gp.h")
    public class207 field2466;

    @ObfuscatedName("gp.e")
    public class207 field2468 = null;

    public class202(class206 arg0) {
        this.field2467 = arg0;
        this.field2466 = this.field2467.field2484.field2487;
        this.field2468 = null;
    }

    public Object next() {
        class207 var1 = this.field2466;
        if (this.field2467.field2484 == var1) {
            var1 = null;
            this.field2466 = null;
        } else {
            this.field2466 = var1.field2487;
        }
        this.field2468 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2467.field2484 != this.field2466;
    }

    public void remove() {
        if (this.field2468 == null) {
            throw new IllegalStateException();
        }
        this.field2468.method3812();
        this.field2468 = null;
    }
}
