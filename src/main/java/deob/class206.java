package deob;

@ObfuscatedName("gn")
public class class206 {

    @ObfuscatedName("gn.z")
    public class205 field2426 = new class205();

    @ObfuscatedName("gn.w")
    public class205 field2425;

    public class206() {
        this.field2426.field2423 = this.field2426;
        this.field2426.field2424 = this.field2426;
    }

    @ObfuscatedName("gn.z()V")
    public void method3764() {
        while (true) {
            class205 var1 = this.field2426.field2423;
            if (this.field2426 == var1) {
                this.field2425 = null;
                return;
            }
            var1.method3756();
        }
    }

    @ObfuscatedName("gn.w(Lga;)V")
    public void method3765(class205 arg0) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        arg0.field2424 = this.field2426.field2424;
        arg0.field2423 = this.field2426;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
    }

    @ObfuscatedName("gn.s(Lga;)V")
    public void method3766(class205 arg0) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        arg0.field2424 = this.field2426;
        arg0.field2423 = this.field2426.field2423;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
    }

    @ObfuscatedName("gn.l(Lga;Lga;)V")
    public static void method3767(class205 arg0, class205 arg1) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        arg0.field2424 = arg1.field2424;
        arg0.field2423 = arg1;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
    }

    @ObfuscatedName("gn.u()Lga;")
    public class205 method3768() {
        class205 var1 = this.field2426.field2423;
        if (this.field2426 == var1) {
            return null;
        } else {
            var1.method3756();
            return var1;
        }
    }

    @ObfuscatedName("gn.q()Lga;")
    public class205 method3772() {
        class205 var1 = this.field2426.field2424;
        if (this.field2426 == var1) {
            return null;
        } else {
            var1.method3756();
            return var1;
        }
    }

    @ObfuscatedName("gn.i()Lga;")
    public class205 method3790() {
        class205 var1 = this.field2426.field2423;
        if (this.field2426 == var1) {
            this.field2425 = null;
            return null;
        } else {
            this.field2425 = var1.field2423;
            return var1;
        }
    }

    @ObfuscatedName("gn.x()Lga;")
    public class205 method3775() {
        class205 var1 = this.field2426.field2424;
        if (this.field2426 == var1) {
            this.field2425 = null;
            return null;
        } else {
            this.field2425 = var1.field2424;
            return var1;
        }
    }

    @ObfuscatedName("gn.e()Lga;")
    public class205 method3771() {
        class205 var1 = this.field2425;
        if (this.field2426 == var1) {
            this.field2425 = null;
            return null;
        } else {
            this.field2425 = var1.field2423;
            return var1;
        }
    }

    @ObfuscatedName("gn.p()Lga;")
    public class205 method3785() {
        class205 var1 = this.field2425;
        if (this.field2426 == var1) {
            this.field2425 = null;
            return null;
        } else {
            this.field2425 = var1.field2424;
            return var1;
        }
    }
}
