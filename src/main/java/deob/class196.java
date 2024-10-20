package deob;

@ObfuscatedName("gm")
public class class196 {

    @ObfuscatedName("gm.a")
    public class197 field2472 = new class197();

    @ObfuscatedName("gm.j")
    public class197 field2473;

    public class196() {
        this.field2472.field2475 = this.field2472;
        this.field2472.field2474 = this.field2472;
    }

    @ObfuscatedName("gm.a(Lgp;)V")
    public void method3351(class197 arg0) {
        if (arg0.field2474 != null) {
            arg0.method3363();
        }
        arg0.field2474 = this.field2472.field2474;
        arg0.field2475 = this.field2472;
        arg0.field2474.field2475 = arg0;
        arg0.field2475.field2474 = arg0;
    }

    @ObfuscatedName("gm.j()Lgp;")
    public class197 method3360() {
        class197 var1 = this.field2472.field2475;
        if (this.field2472 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2475;
            return var1;
        }
    }

    @ObfuscatedName("gm.n()Lgp;")
    public class197 method3353() {
        class197 var1 = this.field2473;
        if (this.field2472 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2475;
            return var1;
        }
    }
}
