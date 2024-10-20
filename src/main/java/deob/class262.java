package deob;

@ObfuscatedName("jh")
public class class262 {

    @ObfuscatedName("jh.q")
    public class181 field3541 = new class181();

    @ObfuscatedName("jh.w")
    public class181 field3542;

    public class262() {
        this.field3541.field2115 = this.field3541;
        this.field3541.field2113 = this.field3541;
    }

    @ObfuscatedName("jh.q()V")
    public void method4501() {
        while (true) {
            class181 var1 = this.field3541.field2115;
            if (this.field3541 == var1) {
                this.field3542 = null;
                return;
            }
            var1.method3286();
        }
    }

    @ObfuscatedName("jh.w(Lfw;)V")
    public void method4532(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        arg0.field2113 = this.field3541.field2113;
        arg0.field2115 = this.field3541;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
    }

    @ObfuscatedName("jh.e(Lfw;)V")
    public void method4503(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        arg0.field2113 = this.field3541;
        arg0.field2115 = this.field3541.field2115;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
    }

    @ObfuscatedName("jh.p(Lfw;Lfw;)V")
    public static void method4504(class181 arg0, class181 arg1) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        arg0.field2113 = arg1.field2113;
        arg0.field2115 = arg1;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
    }

    @ObfuscatedName("jh.k()Lfw;")
    public class181 method4515() {
        class181 var1 = this.field3541.field2115;
        if (this.field3541 == var1) {
            return null;
        } else {
            var1.method3286();
            return var1;
        }
    }

    @ObfuscatedName("jh.l()Lfw;")
    public class181 method4506() {
        class181 var1 = this.field3541.field2113;
        if (this.field3541 == var1) {
            return null;
        } else {
            var1.method3286();
            return var1;
        }
    }

    @ObfuscatedName("jh.b()Lfw;")
    public class181 method4507() {
        class181 var1 = this.field3541.field2115;
        if (this.field3541 == var1) {
            this.field3542 = null;
            return null;
        } else {
            this.field3542 = var1.field2115;
            return var1;
        }
    }

    @ObfuscatedName("jh.i()Lfw;")
    public class181 method4508() {
        class181 var1 = this.field3541.field2113;
        if (this.field3541 == var1) {
            this.field3542 = null;
            return null;
        } else {
            this.field3542 = var1.field2113;
            return var1;
        }
    }

    @ObfuscatedName("jh.c()Lfw;")
    public class181 method4509() {
        class181 var1 = this.field3542;
        if (this.field3541 == var1) {
            this.field3542 = null;
            return null;
        } else {
            this.field3542 = var1.field2115;
            return var1;
        }
    }

    @ObfuscatedName("jh.u()Lfw;")
    public class181 method4502() {
        class181 var1 = this.field3542;
        if (this.field3541 == var1) {
            this.field3542 = null;
            return null;
        } else {
            this.field3542 = var1.field2113;
            return var1;
        }
    }
}
