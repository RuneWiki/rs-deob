package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class202 implements Iterator {

    @ObfuscatedName("gz.j")
    public class203 field2486;

    @ObfuscatedName("gz.h")
    public class196 field2485;

    @ObfuscatedName("gz.f")
    public class196 field2487 = null;

    public class202(class203 arg0) {
        this.field2486 = arg0;
        this.field2485 = this.field2486.field2488.field2473;
        this.field2487 = null;
    }

    public Object next() {
        class196 var1 = this.field2485;
        if (this.field2486.field2488 == var1) {
            var1 = null;
            this.field2485 = null;
        } else {
            this.field2485 = var1.field2473;
        }
        this.field2487 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2486.field2488 != this.field2485;
    }

    public void remove() {
        if (this.field2487 == null) {
            throw new IllegalStateException();
        }
        this.field2487.method3350();
        this.field2487 = null;
    }
}
