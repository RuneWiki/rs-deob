package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class200 implements Iterator {

    @ObfuscatedName("go.n")
    public class203 field2581;

    @ObfuscatedName("go.v")
    public class204 field2582;

    @ObfuscatedName("go.y")
    public class204 field2583 = null;

    public class200(class203 arg0) {
        this.field2581 = arg0;
        this.field2582 = this.field2581.field2594.field2598;
        this.field2583 = null;
    }

    public Object next() {
        class204 var1 = this.field2582;
        if (this.field2581.field2594 == var1) {
            var1 = null;
            this.field2582 = null;
        } else {
            this.field2582 = var1.field2598;
        }
        this.field2583 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2581.field2594 != this.field2582;
    }

    public void remove() {
        if (this.field2583 == null) {
            throw new IllegalStateException();
        }
        this.field2583.method3474();
        this.field2583 = null;
    }
}
