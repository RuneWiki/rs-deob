package deob;

import java.util.Iterator;

@ObfuscatedName("ln")
public class class330 implements Iterator {

    @ObfuscatedName("ln.c")
    public class331 field4021;

    @ObfuscatedName("ln.l")
    public class387 field4020;

    @ObfuscatedName("ln.s")
    public class387 field4019 = null;

    public class330(class331 arg0) {
        this.field4021 = arg0;
        this.field4020 = this.field4021.field4022.field4294;
        this.field4019 = null;
    }

    public Object next() {
        class387 var1 = this.field4020;
        if (this.field4021.field4022 == var1) {
            var1 = null;
            this.field4020 = null;
        } else {
            this.field4020 = var1.field4294;
        }
        this.field4019 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4021.field4022 != this.field4020;
    }

    public void remove() {
        if (this.field4019 == null) {
            throw new IllegalStateException();
        }
        this.field4019.method6163();
        this.field4019 = null;
    }
}
