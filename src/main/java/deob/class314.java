package deob;

import java.util.Iterator;

@ObfuscatedName("lz")
public class class314 implements Iterable {

    @ObfuscatedName("lz.n")
    public class364 field3830 = new class364();

    @ObfuscatedName("lz.c")
    public class364 field3829;

    public class314() {
        this.field3830.field4049 = this.field3830;
        this.field3830.field4050 = this.field3830;
    }

    @ObfuscatedName("lz.n()V")
    public void method5088() {
        while (this.field3830.field4049 != this.field3830) {
            this.field3830.field4049.method5728();
        }
    }

    @ObfuscatedName("lz.c(Lmc;)V")
    public void method5103(class364 arg0) {
        if (arg0.field4050 != null) {
            arg0.method5728();
        }
        arg0.field4050 = this.field3830.field4050;
        arg0.field4049 = this.field3830;
        arg0.field4050.field4049 = arg0;
        arg0.field4049.field4050 = arg0;
    }

    @ObfuscatedName("lz.m(Lmc;Lmc;)V")
    public static void method5090(class364 arg0, class364 arg1) {
        if (arg0.field4050 != null) {
            arg0.method5728();
        }
        arg0.field4050 = arg1;
        arg0.field4049 = arg1.field4049;
        arg0.field4050.field4049 = arg0;
        arg0.field4049.field4050 = arg0;
    }

    @ObfuscatedName("lz.k()Lmc;")
    public class364 method5091() {
        class364 var1 = this.field3830.field4049;
        if (this.field3830 == var1) {
            return null;
        } else {
            var1.method5728();
            return var1;
        }
    }

    @ObfuscatedName("lz.o()Lmc;")
    public class364 method5089() {
        return this.method5102((class364) null);
    }

    @ObfuscatedName("lz.g(Lmc;)Lmc;")
    public class364 method5102(class364 arg0) {
        class364 var2;
        if (arg0 == null) {
            var2 = this.field3830.field4049;
        } else {
            var2 = arg0;
        }
        if (this.field3830 == var2) {
            this.field3829 = null;
            return null;
        } else {
            this.field3829 = var2.field4049;
            return var2;
        }
    }

    @ObfuscatedName("lz.z()Lmc;")
    public class364 method5094() {
        class364 var1 = this.field3829;
        if (this.field3830 == var1) {
            this.field3829 = null;
            return null;
        } else {
            this.field3829 = var1.field4049;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class313(this);
    }
}
