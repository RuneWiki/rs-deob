package deob;

@ObfuscatedName("gc")
public class class196 {

    @ObfuscatedName("gc.i")
    public class197 field2473 = new class197();

    @ObfuscatedName("gc.h")
    public class197 field2474;

    public class196() {
        this.field2473.field2476 = this.field2473;
        this.field2473.field2475 = this.field2473;
    }

    @ObfuscatedName("gc.i(Lgw;)V")
    public void method3405(class197 arg0) {
        if (arg0.field2475 != null) {
            arg0.method3415();
        }
        arg0.field2475 = this.field2473.field2475;
        arg0.field2476 = this.field2473;
        arg0.field2475.field2476 = arg0;
        arg0.field2476.field2475 = arg0;
    }

    @ObfuscatedName("gc.h()Lgw;")
    public class197 method3406() {
        class197 var1 = this.field2473.field2476;
        if (this.field2473 == var1) {
            this.field2474 = null;
            return null;
        } else {
            this.field2474 = var1.field2476;
            return var1;
        }
    }

    @ObfuscatedName("gc.u()Lgw;")
    public class197 method3407() {
        class197 var1 = this.field2474;
        if (this.field2473 == var1) {
            this.field2474 = null;
            return null;
        } else {
            this.field2474 = var1.field2476;
            return var1;
        }
    }
}
