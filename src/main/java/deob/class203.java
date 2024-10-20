package deob;

@ObfuscatedName("ge")
public class class203 {

    @ObfuscatedName("ge.x")
    public class212 field3157 = new class212();

    @ObfuscatedName("ge.r")
    public class212 field3156;

    public class203() {
        this.field3157.field3175 = this.field3157;
        this.field3157.field3173 = this.field3157;
    }

    @ObfuscatedName("ge.x()V")
    public void method3605() {
        while (true) {
            class212 var1 = this.field3157.field3175;
            if (this.field3157 == var1) {
                this.field3156 = null;
                return;
            }
            var1.method3695();
        }
    }

    @ObfuscatedName("ge.r(Lhn;)V")
    public void method3594(class212 arg0) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        arg0.field3173 = this.field3157.field3173;
        arg0.field3175 = this.field3157;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
    }

    @ObfuscatedName("ge.j(Lhn;)V")
    public void method3596(class212 arg0) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        arg0.field3173 = this.field3157;
        arg0.field3175 = this.field3157.field3175;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
    }

    @ObfuscatedName("ge.z(Lhn;Lhn;)V")
    public static void method3597(class212 arg0, class212 arg1) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        arg0.field3173 = arg1.field3173;
        arg0.field3175 = arg1;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
    }

    @ObfuscatedName("ge.i()Lhn;")
    public class212 method3598() {
        class212 var1 = this.field3157.field3175;
        if (this.field3157 == var1) {
            return null;
        } else {
            var1.method3695();
            return var1;
        }
    }

    @ObfuscatedName("ge.b()Lhn;")
    public class212 method3599() {
        class212 var1 = this.field3157.field3173;
        if (this.field3157 == var1) {
            return null;
        } else {
            var1.method3695();
            return var1;
        }
    }

    @ObfuscatedName("ge.l()Lhn;")
    public class212 method3600() {
        class212 var1 = this.field3157.field3175;
        if (this.field3157 == var1) {
            this.field3156 = null;
            return null;
        } else {
            this.field3156 = var1.field3175;
            return var1;
        }
    }

    @ObfuscatedName("ge.m()Lhn;")
    public class212 method3617() {
        class212 var1 = this.field3157.field3173;
        if (this.field3157 == var1) {
            this.field3156 = null;
            return null;
        } else {
            this.field3156 = var1.field3173;
            return var1;
        }
    }

    @ObfuscatedName("ge.p()Lhn;")
    public class212 method3602() {
        class212 var1 = this.field3156;
        if (this.field3157 == var1) {
            this.field3156 = null;
            return null;
        } else {
            this.field3156 = var1.field3175;
            return var1;
        }
    }

    @ObfuscatedName("ge.f()Lhn;")
    public class212 method3603() {
        class212 var1 = this.field3156;
        if (this.field3157 == var1) {
            this.field3156 = null;
            return null;
        } else {
            this.field3156 = var1.field3173;
            return var1;
        }
    }
}
