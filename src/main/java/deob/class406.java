package deob;

@ObfuscatedName("pk")
public class class406 {

    @ObfuscatedName("pk.ak")
    public class504 field4629 = new class504();

    @ObfuscatedName("pk.al")
    public class504 field4630;

    public class406() {
        this.field4629.field5048 = this.field4629;
        this.field4629.field5050 = this.field4629;
    }

    @ObfuscatedName("pk.ak()V")
    public void method6828() {
        while (true) {
            class504 var1 = this.field4629.field5048;
            if (this.field4629 == var1) {
                this.field4630 = null;
                return;
            }
            var1.method8189();
        }
    }

    @ObfuscatedName("pk.al(Ltl;)V")
    public void method6829(class504 arg0) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        arg0.field5050 = this.field4629.field5050;
        arg0.field5048 = this.field4629;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
    }

    @ObfuscatedName("pk.aj(Ltl;)V")
    public void method6830(class504 arg0) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        arg0.field5050 = this.field4629;
        arg0.field5048 = this.field4629.field5048;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
    }

    @ObfuscatedName("pk.az(Ltl;Ltl;)V")
    public static void method6831(class504 arg0, class504 arg1) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        arg0.field5050 = arg1.field5050;
        arg0.field5048 = arg1;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
    }

    @ObfuscatedName("pk.af()Ltl;")
    public class504 method6832() {
        class504 var1 = this.field4629.field5048;
        if (this.field4629 == var1) {
            return null;
        } else {
            var1.method8189();
            return var1;
        }
    }

    @ObfuscatedName("pk.aa()Ltl;")
    public class504 method6833() {
        class504 var1 = this.field4629.field5050;
        if (this.field4629 == var1) {
            return null;
        } else {
            var1.method8189();
            return var1;
        }
    }

    @ObfuscatedName("pk.at()Ltl;")
    public class504 method6834() {
        class504 var1 = this.field4629.field5048;
        if (this.field4629 == var1) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var1.field5048;
            return var1;
        }
    }

    @ObfuscatedName("pk.ab()Ltl;")
    public class504 method6835() {
        class504 var1 = this.field4629.field5050;
        if (this.field4629 == var1) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var1.field5050;
            return var1;
        }
    }

    @ObfuscatedName("pk.ac()Ltl;")
    public class504 method6842() {
        class504 var1 = this.field4630;
        if (this.field4629 == var1) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var1.field5048;
            return var1;
        }
    }

    @ObfuscatedName("pk.ao()Ltl;")
    public class504 method6856() {
        class504 var1 = this.field4630;
        if (this.field4629 == var1) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var1.field5050;
            return var1;
        }
    }

    @ObfuscatedName("pk.ah()Z")
    public boolean method6837() {
        return this.field4629.field5048 == this.field4629;
    }
}
