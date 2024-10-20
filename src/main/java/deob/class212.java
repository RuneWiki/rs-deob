package deob;

import java.util.Iterator;

@ObfuscatedName("hz")
public class class212 implements Iterator {

    @ObfuscatedName("hz.t")
    public class216 field2617;

    @ObfuscatedName("hz.q")
    public class217 field2618;

    @ObfuscatedName("hz.i")
    public class217 field2619 = null;

    public class212(class216 arg0) {
        this.field2617 = arg0;
        this.field2618 = this.field2617.field2635.field2637;
        this.field2619 = null;
    }

    public Object next() {
        class217 var1 = this.field2618;
        if (this.field2617.field2635 == var1) {
            var1 = null;
            this.field2618 = null;
        } else {
            this.field2618 = var1.field2637;
        }
        this.field2619 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2617.field2635 != this.field2618;
    }

    public void remove() {
        if (this.field2619 == null) {
            throw new IllegalStateException();
        }
        this.field2619.method3721();
        this.field2619 = null;
    }
}
