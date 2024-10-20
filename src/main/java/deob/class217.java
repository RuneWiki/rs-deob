package deob;

import java.util.Iterator;

@ObfuscatedName("hx")
public class class217 implements Iterator {

    @ObfuscatedName("hx.f")
    public class218 field2507;

    @ObfuscatedName("hx.h")
    public class209 field2506;

    @ObfuscatedName("hx.e")
    public class209 field2505 = null;

    public class217(class218 arg0) {
        this.field2507 = arg0;
        this.field2506 = this.field2507.field2509.field2491;
        this.field2505 = null;
    }

    public Object next() {
        class209 var1 = this.field2506;
        if (this.field2507.field2509 == var1) {
            var1 = null;
            this.field2506 = null;
        } else {
            this.field2506 = var1.field2491;
        }
        this.field2505 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2507.field2509 != this.field2506;
    }

    public void remove() {
        if (this.field2505 == null) {
            throw new IllegalStateException();
        }
        this.field2505.method3845();
        this.field2505 = null;
    }
}
