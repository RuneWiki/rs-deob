package deob;

import java.util.Iterator;

@ObfuscatedName("jw")
public class class277 implements Iterable {

    @ObfuscatedName("jw.f")
    public class346 field3393 = new class346();

    @ObfuscatedName("jw.o")
    public class346 field3394;

    public class277() {
        this.field3393.field3936 = this.field3393;
        this.field3393.field3934 = this.field3393;
    }

    @ObfuscatedName("jw.f()V")
    public void method4296() {
        while (this.field3393.field3936 != this.field3393) {
            this.field3393.field3936.method5349();
        }
    }

    @ObfuscatedName("jw.o(Lmz;)V")
    public void method4297(class346 arg0) {
        if (arg0.field3934 != null) {
            arg0.method5349();
        }
        arg0.field3934 = this.field3393.field3934;
        arg0.field3936 = this.field3393;
        arg0.field3934.field3936 = arg0;
        arg0.field3936.field3934 = arg0;
    }

    @ObfuscatedName("jw.u(Lmz;Lmz;)V")
    public static void method4309(class346 arg0, class346 arg1) {
        if (arg0.field3934 != null) {
            arg0.method5349();
        }
        arg0.field3934 = arg1;
        arg0.field3936 = arg1.field3936;
        arg0.field3934.field3936 = arg0;
        arg0.field3936.field3934 = arg0;
    }

    @ObfuscatedName("jw.p()Lmz;")
    public class346 method4299() {
        class346 var1 = this.field3393.field3936;
        if (this.field3393 == var1) {
            return null;
        } else {
            var1.method5349();
            return var1;
        }
    }

    @ObfuscatedName("jw.b()Lmz;")
    public class346 method4300() {
        return this.method4301((class346) null);
    }

    @ObfuscatedName("jw.e(Lmz;)Lmz;")
    public class346 method4301(class346 arg0) {
        class346 var2;
        if (arg0 == null) {
            var2 = this.field3393.field3936;
        } else {
            var2 = arg0;
        }
        if (this.field3393 == var2) {
            this.field3394 = null;
            return null;
        } else {
            this.field3394 = var2.field3936;
            return var2;
        }
    }

    @ObfuscatedName("jw.k()Lmz;")
    public class346 method4302() {
        class346 var1 = this.field3394;
        if (this.field3393 == var1) {
            this.field3394 = null;
            return null;
        } else {
            this.field3394 = var1.field3936;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class276(this);
    }
}
