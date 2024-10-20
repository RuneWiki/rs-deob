package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class208 implements Iterator {

    @ObfuscatedName("ge.d")
    public class209 field2583;

    @ObfuscatedName("ge.x")
    public class202 field2582;

    @ObfuscatedName("ge.k")
    public class202 field2581 = null;

    public class208(class209 arg0) {
        this.field2583 = arg0;
        this.field2582 = this.field2583.field2584.field2569;
        this.field2581 = null;
    }

    public Object next() {
        class202 var1 = this.field2582;
        if (this.field2583.field2584 == var1) {
            var1 = null;
            this.field2582 = null;
        } else {
            this.field2582 = var1.field2569;
        }
        this.field2581 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2583.field2584 != this.field2582;
    }

    public void remove() {
        if (this.field2581 == null) {
            throw new IllegalStateException();
        }
        this.field2581.method3514();
        this.field2581 = null;
    }
}
