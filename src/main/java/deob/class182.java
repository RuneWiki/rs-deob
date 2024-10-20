package deob;

@ObfuscatedName("fg")
public class class182 {

    @ObfuscatedName("fg.v")
    public class191 field2895 = new class191();

    @ObfuscatedName("fg.t")
    public class191 field2896;

    public class182() {
        this.field2895.field2912 = this.field2895;
        this.field2895.field2913 = this.field2895;
    }

    @ObfuscatedName("fg.v()V")
    public void method3297() {
        while (true) {
            class191 var1 = this.field2895.field2912;
            if (this.field2895 == var1) {
                this.field2896 = null;
                return;
            }
            var1.method3392();
        }
    }

    @ObfuscatedName("fg.t(Lgu;)V")
    public void method3323(class191 arg0) {
        if (arg0.field2913 != null) {
            arg0.method3392();
        }
        arg0.field2913 = this.field2895.field2913;
        arg0.field2912 = this.field2895;
        arg0.field2913.field2912 = arg0;
        arg0.field2912.field2913 = arg0;
    }

    @ObfuscatedName("fg.f(Lgu;)V")
    public void method3300(class191 arg0) {
        if (arg0.field2913 != null) {
            arg0.method3392();
        }
        arg0.field2913 = this.field2895;
        arg0.field2912 = this.field2895.field2912;
        arg0.field2913.field2912 = arg0;
        arg0.field2912.field2913 = arg0;
    }

    @ObfuscatedName("fg.j(Lgu;Lgu;)V")
    public static void method3301(class191 arg0, class191 arg1) {
        if (arg0.field2913 != null) {
            arg0.method3392();
        }
        arg0.field2913 = arg1.field2913;
        arg0.field2912 = arg1;
        arg0.field2913.field2912 = arg0;
        arg0.field2912.field2913 = arg0;
    }

    @ObfuscatedName("fg.l()Lgu;")
    public class191 method3299() {
        class191 var1 = this.field2895.field2912;
        if (this.field2895 == var1) {
            return null;
        } else {
            var1.method3392();
            return var1;
        }
    }

    @ObfuscatedName("fg.g()Lgu;")
    public class191 method3320() {
        class191 var1 = this.field2895.field2913;
        if (this.field2895 == var1) {
            return null;
        } else {
            var1.method3392();
            return var1;
        }
    }

    @ObfuscatedName("fg.k()Lgu;")
    public class191 method3303() {
        class191 var1 = this.field2895.field2912;
        if (this.field2895 == var1) {
            this.field2896 = null;
            return null;
        } else {
            this.field2896 = var1.field2912;
            return var1;
        }
    }

    @ObfuscatedName("fg.p()Lgu;")
    public class191 method3304() {
        class191 var1 = this.field2895.field2913;
        if (this.field2895 == var1) {
            this.field2896 = null;
            return null;
        } else {
            this.field2896 = var1.field2913;
            return var1;
        }
    }

    @ObfuscatedName("fg.y()Lgu;")
    public class191 method3305() {
        class191 var1 = this.field2896;
        if (this.field2895 == var1) {
            this.field2896 = null;
            return null;
        } else {
            this.field2896 = var1.field2912;
            return var1;
        }
    }

    @ObfuscatedName("fg.m()Lgu;")
    public class191 method3325() {
        class191 var1 = this.field2896;
        if (this.field2895 == var1) {
            this.field2896 = null;
            return null;
        } else {
            this.field2896 = var1.field2913;
            return var1;
        }
    }
}
