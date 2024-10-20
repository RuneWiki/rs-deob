package deob;

import java.util.Iterator;

@ObfuscatedName("hw")
public class class217 implements Iterator {

    @ObfuscatedName("hw.g")
    public class218 field2517;

    @ObfuscatedName("hw.r")
    public class209 field2516;

    @ObfuscatedName("hw.e")
    public class209 field2518 = null;

    public class217(class218 arg0) {
        this.field2517 = arg0;
        this.field2516 = this.field2517.field2519.field2501;
        this.field2518 = null;
    }

    public Object next() {
        class209 var1 = this.field2516;
        if (this.field2517.field2519 == var1) {
            var1 = null;
            this.field2516 = null;
        } else {
            this.field2516 = var1.field2501;
        }
        this.field2518 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2517.field2519 != this.field2516;
    }

    public void remove() {
        if (this.field2518 == null) {
            throw new IllegalStateException();
        }
        this.field2518.method3989();
        this.field2518 = null;
    }
}
