package deob;

import java.util.Iterator;

@ObfuscatedName("hm")
public class class216 implements Iterable {

    @ObfuscatedName("hm.o")
    public class217 field2651 = new class217();

    @ObfuscatedName("hm.k")
    public class217 field2650;

    public class216() {
        this.field2651.field2653 = this.field2651;
        this.field2651.field2654 = this.field2651;
    }

    @ObfuscatedName("hm.o()V")
    public void method3651() {
        while (this.field2651.field2653 != this.field2651) {
            this.field2651.field2653.method3681();
        }
    }

    @ObfuscatedName("hm.k(Lhj;)V")
    public void method3652(class217 arg0) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        arg0.field2654 = this.field2651.field2654;
        arg0.field2653 = this.field2651;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
    }

    @ObfuscatedName("hm.t(Lhj;)V")
    public void method3656(class217 arg0) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        arg0.field2654 = this.field2651;
        arg0.field2653 = this.field2651.field2653;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
    }

    @ObfuscatedName("hm.d(Lhj;Lhj;)V")
    public static void method3668(class217 arg0, class217 arg1) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        arg0.field2654 = arg1;
        arg0.field2653 = arg1.field2653;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
    }

    @ObfuscatedName("hm.h()Lhj;")
    public class217 method3654() {
        class217 var1 = this.field2651.field2653;
        if (this.field2651 == var1) {
            return null;
        } else {
            var1.method3681();
            return var1;
        }
    }

    @ObfuscatedName("hm.m()Lhj;")
    public class217 method3655() {
        return this.method3670((class217) null);
    }

    @ObfuscatedName("hm.z(Lhj;)Lhj;")
    public class217 method3670(class217 arg0) {
        class217 var2;
        if (arg0 == null) {
            var2 = this.field2651.field2653;
        } else {
            var2 = arg0;
        }
        if (this.field2651 == var2) {
            this.field2650 = null;
            return null;
        } else {
            this.field2650 = var2.field2653;
            return var2;
        }
    }

    @ObfuscatedName("hm.i()Lhj;")
    public class217 method3657() {
        class217 var1 = this.field2650;
        if (this.field2651 == var1) {
            this.field2650 = null;
            return null;
        } else {
            this.field2650 = var1.field2653;
            return var1;
        }
    }

    @ObfuscatedName("hm.u()Z")
    public boolean method3658() {
        return this.field2651.field2653 == this.field2651;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
