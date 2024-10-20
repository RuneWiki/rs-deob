package deob;

import java.util.Iterator;

@ObfuscatedName("lh")
public class class314 implements Iterable {

    @ObfuscatedName("lh.l")
    public class365 field3836 = new class365();

    @ObfuscatedName("lh.q")
    public class365 field3837;

    public class314() {
        this.field3836.field4069 = this.field3836;
        this.field3836.field4070 = this.field3836;
    }

    @ObfuscatedName("lh.l()V")
    public void method5160() {
        while (this.field3836.field4069 != this.field3836) {
            this.field3836.field4069.method5771();
        }
    }

    @ObfuscatedName("lh.q(Lnu;)V")
    public void method5168(class365 arg0) {
        if (arg0.field4070 != null) {
            arg0.method5771();
        }
        arg0.field4070 = this.field3836.field4070;
        arg0.field4069 = this.field3836;
        arg0.field4070.field4069 = arg0;
        arg0.field4069.field4070 = arg0;
    }

    @ObfuscatedName("lh.f(Lnu;Lnu;)V")
    public static void method5162(class365 arg0, class365 arg1) {
        if (arg0.field4070 != null) {
            arg0.method5771();
        }
        arg0.field4070 = arg1;
        arg0.field4069 = arg1.field4069;
        arg0.field4070.field4069 = arg0;
        arg0.field4069.field4070 = arg0;
    }

    @ObfuscatedName("lh.j()Lnu;")
    public class365 method5163() {
        class365 var1 = this.field3836.field4069;
        if (this.field3836 == var1) {
            return null;
        } else {
            var1.method5771();
            return var1;
        }
    }

    @ObfuscatedName("lh.m()Lnu;")
    public class365 method5164() {
        return this.method5186((class365) null);
    }

    @ObfuscatedName("lh.k(Lnu;)Lnu;")
    public class365 method5186(class365 arg0) {
        class365 var2;
        if (arg0 == null) {
            var2 = this.field3836.field4069;
        } else {
            var2 = arg0;
        }
        if (this.field3836 == var2) {
            this.field3837 = null;
            return null;
        } else {
            this.field3837 = var2.field4069;
            return var2;
        }
    }

    @ObfuscatedName("lh.t()Lnu;")
    public class365 method5166() {
        class365 var1 = this.field3837;
        if (this.field3836 == var1) {
            this.field3837 = null;
            return null;
        } else {
            this.field3837 = var1.field4069;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class313(this);
    }
}
