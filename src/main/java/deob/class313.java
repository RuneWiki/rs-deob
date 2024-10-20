package deob;

import java.util.Iterator;

@ObfuscatedName("ld")
public class class313 implements Iterator {

    @ObfuscatedName("ld.i")
    public class314 field3820;

    @ObfuscatedName("ld.w")
    public class365 field3821;

    @ObfuscatedName("ld.s")
    public class365 field3822 = null;

    public class313(class314 arg0) {
        this.field3820 = arg0;
        this.field3821 = this.field3820.field3824.field4068;
        this.field3822 = null;
    }

    public Object next() {
        class365 var1 = this.field3821;
        if (this.field3820.field3824 == var1) {
            var1 = null;
            this.field3821 = null;
        } else {
            this.field3821 = var1.field4068;
        }
        this.field3822 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3820.field3824 != this.field3821;
    }

    public void remove() {
        if (this.field3822 == null) {
            throw new IllegalStateException();
        }
        this.field3822.method5748();
        this.field3822 = null;
    }
}
