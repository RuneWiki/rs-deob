package deob;

@ObfuscatedName("lc")
public class class336 {

    @ObfuscatedName("lc.c")
    public class412 field4167 = new class412();

    @ObfuscatedName("lc.p")
    public class412 field4168;

    public class336() {
        this.field4167.field4505 = this.field4167;
        this.field4167.field4506 = this.field4167;
    }

    @ObfuscatedName("lc.c()V")
    public void method5641() {
        while (true) {
            class412 var1 = this.field4167.field4505;
            if (this.field4167 == var1) {
                this.field4168 = null;
                return;
            }
            var1.method6657();
        }
    }

    @ObfuscatedName("lc.p(Lov;)V")
    public void method5660(class412 arg0) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        arg0.field4506 = this.field4167.field4506;
        arg0.field4505 = this.field4167;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
    }

    @ObfuscatedName("lc.f(Lov;)V")
    public void method5640(class412 arg0) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        arg0.field4506 = this.field4167;
        arg0.field4505 = this.field4167.field4505;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
    }

    @ObfuscatedName("lc.n(Lov;Lov;)V")
    public static void method5644(class412 arg0, class412 arg1) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        arg0.field4506 = arg1.field4506;
        arg0.field4505 = arg1;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
    }

    @ObfuscatedName("lc.k()Lov;")
    public class412 method5645() {
        class412 var1 = this.field4167.field4505;
        if (this.field4167 == var1) {
            return null;
        } else {
            var1.method6657();
            return var1;
        }
    }

    @ObfuscatedName("lc.w()Lov;")
    public class412 method5664() {
        class412 var1 = this.field4167.field4506;
        if (this.field4167 == var1) {
            return null;
        } else {
            var1.method6657();
            return var1;
        }
    }

    @ObfuscatedName("lc.s()Lov;")
    public class412 method5647() {
        class412 var1 = this.field4167.field4505;
        if (this.field4167 == var1) {
            this.field4168 = null;
            return null;
        } else {
            this.field4168 = var1.field4505;
            return var1;
        }
    }

    @ObfuscatedName("lc.q()Lov;")
    public class412 method5642() {
        class412 var1 = this.field4167.field4506;
        if (this.field4167 == var1) {
            this.field4168 = null;
            return null;
        } else {
            this.field4168 = var1.field4506;
            return var1;
        }
    }

    @ObfuscatedName("lc.m()Lov;")
    public class412 method5649() {
        class412 var1 = this.field4168;
        if (this.field4167 == var1) {
            this.field4168 = null;
            return null;
        } else {
            this.field4168 = var1.field4505;
            return var1;
        }
    }

    @ObfuscatedName("lc.x()Lov;")
    public class412 method5650() {
        class412 var1 = this.field4168;
        if (this.field4167 == var1) {
            this.field4168 = null;
            return null;
        } else {
            this.field4168 = var1.field4506;
            return var1;
        }
    }
}
