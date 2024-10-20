package deob;

@ObfuscatedName("fw")
public class class180 {

    @ObfuscatedName("fw.l")
    public class189 field2870 = new class189();

    @ObfuscatedName("fw.y")
    public class189 field2869;

    public class180() {
        this.field2870.field2885 = this.field2870;
        this.field2870.field2887 = this.field2870;
    }

    @ObfuscatedName("fw.l()V")
    public void method3276() {
        while (true) {
            class189 var1 = this.field2870.field2885;
            if (this.field2870 == var1) {
                this.field2869 = null;
                return;
            }
            var1.method3375();
        }
    }

    @ObfuscatedName("fw.y(Lgv;)V")
    public void method3278(class189 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3375();
        }
        arg0.field2887 = this.field2870.field2887;
        arg0.field2885 = this.field2870;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("fw.g(Lgv;)V")
    public void method3290(class189 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3375();
        }
        arg0.field2887 = this.field2870;
        arg0.field2885 = this.field2870.field2885;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("fw.j(Lgv;Lgv;)V")
    public static void method3279(class189 arg0, class189 arg1) {
        if (arg0.field2887 != null) {
            arg0.method3375();
        }
        arg0.field2887 = arg1.field2887;
        arg0.field2885 = arg1;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("fw.w()Lgv;")
    public class189 method3280() {
        class189 var1 = this.field2870.field2885;
        if (this.field2870 == var1) {
            return null;
        } else {
            var1.method3375();
            return var1;
        }
    }

    @ObfuscatedName("fw.c()Lgv;")
    public class189 method3281() {
        class189 var1 = this.field2870.field2887;
        if (this.field2870 == var1) {
            return null;
        } else {
            var1.method3375();
            return var1;
        }
    }

    @ObfuscatedName("fw.x()Lgv;")
    public class189 method3304() {
        class189 var1 = this.field2870.field2885;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2885;
            return var1;
        }
    }

    @ObfuscatedName("fw.f()Lgv;")
    public class189 method3292() {
        class189 var1 = this.field2870.field2887;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2887;
            return var1;
        }
    }

    @ObfuscatedName("fw.t()Lgv;")
    public class189 method3297() {
        class189 var1 = this.field2869;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2885;
            return var1;
        }
    }

    @ObfuscatedName("fw.n()Lgv;")
    public class189 method3314() {
        class189 var1 = this.field2869;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2887;
            return var1;
        }
    }
}
