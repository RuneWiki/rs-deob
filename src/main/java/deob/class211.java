package deob;

@ObfuscatedName("hy")
public class class211 {

    @ObfuscatedName("hy.y")
    public class212 field2480 = new class212();

    @ObfuscatedName("hy.c")
    public class212 field2479;

    public class211() {
        this.field2480.field2481 = this.field2480;
        this.field2480.field2482 = this.field2480;
    }

    @ObfuscatedName("hy.y(Lhq;)V")
    public void method3814(class212 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3821();
        }
        arg0.field2482 = this.field2480.field2482;
        arg0.field2481 = this.field2480;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
    }

    @ObfuscatedName("hy.c()Lhq;")
    public class212 method3815() {
        class212 var1 = this.field2480.field2481;
        if (this.field2480 == var1) {
            this.field2479 = null;
            return null;
        } else {
            this.field2479 = var1.field2481;
            return var1;
        }
    }

    @ObfuscatedName("hy.n()Lhq;")
    public class212 method3818() {
        class212 var1 = this.field2479;
        if (this.field2480 == var1) {
            this.field2479 = null;
            return null;
        } else {
            this.field2479 = var1.field2481;
            return var1;
        }
    }
}
