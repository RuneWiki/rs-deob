package deob;

import java.util.Iterator;

@ObfuscatedName("kd")
public class class297 implements Iterator {

    @ObfuscatedName("kd.s")
    public class298 field3720;

    @ObfuscatedName("kd.t")
    public class354 field3721;

    @ObfuscatedName("kd.v")
    public class354 field3722 = null;

    public class297(class298 arg0) {
        this.method4738(arg0);
    }

    @ObfuscatedName("kd.s(Lkk;)V")
    public void method4738(class298 arg0) {
        this.field3720 = arg0;
        this.method4739();
    }

    @ObfuscatedName("kd.t()V")
    public void method4739() {
        this.field3721 = this.field3720 == null ? null : this.field3720.field3723.field3965;
        this.field3722 = null;
    }

    public Object next() {
        class354 var1 = this.field3721;
        if (this.field3720.field3723 == var1) {
            var1 = null;
            this.field3721 = null;
        } else {
            this.field3721 = var1.field3965;
        }
        this.field3722 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3720.field3723 != this.field3721 && this.field3721 != null;
    }

    public void remove() {
        if (this.field3722 == null) {
            throw new IllegalStateException();
        }
        this.field3722.method5447();
        this.field3722 = null;
    }
}
