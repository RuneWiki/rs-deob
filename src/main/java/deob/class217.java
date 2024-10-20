package deob;

import java.util.Iterator;

@ObfuscatedName("hb")
public class class217 implements Iterator {

    @ObfuscatedName("hb.f")
    public class218 field2516;

    @ObfuscatedName("hb.l")
    public class209 field2515;

    @ObfuscatedName("hb.w")
    public class209 field2517 = null;

    public class217(class218 arg0) {
        this.field2516 = arg0;
        this.field2515 = this.field2516.field2518.field2501;
        this.field2517 = null;
    }

    public Object next() {
        class209 var1 = this.field2515;
        if (this.field2516.field2518 == var1) {
            var1 = null;
            this.field2515 = null;
        } else {
            this.field2515 = var1.field2501;
        }
        this.field2517 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2516.field2518 != this.field2515;
    }

    public void remove() {
        if (this.field2517 == null) {
            throw new IllegalStateException();
        }
        this.field2517.method3851();
        this.field2517 = null;
    }
}
