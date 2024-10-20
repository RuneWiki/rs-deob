package deob;

@ObfuscatedName("fe")
public class class176 {

    @ObfuscatedName("fe.e")
    public class183 field2832 = new class183();

    @ObfuscatedName("fe.p")
    public class183 field2831;

    public class176() {
        this.field2832.field2844 = this.field2832;
        this.field2832.field2845 = this.field2832;
    }

    @ObfuscatedName("fe.e()V")
    public void method3231() {
        while (true) {
            class183 var1 = this.field2832.field2844;
            if (this.field2832 == var1) {
                this.field2831 = null;
                return;
            }
            var1.method3307();
        }
    }

    @ObfuscatedName("fe.p(Lgl;)V")
    public void method3222(class183 arg0) {
        if (arg0.field2845 != null) {
            arg0.method3307();
        }
        arg0.field2845 = this.field2832.field2845;
        arg0.field2844 = this.field2832;
        arg0.field2845.field2844 = arg0;
        arg0.field2844.field2845 = arg0;
    }

    @ObfuscatedName("fe.a(Lgl;)V")
    public void method3221(class183 arg0) {
        if (arg0.field2845 != null) {
            arg0.method3307();
        }
        arg0.field2845 = this.field2832;
        arg0.field2844 = this.field2832.field2844;
        arg0.field2845.field2844 = arg0;
        arg0.field2844.field2845 = arg0;
    }

    @ObfuscatedName("fe.g(Lgl;Lgl;)V")
    public static void method3234(class183 arg0, class183 arg1) {
        if (arg0.field2845 != null) {
            arg0.method3307();
        }
        arg0.field2845 = arg1.field2845;
        arg0.field2844 = arg1;
        arg0.field2845.field2844 = arg0;
        arg0.field2844.field2845 = arg0;
    }

    @ObfuscatedName("fe.u()Lgl;")
    public class183 method3223() {
        class183 var1 = this.field2832.field2844;
        if (this.field2832 == var1) {
            return null;
        } else {
            var1.method3307();
            return var1;
        }
    }

    @ObfuscatedName("fe.k()Lgl;")
    public class183 method3224() {
        class183 var1 = this.field2832.field2845;
        if (this.field2832 == var1) {
            return null;
        } else {
            var1.method3307();
            return var1;
        }
    }

    @ObfuscatedName("fe.m()Lgl;")
    public class183 method3225() {
        class183 var1 = this.field2832.field2844;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2844;
            return var1;
        }
    }

    @ObfuscatedName("fe.t()Lgl;")
    public class183 method3226() {
        class183 var1 = this.field2832.field2845;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2845;
            return var1;
        }
    }

    @ObfuscatedName("fe.l()Lgl;")
    public class183 method3227() {
        class183 var1 = this.field2831;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2844;
            return var1;
        }
    }

    @ObfuscatedName("fe.f()Lgl;")
    public class183 method3228() {
        class183 var1 = this.field2831;
        if (this.field2832 == var1) {
            this.field2831 = null;
            return null;
        } else {
            this.field2831 = var1.field2845;
            return var1;
        }
    }
}
