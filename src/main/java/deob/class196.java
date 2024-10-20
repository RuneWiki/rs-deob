package deob;

@ObfuscatedName("gk")
public class class196 {

    @ObfuscatedName("gk.d")
    public class197 field2493 = new class197();

    @ObfuscatedName("gk.k")
    public class197 field2492;

    public class196() {
        this.field2493.field2494 = this.field2493;
        this.field2493.field2495 = this.field2493;
    }

    @ObfuscatedName("gk.d(Lgz;)V")
    public void method3463(class197 arg0) {
        if (arg0.field2495 != null) {
            arg0.method3466();
        }
        arg0.field2495 = this.field2493.field2495;
        arg0.field2494 = this.field2493;
        arg0.field2495.field2494 = arg0;
        arg0.field2494.field2495 = arg0;
    }

    @ObfuscatedName("gk.k()Lgz;")
    public class197 method3454() {
        class197 var1 = this.field2493.field2494;
        if (this.field2493 == var1) {
            this.field2492 = null;
            return null;
        } else {
            this.field2492 = var1.field2494;
            return var1;
        }
    }

    @ObfuscatedName("gk.e()Lgz;")
    public class197 method3460() {
        class197 var1 = this.field2492;
        if (this.field2493 == var1) {
            this.field2492 = null;
            return null;
        } else {
            this.field2492 = var1.field2494;
            return var1;
        }
    }
}
