package deob;

@ObfuscatedName("gg")
public class class186 {

    @ObfuscatedName("gg.p")
    public class198 field2987 = new class198();

    @ObfuscatedName("gg.k")
    public class198 field2988;

    public class186() {
        this.field2987.field3012 = this.field2987;
        this.field2987.field3013 = this.field2987;
    }

    @ObfuscatedName("gg.p(Lgv;)V")
    public void method3401(class198 arg0) {
        if (arg0.field3013 != null) {
            arg0.method3532();
        }
        arg0.field3013 = this.field2987.field3013;
        arg0.field3012 = this.field2987;
        arg0.field3013.field3012 = arg0;
        arg0.field3012.field3013 = arg0;
    }

    @ObfuscatedName("gg.k()Lgv;")
    public class198 method3395() {
        class198 var1 = this.field2987.field3012;
        if (this.field2987 == var1) {
            this.field2988 = null;
            return null;
        } else {
            this.field2988 = var1.field3012;
            return var1;
        }
    }

    @ObfuscatedName("gg.e()Lgv;")
    public class198 method3396() {
        class198 var1 = this.field2988;
        if (this.field2987 == var1) {
            this.field2988 = null;
            return null;
        } else {
            this.field2988 = var1.field3012;
            return var1;
        }
    }
}
