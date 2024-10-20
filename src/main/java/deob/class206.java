package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class206 implements Iterator {

    @ObfuscatedName("gv.m")
    public class200 field3089;

    @ObfuscatedName("gv.l")
    public class204 field3088;

    @ObfuscatedName("gv.y")
    public class204 field3090 = null;

    public class206(class200 arg0) {
        this.field3089 = arg0;
        this.field3088 = this.field3089.field3079.field3083;
        this.field3090 = null;
    }

    public Object next() {
        class204 var1 = this.field3088;
        if (this.field3089.field3079 == var1) {
            var1 = null;
            this.field3088 = null;
        } else {
            this.field3088 = var1.field3083;
        }
        this.field3090 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3089.field3079 != this.field3088;
    }

    public void remove() {
        if (this.field3090 == null) {
            throw new IllegalStateException();
        }
        this.field3090.method3685();
        this.field3090 = null;
    }
}
