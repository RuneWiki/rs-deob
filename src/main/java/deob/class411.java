package deob;

@ObfuscatedName("pu")
public class class411 {

    @ObfuscatedName("pu.ap")
    public class515 field4725 = new class515();

    @ObfuscatedName("pu.aw")
    public class515 field4726;

    public class411() {
        this.field4725.field5171 = this.field4725;
        this.field4725.field5169 = this.field4725;
    }

    @ObfuscatedName("pu.ap()V")
    public void method7248() {
        while (true) {
            class515 var1 = this.field4725.field5171;
            if (this.field4725 == var1) {
                this.field4726 = null;
                return;
            }
            var1.method8667();
        }
    }

    @ObfuscatedName("pu.aw(Ltw;)V")
    public void method7243(class515 arg0) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        arg0.field5169 = this.field4725.field5169;
        arg0.field5171 = this.field4725;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
    }

    @ObfuscatedName("pu.ak(Ltw;)V")
    public void method7244(class515 arg0) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        arg0.field5169 = this.field4725;
        arg0.field5171 = this.field4725.field5171;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
    }

    @ObfuscatedName("pu.aj(Ltw;Ltw;)V")
    public static void method7254(class515 arg0, class515 arg1) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        arg0.field5169 = arg1.field5169;
        arg0.field5171 = arg1;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
    }

    @ObfuscatedName("pu.ai()Ltw;")
    public class515 method7246() {
        class515 var1 = this.field4725.field5171;
        if (this.field4725 == var1) {
            return null;
        } else {
            var1.method8667();
            return var1;
        }
    }

    @ObfuscatedName("pu.ay()Ltw;")
    public class515 method7277() {
        class515 var1 = this.field4725.field5169;
        if (this.field4725 == var1) {
            return null;
        } else {
            var1.method8667();
            return var1;
        }
    }

    @ObfuscatedName("pu.as()Ltw;")
    public class515 method7247() {
        class515 var1 = this.field4725.field5171;
        if (this.field4725 == var1) {
            this.field4726 = null;
            return null;
        } else {
            this.field4726 = var1.field5171;
            return var1;
        }
    }

    @ObfuscatedName("pu.ae()Ltw;")
    public class515 method7262() {
        class515 var1 = this.field4725.field5169;
        if (this.field4725 == var1) {
            this.field4726 = null;
            return null;
        } else {
            this.field4726 = var1.field5169;
            return var1;
        }
    }

    @ObfuscatedName("pu.am()Ltw;")
    public class515 method7249() {
        class515 var1 = this.field4726;
        if (this.field4725 == var1) {
            this.field4726 = null;
            return null;
        } else {
            this.field4726 = var1.field5171;
            return var1;
        }
    }

    @ObfuscatedName("pu.at()Ltw;")
    public class515 method7273() {
        class515 var1 = this.field4726;
        if (this.field4725 == var1) {
            this.field4726 = null;
            return null;
        } else {
            this.field4726 = var1.field5169;
            return var1;
        }
    }
}
