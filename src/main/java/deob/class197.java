package deob;

@ObfuscatedName("gu")
public class class197 {

    @ObfuscatedName("gu.e")
    public class198 field2458 = new class198();

    @ObfuscatedName("gu.n")
    public class198 field2459;

    public class197() {
        this.field2458.field2460 = this.field2458;
        this.field2458.field2461 = this.field2458;
    }

    @ObfuscatedName("gu.e(Lgd;)V")
    public void method3381(class198 arg0) {
        if (arg0.field2461 != null) {
            arg0.method3390();
        }
        arg0.field2461 = this.field2458.field2461;
        arg0.field2460 = this.field2458;
        arg0.field2461.field2460 = arg0;
        arg0.field2460.field2461 = arg0;
    }

    @ObfuscatedName("gu.n()Lgd;")
    public class198 method3383() {
        class198 var1 = this.field2458.field2460;
        if (this.field2458 == var1) {
            this.field2459 = null;
            return null;
        } else {
            this.field2459 = var1.field2460;
            return var1;
        }
    }

    @ObfuscatedName("gu.g()Lgd;")
    public class198 method3384() {
        class198 var1 = this.field2459;
        if (this.field2458 == var1) {
            this.field2459 = null;
            return null;
        } else {
            this.field2459 = var1.field2460;
            return var1;
        }
    }
}
