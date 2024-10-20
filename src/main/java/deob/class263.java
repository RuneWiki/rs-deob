package deob;

@ObfuscatedName("ja")
public class class263 {

    @ObfuscatedName("ja.a")
    public class179 field3530 = new class179();

    @ObfuscatedName("ja.t")
    public class179 field3529;

    public class263() {
        this.field3530.field2087 = this.field3530;
        this.field3530.field2086 = this.field3530;
    }

    @ObfuscatedName("ja.a(Lfz;)V")
    public void method4604(class179 arg0) {
        if (arg0.field2086 != null) {
            arg0.method3384();
        }
        arg0.field2086 = this.field3530.field2086;
        arg0.field2087 = this.field3530;
        arg0.field2086.field2087 = arg0;
        arg0.field2087.field2086 = arg0;
    }

    @ObfuscatedName("ja.t()Lfz;")
    public class179 method4605() {
        class179 var1 = this.field3530.field2087;
        if (this.field3530 == var1) {
            this.field3529 = null;
            return null;
        } else {
            this.field3529 = var1.field2087;
            return var1;
        }
    }

    @ObfuscatedName("ja.n()Lfz;")
    public class179 method4606() {
        class179 var1 = this.field3529;
        if (this.field3530 == var1) {
            this.field3529 = null;
            return null;
        } else {
            this.field3529 = var1.field2087;
            return var1;
        }
    }
}
