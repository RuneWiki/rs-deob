package deob;

@ObfuscatedName("jh")
public class class272 {

    @ObfuscatedName("jh.x")
    public class190 field3533 = new class190();

    @ObfuscatedName("jh.m")
    public class190 field3534;

    public class272() {
        this.field3533.field2118 = this.field3533;
        this.field3533.field2116 = this.field3533;
    }

    @ObfuscatedName("jh.x()V")
    public void method4553() {
        while (true) {
            class190 var1 = this.field3533.field2118;
            if (this.field3533 == var1) {
                this.field3534 = null;
                return;
            }
            var1.method3355();
        }
    }

    @ObfuscatedName("jh.m(Lga;)V")
    public void method4580(class190 arg0) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        arg0.field2116 = this.field3533.field2116;
        arg0.field2118 = this.field3533;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
    }

    @ObfuscatedName("jh.k(Lga;)V")
    public void method4555(class190 arg0) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        arg0.field2116 = this.field3533;
        arg0.field2118 = this.field3533.field2118;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
    }

    @ObfuscatedName("jh.d(Lga;Lga;)V")
    public static void method4556(class190 arg0, class190 arg1) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        arg0.field2116 = arg1.field2116;
        arg0.field2118 = arg1;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
    }

    @ObfuscatedName("jh.w()Lga;")
    public class190 method4557() {
        class190 var1 = this.field3533.field2118;
        if (this.field3533 == var1) {
            return null;
        } else {
            var1.method3355();
            return var1;
        }
    }

    @ObfuscatedName("jh.v()Lga;")
    public class190 method4558() {
        class190 var1 = this.field3533.field2116;
        if (this.field3533 == var1) {
            return null;
        } else {
            var1.method3355();
            return var1;
        }
    }

    @ObfuscatedName("jh.q()Lga;")
    public class190 method4559() {
        class190 var1 = this.field3533.field2118;
        if (this.field3533 == var1) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var1.field2118;
            return var1;
        }
    }

    @ObfuscatedName("jh.z()Lga;")
    public class190 method4563() {
        class190 var1 = this.field3533.field2116;
        if (this.field3533 == var1) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var1.field2116;
            return var1;
        }
    }

    @ObfuscatedName("jh.t()Lga;")
    public class190 method4577() {
        class190 var1 = this.field3534;
        if (this.field3533 == var1) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var1.field2118;
            return var1;
        }
    }

    @ObfuscatedName("jh.e()Lga;")
    public class190 method4560() {
        class190 var1 = this.field3534;
        if (this.field3533 == var1) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var1.field2116;
            return var1;
        }
    }
}
