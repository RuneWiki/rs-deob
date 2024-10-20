package deob;

@ObfuscatedName("gt")
public class class200 {

    @ObfuscatedName("gt.b")
    public class209 field3099 = new class209();

    @ObfuscatedName("gt.g")
    public class209 field3098;

    public class200() {
        this.field3099.field3115 = this.field3099;
        this.field3099.field3116 = this.field3099;
    }

    @ObfuscatedName("gt.b()V")
    public void method3554() {
        while (true) {
            class209 var1 = this.field3099.field3115;
            if (this.field3099 == var1) {
                this.field3098 = null;
                return;
            }
            var1.method3647();
        }
    }

    @ObfuscatedName("gt.g(Lhk;)V")
    public void method3550(class209 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3647();
        }
        arg0.field3116 = this.field3099.field3116;
        arg0.field3115 = this.field3099;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("gt.j(Lhk;)V")
    public void method3551(class209 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3647();
        }
        arg0.field3116 = this.field3099;
        arg0.field3115 = this.field3099.field3115;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("gt.d(Lhk;Lhk;)V")
    public static void method3552(class209 arg0, class209 arg1) {
        if (arg0.field3116 != null) {
            arg0.method3647();
        }
        arg0.field3116 = arg1.field3116;
        arg0.field3115 = arg1;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("gt.x()Lhk;")
    public class209 method3564() {
        class209 var1 = this.field3099.field3115;
        if (this.field3099 == var1) {
            return null;
        } else {
            var1.method3647();
            return var1;
        }
    }

    @ObfuscatedName("gt.y()Lhk;")
    public class209 method3549() {
        class209 var1 = this.field3099.field3116;
        if (this.field3099 == var1) {
            return null;
        } else {
            var1.method3647();
            return var1;
        }
    }

    @ObfuscatedName("gt.r()Lhk;")
    public class209 method3575() {
        class209 var1 = this.field3099.field3115;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3115;
            return var1;
        }
    }

    @ObfuscatedName("gt.c()Lhk;")
    public class209 method3555() {
        class209 var1 = this.field3099.field3116;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3116;
            return var1;
        }
    }

    @ObfuscatedName("gt.l()Lhk;")
    public class209 method3565() {
        class209 var1 = this.field3098;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3115;
            return var1;
        }
    }

    @ObfuscatedName("gt.u()Lhk;")
    public class209 method3557() {
        class209 var1 = this.field3098;
        if (this.field3099 == var1) {
            this.field3098 = null;
            return null;
        } else {
            this.field3098 = var1.field3116;
            return var1;
        }
    }
}
