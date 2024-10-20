package deob;

@ObfuscatedName("gg")
public class class196 {

    @ObfuscatedName("gg.w")
    public class197 field2472 = new class197();

    @ObfuscatedName("gg.s")
    public class197 field2471;

    public class196() {
        this.field2472.field2473 = this.field2472;
        this.field2472.field2474 = this.field2472;
    }

    @ObfuscatedName("gg.w(Lgw;)V")
    public void method3461(class197 arg0) {
        if (arg0.field2474 != null) {
            arg0.method3466();
        }
        arg0.field2474 = this.field2472.field2474;
        arg0.field2473 = this.field2472;
        arg0.field2474.field2473 = arg0;
        arg0.field2473.field2474 = arg0;
    }

    @ObfuscatedName("gg.s()Lgw;")
    public class197 method3462() {
        class197 var1 = this.field2472.field2473;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2473;
            return var1;
        }
    }

    @ObfuscatedName("gg.q()Lgw;")
    public class197 method3465() {
        class197 var1 = this.field2471;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2473;
            return var1;
        }
    }
}
