package deob;

@ObfuscatedName("fg")
public class class177 {

    @ObfuscatedName("fg.y")
    public class179 field2814 = new class179();

    @ObfuscatedName("fg.m")
    public class179 field2813;

    public class177() {
        this.field2814.field2818 = this.field2814;
        this.field2814.field2817 = this.field2814;
    }

    @ObfuscatedName("fg.y()V")
    public void method3349() {
        while (true) {
            class179 var1 = this.field2814.field2818;
            if (this.field2814 == var1) {
                this.field2813 = null;
                return;
            }
            var1.method3395();
        }
    }

    @ObfuscatedName("fg.m(Lfk;)V")
    public void method3350(class179 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3395();
        }
        arg0.field2817 = this.field2814.field2817;
        arg0.field2818 = this.field2814;
        arg0.field2817.field2818 = arg0;
        arg0.field2818.field2817 = arg0;
    }

    @ObfuscatedName("fg.d(Lfk;)V")
    public void method3351(class179 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3395();
        }
        arg0.field2817 = this.field2814;
        arg0.field2818 = this.field2814.field2818;
        arg0.field2817.field2818 = arg0;
        arg0.field2818.field2817 = arg0;
    }

    @ObfuscatedName("fg.k(Lfk;Lfk;)V")
    public static void method3352(class179 arg0, class179 arg1) {
        if (arg0.field2817 != null) {
            arg0.method3395();
        }
        arg0.field2817 = arg1.field2817;
        arg0.field2818 = arg1;
        arg0.field2817.field2818 = arg0;
        arg0.field2818.field2817 = arg0;
    }

    @ObfuscatedName("fg.n()Lfk;")
    public class179 method3353() {
        class179 var1 = this.field2814.field2818;
        if (this.field2814 == var1) {
            return null;
        } else {
            var1.method3395();
            return var1;
        }
    }

    @ObfuscatedName("fg.s()Lfk;")
    public class179 method3354() {
        class179 var1 = this.field2814.field2817;
        if (this.field2814 == var1) {
            return null;
        } else {
            var1.method3395();
            return var1;
        }
    }

    @ObfuscatedName("fg.x()Lfk;")
    public class179 method3355() {
        class179 var1 = this.field2814.field2818;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2818;
            return var1;
        }
    }

    @ObfuscatedName("fg.b()Lfk;")
    public class179 method3356() {
        class179 var1 = this.field2814.field2817;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fg.j()Lfk;")
    public class179 method3357() {
        class179 var1 = this.field2813;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2818;
            return var1;
        }
    }

    @ObfuscatedName("fg.p()Lfk;")
    public class179 method3382() {
        class179 var1 = this.field2813;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2817;
            return var1;
        }
    }
}
