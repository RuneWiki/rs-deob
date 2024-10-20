package deob;

import java.util.Iterator;

@ObfuscatedName("jh")
public class class276 implements Iterable {

    @ObfuscatedName("jh.z")
    public class185 field3566 = new class185();

    @ObfuscatedName("jh.k")
    public class185 field3567;

    public class276() {
        this.field3566.field2147 = this.field3566;
        this.field3566.field2148 = this.field3566;
    }

    @ObfuscatedName("jh.z()V")
    public void method4691() {
        while (this.field3566.field2147 != this.field3566) {
            this.field3566.field2147.method3395();
        }
    }

    @ObfuscatedName("jh.k(Lgs;)V")
    public void method4679(class185 arg0) {
        if (arg0.field2148 != null) {
            arg0.method3395();
        }
        arg0.field2148 = this.field3566.field2148;
        arg0.field2147 = this.field3566;
        arg0.field2148.field2147 = arg0;
        arg0.field2147.field2148 = arg0;
    }

    @ObfuscatedName("jh.s(Lgs;Lgs;)V")
    public static void method4680(class185 arg0, class185 arg1) {
        if (arg0.field2148 != null) {
            arg0.method3395();
        }
        arg0.field2148 = arg1;
        arg0.field2147 = arg1.field2147;
        arg0.field2148.field2147 = arg0;
        arg0.field2147.field2148 = arg0;
    }

    @ObfuscatedName("jh.t()Lgs;")
    public class185 method4681() {
        class185 var1 = this.field3566.field2147;
        if (this.field3566 == var1) {
            return null;
        } else {
            var1.method3395();
            return var1;
        }
    }

    @ObfuscatedName("jh.i()Lgs;")
    public class185 method4695() {
        return this.method4683((class185) null);
    }

    @ObfuscatedName("jh.o(Lgs;)Lgs;")
    public class185 method4683(class185 arg0) {
        class185 var2;
        if (arg0 == null) {
            var2 = this.field3566.field2147;
        } else {
            var2 = arg0;
        }
        if (this.field3566 == var2) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var2.field2147;
            return var2;
        }
    }

    @ObfuscatedName("jh.x()Lgs;")
    public class185 method4684() {
        class185 var1 = this.field3567;
        if (this.field3566 == var1) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var1.field2147;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class274(this);
    }
}
