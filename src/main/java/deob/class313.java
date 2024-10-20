package deob;

import java.util.Iterator;

@ObfuscatedName("le")
public class class313 implements Iterator {

    @ObfuscatedName("le.l")
    public class314 field3834;

    @ObfuscatedName("le.q")
    public class365 field3833;

    @ObfuscatedName("le.f")
    public class365 field3835 = null;

    public class313(class314 arg0) {
        this.field3834 = arg0;
        this.field3833 = this.field3834.field3836.field4069;
        this.field3835 = null;
    }

    public Object next() {
        class365 var1 = this.field3833;
        if (this.field3834.field3836 == var1) {
            var1 = null;
            this.field3833 = null;
        } else {
            this.field3833 = var1.field4069;
        }
        this.field3835 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3834.field3836 != this.field3833;
    }

    public void remove() {
        if (this.field3835 == null) {
            throw new IllegalStateException();
        }
        this.field3835.method5771();
        this.field3835 = null;
    }
}
