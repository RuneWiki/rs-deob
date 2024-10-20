package deob;

import java.util.Iterator;

@ObfuscatedName("jz")
public class class276 implements Iterable {

    @ObfuscatedName("jz.x")
    public class185 field3543 = new class185();

    @ObfuscatedName("jz.m")
    public class185 field3544;

    public class276() {
        this.field3543.field2110 = this.field3543;
        this.field3543.field2108 = this.field3543;
    }

    @ObfuscatedName("jz.x()V")
    public void method4638() {
        while (this.field3543.field2110 != this.field3543) {
            this.field3543.field2110.method3351();
        }
    }

    @ObfuscatedName("jz.m(Lge;)V")
    public void method4627(class185 arg0) {
        if (arg0.field2108 != null) {
            arg0.method3351();
        }
        arg0.field2108 = this.field3543.field2108;
        arg0.field2110 = this.field3543;
        arg0.field2108.field2110 = arg0;
        arg0.field2110.field2108 = arg0;
    }

    @ObfuscatedName("jz.k(Lge;Lge;)V")
    public static void method4620(class185 arg0, class185 arg1) {
        if (arg0.field2108 != null) {
            arg0.method3351();
        }
        arg0.field2108 = arg1;
        arg0.field2110 = arg1.field2110;
        arg0.field2108.field2110 = arg0;
        arg0.field2110.field2108 = arg0;
    }

    @ObfuscatedName("jz.d()Lge;")
    public class185 method4621() {
        class185 var1 = this.field3543.field2110;
        if (this.field3543 == var1) {
            return null;
        } else {
            var1.method3351();
            return var1;
        }
    }

    @ObfuscatedName("jz.w()Lge;")
    public class185 method4635() {
        return this.method4633((class185) null);
    }

    @ObfuscatedName("jz.v(Lge;)Lge;")
    public class185 method4633(class185 arg0) {
        class185 var2;
        if (arg0 == null) {
            var2 = this.field3543.field2110;
        } else {
            var2 = arg0;
        }
        if (this.field3543 == var2) {
            this.field3544 = null;
            return null;
        } else {
            this.field3544 = var2.field2110;
            return var2;
        }
    }

    @ObfuscatedName("jz.q()Lge;")
    public class185 method4624() {
        class185 var1 = this.field3544;
        if (this.field3543 == var1) {
            this.field3544 = null;
            return null;
        } else {
            this.field3544 = var1.field2110;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class274(this);
    }
}
