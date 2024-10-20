package deob;

@ObfuscatedName("fu")
public class class178 {

    @ObfuscatedName("fu.p")
    public class190 field2875 = new class190();

    @ObfuscatedName("fu.y")
    public class190 field2874;

    public class178() {
        this.field2875.field2899 = this.field2875;
        this.field2875.field2900 = this.field2875;
    }

    @ObfuscatedName("fu.p(Lgq;)V")
    public void method3220(class190 arg0) {
        if (arg0.field2900 != null) {
            arg0.method3350();
        }
        arg0.field2900 = this.field2875.field2900;
        arg0.field2899 = this.field2875;
        arg0.field2900.field2899 = arg0;
        arg0.field2899.field2900 = arg0;
    }

    @ObfuscatedName("fu.y()Lgq;")
    public class190 method3217() {
        class190 var1 = this.field2875.field2899;
        if (this.field2875 == var1) {
            this.field2874 = null;
            return null;
        } else {
            this.field2874 = var1.field2899;
            return var1;
        }
    }

    @ObfuscatedName("fu.d()Lgq;")
    public class190 method3215() {
        class190 var1 = this.field2874;
        if (this.field2875 == var1) {
            this.field2874 = null;
            return null;
        } else {
            this.field2874 = var1.field2899;
            return var1;
        }
    }
}
