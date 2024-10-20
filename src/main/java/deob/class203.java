package deob;

@ObfuscatedName("gh")
public class class203 {

    @ObfuscatedName("gh.m")
    public class212 field3151 = new class212();

    @ObfuscatedName("gh.w")
    public class212 field3150;

    public class203() {
        this.field3151.field3169 = this.field3151;
        this.field3151.field3167 = this.field3151;
    }

    @ObfuscatedName("gh.m()V")
    public void method3632() {
        while (true) {
            class212 var1 = this.field3151.field3169;
            if (this.field3151 == var1) {
                this.field3150 = null;
                return;
            }
            var1.method3729();
        }
    }

    @ObfuscatedName("gh.w(Lhf;)V")
    public void method3616(class212 arg0) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        arg0.field3167 = this.field3151.field3167;
        arg0.field3169 = this.field3151;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
    }

    @ObfuscatedName("gh.e(Lhf;)V")
    public void method3617(class212 arg0) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        arg0.field3167 = this.field3151;
        arg0.field3169 = this.field3151.field3169;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
    }

    @ObfuscatedName("gh.o(Lhf;Lhf;)V")
    public static void method3618(class212 arg0, class212 arg1) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        arg0.field3167 = arg1.field3167;
        arg0.field3169 = arg1;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
    }

    @ObfuscatedName("gh.g()Lhf;")
    public class212 method3619() {
        class212 var1 = this.field3151.field3169;
        if (this.field3151 == var1) {
            return null;
        } else {
            var1.method3729();
            return var1;
        }
    }

    @ObfuscatedName("gh.l()Lhf;")
    public class212 method3620() {
        class212 var1 = this.field3151.field3167;
        if (this.field3151 == var1) {
            return null;
        } else {
            var1.method3729();
            return var1;
        }
    }

    @ObfuscatedName("gh.j()Lhf;")
    public class212 method3621() {
        class212 var1 = this.field3151.field3169;
        if (this.field3151 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3169;
            return var1;
        }
    }

    @ObfuscatedName("gh.r()Lhf;")
    public class212 method3622() {
        class212 var1 = this.field3151.field3167;
        if (this.field3151 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3167;
            return var1;
        }
    }

    @ObfuscatedName("gh.x()Lhf;")
    public class212 method3630() {
        class212 var1 = this.field3150;
        if (this.field3151 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3169;
            return var1;
        }
    }

    @ObfuscatedName("gh.k()Lhf;")
    public class212 method3637() {
        class212 var1 = this.field3150;
        if (this.field3151 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3167;
            return var1;
        }
    }
}
