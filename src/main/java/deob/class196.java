package deob;

@ObfuscatedName("gi")
public class class196 {

    @ObfuscatedName("gi.i")
    public class197 field2481 = new class197();

    @ObfuscatedName("gi.w")
    public class197 field2480;

    public class196() {
        this.field2481.field2483 = this.field2481;
        this.field2481.field2482 = this.field2481;
    }

    @ObfuscatedName("gi.i(Lgy;)V")
    public void method3327(class197 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3334();
        }
        arg0.field2482 = this.field2481.field2482;
        arg0.field2483 = this.field2481;
        arg0.field2482.field2483 = arg0;
        arg0.field2483.field2482 = arg0;
    }

    @ObfuscatedName("gi.w()Lgy;")
    public class197 method3331() {
        class197 var1 = this.field2481.field2483;
        if (this.field2481 == var1) {
            this.field2480 = null;
            return null;
        } else {
            this.field2480 = var1.field2483;
            return var1;
        }
    }

    @ObfuscatedName("gi.a()Lgy;")
    public class197 method3326() {
        class197 var1 = this.field2480;
        if (this.field2481 == var1) {
            this.field2480 = null;
            return null;
        } else {
            this.field2480 = var1.field2483;
            return var1;
        }
    }
}
