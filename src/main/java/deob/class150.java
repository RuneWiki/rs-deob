package deob;

@ObfuscatedName("ej")
public class class150 {

    @ObfuscatedName("ej.d")
    public class149 field2035 = new class149();

    @ObfuscatedName("ej.c")
    public class149 field2036;

    public class150() {
        this.field2035.field2032 = this.field2035;
        this.field2035.field2033 = this.field2035;
    }

    @ObfuscatedName("ej.d()V")
    public void method2661() {
        while (true) {
            class149 var1 = this.field2035.field2032;
            if (this.field2035 == var1) {
                this.field2036 = null;
                return;
            }
            var1.method2652();
        }
    }

    @ObfuscatedName("ej.c(Lew;)V")
    public void method2662(class149 arg0) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        arg0.field2033 = this.field2035.field2033;
        arg0.field2032 = this.field2035;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
    }

    @ObfuscatedName("ej.n(Lew;)V")
    public void method2681(class149 arg0) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        arg0.field2033 = this.field2035;
        arg0.field2032 = this.field2035.field2032;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
    }

    @ObfuscatedName("ej.q(Lew;Lew;)V")
    public static void method2660(class149 arg0, class149 arg1) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        arg0.field2033 = arg1.field2033;
        arg0.field2032 = arg1;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
    }

    @ObfuscatedName("ej.t()Lew;")
    public class149 method2664() {
        class149 var1 = this.field2035.field2032;
        if (this.field2035 == var1) {
            return null;
        } else {
            var1.method2652();
            return var1;
        }
    }

    @ObfuscatedName("ej.p()Lew;")
    public class149 method2665() {
        class149 var1 = this.field2035.field2033;
        if (this.field2035 == var1) {
            return null;
        } else {
            var1.method2652();
            return var1;
        }
    }

    @ObfuscatedName("ej.u()Lew;")
    public class149 method2666() {
        class149 var1 = this.field2035.field2032;
        if (this.field2035 == var1) {
            this.field2036 = null;
            return null;
        } else {
            this.field2036 = var1.field2032;
            return var1;
        }
    }

    @ObfuscatedName("ej.w()Lew;")
    public class149 method2667() {
        class149 var1 = this.field2035.field2033;
        if (this.field2035 == var1) {
            this.field2036 = null;
            return null;
        } else {
            this.field2036 = var1.field2033;
            return var1;
        }
    }

    @ObfuscatedName("ej.r()Lew;")
    public class149 method2668() {
        class149 var1 = this.field2036;
        if (this.field2035 == var1) {
            this.field2036 = null;
            return null;
        } else {
            this.field2036 = var1.field2032;
            return var1;
        }
    }

    @ObfuscatedName("ej.s()Lew;")
    public class149 method2669() {
        class149 var1 = this.field2036;
        if (this.field2035 == var1) {
            this.field2036 = null;
            return null;
        } else {
            this.field2036 = var1.field2033;
            return var1;
        }
    }
}
