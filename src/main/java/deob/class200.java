package deob;

@ObfuscatedName("gu")
public class class200 {

    @ObfuscatedName("gu.e")
    public class209 field3100 = new class209();

    @ObfuscatedName("gu.w")
    public class209 field3099;

    public class200() {
        this.field3100.field3115 = this.field3100;
        this.field3100.field3117 = this.field3100;
    }

    @ObfuscatedName("gu.e()V")
    public void method3538() {
        while (true) {
            class209 var1 = this.field3100.field3115;
            if (this.field3100 == var1) {
                this.field3099 = null;
                return;
            }
            var1.method3632();
        }
    }

    @ObfuscatedName("gu.w(Lhd;)V")
    public void method3553(class209 arg0) {
        if (arg0.field3117 != null) {
            arg0.method3632();
        }
        arg0.field3117 = this.field3100.field3117;
        arg0.field3115 = this.field3100;
        arg0.field3117.field3115 = arg0;
        arg0.field3115.field3117 = arg0;
    }

    @ObfuscatedName("gu.f(Lhd;)V")
    public void method3540(class209 arg0) {
        if (arg0.field3117 != null) {
            arg0.method3632();
        }
        arg0.field3117 = this.field3100;
        arg0.field3115 = this.field3100.field3115;
        arg0.field3117.field3115 = arg0;
        arg0.field3115.field3117 = arg0;
    }

    @ObfuscatedName("gu.s(Lhd;Lhd;)V")
    public static void method3541(class209 arg0, class209 arg1) {
        if (arg0.field3117 != null) {
            arg0.method3632();
        }
        arg0.field3117 = arg1.field3117;
        arg0.field3115 = arg1;
        arg0.field3117.field3115 = arg0;
        arg0.field3115.field3117 = arg0;
    }

    @ObfuscatedName("gu.p()Lhd;")
    public class209 method3542() {
        class209 var1 = this.field3100.field3115;
        if (this.field3100 == var1) {
            return null;
        } else {
            var1.method3632();
            return var1;
        }
    }

    @ObfuscatedName("gu.h()Lhd;")
    public class209 method3543() {
        class209 var1 = this.field3100.field3117;
        if (this.field3100 == var1) {
            return null;
        } else {
            var1.method3632();
            return var1;
        }
    }

    @ObfuscatedName("gu.g()Lhd;")
    public class209 method3544() {
        class209 var1 = this.field3100.field3115;
        if (this.field3100 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3115;
            return var1;
        }
    }

    @ObfuscatedName("gu.a()Lhd;")
    public class209 method3537() {
        class209 var1 = this.field3100.field3117;
        if (this.field3100 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3117;
            return var1;
        }
    }

    @ObfuscatedName("gu.r()Lhd;")
    public class209 method3546() {
        class209 var1 = this.field3099;
        if (this.field3100 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3115;
            return var1;
        }
    }

    @ObfuscatedName("gu.k()Lhd;")
    public class209 method3563() {
        class209 var1 = this.field3099;
        if (this.field3100 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3117;
            return var1;
        }
    }
}
