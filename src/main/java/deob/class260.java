package deob;

@ObfuscatedName("in")
public final class class260 {

    @ObfuscatedName("in.f")
    public class183 field3499 = new class183();

    public class260() {
        this.field3499.field2314 = this.field3499;
        this.field3499.field2316 = this.field3499;
    }

    @ObfuscatedName("in.f(Lgw;)V")
    public void method4435(class183 arg0) {
        if (arg0.field2316 != null) {
            arg0.method3286();
        }
        arg0.field2316 = this.field3499.field2316;
        arg0.field2314 = this.field3499;
        arg0.field2316.field2314 = arg0;
        arg0.field2314.field2316 = arg0;
    }

    @ObfuscatedName("in.i(Lgw;)V")
    public void method4431(class183 arg0) {
        if (arg0.field2316 != null) {
            arg0.method3286();
        }
        arg0.field2316 = this.field3499;
        arg0.field2314 = this.field3499.field2314;
        arg0.field2316.field2314 = arg0;
        arg0.field2314.field2316 = arg0;
    }

    @ObfuscatedName("in.y()Lgw;")
    public class183 method4437() {
        class183 var1 = this.field3499.field2314;
        return this.field3499 == var1 ? null : var1;
    }
}
