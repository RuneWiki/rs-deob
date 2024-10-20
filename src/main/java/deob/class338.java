package deob;

@ObfuscatedName("ly")
public class class338 {

    @ObfuscatedName("ly.s")
    public class405 field4133 = new class405();

    @ObfuscatedName("ly.h")
    public class405 field4132;

    public class338() {
        this.field4133.field4460 = this.field4133;
        this.field4133.field4459 = this.field4133;
    }

    @ObfuscatedName("ly.s(Lof;)V")
    public void method5551(class405 arg0) {
        if (arg0.field4459 != null) {
            arg0.method6404();
        }
        arg0.field4459 = this.field4133.field4459;
        arg0.field4460 = this.field4133;
        arg0.field4459.field4460 = arg0;
        arg0.field4460.field4459 = arg0;
    }

    @ObfuscatedName("ly.h()Lof;")
    public class405 method5549() {
        class405 var1 = this.field4133.field4460;
        if (this.field4133 == var1) {
            this.field4132 = null;
            return null;
        } else {
            this.field4132 = var1.field4460;
            return var1;
        }
    }

    @ObfuscatedName("ly.w()Lof;")
    public class405 method5550() {
        class405 var1 = this.field4132;
        if (this.field4133 == var1) {
            this.field4132 = null;
            return null;
        } else {
            this.field4132 = var1.field4460;
            return var1;
        }
    }
}
