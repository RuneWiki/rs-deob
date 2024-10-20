package deob;

@ObfuscatedName("ga")
public class class196 {

    @ObfuscatedName("ga.e")
    public class208 field3089 = new class208();

    @ObfuscatedName("ga.w")
    public class208 field3088;

    public class196() {
        this.field3089.field3113 = this.field3089;
        this.field3089.field3114 = this.field3089;
    }

    @ObfuscatedName("ga.e(Lgx;)V")
    public void method3497(class208 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3630();
        }
        arg0.field3114 = this.field3089.field3114;
        arg0.field3113 = this.field3089;
        arg0.field3114.field3113 = arg0;
        arg0.field3113.field3114 = arg0;
    }

    @ObfuscatedName("ga.w()Lgx;")
    public class208 method3503() {
        class208 var1 = this.field3089.field3113;
        if (this.field3089 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3113;
            return var1;
        }
    }

    @ObfuscatedName("ga.f()Lgx;")
    public class208 method3498() {
        class208 var1 = this.field3088;
        if (this.field3089 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3113;
            return var1;
        }
    }
}
