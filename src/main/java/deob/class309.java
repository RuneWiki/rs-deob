package deob;

@ObfuscatedName("kf")
public class class309 {

    @ObfuscatedName("kf.l")
    public class370 field3825 = new class370();

    @ObfuscatedName("kf.q")
    public class370 field3824;

    public class309() {
        this.field3825.field4076 = this.field3825;
        this.field3825.field4077 = this.field3825;
    }

    @ObfuscatedName("kf.l()V")
    public void method5014() {
        while (true) {
            class370 var1 = this.field3825.field4076;
            if (this.field3825 == var1) {
                this.field3824 = null;
                return;
            }
            var1.method5775();
        }
    }

    @ObfuscatedName("kf.q(Lnv;)V")
    public void method5015(class370 arg0) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        arg0.field4077 = this.field3825.field4077;
        arg0.field4076 = this.field3825;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
    }

    @ObfuscatedName("kf.f(Lnv;)V")
    public void method5037(class370 arg0) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        arg0.field4077 = this.field3825;
        arg0.field4076 = this.field3825.field4076;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
    }

    @ObfuscatedName("kf.j(Lnv;Lnv;)V")
    public static void method5017(class370 arg0, class370 arg1) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        arg0.field4077 = arg1.field4077;
        arg0.field4076 = arg1;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
    }

    @ObfuscatedName("kf.m()Lnv;")
    public class370 method5032() {
        class370 var1 = this.field3825.field4076;
        if (this.field3825 == var1) {
            return null;
        } else {
            var1.method5775();
            return var1;
        }
    }

    @ObfuscatedName("kf.k()Lnv;")
    public class370 method5019() {
        class370 var1 = this.field3825.field4077;
        if (this.field3825 == var1) {
            return null;
        } else {
            var1.method5775();
            return var1;
        }
    }

    @ObfuscatedName("kf.t()Lnv;")
    public class370 method5035() {
        class370 var1 = this.field3825.field4076;
        if (this.field3825 == var1) {
            this.field3824 = null;
            return null;
        } else {
            this.field3824 = var1.field4076;
            return var1;
        }
    }

    @ObfuscatedName("kf.a()Lnv;")
    public class370 method5021() {
        class370 var1 = this.field3825.field4077;
        if (this.field3825 == var1) {
            this.field3824 = null;
            return null;
        } else {
            this.field3824 = var1.field4077;
            return var1;
        }
    }

    @ObfuscatedName("kf.e()Lnv;")
    public class370 method5022() {
        class370 var1 = this.field3824;
        if (this.field3825 == var1) {
            this.field3824 = null;
            return null;
        } else {
            this.field3824 = var1.field4076;
            return var1;
        }
    }

    @ObfuscatedName("kf.i()Lnv;")
    public class370 method5023() {
        class370 var1 = this.field3824;
        if (this.field3825 == var1) {
            this.field3824 = null;
            return null;
        } else {
            this.field3824 = var1.field4077;
            return var1;
        }
    }
}
