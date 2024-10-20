package deob;

import java.util.Iterator;

@ObfuscatedName("ja")
public class class272 implements Iterable {

    @ObfuscatedName("ja.m")
    public class186 field3602 = new class186();

    @ObfuscatedName("ja.f")
    public class186 field3603;

    public class272() {
        this.field3602.field2140 = this.field3602;
        this.field3602.field2141 = this.field3602;
    }

    @ObfuscatedName("ja.m()V")
    public void method4819() {
        while (this.field3602.field2140 != this.field3602) {
            this.field3602.field2140.method3306();
        }
    }

    @ObfuscatedName("ja.f(Lgw;)V")
    public void method4842(class186 arg0) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        arg0.field2141 = this.field3602.field2141;
        arg0.field2140 = this.field3602;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
    }

    @ObfuscatedName("ja.q(Lgw;)V")
    public void method4820(class186 arg0) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        arg0.field2141 = this.field3602;
        arg0.field2140 = this.field3602.field2140;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
    }

    @ObfuscatedName("ja.w(Lgw;Lgw;)V")
    public static void method4837(class186 arg0, class186 arg1) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        arg0.field2141 = arg1;
        arg0.field2140 = arg1.field2140;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
    }

    @ObfuscatedName("ja.o()Lgw;")
    public class186 method4823() {
        return this.method4845((class186) null);
    }

    @ObfuscatedName("ja.u(Lgw;)Lgw;")
    public class186 method4845(class186 arg0) {
        class186 var2;
        if (arg0 == null) {
            var2 = this.field3602.field2140;
        } else {
            var2 = arg0;
        }
        if (this.field3602 == var2) {
            this.field3603 = null;
            return null;
        } else {
            this.field3603 = var2.field2140;
            return var2;
        }
    }

    @ObfuscatedName("ja.g()Lgw;")
    public class186 method4825() {
        class186 var1 = this.field3603;
        if (this.field3602 == var1) {
            this.field3603 = null;
            return null;
        } else {
            this.field3603 = var1.field2140;
            return var1;
        }
    }

    @ObfuscatedName("ja.l()Z")
    public boolean method4834() {
        return this.field3602.field2140 == this.field3602;
    }

    public Iterator iterator() {
        return new class276(this);
    }
}
