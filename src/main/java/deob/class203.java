package deob;

@ObfuscatedName("ga")
public class class203 {

    @ObfuscatedName("ga.k")
    public class212 field3150 = new class212();

    @ObfuscatedName("ga.q")
    public class212 field3149;

    public class203() {
        this.field3150.field3167 = this.field3150;
        this.field3150.field3168 = this.field3150;
    }

    @ObfuscatedName("ga.k()V")
    public void method3602() {
        while (true) {
            class212 var1 = this.field3150.field3167;
            if (this.field3150 == var1) {
                this.field3149 = null;
                return;
            }
            var1.method3703();
        }
    }

    @ObfuscatedName("ga.q(Lhk;)V")
    public void method3596(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        arg0.field3168 = this.field3150.field3168;
        arg0.field3167 = this.field3150;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
    }

    @ObfuscatedName("ga.f(Lhk;)V")
    public void method3597(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        arg0.field3168 = this.field3150;
        arg0.field3167 = this.field3150.field3167;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
    }

    @ObfuscatedName("ga.c(Lhk;Lhk;)V")
    public static void method3606(class212 arg0, class212 arg1) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        arg0.field3168 = arg1.field3168;
        arg0.field3167 = arg1;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
    }

    @ObfuscatedName("ga.v()Lhk;")
    public class212 method3612() {
        class212 var1 = this.field3150.field3167;
        if (this.field3150 == var1) {
            return null;
        } else {
            var1.method3703();
            return var1;
        }
    }

    @ObfuscatedName("ga.j()Lhk;")
    public class212 method3600() {
        class212 var1 = this.field3150.field3168;
        if (this.field3150 == var1) {
            return null;
        } else {
            var1.method3703();
            return var1;
        }
    }

    @ObfuscatedName("ga.m()Lhk;")
    public class212 method3616() {
        class212 var1 = this.field3150.field3167;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3167;
            return var1;
        }
    }

    @ObfuscatedName("ga.y()Lhk;")
    public class212 method3604() {
        class212 var1 = this.field3150.field3168;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3168;
            return var1;
        }
    }

    @ObfuscatedName("ga.u()Lhk;")
    public class212 method3603() {
        class212 var1 = this.field3149;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3167;
            return var1;
        }
    }

    @ObfuscatedName("ga.h()Lhk;")
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
