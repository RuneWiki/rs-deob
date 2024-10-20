package deob;

@ObfuscatedName("jj")
public class class274 {

    @ObfuscatedName("jj.h")
    public class188 field3572 = new class188();

    @ObfuscatedName("jj.v")
    public class188 field3571;

    public class274() {
        this.field3572.field2134 = this.field3572;
        this.field3572.field2135 = this.field3572;
    }

    @ObfuscatedName("jj.h(Lgm;)V")
    public void method4571(class188 arg0) {
        if (arg0.field2135 != null) {
            arg0.method3357();
        }
        arg0.field2135 = this.field3572.field2135;
        arg0.field2134 = this.field3572;
        arg0.field2135.field2134 = arg0;
        arg0.field2134.field2135 = arg0;
    }

    @ObfuscatedName("jj.v()Lgm;")
    public class188 method4570() {
        class188 var1 = this.field3572.field2134;
        if (this.field3572 == var1) {
            this.field3571 = null;
            return null;
        } else {
            this.field3571 = var1.field2134;
            return var1;
        }
    }

    @ObfuscatedName("jj.x()Lgm;")
    public class188 method4573() {
        class188 var1 = this.field3571;
        if (this.field3572 == var1) {
            this.field3571 = null;
            return null;
        } else {
            this.field3571 = var1.field2134;
            return var1;
        }
    }
}
