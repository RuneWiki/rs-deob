package deob;

@ObfuscatedName("ft")
public class class182 {

    @ObfuscatedName("ft.p")
    public class191 field2885 = new class191();

    @ObfuscatedName("ft.y")
    public class191 field2886;

    public class182() {
        this.field2885.field2902 = this.field2885;
        this.field2885.field2901 = this.field2885;
    }

    @ObfuscatedName("ft.p()V")
    public void method3255() {
        while (true) {
            class191 var1 = this.field2885.field2902;
            if (this.field2885 == var1) {
                this.field2886 = null;
                return;
            }
            var1.method3358();
        }
    }

    @ObfuscatedName("ft.y(Lgu;)V")
    public void method3256(class191 arg0) {
        if (arg0.field2901 != null) {
            arg0.method3358();
        }
        arg0.field2901 = this.field2885.field2901;
        arg0.field2902 = this.field2885;
        arg0.field2901.field2902 = arg0;
        arg0.field2902.field2901 = arg0;
    }

    @ObfuscatedName("ft.d(Lgu;)V")
    public void method3273(class191 arg0) {
        if (arg0.field2901 != null) {
            arg0.method3358();
        }
        arg0.field2901 = this.field2885;
        arg0.field2902 = this.field2885.field2902;
        arg0.field2901.field2902 = arg0;
        arg0.field2902.field2901 = arg0;
    }

    @ObfuscatedName("ft.c(Lgu;Lgu;)V")
    public static void method3258(class191 arg0, class191 arg1) {
        if (arg0.field2901 != null) {
            arg0.method3358();
        }
        arg0.field2901 = arg1.field2901;
        arg0.field2902 = arg1;
        arg0.field2901.field2902 = arg0;
        arg0.field2902.field2901 = arg0;
    }

    @ObfuscatedName("ft.r()Lgu;")
    public class191 method3279() {
        class191 var1 = this.field2885.field2902;
        if (this.field2885 == var1) {
            return null;
        } else {
            var1.method3358();
            return var1;
        }
    }

    @ObfuscatedName("ft.f()Lgu;")
    public class191 method3259() {
        class191 var1 = this.field2885.field2901;
        if (this.field2885 == var1) {
            return null;
        } else {
            var1.method3358();
            return var1;
        }
    }

    @ObfuscatedName("ft.z()Lgu;")
    public class191 method3270() {
        class191 var1 = this.field2885.field2902;
        if (this.field2885 == var1) {
            this.field2886 = null;
            return null;
        } else {
            this.field2886 = var1.field2902;
            return var1;
        }
    }

    @ObfuscatedName("ft.o()Lgu;")
    public class191 method3261() {
        class191 var1 = this.field2885.field2901;
        if (this.field2885 == var1) {
            this.field2886 = null;
            return null;
        } else {
            this.field2886 = var1.field2901;
            return var1;
        }
    }

    @ObfuscatedName("ft.k()Lgu;")
    public class191 method3262() {
        class191 var1 = this.field2886;
        if (this.field2885 == var1) {
            this.field2886 = null;
            return null;
        } else {
            this.field2886 = var1.field2902;
            return var1;
        }
    }

    @ObfuscatedName("ft.s()Lgu;")
    public class191 method3276() {
        class191 var1 = this.field2886;
        if (this.field2885 == var1) {
            this.field2886 = null;
            return null;
        } else {
            this.field2886 = var1.field2901;
            return var1;
        }
    }
}
