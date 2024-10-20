package deob;

@ObfuscatedName("fm")
public class class177 {

    @ObfuscatedName("fm.g")
    public class179 field2809 = new class179();

    @ObfuscatedName("fm.m")
    public class179 field2810;

    public class177() {
        this.field2809.field2815 = this.field2809;
        this.field2809.field2813 = this.field2809;
    }

    @ObfuscatedName("fm.g()V")
    public void method3315() {
        while (true) {
            class179 var1 = this.field2809.field2815;
            if (this.field2809 == var1) {
                this.field2810 = null;
                return;
            }
            var1.method3346();
        }
    }

    @ObfuscatedName("fm.m(Lfu;)V")
    public void method3326(class179 arg0) {
        if (arg0.field2813 != null) {
            arg0.method3346();
        }
        arg0.field2813 = this.field2809.field2813;
        arg0.field2815 = this.field2809;
        arg0.field2813.field2815 = arg0;
        arg0.field2815.field2813 = arg0;
    }

    @ObfuscatedName("fm.v(Lfu;)V")
    public void method3320(class179 arg0) {
        if (arg0.field2813 != null) {
            arg0.method3346();
        }
        arg0.field2813 = this.field2809;
        arg0.field2815 = this.field2809.field2815;
        arg0.field2813.field2815 = arg0;
        arg0.field2815.field2813 = arg0;
    }

    @ObfuscatedName("fm.r(Lfu;Lfu;)V")
    public static void method3329(class179 arg0, class179 arg1) {
        if (arg0.field2813 != null) {
            arg0.method3346();
        }
        arg0.field2813 = arg1.field2813;
        arg0.field2815 = arg1;
        arg0.field2813.field2815 = arg0;
        arg0.field2815.field2813 = arg0;
    }

    @ObfuscatedName("fm.n()Lfu;")
    public class179 method3319() {
        class179 var1 = this.field2809.field2815;
        if (this.field2809 == var1) {
            return null;
        } else {
            var1.method3346();
            return var1;
        }
    }

    @ObfuscatedName("fm.i()Lfu;")
    public class179 method3322() {
        class179 var1 = this.field2809.field2813;
        if (this.field2809 == var1) {
            return null;
        } else {
            var1.method3346();
            return var1;
        }
    }

    @ObfuscatedName("fm.s()Lfu;")
    public class179 method3321() {
        class179 var1 = this.field2809.field2815;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fm.w()Lfu;")
    public class179 method3318() {
        class179 var1 = this.field2809.field2813;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fm.d()Lfu;")
    public class179 method3323() {
        class179 var1 = this.field2810;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fm.t()Lfu;")
    public class179 method3314() {
        class179 var1 = this.field2810;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2813;
            return var1;
        }
    }
}
