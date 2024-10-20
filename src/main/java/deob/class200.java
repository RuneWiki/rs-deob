package deob;

@ObfuscatedName("gh")
public class class200 {

    @ObfuscatedName("gh.f")
    public class209 field3101 = new class209();

    @ObfuscatedName("gh.u")
    public class209 field3100;

    public class200() {
        this.field3101.field3117 = this.field3101;
        this.field3101.field3118 = this.field3101;
    }

    @ObfuscatedName("gh.f()V")
    public void method3582() {
        while (true) {
            class209 var1 = this.field3101.field3117;
            if (this.field3101 == var1) {
                this.field3100 = null;
                return;
            }
            var1.method3679();
        }
    }

    @ObfuscatedName("gh.u(Lhf;)V")
    public void method3610(class209 arg0) {
        if (arg0.field3118 != null) {
            arg0.method3679();
        }
        arg0.field3118 = this.field3101.field3118;
        arg0.field3117 = this.field3101;
        arg0.field3118.field3117 = arg0;
        arg0.field3117.field3118 = arg0;
    }

    @ObfuscatedName("gh.x(Lhf;)V")
    public void method3584(class209 arg0) {
        if (arg0.field3118 != null) {
            arg0.method3679();
        }
        arg0.field3118 = this.field3101;
        arg0.field3117 = this.field3101.field3117;
        arg0.field3118.field3117 = arg0;
        arg0.field3117.field3118 = arg0;
    }

    @ObfuscatedName("gh.b(Lhf;Lhf;)V")
    public static void method3605(class209 arg0, class209 arg1) {
        if (arg0.field3118 != null) {
            arg0.method3679();
        }
        arg0.field3118 = arg1.field3118;
        arg0.field3117 = arg1;
        arg0.field3118.field3117 = arg0;
        arg0.field3117.field3118 = arg0;
    }

    @ObfuscatedName("gh.l()Lhf;")
    public class209 method3586() {
        class209 var1 = this.field3101.field3117;
        if (this.field3101 == var1) {
            return null;
        } else {
            var1.method3679();
            return var1;
        }
    }

    @ObfuscatedName("gh.d()Lhf;")
    public class209 method3583() {
        class209 var1 = this.field3101.field3118;
        if (this.field3101 == var1) {
            return null;
        } else {
            var1.method3679();
            return var1;
        }
    }

    @ObfuscatedName("gh.n()Lhf;")
    public class209 method3585() {
        class209 var1 = this.field3101.field3117;
        if (this.field3101 == var1) {
            this.field3100 = null;
            return null;
        } else {
            this.field3100 = var1.field3117;
            return var1;
        }
    }

    @ObfuscatedName("gh.m()Lhf;")
    public class209 method3589() {
        class209 var1 = this.field3101.field3118;
        if (this.field3101 == var1) {
            this.field3100 = null;
            return null;
        } else {
            this.field3100 = var1.field3118;
            return var1;
        }
    }

    @ObfuscatedName("gh.g()Lhf;")
    public class209 method3590() {
        class209 var1 = this.field3100;
        if (this.field3101 == var1) {
            this.field3100 = null;
            return null;
        } else {
            this.field3100 = var1.field3117;
            return var1;
        }
    }

    @ObfuscatedName("gh.s()Lhf;")
    public class209 method3591() {
        class209 var1 = this.field3100;
        if (this.field3101 == var1) {
            this.field3100 = null;
            return null;
        } else {
            this.field3100 = var1.field3118;
            return var1;
        }
    }
}
