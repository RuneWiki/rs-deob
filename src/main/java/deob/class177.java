package deob;

@ObfuscatedName("fx")
public class class177 {

    @ObfuscatedName("fx.i")
    public class179 field2813 = new class179();

    @ObfuscatedName("fx.p")
    public class179 field2814;

    public class177() {
        this.field2813.field2817 = this.field2813;
        this.field2813.field2819 = this.field2813;
    }

    @ObfuscatedName("fx.i()V")
    public void method3284() {
        while (true) {
            class179 var1 = this.field2813.field2817;
            if (this.field2813 == var1) {
                this.field2814 = null;
                return;
            }
            var1.method3319();
        }
    }

    @ObfuscatedName("fx.p(Lfk;)V")
    public void method3308(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3319();
        }
        arg0.field2819 = this.field2813.field2819;
        arg0.field2817 = this.field2813;
        arg0.field2819.field2817 = arg0;
        arg0.field2817.field2819 = arg0;
    }

    @ObfuscatedName("fx.a(Lfk;)V")
    public void method3294(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3319();
        }
        arg0.field2819 = this.field2813;
        arg0.field2817 = this.field2813.field2817;
        arg0.field2819.field2817 = arg0;
        arg0.field2817.field2819 = arg0;
    }

    @ObfuscatedName("fx.l(Lfk;Lfk;)V")
    public static void method3287(class179 arg0, class179 arg1) {
        if (arg0.field2819 != null) {
            arg0.method3319();
        }
        arg0.field2819 = arg1.field2819;
        arg0.field2817 = arg1;
        arg0.field2819.field2817 = arg0;
        arg0.field2817.field2819 = arg0;
    }

    @ObfuscatedName("fx.q()Lfk;")
    public class179 method3288() {
        class179 var1 = this.field2813.field2817;
        if (this.field2813 == var1) {
            return null;
        } else {
            var1.method3319();
            return var1;
        }
    }

    @ObfuscatedName("fx.b()Lfk;")
    public class179 method3302() {
        class179 var1 = this.field2813.field2819;
        if (this.field2813 == var1) {
            return null;
        } else {
            var1.method3319();
            return var1;
        }
    }

    @ObfuscatedName("fx.u()Lfk;")
    public class179 method3313() {
        class179 var1 = this.field2813.field2817;
        if (this.field2813 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fx.d()Lfk;")
    public class179 method3291() {
        class179 var1 = this.field2813.field2819;
        if (this.field2813 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fx.m()Lfk;")
    public class179 method3292() {
        class179 var1 = this.field2814;
        if (this.field2813 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fx.v()Lfk;")
    public class179 method3293() {
        class179 var1 = this.field2814;
        if (this.field2813 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2819;
            return var1;
        }
    }
}
