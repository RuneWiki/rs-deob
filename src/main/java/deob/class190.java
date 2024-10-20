package deob;

@ObfuscatedName("gw")
public class class190 {

    @ObfuscatedName("gw.n")
    public class199 field2991 = new class199();

    @ObfuscatedName("gw.d")
    public class199 field2992;

    public class190() {
        this.field2991.field3008 = this.field2991;
        this.field2991.field3009 = this.field2991;
    }

    @ObfuscatedName("gw.n()V")
    public void method3483() {
        while (true) {
            class199 var1 = this.field2991.field3008;
            if (this.field2991 == var1) {
                this.field2992 = null;
                return;
            }
            var1.method3562();
        }
    }

    @ObfuscatedName("gw.d(Lga;)V")
    public void method3477(class199 arg0) {
        if (arg0.field3009 != null) {
            arg0.method3562();
        }
        arg0.field3009 = this.field2991.field3009;
        arg0.field3008 = this.field2991;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
    }

    @ObfuscatedName("gw.z(Lga;)V")
    public void method3478(class199 arg0) {
        if (arg0.field3009 != null) {
            arg0.method3562();
        }
        arg0.field3009 = this.field2991;
        arg0.field3008 = this.field2991.field3008;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
    }

    @ObfuscatedName("gw.y(Lga;Lga;)V")
    public static void method3479(class199 arg0, class199 arg1) {
        if (arg0.field3009 != null) {
            arg0.method3562();
        }
        arg0.field3009 = arg1.field3009;
        arg0.field3008 = arg1;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
    }

    @ObfuscatedName("gw.e()Lga;")
    public class199 method3480() {
        class199 var1 = this.field2991.field3008;
        if (this.field2991 == var1) {
            return null;
        } else {
            var1.method3562();
            return var1;
        }
    }

    @ObfuscatedName("gw.g()Lga;")
    public class199 method3481() {
        class199 var1 = this.field2991.field3009;
        if (this.field2991 == var1) {
            return null;
        } else {
            var1.method3562();
            return var1;
        }
    }

    @ObfuscatedName("gw.f()Lga;")
    public class199 method3497() {
        class199 var1 = this.field2991.field3008;
        if (this.field2991 == var1) {
            this.field2992 = null;
            return null;
        } else {
            this.field2992 = var1.field3008;
            return var1;
        }
    }

    @ObfuscatedName("gw.m()Lga;")
    public class199 method3482() {
        class199 var1 = this.field2991.field3009;
        if (this.field2991 == var1) {
            this.field2992 = null;
            return null;
        } else {
            this.field2992 = var1.field3009;
            return var1;
        }
    }

    @ObfuscatedName("gw.a()Lga;")
    public class199 method3475() {
        class199 var1 = this.field2992;
        if (this.field2991 == var1) {
            this.field2992 = null;
            return null;
        } else {
            this.field2992 = var1.field3008;
            return var1;
        }
    }

    @ObfuscatedName("gw.h()Lga;")
    public class199 method3484() {
        class199 var1 = this.field2992;
        if (this.field2991 == var1) {
            this.field2992 = null;
            return null;
        } else {
            this.field2992 = var1.field3009;
            return var1;
        }
    }
}
