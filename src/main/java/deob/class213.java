package deob;

@ObfuscatedName("hv")
public class class213 {

    @ObfuscatedName("hv.a")
    public class212 field2514 = new class212();

    @ObfuscatedName("hv.s")
    public class212 field2513;

    public class213() {
        this.field2514.field2511 = this.field2514;
        this.field2514.field2510 = this.field2514;
    }

    @ObfuscatedName("hv.a()V")
    public void method3996() {
        while (true) {
            class212 var1 = this.field2514.field2511;
            if (this.field2514 == var1) {
                this.field2513 = null;
                return;
            }
            var1.method3960();
        }
    }

    @ObfuscatedName("hv.s(Lhy;)V")
    public void method3966(class212 arg0) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        arg0.field2510 = this.field2514.field2510;
        arg0.field2511 = this.field2514;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
    }

    @ObfuscatedName("hv.g(Lhy;)V")
    public void method3967(class212 arg0) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        arg0.field2510 = this.field2514;
        arg0.field2511 = this.field2514.field2511;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
    }

    @ObfuscatedName("hv.x(Lhy;Lhy;)V")
    public static void method3973(class212 arg0, class212 arg1) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        arg0.field2510 = arg1.field2510;
        arg0.field2511 = arg1;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
    }

    @ObfuscatedName("hv.h()Lhy;")
    public class212 method3969() {
        class212 var1 = this.field2514.field2511;
        if (this.field2514 == var1) {
            return null;
        } else {
            var1.method3960();
            return var1;
        }
    }

    @ObfuscatedName("hv.f()Lhy;")
    public class212 method3970() {
        class212 var1 = this.field2514.field2510;
        if (this.field2514 == var1) {
            return null;
        } else {
            var1.method3960();
            return var1;
        }
    }

    @ObfuscatedName("hv.p()Lhy;")
    public class212 method3990() {
        class212 var1 = this.field2514.field2511;
        if (this.field2514 == var1) {
            this.field2513 = null;
            return null;
        } else {
            this.field2513 = var1.field2511;
            return var1;
        }
    }

    @ObfuscatedName("hv.m()Lhy;")
    public class212 method3972() {
        class212 var1 = this.field2514.field2510;
        if (this.field2514 == var1) {
            this.field2513 = null;
            return null;
        } else {
            this.field2513 = var1.field2510;
            return var1;
        }
    }

    @ObfuscatedName("hv.q()Lhy;")
    public class212 method3984() {
        class212 var1 = this.field2513;
        if (this.field2514 == var1) {
            this.field2513 = null;
            return null;
        } else {
            this.field2513 = var1.field2511;
            return var1;
        }
    }

    @ObfuscatedName("hv.b()Lhy;")
    public class212 method3989() {
        class212 var1 = this.field2513;
        if (this.field2514 == var1) {
            this.field2513 = null;
            return null;
        } else {
            this.field2513 = var1.field2510;
            return var1;
        }
    }
}
