package deob;

@ObfuscatedName("go")
public class class199 {

    @ObfuscatedName("go.n")
    public class208 field3080 = new class208();

    @ObfuscatedName("go.d")
    public class208 field3081;

    public class199() {
        this.field3080.field3097 = this.field3080;
        this.field3080.field3098 = this.field3080;
    }

    @ObfuscatedName("go.n()V")
    public void method3546() {
        while (true) {
            class208 var1 = this.field3080.field3097;
            if (this.field3080 == var1) {
                this.field3081 = null;
                return;
            }
            var1.method3651();
        }
    }

    @ObfuscatedName("go.d(Lge;)V")
    public void method3579(class208 arg0) {
        if (arg0.field3098 != null) {
            arg0.method3651();
        }
        arg0.field3098 = this.field3080.field3098;
        arg0.field3097 = this.field3080;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("go.s(Lge;)V")
    public void method3549(class208 arg0) {
        if (arg0.field3098 != null) {
            arg0.method3651();
        }
        arg0.field3098 = this.field3080;
        arg0.field3097 = this.field3080.field3097;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("go.q(Lge;Lge;)V")
    public static void method3550(class208 arg0, class208 arg1) {
        if (arg0.field3098 != null) {
            arg0.method3651();
        }
        arg0.field3098 = arg1.field3098;
        arg0.field3097 = arg1;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("go.j()Lge;")
    public class208 method3551() {
        class208 var1 = this.field3080.field3097;
        if (this.field3080 == var1) {
            return null;
        } else {
            var1.method3651();
            return var1;
        }
    }

    @ObfuscatedName("go.k()Lge;")
    public class208 method3552() {
        class208 var1 = this.field3080.field3098;
        if (this.field3080 == var1) {
            return null;
        } else {
            var1.method3651();
            return var1;
        }
    }

    @ObfuscatedName("go.i()Lge;")
    public class208 method3574() {
        class208 var1 = this.field3080.field3097;
        if (this.field3080 == var1) {
            this.field3081 = null;
            return null;
        } else {
            this.field3081 = var1.field3097;
            return var1;
        }
    }

    @ObfuscatedName("go.m()Lge;")
    public class208 method3554() {
        class208 var1 = this.field3080.field3098;
        if (this.field3080 == var1) {
            this.field3081 = null;
            return null;
        } else {
            this.field3081 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("go.p()Lge;")
    public class208 method3568() {
        class208 var1 = this.field3081;
        if (this.field3080 == var1) {
            this.field3081 = null;
            return null;
        } else {
            this.field3081 = var1.field3097;
            return var1;
        }
    }

    @ObfuscatedName("go.h()Lge;")
    public class208 method3556() {
        class208 var1 = this.field3081;
        if (this.field3080 == var1) {
            this.field3081 = null;
            return null;
        } else {
            this.field3081 = var1.field3098;
            return var1;
        }
    }
}
