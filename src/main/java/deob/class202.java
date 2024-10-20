package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class202 implements Iterator {

    @ObfuscatedName("ge.i")
    public class203 field2492;

    @ObfuscatedName("ge.j")
    public class196 field2491;

    @ObfuscatedName("ge.a")
    public class196 field2490 = null;

    public class202(class203 arg0) {
        this.field2492 = arg0;
        this.field2491 = this.field2492.field2493.field2478;
        this.field2490 = null;
    }

    public Object next() {
        class196 var1 = this.field2491;
        if (this.field2492.field2493 == var1) {
            var1 = null;
            this.field2491 = null;
        } else {
            this.field2491 = var1.field2478;
        }
        this.field2490 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2492.field2493 != this.field2491;
    }

    public void remove() {
        if (this.field2490 == null) {
            throw new IllegalStateException();
        }
        this.field2490.method3445();
        this.field2490 = null;
    }
}
