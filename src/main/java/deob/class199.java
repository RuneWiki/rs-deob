package deob;

@ObfuscatedName("gy")
public class class199 {

    @ObfuscatedName("gy.i")
    public class208 field3083 = new class208();

    @ObfuscatedName("gy.v")
    public class208 field3082;

    public class199() {
        this.field3083.field3098 = this.field3083;
        this.field3083.field3100 = this.field3083;
    }

    @ObfuscatedName("gy.i()V")
    public void method3560() {
        while (true) {
            class208 var1 = this.field3083.field3098;
            if (this.field3083 == var1) {
                this.field3082 = null;
                return;
            }
            var1.method3624();
        }
    }

    @ObfuscatedName("gy.v(Lgp;)V")
    public void method3545(class208 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3624();
        }
        arg0.field3100 = this.field3083.field3100;
        arg0.field3098 = this.field3083;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
    }

    @ObfuscatedName("gy.f(Lgp;)V")
    public void method3531(class208 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3624();
        }
        arg0.field3100 = this.field3083;
        arg0.field3098 = this.field3083.field3098;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
    }

    @ObfuscatedName("gy.h(Lgp;Lgp;)V")
    public static void method3550(class208 arg0, class208 arg1) {
        if (arg0.field3100 != null) {
            arg0.method3624();
        }
        arg0.field3100 = arg1.field3100;
        arg0.field3098 = arg1;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
    }

    @ObfuscatedName("gy.a()Lgp;")
    public class208 method3542() {
        class208 var1 = this.field3083.field3098;
        if (this.field3083 == var1) {
            return null;
        } else {
            var1.method3624();
            return var1;
        }
    }

    @ObfuscatedName("gy.s()Lgp;")
    public class208 method3534() {
        class208 var1 = this.field3083.field3100;
        if (this.field3083 == var1) {
            return null;
        } else {
            var1.method3624();
            return var1;
        }
    }

    @ObfuscatedName("gy.p()Lgp;")
    public class208 method3535() {
        class208 var1 = this.field3083.field3098;
        if (this.field3083 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("gy.r()Lgp;")
    public class208 method3528() {
        class208 var1 = this.field3083.field3100;
        if (this.field3083 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3100;
            return var1;
        }
    }

    @ObfuscatedName("gy.k()Lgp;")
    public class208 method3537() {
        class208 var1 = this.field3082;
        if (this.field3083 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("gy.d()Lgp;")
    public class208 method3538() {
        class208 var1 = this.field3082;
        if (this.field3083 == var1) {
            this.field3082 = null;
            return null;
        } else {
            this.field3082 = var1.field3100;
            return var1;
        }
    }
}
