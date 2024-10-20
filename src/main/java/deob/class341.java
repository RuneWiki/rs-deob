package deob;

import java.util.Iterator;

@ObfuscatedName("mt")
public class class341 implements Iterable {

    @ObfuscatedName("mt.c")
    public class407 field4180 = new class407();

    @ObfuscatedName("mt.p")
    public class407 field4179;

    public class341() {
        this.field4180.field4498 = this.field4180;
        this.field4180.field4499 = this.field4180;
    }

    @ObfuscatedName("mt.c()V")
    public void method5788() {
        while (this.field4180.field4498 != this.field4180) {
            this.field4180.field4498.method6653();
        }
    }

    @ObfuscatedName("mt.p(Loa;)V")
    public void method5789(class407 arg0) {
        if (arg0.field4499 != null) {
            arg0.method6653();
        }
        arg0.field4499 = this.field4180.field4499;
        arg0.field4498 = this.field4180;
        arg0.field4499.field4498 = arg0;
        arg0.field4498.field4499 = arg0;
    }

    @ObfuscatedName("mt.f(Loa;Loa;)V")
    public static void method5790(class407 arg0, class407 arg1) {
        if (arg0.field4499 != null) {
            arg0.method6653();
        }
        arg0.field4499 = arg1;
        arg0.field4498 = arg1.field4498;
        arg0.field4499.field4498 = arg0;
        arg0.field4498.field4499 = arg0;
    }

    @ObfuscatedName("mt.n()Loa;")
    public class407 method5803() {
        class407 var1 = this.field4180.field4498;
        if (this.field4180 == var1) {
            return null;
        } else {
            var1.method6653();
            return var1;
        }
    }

    @ObfuscatedName("mt.k()Loa;")
    public class407 method5792() {
        return this.method5793((class407) null);
    }

    @ObfuscatedName("mt.w(Loa;)Loa;")
    public class407 method5793(class407 arg0) {
        class407 var2;
        if (arg0 == null) {
            var2 = this.field4180.field4498;
        } else {
            var2 = arg0;
        }
        if (this.field4180 == var2) {
            this.field4179 = null;
            return null;
        } else {
            this.field4179 = var2.field4498;
            return var2;
        }
    }

    @ObfuscatedName("mt.s()Loa;")
    public class407 method5794() {
        class407 var1 = this.field4179;
        if (this.field4180 == var1) {
            this.field4179 = null;
            return null;
        } else {
            this.field4179 = var1.field4498;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class340(this);
    }
}
