package deob;

@ObfuscatedName("jv")
public class class262 {

    @ObfuscatedName("jv.z")
    public class181 field3525 = new class181();

    @ObfuscatedName("jv.n")
    public class181 field3524;

    public class262() {
        this.field3525.field2093 = this.field3525;
        this.field3525.field2095 = this.field3525;
    }

    @ObfuscatedName("jv.z()V")
    public void method4432() {
        while (true) {
            class181 var1 = this.field3525.field2093;
            if (this.field3525 == var1) {
                this.field3524 = null;
                return;
            }
            var1.method3249();
        }
    }

    @ObfuscatedName("jv.n(Lfx;)V")
    public void method4433(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        arg0.field2095 = this.field3525.field2095;
        arg0.field2093 = this.field3525;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
    }

    @ObfuscatedName("jv.v(Lfx;)V")
    public void method4434(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        arg0.field2095 = this.field3525;
        arg0.field2093 = this.field3525.field2093;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
    }

    @ObfuscatedName("jv.u(Lfx;Lfx;)V")
    public static void method4458(class181 arg0, class181 arg1) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        arg0.field2095 = arg1.field2095;
        arg0.field2093 = arg1;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
    }

    @ObfuscatedName("jv.r()Lfx;")
    public class181 method4436() {
        class181 var1 = this.field3525.field2093;
        if (this.field3525 == var1) {
            return null;
        } else {
            var1.method3249();
            return var1;
        }
    }

    @ObfuscatedName("jv.p()Lfx;")
    public class181 method4437() {
        class181 var1 = this.field3525.field2095;
        if (this.field3525 == var1) {
            return null;
        } else {
            var1.method3249();
            return var1;
        }
    }

    @ObfuscatedName("jv.q()Lfx;")
    public class181 method4431() {
        class181 var1 = this.field3525.field2093;
        if (this.field3525 == var1) {
            this.field3524 = null;
            return null;
        } else {
            this.field3524 = var1.field2093;
            return var1;
        }
    }

    @ObfuscatedName("jv.m()Lfx;")
    public class181 method4439() {
        class181 var1 = this.field3525.field2095;
        if (this.field3525 == var1) {
            this.field3524 = null;
            return null;
        } else {
            this.field3524 = var1.field2095;
            return var1;
        }
    }

    @ObfuscatedName("jv.y()Lfx;")
    public class181 method4454() {
        class181 var1 = this.field3524;
        if (this.field3525 == var1) {
            this.field3524 = null;
            return null;
        } else {
            this.field3524 = var1.field2093;
            return var1;
        }
    }

    @ObfuscatedName("jv.i()Lfx;")
    public class181 method4456() {
        class181 var1 = this.field3524;
        if (this.field3525 == var1) {
            this.field3524 = null;
            return null;
        } else {
            this.field3524 = var1.field2095;
            return var1;
        }
    }
}
