package deob;

import java.util.Iterator;

@ObfuscatedName("jt")
public class class277 implements Iterable {

    @ObfuscatedName("jt.f")
    public class185 field3568 = new class185();

    @ObfuscatedName("jt.b")
    public class185 field3567;

    public class277() {
        this.field3568.field2133 = this.field3568;
        this.field3568.field2134 = this.field3568;
    }

    @ObfuscatedName("jt.f()V")
    public void method4693() {
        while (this.field3568.field2133 != this.field3568) {
            this.field3568.field2133.method3400();
        }
    }

    @ObfuscatedName("jt.b(Lgp;)V")
    public void method4694(class185 arg0) {
        if (arg0.field2134 != null) {
            arg0.method3400();
        }
        arg0.field2134 = this.field3568.field2134;
        arg0.field2133 = this.field3568;
        arg0.field2134.field2133 = arg0;
        arg0.field2133.field2134 = arg0;
    }

    @ObfuscatedName("jt.l(Lgp;Lgp;)V")
    public static void method4716(class185 arg0, class185 arg1) {
        if (arg0.field2134 != null) {
            arg0.method3400();
        }
        arg0.field2134 = arg1;
        arg0.field2133 = arg1.field2133;
        arg0.field2134.field2133 = arg0;
        arg0.field2133.field2134 = arg0;
    }

    @ObfuscatedName("jt.m()Lgp;")
    public class185 method4696() {
        class185 var1 = this.field3568.field2133;
        if (this.field3568 == var1) {
            return null;
        } else {
            var1.method3400();
            return var1;
        }
    }

    @ObfuscatedName("jt.z()Lgp;")
    public class185 method4700() {
        return this.method4698((class185) null);
    }

    @ObfuscatedName("jt.q(Lgp;)Lgp;")
    public class185 method4698(class185 arg0) {
        class185 var2;
        if (arg0 == null) {
            var2 = this.field3568.field2133;
        } else {
            var2 = arg0;
        }
        if (this.field3568 == var2) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var2.field2133;
            return var2;
        }
    }

    @ObfuscatedName("jt.k()Lgp;")
    public class185 method4699() {
        class185 var1 = this.field3567;
        if (this.field3568 == var1) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var1.field2133;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class275(this);
    }
}
