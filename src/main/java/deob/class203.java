package deob;

@ObfuscatedName("gz")
public class class203 {

    @ObfuscatedName("gz.i")
    public class212 field3157 = new class212();

    @ObfuscatedName("gz.h")
    public class212 field3158;

    public class203() {
        this.field3157.field3174 = this.field3157;
        this.field3157.field3175 = this.field3157;
    }

    @ObfuscatedName("gz.i()V")
    public void method3615() {
        while (true) {
            class212 var1 = this.field3157.field3174;
            if (this.field3157 == var1) {
                this.field3158 = null;
                return;
            }
            var1.method3706();
        }
    }

    @ObfuscatedName("gz.h(Lhk;)V")
    public void method3617(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        arg0.field3175 = this.field3157.field3175;
        arg0.field3174 = this.field3157;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gz.e(Lhk;)V")
    public void method3593(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        arg0.field3175 = this.field3157;
        arg0.field3174 = this.field3157.field3174;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gz.g(Lhk;Lhk;)V")
    public static void method3594(class212 arg0, class212 arg1) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        arg0.field3175 = arg1.field3175;
        arg0.field3174 = arg1;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gz.n()Lhk;")
    public class212 method3611() {
        class212 var1 = this.field3157.field3174;
        if (this.field3157 == var1) {
            return null;
        } else {
            var1.method3706();
            return var1;
        }
    }

    @ObfuscatedName("gz.u()Lhk;")
    public class212 method3596() {
        class212 var1 = this.field3157.field3175;
        if (this.field3157 == var1) {
            return null;
        } else {
            var1.method3706();
            return var1;
        }
    }

    @ObfuscatedName("gz.d()Lhk;")
    public class212 method3597() {
        class212 var1 = this.field3157.field3174;
        if (this.field3157 == var1) {
            this.field3158 = null;
            return null;
        } else {
            this.field3158 = var1.field3174;
            return var1;
        }
    }

    @ObfuscatedName("gz.l()Lhk;")
    public class212 method3598() {
        class212 var1 = this.field3157.field3175;
        if (this.field3157 == var1) {
            this.field3158 = null;
            return null;
        } else {
            this.field3158 = var1.field3175;
            return var1;
        }
    }

    @ObfuscatedName("gz.m()Lhk;")
    public class212 method3599() {
        class212 var1 = this.field3158;
        if (this.field3157 == var1) {
            this.field3158 = null;
            return null;
        } else {
            this.field3158 = var1.field3174;
            return var1;
        }
    }

    @ObfuscatedName("gz.j()Lhk;")
    public class212 method3600() {
        class212 var1 = this.field3158;
        if (this.field3157 == var1) {
            this.field3158 = null;
            return null;
        } else {
            this.field3158 = var1.field3175;
            return var1;
        }
    }
}
