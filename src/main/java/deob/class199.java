package deob;

@ObfuscatedName("gb")
public class class199 {

    @ObfuscatedName("gb.i")
    public class208 field3083 = new class208();

    @ObfuscatedName("gb.v")
    public class208 field3084;

    public class199() {
        this.field3083.field3099 = this.field3083;
        this.field3083.field3101 = this.field3083;
    }

    @ObfuscatedName("gb.i()V")
    public void method3553() {
        while (true) {
            class208 var1 = this.field3083.field3099;
            if (this.field3083 == var1) {
                this.field3084 = null;
                return;
            }
            var1.method3626();
        }
    }

    @ObfuscatedName("gb.v(Lgo;)V")
    public void method3529(class208 arg0) {
        if (arg0.field3101 != null) {
            arg0.method3626();
        }
        arg0.field3101 = this.field3083.field3101;
        arg0.field3099 = this.field3083;
        arg0.field3101.field3099 = arg0;
        arg0.field3099.field3101 = arg0;
    }

    @ObfuscatedName("gb.r(Lgo;)V")
    public void method3530(class208 arg0) {
        if (arg0.field3101 != null) {
            arg0.method3626();
        }
        arg0.field3101 = this.field3083;
        arg0.field3099 = this.field3083.field3099;
        arg0.field3101.field3099 = arg0;
        arg0.field3099.field3101 = arg0;
    }

    @ObfuscatedName("gb.n(Lgo;Lgo;)V")
    public static void method3546(class208 arg0, class208 arg1) {
        if (arg0.field3101 != null) {
            arg0.method3626();
        }
        arg0.field3101 = arg1.field3101;
        arg0.field3099 = arg1;
        arg0.field3101.field3099 = arg0;
        arg0.field3099.field3101 = arg0;
    }

    @ObfuscatedName("gb.x()Lgo;")
    public class208 method3532() {
        class208 var1 = this.field3083.field3099;
        if (this.field3083 == var1) {
            return null;
        } else {
            var1.method3626();
            return var1;
        }
    }

    @ObfuscatedName("gb.q()Lgo;")
    public class208 method3531() {
        class208 var1 = this.field3083.field3101;
        if (this.field3083 == var1) {
            return null;
        } else {
            var1.method3626();
            return var1;
        }
    }

    @ObfuscatedName("gb.h()Lgo;")
    public class208 method3534() {
        class208 var1 = this.field3083.field3099;
        if (this.field3083 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3099;
            return var1;
        }
    }

    @ObfuscatedName("gb.d()Lgo;")
    public class208 method3540() {
        class208 var1 = this.field3083.field3101;
        if (this.field3083 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3101;
            return var1;
        }
    }

    @ObfuscatedName("gb.c()Lgo;")
    public class208 method3536() {
        class208 var1 = this.field3084;
        if (this.field3083 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3099;
            return var1;
        }
    }

    @ObfuscatedName("gb.y()Lgo;")
    public class208 method3537() {
        class208 var1 = this.field3084;
        if (this.field3083 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3101;
            return var1;
        }
    }
}
