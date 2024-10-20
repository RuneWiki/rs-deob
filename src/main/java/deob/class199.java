package deob;

@ObfuscatedName("gk")
public class class199 {

    @ObfuscatedName("gk.m")
    public class211 field3140 = new class211();

    @ObfuscatedName("gk.w")
    public class211 field3139;

    public class199() {
        this.field3140.field3166 = this.field3140;
        this.field3140.field3165 = this.field3140;
    }

    @ObfuscatedName("gk.m(Lhi;)V")
    public void method3584(class211 arg0) {
        if (arg0.field3165 != null) {
            arg0.method3723();
        }
        arg0.field3165 = this.field3140.field3165;
        arg0.field3166 = this.field3140;
        arg0.field3165.field3166 = arg0;
        arg0.field3166.field3165 = arg0;
    }

    @ObfuscatedName("gk.w()Lhi;")
    public class211 method3580() {
        class211 var1 = this.field3140.field3166;
        if (this.field3140 == var1) {
            this.field3139 = null;
            return null;
        } else {
            this.field3139 = var1.field3166;
            return var1;
        }
    }

    @ObfuscatedName("gk.e()Lhi;")
    public class211 method3581() {
        class211 var1 = this.field3139;
        if (this.field3140 == var1) {
            this.field3139 = null;
            return null;
        } else {
            this.field3139 = var1.field3166;
            return var1;
        }
    }
}
