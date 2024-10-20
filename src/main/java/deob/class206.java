package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class206 implements Iterator {

    @ObfuscatedName("gu.h")
    public class200 field3090;

    @ObfuscatedName("gu.q")
    public class204 field3089;

    @ObfuscatedName("gu.v")
    public class204 field3088 = null;

    public class206(class200 arg0) {
        this.field3090 = arg0;
        this.field3089 = this.field3090.field3079.field3084;
        this.field3088 = null;
    }

    public Object next() {
        class204 var1 = this.field3089;
        if (this.field3090.field3079 == var1) {
            var1 = null;
            this.field3089 = null;
        } else {
            this.field3089 = var1.field3084;
        }
        this.field3088 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3090.field3079 != this.field3089;
    }

    public void remove() {
        if (this.field3088 == null) {
            throw new IllegalStateException();
        }
        this.field3088.method3689();
        this.field3088 = null;
    }
}
