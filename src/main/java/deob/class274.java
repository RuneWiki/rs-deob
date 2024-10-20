package deob;

@ObfuscatedName("jw")
public class class274 {

    @ObfuscatedName("jw.n")
    public class188 field3573 = new class188();

    @ObfuscatedName("jw.v")
    public class188 field3574;

    public class274() {
        this.field3573.field2136 = this.field3573;
        this.field3573.field2137 = this.field3573;
    }

    @ObfuscatedName("jw.n(Lgm;)V")
    public void method4732(class188 arg0) {
        if (arg0.field2137 != null) {
            arg0.method3484();
        }
        arg0.field2137 = this.field3573.field2137;
        arg0.field2136 = this.field3573;
        arg0.field2137.field2136 = arg0;
        arg0.field2136.field2137 = arg0;
    }

    @ObfuscatedName("jw.v()Lgm;")
    public class188 method4733() {
        class188 var1 = this.field3573.field2136;
        if (this.field3573 == var1) {
            this.field3574 = null;
            return null;
        } else {
            this.field3574 = var1.field2136;
            return var1;
        }
    }

    @ObfuscatedName("jw.d()Lgm;")
    public class188 method4731() {
        class188 var1 = this.field3574;
        if (this.field3573 == var1) {
            this.field3574 = null;
            return null;
        } else {
            this.field3574 = var1.field2136;
            return var1;
        }
    }
}
