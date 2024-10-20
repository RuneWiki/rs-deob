package deob;

@ObfuscatedName("kn")
public class class309 {

    @ObfuscatedName("kn.n")
    public class369 field3818 = new class369();

    @ObfuscatedName("kn.c")
    public class369 field3817;

    public class309() {
        this.field3818.field4055 = this.field3818;
        this.field3818.field4057 = this.field3818;
    }

    @ObfuscatedName("kn.n()V")
    public void method4958() {
        while (true) {
            class369 var1 = this.field3818.field4055;
            if (this.field3818 == var1) {
                this.field3817 = null;
                return;
            }
            var1.method5732();
        }
    }

    @ObfuscatedName("kn.c(Lnr;)V")
    public void method4986(class369 arg0) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        arg0.field4057 = this.field3818.field4057;
        arg0.field4055 = this.field3818;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
    }

    @ObfuscatedName("kn.m(Lnr;)V")
    public void method4968(class369 arg0) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        arg0.field4057 = this.field3818;
        arg0.field4055 = this.field3818.field4055;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
    }

    @ObfuscatedName("kn.k(Lnr;Lnr;)V")
    public static void method4961(class369 arg0, class369 arg1) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        arg0.field4057 = arg1.field4057;
        arg0.field4055 = arg1;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
    }

    @ObfuscatedName("kn.o()Lnr;")
    public class369 method4957() {
        class369 var1 = this.field3818.field4055;
        if (this.field3818 == var1) {
            return null;
        } else {
            var1.method5732();
            return var1;
        }
    }

    @ObfuscatedName("kn.g()Lnr;")
    public class369 method4963() {
        class369 var1 = this.field3818.field4057;
        if (this.field3818 == var1) {
            return null;
        } else {
            var1.method5732();
            return var1;
        }
    }

    @ObfuscatedName("kn.z()Lnr;")
    public class369 method4962() {
        class369 var1 = this.field3818.field4055;
        if (this.field3818 == var1) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var1.field4055;
            return var1;
        }
    }

    @ObfuscatedName("kn.a()Lnr;")
    public class369 method4965() {
        class369 var1 = this.field3818.field4057;
        if (this.field3818 == var1) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var1.field4057;
            return var1;
        }
    }

    @ObfuscatedName("kn.u()Lnr;")
    public class369 method4985() {
        class369 var1 = this.field3817;
        if (this.field3818 == var1) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var1.field4055;
            return var1;
        }
    }

    @ObfuscatedName("kn.e()Lnr;")
    public class369 method4959() {
        class369 var1 = this.field3817;
        if (this.field3818 == var1) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var1.field4057;
            return var1;
        }
    }
}
