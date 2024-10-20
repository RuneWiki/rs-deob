package deob;

@ObfuscatedName("gk")
public class class200 {

    @ObfuscatedName("gk.j")
    public class209 field3108 = new class209();

    @ObfuscatedName("gk.h")
    public class209 field3107;

    public class200() {
        this.field3108.field3124 = this.field3108;
        this.field3108.field3125 = this.field3108;
    }

    @ObfuscatedName("gk.j()V")
    public void method3545() {
        while (true) {
            class209 var1 = this.field3108.field3124;
            if (this.field3108 == var1) {
                this.field3107 = null;
                return;
            }
            var1.method3639();
        }
    }

    @ObfuscatedName("gk.h(Lhc;)V")
    public void method3535(class209 arg0) {
        if (arg0.field3125 != null) {
            arg0.method3639();
        }
        arg0.field3125 = this.field3108.field3125;
        arg0.field3124 = this.field3108;
        arg0.field3125.field3124 = arg0;
        arg0.field3124.field3125 = arg0;
    }

    @ObfuscatedName("gk.m(Lhc;)V")
    public void method3536(class209 arg0) {
        if (arg0.field3125 != null) {
            arg0.method3639();
        }
        arg0.field3125 = this.field3108;
        arg0.field3124 = this.field3108.field3124;
        arg0.field3125.field3124 = arg0;
        arg0.field3124.field3125 = arg0;
    }

    @ObfuscatedName("gk.z(Lhc;Lhc;)V")
    public static void method3537(class209 arg0, class209 arg1) {
        if (arg0.field3125 != null) {
            arg0.method3639();
        }
        arg0.field3125 = arg1.field3125;
        arg0.field3124 = arg1;
        arg0.field3125.field3124 = arg0;
        arg0.field3124.field3125 = arg0;
    }

    @ObfuscatedName("gk.x()Lhc;")
    public class209 method3538() {
        class209 var1 = this.field3108.field3124;
        if (this.field3108 == var1) {
            return null;
        } else {
            var1.method3639();
            return var1;
        }
    }

    @ObfuscatedName("gk.e()Lhc;")
    public class209 method3534() {
        class209 var1 = this.field3108.field3125;
        if (this.field3108 == var1) {
            return null;
        } else {
            var1.method3639();
            return var1;
        }
    }

    @ObfuscatedName("gk.i()Lhc;")
    public class209 method3540() {
        class209 var1 = this.field3108.field3124;
        if (this.field3108 == var1) {
            this.field3107 = null;
            return null;
        } else {
            this.field3107 = var1.field3124;
            return var1;
        }
    }

    @ObfuscatedName("gk.c()Lhc;")
    public class209 method3541() {
        class209 var1 = this.field3108.field3125;
        if (this.field3108 == var1) {
            this.field3107 = null;
            return null;
        } else {
            this.field3107 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("gk.n()Lhc;")
    public class209 method3533() {
        class209 var1 = this.field3107;
        if (this.field3108 == var1) {
            this.field3107 = null;
            return null;
        } else {
            this.field3107 = var1.field3124;
            return var1;
        }
    }

    @ObfuscatedName("gk.l()Lhc;")
    public class209 method3543() {
        class209 var1 = this.field3107;
        if (this.field3108 == var1) {
            this.field3107 = null;
            return null;
        } else {
            this.field3107 = var1.field3125;
            return var1;
        }
    }
}
