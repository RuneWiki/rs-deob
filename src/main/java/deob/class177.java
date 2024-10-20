package deob;

@ObfuscatedName("fv")
public class class177 {

    @ObfuscatedName("fv.f")
    public class179 field2808 = new class179();

    @ObfuscatedName("fv.t")
    public class179 field2809;

    public class177() {
        this.field2808.field2813 = this.field2808;
        this.field2808.field2814 = this.field2808;
    }

    @ObfuscatedName("fv.f()V")
    public void method3336() {
        while (true) {
            class179 var1 = this.field2808.field2813;
            if (this.field2808 == var1) {
                this.field2809 = null;
                return;
            }
            var1.method3374();
        }
    }

    @ObfuscatedName("fv.t(Lfy;)V")
    public void method3333(class179 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3374();
        }
        arg0.field2814 = this.field2808.field2814;
        arg0.field2813 = this.field2808;
        arg0.field2814.field2813 = arg0;
        arg0.field2813.field2814 = arg0;
    }

    @ObfuscatedName("fv.n(Lfy;)V")
    public void method3334(class179 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3374();
        }
        arg0.field2814 = this.field2808;
        arg0.field2813 = this.field2808.field2813;
        arg0.field2814.field2813 = arg0;
        arg0.field2813.field2814 = arg0;
    }

    @ObfuscatedName("fv.e(Lfy;Lfy;)V")
    public static void method3335(class179 arg0, class179 arg1) {
        if (arg0.field2814 != null) {
            arg0.method3374();
        }
        arg0.field2814 = arg1.field2814;
        arg0.field2813 = arg1;
        arg0.field2814.field2813 = arg0;
        arg0.field2813.field2814 = arg0;
    }

    @ObfuscatedName("fv.l()Lfy;")
    public class179 method3358() {
        class179 var1 = this.field2808.field2813;
        if (this.field2808 == var1) {
            return null;
        } else {
            var1.method3374();
            return var1;
        }
    }

    @ObfuscatedName("fv.d()Lfy;")
    public class179 method3337() {
        class179 var1 = this.field2808.field2814;
        if (this.field2808 == var1) {
            return null;
        } else {
            var1.method3374();
            return var1;
        }
    }

    @ObfuscatedName("fv.r()Lfy;")
    public class179 method3362() {
        class179 var1 = this.field2808.field2813;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fv.k()Lfy;")
    public class179 method3339() {
        class179 var1 = this.field2808.field2814;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2814;
            return var1;
        }
    }

    @ObfuscatedName("fv.u()Lfy;")
    public class179 method3350() {
        class179 var1 = this.field2809;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fv.o()Lfy;")
    public class179 method3341() {
        class179 var1 = this.field2809;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2814;
            return var1;
        }
    }
}
