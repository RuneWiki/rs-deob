package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class201 implements Iterator {

    @ObfuscatedName("go.i")
    public class202 field2483;

    @ObfuscatedName("go.h")
    public class195 field2484;

    @ObfuscatedName("go.u")
    public class195 field2485 = null;

    public class201(class202 arg0) {
        this.field2483 = arg0;
        this.field2484 = this.field2483.field2486.field2472;
        this.field2485 = null;
    }

    public Object next() {
        class195 var1 = this.field2484;
        if (this.field2483.field2486 == var1) {
            var1 = null;
            this.field2484 = null;
        } else {
            this.field2484 = var1.field2472;
        }
        this.field2485 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2483.field2486 != this.field2484;
    }

    public void remove() {
        if (this.field2485 == null) {
            throw new IllegalStateException();
        }
        this.field2485.method3403();
        this.field2485 = null;
    }
}
