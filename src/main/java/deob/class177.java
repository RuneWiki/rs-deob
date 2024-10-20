package deob;

@ObfuscatedName("fz")
public class class177 {

    @ObfuscatedName("fz.i")
    public class179 field2814 = new class179();

    @ObfuscatedName("fz.v")
    public class179 field2813;

    public class177() {
        this.field2814.field2817 = this.field2814;
        this.field2814.field2819 = this.field2814;
    }

    @ObfuscatedName("fz.i()V")
    public void method3363() {
        while (true) {
            class179 var1 = this.field2814.field2817;
            if (this.field2814 == var1) {
                this.field2813 = null;
                return;
            }
            var1.method3409();
        }
    }

    @ObfuscatedName("fz.v(Lfo;)V")
    public void method3364(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3409();
        }
        arg0.field2819 = this.field2814.field2819;
        arg0.field2817 = this.field2814;
        arg0.field2819.field2817 = arg0;
        arg0.field2817.field2819 = arg0;
    }

    @ObfuscatedName("fz.m(Lfo;)V")
    public void method3365(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3409();
        }
        arg0.field2819 = this.field2814;
        arg0.field2817 = this.field2814.field2817;
        arg0.field2819.field2817 = arg0;
        arg0.field2817.field2819 = arg0;
    }

    @ObfuscatedName("fz.j(Lfo;Lfo;)V")
    public static void method3362(class179 arg0, class179 arg1) {
        if (arg0.field2819 != null) {
            arg0.method3409();
        }
        arg0.field2819 = arg1.field2819;
        arg0.field2817 = arg1;
        arg0.field2819.field2817 = arg0;
        arg0.field2817.field2819 = arg0;
    }

    @ObfuscatedName("fz.o()Lfo;")
    public class179 method3398() {
        class179 var1 = this.field2814.field2817;
        if (this.field2814 == var1) {
            return null;
        } else {
            var1.method3409();
            return var1;
        }
    }

    @ObfuscatedName("fz.l()Lfo;")
    public class179 method3373() {
        class179 var1 = this.field2814.field2819;
        if (this.field2814 == var1) {
            return null;
        } else {
            var1.method3409();
            return var1;
        }
    }

    @ObfuscatedName("fz.g()Lfo;")
    public class179 method3369() {
        class179 var1 = this.field2814.field2817;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fz.w()Lfo;")
    public class179 method3370() {
        class179 var1 = this.field2814.field2819;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fz.c()Lfo;")
    public class179 method3371() {
        class179 var1 = this.field2813;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fz.z()Lfo;")
    public class179 method3372() {
        class179 var1 = this.field2813;
        if (this.field2814 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2819;
            return var1;
        }
    }
}
