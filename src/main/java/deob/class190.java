package deob;

@ObfuscatedName("gh")
public class class190 {

    @ObfuscatedName("gh.b")
    public class199 field2989 = new class199();

    @ObfuscatedName("gh.e")
    public class199 field2990;

    public class190() {
        this.field2989.field3005 = this.field2989;
        this.field2989.field3007 = this.field2989;
    }

    @ObfuscatedName("gh.b()V")
    public void method3318() {
        while (true) {
            class199 var1 = this.field2989.field3005;
            if (this.field2989 == var1) {
                this.field2990 = null;
                return;
            }
            var1.method3414();
        }
    }

    @ObfuscatedName("gh.e(Lgv;)V")
    public void method3319(class199 arg0) {
        if (arg0.field3007 != null) {
            arg0.method3414();
        }
        arg0.field3007 = this.field2989.field3007;
        arg0.field3005 = this.field2989;
        arg0.field3007.field3005 = arg0;
        arg0.field3005.field3007 = arg0;
    }

    @ObfuscatedName("gh.a(Lgv;)V")
    public void method3320(class199 arg0) {
        if (arg0.field3007 != null) {
            arg0.method3414();
        }
        arg0.field3007 = this.field2989;
        arg0.field3005 = this.field2989.field3005;
        arg0.field3007.field3005 = arg0;
        arg0.field3005.field3007 = arg0;
    }

    @ObfuscatedName("gh.k(Lgv;Lgv;)V")
    public static void method3321(class199 arg0, class199 arg1) {
        if (arg0.field3007 != null) {
            arg0.method3414();
        }
        arg0.field3007 = arg1.field3007;
        arg0.field3005 = arg1;
        arg0.field3007.field3005 = arg0;
        arg0.field3005.field3007 = arg0;
    }

    @ObfuscatedName("gh.p()Lgv;")
    public class199 method3340() {
        class199 var1 = this.field2989.field3005;
        if (this.field2989 == var1) {
            return null;
        } else {
            var1.method3414();
            return var1;
        }
    }

    @ObfuscatedName("gh.l()Lgv;")
    public class199 method3323() {
        class199 var1 = this.field2989.field3007;
        if (this.field2989 == var1) {
            return null;
        } else {
            var1.method3414();
            return var1;
        }
    }

    @ObfuscatedName("gh.u()Lgv;")
    public class199 method3324() {
        class199 var1 = this.field2989.field3005;
        if (this.field2989 == var1) {
            this.field2990 = null;
            return null;
        } else {
            this.field2990 = var1.field3005;
            return var1;
        }
    }

    @ObfuscatedName("gh.o()Lgv;")
    public class199 method3325() {
        class199 var1 = this.field2989.field3007;
        if (this.field2989 == var1) {
            this.field2990 = null;
            return null;
        } else {
            this.field2990 = var1.field3007;
            return var1;
        }
    }

    @ObfuscatedName("gh.m()Lgv;")
    public class199 method3326() {
        class199 var1 = this.field2990;
        if (this.field2989 == var1) {
            this.field2990 = null;
            return null;
        } else {
            this.field2990 = var1.field3005;
            return var1;
        }
    }

    @ObfuscatedName("gh.q()Lgv;")
    public class199 method3317() {
        class199 var1 = this.field2990;
        if (this.field2989 == var1) {
            this.field2990 = null;
            return null;
        } else {
            this.field2990 = var1.field3007;
            return var1;
        }
    }
}
