package deob;

@ObfuscatedName("gs")
public class class199 {

    @ObfuscatedName("gs.v")
    public class208 field3099 = new class208();

    @ObfuscatedName("gs.f")
    public class208 field3098;

    public class199() {
        this.field3099.field3116 = this.field3099;
        this.field3099.field3114 = this.field3099;
    }

    @ObfuscatedName("gs.v()V")
    public void method3557() {
        while (true) {
            class208 var1 = this.field3099.field3116;
            if (this.field3099 == var1) {
                this.field3098 = null;
                return;
            }
            var1.method3645();
        }
    }

    @ObfuscatedName("gs.f(Lgq;)V")
    public void method3558(class208 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3645();
        }
        arg0.field3114 = this.field3099.field3114;
        arg0.field3116 = this.field3099;
        arg0.field3114.field3116 = arg0;
        arg0.field3116.field3114 = arg0;
    }

    @ObfuscatedName("gs.i(Lgq;)V")
    public void method3559(class208 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3645();
        }
        arg0.field3114 = this.field3099;
        arg0.field3116 = this.field3099.field3116;
        arg0.field3114.field3116 = arg0;
        arg0.field3116.field3114 = arg0;
    }

    @ObfuscatedName("gs.d(Lgq;Lgq;)V")
    public static void method3560(class208 arg0, class208 arg1) {
        if (arg0.field3114 != null) {
            arg0.method3645();
        }
        arg0.field3114 = arg1.field3114;
        arg0.field3116 = arg1;
        arg0.field3114.field3116 = arg0;
        arg0.field3116.field3114 = arg0;
    }

    @ObfuscatedName("gs.o()Lgq;")
    public class208 method3561() {
        class208 var1 = this.field3099.field3116;
        if (this.field3099 == var1) {
            return null;
        } else {
            var1.method3645();
            return var1;
        }
    }

    @ObfuscatedName("gs.c()Lgq;")
    public class208 method3562() {
        class208 var1 = this.field3099.field3114;
        if (this.field3099 == var1) {
            return null;
        } else {
            var1.method3645();
            return var1;
        }
    }

    @ObfuscatedName("gs.p()Lgq;")
    public class208 method3563() {
        class208 var1 = this.field3099.field3116;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3116;
            return var1;
        }
    }

    @ObfuscatedName("gs.j()Lgq;")
    public class208 method3556() {
        class208 var1 = this.field3099.field3114;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3114;
            return var1;
        }
    }

    @ObfuscatedName("gs.a()Lgq;")
    public class208 method3565() {
        class208 var1 = this.field3098;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3116;
            return var1;
        }
    }

    @ObfuscatedName("gs.y()Lgq;")
    public class208 method3582() {
        class208 var1 = this.field3098;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3114;
            return var1;
        }
    }
}
