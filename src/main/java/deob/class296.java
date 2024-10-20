package deob;

import java.util.Iterator;

@ObfuscatedName("kk")
public class class296 implements Iterator {

    @ObfuscatedName("kk.f")
    public class297 field3711;

    @ObfuscatedName("kk.e")
    public class353 field3712;

    @ObfuscatedName("kk.v")
    public class353 field3710 = null;

    public class296(class297 arg0) {
        this.method4765(arg0);
    }

    @ObfuscatedName("kk.f(Lkz;)V")
    public void method4765(class297 arg0) {
        this.field3711 = arg0;
        this.method4752();
    }

    @ObfuscatedName("kk.e()V")
    public void method4752() {
        this.field3712 = this.field3711 == null ? null : this.field3711.field3714.field3935;
        this.field3710 = null;
    }

    public Object next() {
        class353 var1 = this.field3712;
        if (this.field3711.field3714 == var1) {
            var1 = null;
            this.field3712 = null;
        } else {
            this.field3712 = var1.field3935;
        }
        this.field3710 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3711.field3714 != this.field3712;
    }

    public void remove() {
        if (this.field3710 == null) {
            throw new IllegalStateException();
        }
        this.field3710.method5407();
        this.field3710 = null;
    }
}
