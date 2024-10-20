package deob;

@ObfuscatedName("gd")
public class class199 {

    @ObfuscatedName("gd.o")
    public class208 field3081 = new class208();

    @ObfuscatedName("gd.f")
    public class208 field3082;

    public class199() {
        this.field3081.field3098 = this.field3081;
        this.field3081.field3099 = this.field3081;
    }

    @ObfuscatedName("gd.o()V")
    public void method3535() {
        while (true) {
            class208 var1 = this.field3081.field3098;
            if (this.field3081 == var1) {
                this.field3082 = null;
                return;
            }
            var1.method3605();
        }
    }

    @ObfuscatedName("gd.f(Lgu;)V")
    public void method3515(class208 arg0) {
        if (arg0.field3099 != null) {
            arg0.method3605();
        }
        arg0.field3099 = this.field3081.field3099;
        arg0.field3098 = this.field3081;
        arg0.field3099.field3098 = arg0;
        arg0.field3098.field3099 = arg0;
    }

    @ObfuscatedName("gd.i(Lgu;)V")
    public void method3516(class208 arg0) {
        if (arg0.field3099 != null) {
            arg0.method3605();
        }
        arg0.field3099 = this.field3081;
        arg0.field3098 = this.field3081.field3098;
        arg0.field3099.field3098 = arg0;
        arg0.field3098.field3099 = arg0;
    }

    @ObfuscatedName("gd.h(Lgu;Lgu;)V")
    public static void method3517(class208 arg0, class208 arg1) {
        if (arg0.field3099 != null) {
            arg0.method3605();
        }
        arg0.field3099 = arg1.field3099;
        arg0.field3098 = arg1;
        arg0.field3099.field3098 = arg0;
        arg0.field3098.field3099 = arg0;
    }

    @ObfuscatedName("gd.q()Lgu;")
    public class208 method3518() {
        class208 var1 = this.field3081.field3098;
        if (this.field3081 == var1) {
            return null;
        } else {
            var1.method3605();
            return var1;
        }
    }

    @ObfuscatedName("gd.u()Lgu;")
    public class208 method3539() {
        class208 var1 = this.field3081.field3099;
        if (this.field3081 == var1) {
            return null;
        } else {
            var1.method3605();
            return var1;
        }
    }

    @ObfuscatedName("gd.m()Lgu;")
    public class208 method3520() {
        class208 var1 = this.field3081.field3098;
        if (this.field3081 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("gd.y()Lgu;")
    public class208 method3533() {
        class208 var1 = this.field3081.field3099;
        if (this.field3081 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3099;
            return var1;
        }
    }

    @ObfuscatedName("gd.p()Lgu;")
    public class208 method3522() {
        class208 var1 = this.field3082;
        if (this.field3081 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("gd.t()Lgu;")
    public class208 method3523() {
        class208 var1 = this.field3082;
        if (this.field3081 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3099;
            return var1;
        }
    }
}
