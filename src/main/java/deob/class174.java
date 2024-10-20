package deob;

@ObfuscatedName("fx")
public class class174 {

    @ObfuscatedName("fx.k")
    public class186 field2850 = new class186();

    @ObfuscatedName("fx.y")
    public class186 field2851;

    public class174() {
        this.field2850.field2876 = this.field2850;
        this.field2850.field2875 = this.field2850;
    }

    @ObfuscatedName("fx.k(Lgb;)V")
    public void method3235(class186 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3363();
        }
        arg0.field2875 = this.field2850.field2875;
        arg0.field2876 = this.field2850;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("fx.y()Lgb;")
    public class186 method3230() {
        class186 var1 = this.field2850.field2876;
        if (this.field2850 == var1) {
            this.field2851 = null;
            return null;
        } else {
            this.field2851 = var1.field2876;
            return var1;
        }
    }

    @ObfuscatedName("fx.s()Lgb;")
    public class186 method3231() {
        class186 var1 = this.field2851;
        if (this.field2850 == var1) {
            this.field2851 = null;
            return null;
        } else {
            this.field2851 = var1.field2876;
            return var1;
        }
    }
}
