package deob;

@ObfuscatedName("gb")
public class class203 {

    @ObfuscatedName("gb.s")
    public class212 field3150 = new class212();

    @ObfuscatedName("gb.z")
    public class212 field3149;

    public class203() {
        this.field3150.field3166 = this.field3150;
        this.field3150.field3168 = this.field3150;
    }

    @ObfuscatedName("gb.s()V")
    public void method3582() {
        while (true) {
            class212 var1 = this.field3150.field3166;
            if (this.field3150 == var1) {
                this.field3149 = null;
                return;
            }
            var1.method3699();
        }
    }

    @ObfuscatedName("gb.z(Lhg;)V")
    public void method3581(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        arg0.field3168 = this.field3150.field3168;
        arg0.field3166 = this.field3150;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gb.t(Lhg;)V")
    public void method3591(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        arg0.field3168 = this.field3150;
        arg0.field3166 = this.field3150.field3166;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gb.y(Lhg;Lhg;)V")
    public static void method3594(class212 arg0, class212 arg1) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        arg0.field3168 = arg1.field3168;
        arg0.field3166 = arg1;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gb.p()Lhg;")
    public class212 method3586() {
        class212 var1 = this.field3150.field3166;
        if (this.field3150 == var1) {
            return null;
        } else {
            var1.method3699();
            return var1;
        }
    }

    @ObfuscatedName("gb.g()Lhg;")
    public class212 method3587() {
        class212 var1 = this.field3150.field3168;
        if (this.field3150 == var1) {
            return null;
        } else {
            var1.method3699();
            return var1;
        }
    }

    @ObfuscatedName("gb.m()Lhg;")
    public class212 method3588() {
        class212 var1 = this.field3150.field3166;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3166;
            return var1;
        }
    }

    @ObfuscatedName("gb.f()Lhg;")
    public class212 method3603() {
        class212 var1 = this.field3150.field3168;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3168;
            return var1;
        }
    }

    @ObfuscatedName("gb.k()Lhg;")
    public class212 method3590() {
        class212 var1 = this.field3149;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3166;
            return var1;
        }
    }

    @ObfuscatedName("gb.h()Lhg;")
    public class212 method3608() {
        class212 var1 = this.field3149;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3168;
            return var1;
        }
    }
}
