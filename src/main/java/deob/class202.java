package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class202 implements Iterator {

    @ObfuscatedName("gd.v")
    public class206 field2444;

    @ObfuscatedName("gd.s")
    public class207 field2445;

    @ObfuscatedName("gd.o")
    public class207 field2446 = null;

    public class202(class206 arg0) {
        this.field2444 = arg0;
        this.field2445 = this.field2444.field2462.field2463;
        this.field2446 = null;
    }

    public Object next() {
        class207 var1 = this.field2445;
        if (this.field2444.field2462 == var1) {
            var1 = null;
            this.field2445 = null;
        } else {
            this.field2445 = var1.field2463;
        }
        this.field2446 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2444.field2462 != this.field2445;
    }

    public void remove() {
        if (this.field2446 == null) {
            throw new IllegalStateException();
        }
        this.field2446.method3787();
        this.field2446 = null;
    }
}
