package deob;

import java.util.Iterator;

@ObfuscatedName("ht")
public class class211 implements Iterable {

    @ObfuscatedName("ht.n")
    public class212 field2499 = new class212();

    @ObfuscatedName("ht.h")
    public class212 field2498;

    public class211() {
        this.field2499.field2500 = this.field2499;
        this.field2499.field2501 = this.field2499;
    }

    @ObfuscatedName("ht.n()V")
    public void method3949() {
        while (this.field2499.field2500 != this.field2499) {
            this.field2499.field2500.method3973();
        }
    }

    @ObfuscatedName("ht.h(Lhv;)V")
    public void method3950(class212 arg0) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        arg0.field2501 = this.field2499.field2501;
        arg0.field2500 = this.field2499;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
    }

    @ObfuscatedName("ht.l(Lhv;)V")
    public void method3965(class212 arg0) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        arg0.field2501 = this.field2499;
        arg0.field2500 = this.field2499.field2500;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
    }

    @ObfuscatedName("ht.g(Lhv;Lhv;)V")
    public static void method3952(class212 arg0, class212 arg1) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        arg0.field2501 = arg1;
        arg0.field2500 = arg1.field2500;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
    }

    @ObfuscatedName("ht.b()Lhv;")
    public class212 method3953() {
        return this.method3954((class212) null);
    }

    @ObfuscatedName("ht.a(Lhv;)Lhv;")
    public class212 method3954(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field2499.field2500;
        } else {
            var2 = arg0;
        }
        if (this.field2499 == var2) {
            this.field2498 = null;
            return null;
        } else {
            this.field2498 = var2.field2500;
            return var2;
        }
    }

    @ObfuscatedName("ht.c()Lhv;")
    public class212 method3955() {
        class212 var1 = this.field2498;
        if (this.field2499 == var1) {
            this.field2498 = null;
            return null;
        } else {
            this.field2498 = var1.field2500;
            return var1;
        }
    }

    @ObfuscatedName("ht.z()Z")
    public boolean method3956() {
        return this.field2499.field2500 == this.field2499;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
