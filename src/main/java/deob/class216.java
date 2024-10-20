package deob;

import java.util.Iterator;

@ObfuscatedName("hs")
public class class216 implements Iterable {

    @ObfuscatedName("hs.d")
    public class217 field2651 = new class217();

    @ObfuscatedName("hs.z")
    public class217 field2652;

    public class216() {
        this.field2651.field2654 = this.field2651;
        this.field2651.field2653 = this.field2651;
    }

    @ObfuscatedName("hs.d()V")
    public void method3749() {
        while (this.field2651.field2654 != this.field2651) {
            this.field2651.field2654.method3785();
        }
    }

    @ObfuscatedName("hs.z(Lho;)V")
    public void method3750(class217 arg0) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        arg0.field2653 = this.field2651.field2653;
        arg0.field2654 = this.field2651;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
    }

    @ObfuscatedName("hs.n(Lho;)V")
    public void method3751(class217 arg0) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        arg0.field2653 = this.field2651;
        arg0.field2654 = this.field2651.field2654;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
    }

    @ObfuscatedName("hs.r(Lho;Lho;)V")
    public static void method3752(class217 arg0, class217 arg1) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        arg0.field2653 = arg1;
        arg0.field2654 = arg1.field2654;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
    }

    @ObfuscatedName("hs.e()Lho;")
    public class217 method3753() {
        class217 var1 = this.field2651.field2654;
        if (this.field2651 == var1) {
            return null;
        } else {
            var1.method3785();
            return var1;
        }
    }

    @ObfuscatedName("hs.y()Lho;")
    public class217 method3762() {
        return this.method3772((class217) null);
    }

    @ObfuscatedName("hs.k(Lho;)Lho;")
    public class217 method3772(class217 arg0) {
        class217 var2;
        if (arg0 == null) {
            var2 = this.field2651.field2654;
        } else {
            var2 = arg0;
        }
        if (this.field2651 == var2) {
            this.field2652 = null;
            return null;
        } else {
            this.field2652 = var2.field2654;
            return var2;
        }
    }

    @ObfuscatedName("hs.s()Lho;")
    public class217 method3756() {
        class217 var1 = this.field2652;
        if (this.field2651 == var1) {
            this.field2652 = null;
            return null;
        } else {
            this.field2652 = var1.field2654;
            return var1;
        }
    }

    @ObfuscatedName("hs.x()Z")
    public boolean method3755() {
        return this.field2651.field2654 == this.field2651;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
