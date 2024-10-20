package deob;

@ObfuscatedName("gf")
public class class203 {

    @ObfuscatedName("gf.l")
    public class212 field3158 = new class212();

    @ObfuscatedName("gf.g")
    public class212 field3157;

    public class203() {
        this.field3158.field3174 = this.field3158;
        this.field3158.field3175 = this.field3158;
    }

    @ObfuscatedName("gf.l()V")
    public void method3744() {
        while (true) {
            class212 var1 = this.field3158.field3174;
            if (this.field3158 == var1) {
                this.field3157 = null;
                return;
            }
            var1.method3815();
        }
    }

    @ObfuscatedName("gf.g(Lhb;)V")
    public void method3711(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        arg0.field3175 = this.field3158.field3175;
        arg0.field3174 = this.field3158;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gf.r(Lhb;)V")
    public void method3712(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        arg0.field3175 = this.field3158;
        arg0.field3174 = this.field3158.field3174;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gf.e(Lhb;Lhb;)V")
    public static void method3746(class212 arg0, class212 arg1) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        arg0.field3175 = arg1.field3175;
        arg0.field3174 = arg1;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gf.h()Lhb;")
    public class212 method3714() {
        class212 var1 = this.field3158.field3174;
        if (this.field3158 == var1) {
            return null;
        } else {
            var1.method3815();
            return var1;
        }
    }

    @ObfuscatedName("gf.s()Lhb;")
    public class212 method3715() {
        class212 var1 = this.field3158.field3175;
        if (this.field3158 == var1) {
            return null;
        } else {
            var1.method3815();
            return var1;
        }
    }

    @ObfuscatedName("gf.k()Lhb;")
    public class212 method3728() {
        class212 var1 = this.field3158.field3174;
        if (this.field3158 == var1) {
            this.field3157 = null;
            return null;
        } else {
            this.field3157 = var1.field3174;
            return var1;
        }
    }

    @ObfuscatedName("gf.u()Lhb;")
    public class212 method3717() {
        class212 var1 = this.field3158.field3175;
        if (this.field3158 == var1) {
            this.field3157 = null;
            return null;
        } else {
            this.field3157 = var1.field3175;
            return var1;
        }
    }

    @ObfuscatedName("gf.n()Lhb;")
    public class212 method3718() {
        class212 var1 = this.field3157;
        if (this.field3158 == var1) {
            this.field3157 = null;
            return null;
        } else {
            this.field3157 = var1.field3174;
            return var1;
        }
    }

    @ObfuscatedName("gf.b()Lhb;")
    public class212 method3719() {
        class212 var1 = this.field3157;
        if (this.field3158 == var1) {
            this.field3157 = null;
            return null;
        } else {
            this.field3157 = var1.field3175;
            return var1;
        }
    }
}
