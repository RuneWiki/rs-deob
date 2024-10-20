package deob;

@ObfuscatedName("ga")
public class class199 {

    @ObfuscatedName("ga.g")
    public class208 field3082 = new class208();

    @ObfuscatedName("ga.b")
    public class208 field3083;

    public class199() {
        this.field3082.field3098 = this.field3082;
        this.field3082.field3100 = this.field3082;
    }

    @ObfuscatedName("ga.g()V")
    public void method3622() {
        while (true) {
            class208 var1 = this.field3082.field3098;
            if (this.field3082 == var1) {
                this.field3083 = null;
                return;
            }
            var1.method3693();
        }
    }

    @ObfuscatedName("ga.b(Lgr;)V")
    public void method3598(class208 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3693();
        }
        arg0.field3100 = this.field3082.field3100;
        arg0.field3098 = this.field3082;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
    }

    @ObfuscatedName("ga.w(Lgr;)V")
    public void method3599(class208 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3693();
        }
        arg0.field3100 = this.field3082;
        arg0.field3098 = this.field3082.field3098;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
    }

    @ObfuscatedName("ga.d(Lgr;Lgr;)V")
    public static void method3612(class208 arg0, class208 arg1) {
        if (arg0.field3100 != null) {
            arg0.method3693();
        }
        arg0.field3100 = arg1.field3100;
        arg0.field3098 = arg1;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
    }

    @ObfuscatedName("ga.z()Lgr;")
    public class208 method3601() {
        class208 var1 = this.field3082.field3098;
        if (this.field3082 == var1) {
            return null;
        } else {
            var1.method3693();
            return var1;
        }
    }

    @ObfuscatedName("ga.l()Lgr;")
    public class208 method3602() {
        class208 var1 = this.field3082.field3100;
        if (this.field3082 == var1) {
            return null;
        } else {
            var1.method3693();
            return var1;
        }
    }

    @ObfuscatedName("ga.m()Lgr;")
    public class208 method3603() {
        class208 var1 = this.field3082.field3098;
        if (this.field3082 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("ga.p()Lgr;")
    public class208 method3604() {
        class208 var1 = this.field3082.field3100;
        if (this.field3082 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3100;
            return var1;
        }
    }

    @ObfuscatedName("ga.u()Lgr;")
    public class208 method3596() {
        class208 var1 = this.field3083;
        if (this.field3082 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("ga.c()Lgr;")
    public class208 method3606() {
        class208 var1 = this.field3083;
        if (this.field3082 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3100;
            return var1;
        }
    }
}
