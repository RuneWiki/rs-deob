package deob;

@ObfuscatedName("fi")
public class class177 {

    @ObfuscatedName("fi.q")
    public class179 field2825 = new class179();

    @ObfuscatedName("fi.c")
    public class179 field2826;

    public class177() {
        this.field2825.field2829 = this.field2825;
        this.field2825.field2831 = this.field2825;
    }

    @ObfuscatedName("fi.q()V")
    public void method3275() {
        while (true) {
            class179 var1 = this.field2825.field2829;
            if (this.field2825 == var1) {
                this.field2826 = null;
                return;
            }
            var1.method3309();
        }
    }

    @ObfuscatedName("fi.c(Lft;)V")
    public void method3288(class179 arg0) {
        if (arg0.field2831 != null) {
            arg0.method3309();
        }
        arg0.field2831 = this.field2825.field2831;
        arg0.field2829 = this.field2825;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
    }

    @ObfuscatedName("fi.p(Lft;)V")
    public void method3277(class179 arg0) {
        if (arg0.field2831 != null) {
            arg0.method3309();
        }
        arg0.field2831 = this.field2825;
        arg0.field2829 = this.field2825.field2829;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
    }

    @ObfuscatedName("fi.z(Lft;Lft;)V")
    public static void method3295(class179 arg0, class179 arg1) {
        if (arg0.field2831 != null) {
            arg0.method3309();
        }
        arg0.field2831 = arg1.field2831;
        arg0.field2829 = arg1;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
    }

    @ObfuscatedName("fi.m()Lft;")
    public class179 method3279() {
        class179 var1 = this.field2825.field2829;
        if (this.field2825 == var1) {
            return null;
        } else {
            var1.method3309();
            return var1;
        }
    }

    @ObfuscatedName("fi.k()Lft;")
    public class179 method3280() {
        class179 var1 = this.field2825.field2831;
        if (this.field2825 == var1) {
            return null;
        } else {
            var1.method3309();
            return var1;
        }
    }

    @ObfuscatedName("fi.v()Lft;")
    public class179 method3286() {
        class179 var1 = this.field2825.field2829;
        if (this.field2825 == var1) {
            this.field2826 = null;
            return null;
        } else {
            this.field2826 = var1.field2829;
            return var1;
        }
    }

    @ObfuscatedName("fi.y()Lft;")
    public class179 method3282() {
        class179 var1 = this.field2825.field2831;
        if (this.field2825 == var1) {
            this.field2826 = null;
            return null;
        } else {
            this.field2826 = var1.field2831;
            return var1;
        }
    }

    @ObfuscatedName("fi.d()Lft;")
    public class179 method3302() {
        class179 var1 = this.field2826;
        if (this.field2825 == var1) {
            this.field2826 = null;
            return null;
        } else {
            this.field2826 = var1.field2829;
            return var1;
        }
    }

    @ObfuscatedName("fi.l()Lft;")
    public class179 method3284() {
        class179 var1 = this.field2826;
        if (this.field2825 == var1) {
            this.field2826 = null;
            return null;
        } else {
            this.field2826 = var1.field2831;
            return var1;
        }
    }
}
