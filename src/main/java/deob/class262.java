package deob;

@ObfuscatedName("jv")
public class class262 {

    @ObfuscatedName("jv.c")
    public class181 field3509 = new class181();

    @ObfuscatedName("jv.x")
    public class181 field3510;

    public class262() {
        this.field3509.field2095 = this.field3509;
        this.field3509.field2094 = this.field3509;
    }

    @ObfuscatedName("jv.c()V")
    public void method4544() {
        while (true) {
            class181 var1 = this.field3509.field2095;
            if (this.field3509 == var1) {
                this.field3510 = null;
                return;
            }
            var1.method3326();
        }
    }

    @ObfuscatedName("jv.x(Lfn;)V")
    public void method4572(class181 arg0) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        arg0.field2094 = this.field3509.field2094;
        arg0.field2095 = this.field3509;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
    }

    @ObfuscatedName("jv.t(Lfn;)V")
    public void method4543(class181 arg0) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        arg0.field2094 = this.field3509;
        arg0.field2095 = this.field3509.field2095;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
    }

    @ObfuscatedName("jv.g(Lfn;Lfn;)V")
    public static void method4581(class181 arg0, class181 arg1) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        arg0.field2094 = arg1.field2094;
        arg0.field2095 = arg1;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
    }

    @ObfuscatedName("jv.l()Lfn;")
    public class181 method4548() {
        class181 var1 = this.field3509.field2095;
        if (this.field3509 == var1) {
            return null;
        } else {
            var1.method3326();
            return var1;
        }
    }

    @ObfuscatedName("jv.u()Lfn;")
    public class181 method4549() {
        class181 var1 = this.field3509.field2094;
        if (this.field3509 == var1) {
            return null;
        } else {
            var1.method3326();
            return var1;
        }
    }

    @ObfuscatedName("jv.j()Lfn;")
    public class181 method4550() {
        class181 var1 = this.field3509.field2095;
        if (this.field3509 == var1) {
            this.field3510 = null;
            return null;
        } else {
            this.field3510 = var1.field2095;
            return var1;
        }
    }

    @ObfuscatedName("jv.v()Lfn;")
    public class181 method4551() {
        class181 var1 = this.field3509.field2094;
        if (this.field3509 == var1) {
            this.field3510 = null;
            return null;
        } else {
            this.field3510 = var1.field2094;
            return var1;
        }
    }

    @ObfuscatedName("jv.d()Lfn;")
    public class181 method4573() {
        class181 var1 = this.field3510;
        if (this.field3509 == var1) {
            this.field3510 = null;
            return null;
        } else {
            this.field3510 = var1.field2095;
            return var1;
        }
    }

    @ObfuscatedName("jv.z()Lfn;")
    public class181 method4553() {
        class181 var1 = this.field3510;
        if (this.field3509 == var1) {
            this.field3510 = null;
            return null;
        } else {
            this.field3510 = var1.field2094;
            return var1;
        }
    }
}
