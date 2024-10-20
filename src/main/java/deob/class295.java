package deob;

import java.util.Iterator;

@ObfuscatedName("kq")
public class class295 implements Iterator {

    @ObfuscatedName("kq.v")
    public class296 field3709;

    @ObfuscatedName("kq.n")
    public class352 field3707;

    @ObfuscatedName("kq.f")
    public class352 field3708 = null;

    public class295(class296 arg0) {
        this.method4746(arg0);
    }

    @ObfuscatedName("kq.v(Lki;)V")
    public void method4746(class296 arg0) {
        this.field3709 = arg0;
        this.method4747();
    }

    @ObfuscatedName("kq.n()V")
    public void method4747() {
        this.field3707 = this.field3709 == null ? null : this.field3709.field3711.field3939;
        this.field3708 = null;
    }

    public Object next() {
        class352 var1 = this.field3707;
        if (this.field3709.field3711 == var1) {
            var1 = null;
            this.field3707 = null;
        } else {
            this.field3707 = var1.field3939;
        }
        this.field3708 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3709.field3711 != this.field3707;
    }

    public void remove() {
        if (this.field3708 == null) {
            throw new IllegalStateException();
        }
        this.field3708.method5496();
        this.field3708 = null;
    }
}
