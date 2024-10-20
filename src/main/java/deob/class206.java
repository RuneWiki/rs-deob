package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class206 implements Iterator {

    @ObfuscatedName("gw.i")
    public class200 field3095;

    @ObfuscatedName("gw.v")
    public class204 field3094;

    @ObfuscatedName("gw.r")
    public class204 field3096 = null;

    public class206(class200 arg0) {
        this.field3095 = arg0;
        this.field3094 = this.field3095.field3085.field3090;
        this.field3096 = null;
    }

    public Object next() {
        class204 var1 = this.field3094;
        if (this.field3095.field3085 == var1) {
            var1 = null;
            this.field3094 = null;
        } else {
            this.field3094 = var1.field3090;
        }
        this.field3096 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3095.field3085 != this.field3094;
    }

    public void remove() {
        if (this.field3096 == null) {
            throw new IllegalStateException();
        }
        this.field3096.method3602();
        this.field3096 = null;
    }
}
