package deob;

@ObfuscatedName("fn")
public class class175 {

    @ObfuscatedName("fn.c")
    public class177 field2755 = new class177();

    @ObfuscatedName("fn.j")
    public class177 field2754;

    public class175() {
        this.field2755.field2760 = this.field2755;
        this.field2755.field2758 = this.field2755;
    }

    @ObfuscatedName("fn.c()V")
    public void method3146() {
        while (true) {
            class177 var1 = this.field2755.field2760;
            if (this.field2755 == var1) {
                this.field2754 = null;
                return;
            }
            var1.method3182();
        }
    }

    @ObfuscatedName("fn.j(Lfk;)V")
    public void method3147(class177 arg0) {
        if (arg0.field2758 != null) {
            arg0.method3182();
        }
        arg0.field2758 = this.field2755.field2758;
        arg0.field2760 = this.field2755;
        arg0.field2758.field2760 = arg0;
        arg0.field2760.field2758 = arg0;
    }

    @ObfuscatedName("fn.f(Lfk;)V")
    public void method3148(class177 arg0) {
        if (arg0.field2758 != null) {
            arg0.method3182();
        }
        arg0.field2758 = this.field2755;
        arg0.field2760 = this.field2755.field2760;
        arg0.field2758.field2760 = arg0;
        arg0.field2760.field2758 = arg0;
    }

    @ObfuscatedName("fn.y(Lfk;Lfk;)V")
    public static void method3160(class177 arg0, class177 arg1) {
        if (arg0.field2758 != null) {
            arg0.method3182();
        }
        arg0.field2758 = arg1.field2758;
        arg0.field2760 = arg1;
        arg0.field2758.field2760 = arg0;
        arg0.field2760.field2758 = arg0;
    }

    @ObfuscatedName("fn.x()Lfk;")
    public class177 method3150() {
        class177 var1 = this.field2755.field2760;
        if (this.field2755 == var1) {
            return null;
        } else {
            var1.method3182();
            return var1;
        }
    }

    @ObfuscatedName("fn.e()Lfk;")
    public class177 method3151() {
        class177 var1 = this.field2755.field2758;
        if (this.field2755 == var1) {
            return null;
        } else {
            var1.method3182();
            return var1;
        }
    }

    @ObfuscatedName("fn.m()Lfk;")
    public class177 method3145() {
        class177 var1 = this.field2755.field2760;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2760;
            return var1;
        }
    }

    @ObfuscatedName("fn.s()Lfk;")
    public class177 method3153() {
        class177 var1 = this.field2755.field2758;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2758;
            return var1;
        }
    }

    @ObfuscatedName("fn.p()Lfk;")
    public class177 method3154() {
        class177 var1 = this.field2754;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2760;
            return var1;
        }
    }

    @ObfuscatedName("fn.w()Lfk;")
    public class177 method3155() {
        class177 var1 = this.field2754;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2758;
            return var1;
        }
    }
}
