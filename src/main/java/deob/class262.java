package deob;

@ObfuscatedName("jb")
public class class262 {

    @ObfuscatedName("jb.a")
    public class181 field3528 = new class181();

    @ObfuscatedName("jb.t")
    public class181 field3527;

    public class262() {
        this.field3528.field2090 = this.field3528;
        this.field3528.field2089 = this.field3528;
    }

    @ObfuscatedName("jb.a()V")
    public void method4575() {
        while (true) {
            class181 var1 = this.field3528.field2090;
            if (this.field3528 == var1) {
                this.field3527 = null;
                return;
            }
            var1.method3386();
        }
    }

    @ObfuscatedName("jb.t(Lfd;)V")
    public void method4576(class181 arg0) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        arg0.field2089 = this.field3528.field2089;
        arg0.field2090 = this.field3528;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
    }

    @ObfuscatedName("jb.n(Lfd;)V")
    public void method4577(class181 arg0) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        arg0.field2089 = this.field3528;
        arg0.field2090 = this.field3528.field2090;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
    }

    @ObfuscatedName("jb.q(Lfd;Lfd;)V")
    public static void method4585(class181 arg0, class181 arg1) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        arg0.field2089 = arg1.field2089;
        arg0.field2090 = arg1;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
    }

    @ObfuscatedName("jb.v()Lfd;")
    public class181 method4579() {
        class181 var1 = this.field3528.field2090;
        if (this.field3528 == var1) {
            return null;
        } else {
            var1.method3386();
            return var1;
        }
    }

    @ObfuscatedName("jb.l()Lfd;")
    public class181 method4580() {
        class181 var1 = this.field3528.field2089;
        if (this.field3528 == var1) {
            return null;
        } else {
            var1.method3386();
            return var1;
        }
    }

    @ObfuscatedName("jb.c()Lfd;")
    public class181 method4581() {
        class181 var1 = this.field3528.field2090;
        if (this.field3528 == var1) {
            this.field3527 = null;
            return null;
        } else {
            this.field3527 = var1.field2090;
            return var1;
        }
    }

    @ObfuscatedName("jb.o()Lfd;")
    public class181 method4582() {
        class181 var1 = this.field3528.field2089;
        if (this.field3528 == var1) {
            this.field3527 = null;
            return null;
        } else {
            this.field3527 = var1.field2089;
            return var1;
        }
    }

    @ObfuscatedName("jb.i()Lfd;")
    public class181 method4589() {
        class181 var1 = this.field3527;
        if (this.field3528 == var1) {
            this.field3527 = null;
            return null;
        } else {
            this.field3527 = var1.field2090;
            return var1;
        }
    }

    @ObfuscatedName("jb.d()Lfd;")
    public class181 method4584() {
        class181 var1 = this.field3527;
        if (this.field3528 == var1) {
            this.field3527 = null;
            return null;
        } else {
            this.field3527 = var1.field2089;
            return var1;
        }
    }
}
