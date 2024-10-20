package deob;

@ObfuscatedName("gp")
public class class197 {

    @ObfuscatedName("gp.j")
    public class198 field2476 = new class198();

    @ObfuscatedName("gp.h")
    public class198 field2475;

    public class197() {
        this.field2476.field2478 = this.field2476;
        this.field2476.field2477 = this.field2476;
    }

    @ObfuscatedName("gp.j(Lgb;)V")
    public void method3354(class198 arg0) {
        if (arg0.field2477 != null) {
            arg0.method3362();
        }
        arg0.field2477 = this.field2476.field2477;
        arg0.field2478 = this.field2476;
        arg0.field2477.field2478 = arg0;
        arg0.field2478.field2477 = arg0;
    }

    @ObfuscatedName("gp.h()Lgb;")
    public class198 method3352() {
        class198 var1 = this.field2476.field2478;
        if (this.field2476 == var1) {
            this.field2475 = null;
            return null;
        } else {
            this.field2475 = var1.field2478;
            return var1;
        }
    }

    @ObfuscatedName("gp.f()Lgb;")
    public class198 method3360() {
        class198 var1 = this.field2475;
        if (this.field2476 == var1) {
            this.field2475 = null;
            return null;
        } else {
            this.field2475 = var1.field2478;
            return var1;
        }
    }
}
