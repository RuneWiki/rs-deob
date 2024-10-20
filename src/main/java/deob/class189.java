package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class189 implements Iterator {

    @ObfuscatedName("gb.d")
    public class192 field2471;

    @ObfuscatedName("gb.k")
    public class193 field2470;

    @ObfuscatedName("gb.e")
    public class193 field2472 = null;

    public class189(class192 arg0) {
        this.field2471 = arg0;
        this.field2470 = this.field2471.field2484.field2485;
        this.field2472 = null;
    }

    public Object next() {
        class193 var1 = this.field2470;
        if (this.field2471.field2484 == var1) {
            var1 = null;
            this.field2470 = null;
        } else {
            this.field2470 = var1.field2485;
        }
        this.field2472 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2471.field2484 != this.field2470;
    }

    public void remove() {
        if (this.field2472 == null) {
            throw new IllegalStateException();
        }
        this.field2472.method3407();
        this.field2472 = null;
    }
}
