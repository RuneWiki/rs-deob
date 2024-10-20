package deob;

import java.util.Iterator;

@ObfuscatedName("po")
public class class402 implements Iterator {

    @ObfuscatedName("po.az")
    public class403 field4550;

    @ObfuscatedName("po.ah")
    public class489 field4549;

    @ObfuscatedName("po.af")
    public class489 field4551 = null;

    public class402(class403 arg0) {
        this.field4550 = arg0;
        this.field4549 = this.field4550.field4552.field4945;
        this.field4551 = null;
    }

    public Object next() {
        class489 var1 = this.field4549;
        if (this.field4550.field4552 == var1) {
            var1 = null;
            this.field4549 = null;
        } else {
            this.field4549 = var1.field4945;
        }
        this.field4551 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4550.field4552 != this.field4549;
    }

    public void remove() {
        if (this.field4551 == null) {
            throw new IllegalStateException();
        }
        this.field4551.method7853();
        this.field4551 = null;
    }
}
