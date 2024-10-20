package deob;

@ObfuscatedName("ji")
public class class273 {

    @ObfuscatedName("ji.n")
    public class190 field3572 = new class190();

    @ObfuscatedName("ji.v")
    public class190 field3571;

    public class273() {
        this.field3572.field2140 = this.field3572;
        this.field3572.field2139 = this.field3572;
    }

    @ObfuscatedName("ji.n()V")
    public void method4709() {
        while (true) {
            class190 var1 = this.field3572.field2140;
            if (this.field3572 == var1) {
                this.field3571 = null;
                return;
            }
            var1.method3486();
        }
    }

    @ObfuscatedName("ji.v(Lga;)V")
    public void method4699(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        arg0.field2139 = this.field3572.field2139;
        arg0.field2140 = this.field3572;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
    }

    @ObfuscatedName("ji.d(Lga;)V")
    public void method4700(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        arg0.field2139 = this.field3572;
        arg0.field2140 = this.field3572.field2140;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
    }

    @ObfuscatedName("ji.c(Lga;Lga;)V")
    public static void method4701(class190 arg0, class190 arg1) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        arg0.field2139 = arg1.field2139;
        arg0.field2140 = arg1;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
    }

    @ObfuscatedName("ji.y()Lga;")
    public class190 method4702() {
        class190 var1 = this.field3572.field2140;
        if (this.field3572 == var1) {
            return null;
        } else {
            var1.method3486();
            return var1;
        }
    }

    @ObfuscatedName("ji.h()Lga;")
    public class190 method4718() {
        class190 var1 = this.field3572.field2139;
        if (this.field3572 == var1) {
            return null;
        } else {
            var1.method3486();
            return var1;
        }
    }

    @ObfuscatedName("ji.z()Lga;")
    public class190 method4721() {
        class190 var1 = this.field3572.field2140;
        if (this.field3572 == var1) {
            this.field3571 = null;
            return null;
        } else {
            this.field3571 = var1.field2140;
            return var1;
        }
    }

    @ObfuscatedName("ji.e()Lga;")
    public class190 method4705() {
        class190 var1 = this.field3572.field2139;
        if (this.field3572 == var1) {
            this.field3571 = null;
            return null;
        } else {
            this.field3571 = var1.field2139;
            return var1;
        }
    }

    @ObfuscatedName("ji.q()Lga;")
    public class190 method4706() {
        class190 var1 = this.field3571;
        if (this.field3572 == var1) {
            this.field3571 = null;
            return null;
        } else {
            this.field3571 = var1.field2140;
            return var1;
        }
    }

    @ObfuscatedName("ji.l()Lga;")
    public class190 method4698() {
        class190 var1 = this.field3571;
        if (this.field3572 == var1) {
            this.field3571 = null;
            return null;
        } else {
            this.field3571 = var1.field2139;
            return var1;
        }
    }
}
