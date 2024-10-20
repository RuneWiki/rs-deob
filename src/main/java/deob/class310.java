package deob;

import java.util.Iterator;

@ObfuscatedName("kc")
public class class310 implements Iterator {

    @ObfuscatedName("kc.n")
    public class311 field3820;

    @ObfuscatedName("kc.c")
    public class369 field3821;

    @ObfuscatedName("kc.m")
    public class369 field3819 = null;

    public class310(class311 arg0) {
        this.method4991(arg0);
    }

    @ObfuscatedName("kc.n(Lkz;)V")
    public void method4991(class311 arg0) {
        this.field3820 = arg0;
        this.method4992();
    }

    @ObfuscatedName("kc.c()V")
    public void method4992() {
        this.field3821 = this.field3820 == null ? null : this.field3820.field3822.field4055;
        this.field3819 = null;
    }

    public Object next() {
        class369 var1 = this.field3821;
        if (this.field3820.field3822 == var1) {
            var1 = null;
            this.field3821 = null;
        } else {
            this.field3821 = var1.field4055;
        }
        this.field3819 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3820.field3822 != this.field3821 && this.field3821 != null;
    }

    public void remove() {
        if (this.field3819 == null) {
            throw new IllegalStateException();
        }
        this.field3819.method5732();
        this.field3819 = null;
    }
}
