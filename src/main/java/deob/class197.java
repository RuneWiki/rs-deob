package deob;

@ObfuscatedName("gv")
public class class197 {

    @ObfuscatedName("gv.i")
    public class198 field2481 = new class198();

    @ObfuscatedName("gv.j")
    public class198 field2480;

    public class197() {
        this.field2481.field2482 = this.field2481;
        this.field2481.field2483 = this.field2481;
    }

    @ObfuscatedName("gv.i(Lgb;)V")
    public void method3447(class198 arg0) {
        if (arg0.field2483 != null) {
            arg0.method3463();
        }
        arg0.field2483 = this.field2481.field2483;
        arg0.field2482 = this.field2481;
        arg0.field2483.field2482 = arg0;
        arg0.field2482.field2483 = arg0;
    }

    @ObfuscatedName("gv.j()Lgb;")
    public class198 method3448() {
        class198 var1 = this.field2481.field2482;
        if (this.field2481 == var1) {
            this.field2480 = null;
            return null;
        } else {
            this.field2480 = var1.field2482;
            return var1;
        }
    }

    @ObfuscatedName("gv.a()Lgb;")
    public class198 method3449() {
        class198 var1 = this.field2480;
        if (this.field2481 == var1) {
            this.field2480 = null;
            return null;
        } else {
            this.field2480 = var1.field2482;
            return var1;
        }
    }
}
