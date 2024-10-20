package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class201 implements Iterator {

    @ObfuscatedName("gx.a")
    public class202 field2483;

    @ObfuscatedName("gx.j")
    public class195 field2484;

    @ObfuscatedName("gx.n")
    public class195 field2482 = null;

    public class201(class202 arg0) {
        this.field2483 = arg0;
        this.field2484 = this.field2483.field2485.field2471;
        this.field2482 = null;
    }

    public Object next() {
        class195 var1 = this.field2484;
        if (this.field2483.field2485 == var1) {
            var1 = null;
            this.field2484 = null;
        } else {
            this.field2484 = var1.field2471;
        }
        this.field2482 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2483.field2485 != this.field2484;
    }

    public void remove() {
        if (this.field2482 == null) {
            throw new IllegalStateException();
        }
        this.field2482.method3348();
        this.field2482 = null;
    }
}
