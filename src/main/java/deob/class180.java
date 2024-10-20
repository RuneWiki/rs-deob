package deob;

@ObfuscatedName("fn")
public class class180 {

    @ObfuscatedName("fn.c")
    public class189 field2869 = new class189();

    @ObfuscatedName("fn.j")
    public class189 field2870;

    public class180() {
        this.field2869.field2885 = this.field2869;
        this.field2869.field2887 = this.field2869;
    }

    @ObfuscatedName("fn.c()V")
    public void method3240() {
        while (true) {
            class189 var1 = this.field2869.field2885;
            if (this.field2869 == var1) {
                this.field2870 = null;
                return;
            }
            var1.method3334();
        }
    }

    @ObfuscatedName("fn.j(Lgy;)V")
    public void method3241(class189 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3334();
        }
        arg0.field2887 = this.field2869.field2887;
        arg0.field2885 = this.field2869;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("fn.y(Lgy;)V")
    public void method3242(class189 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3334();
        }
        arg0.field2887 = this.field2869;
        arg0.field2885 = this.field2869.field2885;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("fn.r(Lgy;Lgy;)V")
    public static void method3243(class189 arg0, class189 arg1) {
        if (arg0.field2887 != null) {
            arg0.method3334();
        }
        arg0.field2887 = arg1.field2887;
        arg0.field2885 = arg1;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("fn.f()Lgy;")
    public class189 method3244() {
        class189 var1 = this.field2869.field2885;
        if (this.field2869 == var1) {
            return null;
        } else {
            var1.method3334();
            return var1;
        }
    }

    @ObfuscatedName("fn.l()Lgy;")
    public class189 method3259() {
        class189 var1 = this.field2869.field2887;
        if (this.field2869 == var1) {
            return null;
        } else {
            var1.method3334();
            return var1;
        }
    }

    @ObfuscatedName("fn.b()Lgy;")
    public class189 method3249() {
        class189 var1 = this.field2869.field2885;
        if (this.field2869 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2885;
            return var1;
        }
    }

    @ObfuscatedName("fn.k()Lgy;")
    public class189 method3247() {
        class189 var1 = this.field2869.field2887;
        if (this.field2869 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2887;
            return var1;
        }
    }

    @ObfuscatedName("fn.g()Lgy;")
    public class189 method3248() {
        class189 var1 = this.field2870;
        if (this.field2869 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2885;
            return var1;
        }
    }

    @ObfuscatedName("fn.v()Lgy;")
    public class189 method3246() {
        class189 var1 = this.field2870;
        if (this.field2869 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2887;
            return var1;
        }
    }
}
