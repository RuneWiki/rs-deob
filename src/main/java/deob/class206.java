package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class206 implements Iterator {

    @ObfuscatedName("gx.a")
    public class200 field3106;

    @ObfuscatedName("gx.r")
    public class204 field3107;

    @ObfuscatedName("gx.f")
    public class204 field3105 = null;

    public class206(class200 arg0) {
        this.field3106 = arg0;
        this.field3107 = this.field3106.field3096.field3101;
        this.field3105 = null;
    }

    public Object next() {
        class204 var1 = this.field3107;
        if (this.field3106.field3096 == var1) {
            var1 = null;
            this.field3107 = null;
        } else {
            this.field3107 = var1.field3101;
        }
        this.field3105 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3106.field3096 != this.field3107;
    }

    public void remove() {
        if (this.field3105 == null) {
            throw new IllegalStateException();
        }
        this.field3105.method3635();
        this.field3105 = null;
    }
}
