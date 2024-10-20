package deob;

import java.util.Iterator;

@ObfuscatedName("hw")
public class class212 implements Iterator {

    @ObfuscatedName("hw.c")
    public class216 field2626;

    @ObfuscatedName("hw.i")
    public class217 field2625;

    @ObfuscatedName("hw.o")
    public class217 field2624 = null;

    public class212(class216 arg0) {
        this.field2626 = arg0;
        this.field2625 = this.field2626.field2641.field2643;
        this.field2624 = null;
    }

    public Object next() {
        class217 var1 = this.field2625;
        if (this.field2626.field2641 == var1) {
            var1 = null;
            this.field2625 = null;
        } else {
            this.field2625 = var1.field2643;
        }
        this.field2624 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2626.field2641 != this.field2625;
    }

    public void remove() {
        if (this.field2624 == null) {
            throw new IllegalStateException();
        }
        this.field2624.method3710();
        this.field2624 = null;
    }
}
