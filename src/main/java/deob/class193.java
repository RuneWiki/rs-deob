package deob;

@ObfuscatedName("gg")
public class class193 {

    @ObfuscatedName("gg.j")
    public class202 field3028 = new class202();

    @ObfuscatedName("gg.y")
    public class202 field3027;

    public class193() {
        this.field3028.field3044 = this.field3028;
        this.field3028.field3045 = this.field3028;
    }

    @ObfuscatedName("gg.j()V")
    public void method3509() {
        while (true) {
            class202 var1 = this.field3028.field3044;
            if (this.field3028 == var1) {
                this.field3027 = null;
                return;
            }
            var1.method3563();
        }
    }

    @ObfuscatedName("gg.y(Lgz;)V")
    public void method3485(class202 arg0) {
        if (arg0.field3045 != null) {
            arg0.method3563();
        }
        arg0.field3045 = this.field3028.field3045;
        arg0.field3044 = this.field3028;
        arg0.field3045.field3044 = arg0;
        arg0.field3044.field3045 = arg0;
    }

    @ObfuscatedName("gg.z(Lgz;)V")
    public void method3486(class202 arg0) {
        if (arg0.field3045 != null) {
            arg0.method3563();
        }
        arg0.field3045 = this.field3028;
        arg0.field3044 = this.field3028.field3044;
        arg0.field3045.field3044 = arg0;
        arg0.field3044.field3045 = arg0;
    }

    @ObfuscatedName("gg.l(Lgz;Lgz;)V")
    public static void method3484(class202 arg0, class202 arg1) {
        if (arg0.field3045 != null) {
            arg0.method3563();
        }
        arg0.field3045 = arg1.field3045;
        arg0.field3044 = arg1;
        arg0.field3045.field3044 = arg0;
        arg0.field3044.field3045 = arg0;
    }

    @ObfuscatedName("gg.w()Lgz;")
    public class202 method3488() {
        class202 var1 = this.field3028.field3044;
        if (this.field3028 == var1) {
            return null;
        } else {
            var1.method3563();
            return var1;
        }
    }

    @ObfuscatedName("gg.d()Lgz;")
    public class202 method3510() {
        class202 var1 = this.field3028.field3045;
        if (this.field3028 == var1) {
            return null;
        } else {
            var1.method3563();
            return var1;
        }
    }

    @ObfuscatedName("gg.f()Lgz;")
    public class202 method3490() {
        class202 var1 = this.field3028.field3044;
        if (this.field3028 == var1) {
            this.field3027 = null;
            return null;
        } else {
            this.field3027 = var1.field3044;
            return var1;
        }
    }

    @ObfuscatedName("gg.i()Lgz;")
    public class202 method3491() {
        class202 var1 = this.field3028.field3045;
        if (this.field3028 == var1) {
            this.field3027 = null;
            return null;
        } else {
            this.field3027 = var1.field3045;
            return var1;
        }
    }

    @ObfuscatedName("gg.a()Lgz;")
    public class202 method3492() {
        class202 var1 = this.field3027;
        if (this.field3028 == var1) {
            this.field3027 = null;
            return null;
        } else {
            this.field3027 = var1.field3044;
            return var1;
        }
    }

    @ObfuscatedName("gg.o()Lgz;")
    public class202 method3487() {
        class202 var1 = this.field3027;
        if (this.field3028 == var1) {
            this.field3027 = null;
            return null;
        } else {
            this.field3027 = var1.field3045;
            return var1;
        }
    }
}
