package deob;

@ObfuscatedName("fx")
public class class177 {

    @ObfuscatedName("fx.g")
    public class186 field2860 = new class186();

    @ObfuscatedName("fx.v")
    public class186 field2859;

    public class177() {
        this.field2860.field2876 = this.field2860;
        this.field2860.field2877 = this.field2860;
    }

    @ObfuscatedName("fx.g()V")
    public void method3231() {
        while (true) {
            class186 var1 = this.field2860.field2876;
            if (this.field2860 == var1) {
                this.field2859 = null;
                return;
            }
            var1.method3322();
        }
    }

    @ObfuscatedName("fx.v(Lgc;)V")
    public void method3232(class186 arg0) {
        if (arg0.field2877 != null) {
            arg0.method3322();
        }
        arg0.field2877 = this.field2860.field2877;
        arg0.field2876 = this.field2860;
        arg0.field2877.field2876 = arg0;
        arg0.field2876.field2877 = arg0;
    }

    @ObfuscatedName("fx.z(Lgc;)V")
    public void method3238(class186 arg0) {
        if (arg0.field2877 != null) {
            arg0.method3322();
        }
        arg0.field2877 = this.field2860;
        arg0.field2876 = this.field2860.field2876;
        arg0.field2877.field2876 = arg0;
        arg0.field2876.field2877 = arg0;
    }

    @ObfuscatedName("fx.h(Lgc;Lgc;)V")
    public static void method3234(class186 arg0, class186 arg1) {
        if (arg0.field2877 != null) {
            arg0.method3322();
        }
        arg0.field2877 = arg1.field2877;
        arg0.field2876 = arg1;
        arg0.field2877.field2876 = arg0;
        arg0.field2876.field2877 = arg0;
    }

    @ObfuscatedName("fx.k()Lgc;")
    public class186 method3235() {
        class186 var1 = this.field2860.field2876;
        if (this.field2860 == var1) {
            return null;
        } else {
            var1.method3322();
            return var1;
        }
    }

    @ObfuscatedName("fx.l()Lgc;")
    public class186 method3236() {
        class186 var1 = this.field2860.field2877;
        if (this.field2860 == var1) {
            return null;
        } else {
            var1.method3322();
            return var1;
        }
    }

    @ObfuscatedName("fx.e()Lgc;")
    public class186 method3237() {
        class186 var1 = this.field2860.field2876;
        if (this.field2860 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2876;
            return var1;
        }
    }

    @ObfuscatedName("fx.j()Lgc;")
    public class186 method3230() {
        class186 var1 = this.field2860.field2877;
        if (this.field2860 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2877;
            return var1;
        }
    }

    @ObfuscatedName("fx.n()Lgc;")
    public class186 method3239() {
        class186 var1 = this.field2859;
        if (this.field2860 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2876;
            return var1;
        }
    }

    @ObfuscatedName("fx.f()Lgc;")
    public class186 method3240() {
        class186 var1 = this.field2859;
        if (this.field2860 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2877;
            return var1;
        }
    }
}
