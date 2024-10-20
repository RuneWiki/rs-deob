package deob;

import java.util.Iterator;

@ObfuscatedName("ju")
public class class275 implements Iterator {

    @ObfuscatedName("ju.x")
    public class271 field3541;

    @ObfuscatedName("ju.m")
    public class190 field3540;

    @ObfuscatedName("ju.k")
    public class190 field3542 = null;

    public class275(class271 arg0) {
        this.method4604(arg0);
    }

    @ObfuscatedName("ju.q(Ljm;)V")
    public void method4604(class271 arg0) {
        this.field3541 = arg0;
        this.method4612();
    }

    @ObfuscatedName("ju.z()V")
    public void method4612() {
        this.field3540 = this.field3541 == null ? null : this.field3541.field3532.field2118;
        this.field3542 = null;
    }

    public Object next() {
        class190 var1 = this.field3540;
        if (this.field3541.field3532 == var1) {
            var1 = null;
            this.field3540 = null;
        } else {
            this.field3540 = var1.field2118;
        }
        this.field3542 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3541.field3532 != this.field3540;
    }

    public void remove() {
        if (this.field3542 == null) {
            throw new IllegalStateException();
        }
        this.field3542.method3355();
        this.field3542 = null;
    }
}
