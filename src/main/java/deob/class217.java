package deob;

import java.util.Iterator;

@ObfuscatedName("hh")
public class class217 implements Iterator {

    @ObfuscatedName("hh.v")
    public class218 field2483;

    @ObfuscatedName("hh.s")
    public class209 field2484;

    @ObfuscatedName("hh.o")
    public class209 field2485 = null;

    public class217(class218 arg0) {
        this.field2483 = arg0;
        this.field2484 = this.field2483.field2487.field2469;
        this.field2485 = null;
    }

    public Object next() {
        class209 var1 = this.field2484;
        if (this.field2483.field2487 == var1) {
            var1 = null;
            this.field2484 = null;
        } else {
            this.field2484 = var1.field2469;
        }
        this.field2485 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2483.field2487 != this.field2484;
    }

    public void remove() {
        if (this.field2485 == null) {
            throw new IllegalStateException();
        }
        this.field2485.method3826();
        this.field2485 = null;
    }
}
