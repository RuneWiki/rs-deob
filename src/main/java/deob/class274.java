package deob;

@ObfuscatedName("jj")
public class class274 {

    @ObfuscatedName("jj.f")
    public class188 field3560 = new class188();

    @ObfuscatedName("jj.b")
    public class188 field3559;

    public class274() {
        this.field3560.field2137 = this.field3560;
        this.field3560.field2138 = this.field3560;
    }

    @ObfuscatedName("jj.f(Lgq;)V")
    public void method4659(class188 arg0) {
        if (arg0.field2138 != null) {
            arg0.method3404();
        }
        arg0.field2138 = this.field3560.field2138;
        arg0.field2137 = this.field3560;
        arg0.field2138.field2137 = arg0;
        arg0.field2137.field2138 = arg0;
    }

    @ObfuscatedName("jj.b()Lgq;")
    public class188 method4660() {
        class188 var1 = this.field3560.field2137;
        if (this.field3560 == var1) {
            this.field3559 = null;
            return null;
        } else {
            this.field3559 = var1.field2137;
            return var1;
        }
    }

    @ObfuscatedName("jj.l()Lgq;")
    public class188 method4661() {
        class188 var1 = this.field3559;
        if (this.field3560 == var1) {
            this.field3559 = null;
            return null;
        } else {
            this.field3559 = var1.field2137;
            return var1;
        }
    }
}
