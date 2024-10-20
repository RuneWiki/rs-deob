package deob;

import java.util.Iterator;

@ObfuscatedName("ji")
public class class266 implements Iterable {

    @ObfuscatedName("ji.f")
    public class183 field3512 = new class183();

    @ObfuscatedName("ji.i")
    public class183 field3513;

    public class266() {
        this.field3512.field2314 = this.field3512;
        this.field3512.field2316 = this.field3512;
    }

    @ObfuscatedName("ji.f()V")
    public void method4599() {
        while (this.field3512.field2314 != this.field3512) {
            this.field3512.field2314.method3286();
        }
    }

    @ObfuscatedName("ji.i(Lgw;)V")
    public void method4600(class183 arg0) {
        if (arg0.field2316 != null) {
            arg0.method3286();
        }
        arg0.field2316 = this.field3512.field2316;
        arg0.field2314 = this.field3512;
        arg0.field2316.field2314 = arg0;
        arg0.field2314.field2316 = arg0;
    }

    @ObfuscatedName("ji.y(Lgw;Lgw;)V")
    public static void method4609(class183 arg0, class183 arg1) {
        if (arg0.field2316 != null) {
            arg0.method3286();
        }
        arg0.field2316 = arg1;
        arg0.field2314 = arg1.field2314;
        arg0.field2316.field2314 = arg0;
        arg0.field2314.field2316 = arg0;
    }

    @ObfuscatedName("ji.w()Lgw;")
    public class183 method4602() {
        class183 var1 = this.field3512.field2314;
        if (this.field3512 == var1) {
            return null;
        } else {
            var1.method3286();
            return var1;
        }
    }

    @ObfuscatedName("ji.p()Lgw;")
    public class183 method4603() {
        return this.method4612((class183) null);
    }

    @ObfuscatedName("ji.b(Lgw;)Lgw;")
    public class183 method4612(class183 arg0) {
        class183 var2;
        if (arg0 == null) {
            var2 = this.field3512.field2314;
        } else {
            var2 = arg0;
        }
        if (this.field3512 == var2) {
            this.field3513 = null;
            return null;
        } else {
            this.field3513 = var2.field2314;
            return var2;
        }
    }

    @ObfuscatedName("ji.e()Lgw;")
    public class183 method4604() {
        class183 var1 = this.field3513;
        if (this.field3512 == var1) {
            this.field3513 = null;
            return null;
        } else {
            this.field3513 = var1.field2314;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class264(this);
    }
}
