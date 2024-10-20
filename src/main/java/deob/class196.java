package deob;

@ObfuscatedName("gs")
public class class196 {

    @ObfuscatedName("gs.e")
    public class197 field2460 = new class197();

    @ObfuscatedName("gs.o")
    public class197 field2459;

    public class196() {
        this.field2460.field2461 = this.field2460;
        this.field2460.field2462 = this.field2460;
    }

    @ObfuscatedName("gs.e(Lgi;)V")
    public void method3352(class197 arg0) {
        if (arg0.field2462 != null) {
            arg0.method3364();
        }
        arg0.field2462 = this.field2460.field2462;
        arg0.field2461 = this.field2460;
        arg0.field2462.field2461 = arg0;
        arg0.field2461.field2462 = arg0;
    }

    @ObfuscatedName("gs.o()Lgi;")
    public class197 method3354() {
        class197 var1 = this.field2460.field2461;
        if (this.field2460 == var1) {
            this.field2459 = null;
            return null;
        } else {
            this.field2459 = var1.field2461;
            return var1;
        }
    }

    @ObfuscatedName("gs.m()Lgi;")
    public class197 method3353() {
        class197 var1 = this.field2459;
        if (this.field2460 == var1) {
            this.field2459 = null;
            return null;
        } else {
            this.field2459 = var1.field2461;
            return var1;
        }
    }
}
