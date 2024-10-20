package deob;

@ObfuscatedName("ge")
public class class199 {

    @ObfuscatedName("ge.y")
    public class208 field3076 = new class208();

    @ObfuscatedName("ge.d")
    public class208 field3075;

    public class199() {
        this.field3076.field3092 = this.field3076;
        this.field3076.field3093 = this.field3076;
    }

    @ObfuscatedName("ge.y()V")
    public void method3487() {
        while (true) {
            class208 var1 = this.field3076.field3092;
            if (this.field3076 == var1) {
                this.field3075 = null;
                return;
            }
            var1.method3588();
        }
    }

    @ObfuscatedName("ge.d(Lgx;)V")
    public void method3488(class208 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3588();
        }
        arg0.field3093 = this.field3076.field3093;
        arg0.field3092 = this.field3076;
        arg0.field3093.field3092 = arg0;
        arg0.field3092.field3093 = arg0;
    }

    @ObfuscatedName("ge.g(Lgx;)V")
    public void method3489(class208 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3588();
        }
        arg0.field3093 = this.field3076;
        arg0.field3092 = this.field3076.field3092;
        arg0.field3093.field3092 = arg0;
        arg0.field3092.field3093 = arg0;
    }

    @ObfuscatedName("ge.w(Lgx;Lgx;)V")
    public static void method3490(class208 arg0, class208 arg1) {
        if (arg0.field3093 != null) {
            arg0.method3588();
        }
        arg0.field3093 = arg1.field3093;
        arg0.field3092 = arg1;
        arg0.field3093.field3092 = arg0;
        arg0.field3092.field3093 = arg0;
    }

    @ObfuscatedName("ge.e()Lgx;")
    public class208 method3491() {
        class208 var1 = this.field3076.field3092;
        if (this.field3076 == var1) {
            return null;
        } else {
            var1.method3588();
            return var1;
        }
    }

    @ObfuscatedName("ge.c()Lgx;")
    public class208 method3492() {
        class208 var1 = this.field3076.field3093;
        if (this.field3076 == var1) {
            return null;
        } else {
            var1.method3588();
            return var1;
        }
    }

    @ObfuscatedName("ge.a()Lgx;")
    public class208 method3493() {
        class208 var1 = this.field3076.field3092;
        if (this.field3076 == var1) {
            this.field3075 = null;
            return null;
        } else {
            this.field3075 = var1.field3092;
            return var1;
        }
    }

    @ObfuscatedName("ge.q()Lgx;")
    public class208 method3494() {
        class208 var1 = this.field3076.field3093;
        if (this.field3076 == var1) {
            this.field3075 = null;
            return null;
        } else {
            this.field3075 = var1.field3093;
            return var1;
        }
    }

    @ObfuscatedName("ge.m()Lgx;")
    public class208 method3495() {
        class208 var1 = this.field3075;
        if (this.field3076 == var1) {
            this.field3075 = null;
            return null;
        } else {
            this.field3075 = var1.field3092;
            return var1;
        }
    }

    @ObfuscatedName("ge.n()Lgx;")
    public class208 method3501() {
        class208 var1 = this.field3075;
        if (this.field3076 == var1) {
            this.field3075 = null;
            return null;
        } else {
            this.field3075 = var1.field3093;
            return var1;
        }
    }
}
