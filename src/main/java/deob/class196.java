package deob;

@ObfuscatedName("gj")
public class class196 {

    @ObfuscatedName("gj.d")
    public class197 field2446 = new class197();

    @ObfuscatedName("gj.q")
    public class197 field2447;

    public class196() {
        this.field2446.field2448 = this.field2446;
        this.field2446.field2449 = this.field2446;
    }

    @ObfuscatedName("gj.d(Lge;)V")
    public void method3352(class197 arg0) {
        if (arg0.field2449 != null) {
            arg0.method3362();
        }
        arg0.field2449 = this.field2446.field2449;
        arg0.field2448 = this.field2446;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
    }

    @ObfuscatedName("gj.q()Lge;")
    public class197 method3353() {
        class197 var1 = this.field2446.field2448;
        if (this.field2446 == var1) {
            this.field2447 = null;
            return null;
        } else {
            this.field2447 = var1.field2448;
            return var1;
        }
    }

    @ObfuscatedName("gj.x()Lge;")
    public class197 method3358() {
        class197 var1 = this.field2447;
        if (this.field2446 == var1) {
            this.field2447 = null;
            return null;
        } else {
            this.field2447 = var1.field2448;
            return var1;
        }
    }
}
