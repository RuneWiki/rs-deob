package deob;

@ObfuscatedName("gj")
public class class199 {

    @ObfuscatedName("gj.c")
    public class208 field3081 = new class208();

    @ObfuscatedName("gj.h")
    public class208 field3080;

    public class199() {
        this.field3081.field3097 = this.field3081;
        this.field3081.field3098 = this.field3081;
    }

    @ObfuscatedName("gj.c()V")
    public void method3560() {
        while (true) {
            class208 var1 = this.field3081.field3097;
            if (this.field3081 == var1) {
                this.field3080 = null;
                return;
            }
            var1.method3646();
        }
    }

    @ObfuscatedName("gj.h(Lgc;)V")
    public void method3585(class208 arg0) {
        if (arg0.field3098 != null) {
            arg0.method3646();
        }
        arg0.field3098 = this.field3081.field3098;
        arg0.field3097 = this.field3081;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("gj.k(Lgc;)V")
    public void method3577(class208 arg0) {
        if (arg0.field3098 != null) {
            arg0.method3646();
        }
        arg0.field3098 = this.field3081;
        arg0.field3097 = this.field3081.field3097;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("gj.t(Lgc;Lgc;)V")
    public static void method3551(class208 arg0, class208 arg1) {
        if (arg0.field3098 != null) {
            arg0.method3646();
        }
        arg0.field3098 = arg1.field3098;
        arg0.field3097 = arg1;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("gj.g()Lgc;")
    public class208 method3556() {
        class208 var1 = this.field3081.field3097;
        if (this.field3081 == var1) {
            return null;
        } else {
            var1.method3646();
            return var1;
        }
    }

    @ObfuscatedName("gj.o()Lgc;")
    public class208 method3557() {
        class208 var1 = this.field3081.field3098;
        if (this.field3081 == var1) {
            return null;
        } else {
            var1.method3646();
            return var1;
        }
    }

    @ObfuscatedName("gj.i()Lgc;")
    public class208 method3558() {
        class208 var1 = this.field3081.field3097;
        if (this.field3081 == var1) {
            this.field3080 = null;
            return null;
        } else {
            this.field3080 = var1.field3097;
            return var1;
        }
    }

    @ObfuscatedName("gj.w()Lgc;")
    public class208 method3559() {
        class208 var1 = this.field3081.field3098;
        if (this.field3081 == var1) {
            this.field3080 = null;
            return null;
        } else {
            this.field3080 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("gj.m()Lgc;")
    public class208 method3554() {
        class208 var1 = this.field3080;
        if (this.field3081 == var1) {
            this.field3080 = null;
            return null;
        } else {
            this.field3080 = var1.field3097;
            return var1;
        }
    }

    @ObfuscatedName("gj.r()Lgc;")
    public class208 method3561() {
        class208 var1 = this.field3080;
        if (this.field3081 == var1) {
            this.field3080 = null;
            return null;
        } else {
            this.field3080 = var1.field3098;
            return var1;
        }
    }
}
