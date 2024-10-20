package deob;

@ObfuscatedName("fk")
public class class178 {

    @ObfuscatedName("fk.l")
    public class180 field2832 = new class180();

    @ObfuscatedName("fk.b")
    public class180 field2831;

    public class178() {
        this.field2832.field2836 = this.field2832;
        this.field2832.field2835 = this.field2832;
    }

    @ObfuscatedName("fk.l()V")
    public void method3320() {
        while (true) {
            class180 var1 = this.field2832.field2836;
            if (this.field2832 == var1) {
                this.field2831 = null;
                return;
            }
            var1.method3360();
        }
    }

    @ObfuscatedName("fk.b(Lfm;)V")
    public void method3321(class180 arg0) {
        if (arg0.field2835 != null) {
            arg0.method3360();
        }
        arg0.field2835 = this.field2832.field2835;
        arg0.field2836 = this.field2832;
        arg0.field2835.field2836 = arg0;
        arg0.field2836.field2835 = arg0;
    }

    @ObfuscatedName("fk.o(Lfm;)V")
    public void method3322(class180 arg0) {
        if (arg0.field2835 != null) {
            arg0.method3360();
        }
        arg0.field2835 = this.field2832;
        arg0.field2836 = this.field2832.field2836;
        arg0.field2835.field2836 = arg0;
        arg0.field2836.field2835 = arg0;
    }

    @ObfuscatedName("fk.w(Lfm;Lfm;)V")
    public static void method3323(class180 arg0, class180 arg1) {
        if (arg0.field2835 != null) {
            arg0.method3360();
        }
        arg0.field2835 = arg1.field2835;
        arg0.field2836 = arg1;
        arg0.field2835.field2836 = arg0;
        arg0.field2836.field2835 = arg0;
    }

    @ObfuscatedName("fk.r()Lfm;")
    public class180 method3324() {
        class180 var1 = this.field2832.field2836;
        if (this.field2832 == var1) {
            return null;
        } else {
            var1.method3360();
            return var1;
        }
    }

    @ObfuscatedName("fk.k()Lfm;")
    public class180 method3325() {
        class180 var1 = this.field2832.field2835;
        if (this.field2832 == var1) {
            return null;
        } else {
            var1.method3360();
            return var1;
        }
    }

    @ObfuscatedName("fk.z()Lfm;")
    public class180 method3343() {
        class180 var1 = this.field2832.field2836;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2836;
            return var1;
        }
    }

    @ObfuscatedName("fk.g()Lfm;")
    public class180 method3327() {
        class180 var1 = this.field2832.field2835;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2835;
            return var1;
        }
    }

    @ObfuscatedName("fk.n()Lfm;")
    public class180 method3328() {
        class180 var1 = this.field2831;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2836;
            return var1;
        }
    }

    @ObfuscatedName("fk.j()Lfm;")
    public class180 method3348() {
        class180 var1 = this.field2831;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2835;
            return var1;
        }
    }
}
