package deob;

@ObfuscatedName("gu")
public class class199 {

    @ObfuscatedName("gu.h")
    public class208 field3085 = new class208();

    @ObfuscatedName("gu.m")
    public class208 field3084;

    public class199() {
        this.field3085.field3101 = this.field3085;
        this.field3085.field3102 = this.field3085;
    }

    @ObfuscatedName("gu.h()V")
    public void method3540() {
        while (true) {
            class208 var1 = this.field3085.field3101;
            if (this.field3085 == var1) {
                this.field3084 = null;
                return;
            }
            var1.method3625();
        }
    }

    @ObfuscatedName("gu.m(Lgr;)V")
    public void method3541(class208 arg0) {
        if (arg0.field3102 != null) {
            arg0.method3625();
        }
        arg0.field3102 = this.field3085.field3102;
        arg0.field3101 = this.field3085;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
    }

    @ObfuscatedName("gu.i(Lgr;)V")
    public void method3542(class208 arg0) {
        if (arg0.field3102 != null) {
            arg0.method3625();
        }
        arg0.field3102 = this.field3085;
        arg0.field3101 = this.field3085.field3101;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
    }

    @ObfuscatedName("gu.q(Lgr;Lgr;)V")
    public static void method3558(class208 arg0, class208 arg1) {
        if (arg0.field3102 != null) {
            arg0.method3625();
        }
        arg0.field3102 = arg1.field3102;
        arg0.field3101 = arg1;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
    }

    @ObfuscatedName("gu.p()Lgr;")
    public class208 method3543() {
        class208 var1 = this.field3085.field3101;
        if (this.field3085 == var1) {
            return null;
        } else {
            var1.method3625();
            return var1;
        }
    }

    @ObfuscatedName("gu.c()Lgr;")
    public class208 method3562() {
        class208 var1 = this.field3085.field3102;
        if (this.field3085 == var1) {
            return null;
        } else {
            var1.method3625();
            return var1;
        }
    }

    @ObfuscatedName("gu.f()Lgr;")
    public class208 method3546() {
        class208 var1 = this.field3085.field3101;
        if (this.field3085 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3101;
            return var1;
        }
    }

    @ObfuscatedName("gu.y()Lgr;")
    public class208 method3547() {
        class208 var1 = this.field3085.field3102;
        if (this.field3085 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3102;
            return var1;
        }
    }

    @ObfuscatedName("gu.w()Lgr;")
    public class208 method3548() {
        class208 var1 = this.field3084;
        if (this.field3085 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3101;
            return var1;
        }
    }

    @ObfuscatedName("gu.l()Lgr;")
    public class208 method3549() {
        class208 var1 = this.field3084;
        if (this.field3085 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3102;
            return var1;
        }
    }
}
