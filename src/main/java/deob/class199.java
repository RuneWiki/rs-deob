package deob;

@ObfuscatedName("gq")
public class class199 {

    @ObfuscatedName("gq.a")
    public class211 field3142 = new class211();

    @ObfuscatedName("gq.d")
    public class211 field3143;

    public class199() {
        this.field3142.field3169 = this.field3142;
        this.field3142.field3168 = this.field3142;
    }

    @ObfuscatedName("gq.a(Lho;)V")
    public void method3570(class211 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3725();
        }
        arg0.field3168 = this.field3142.field3168;
        arg0.field3169 = this.field3142;
        arg0.field3168.field3169 = arg0;
        arg0.field3169.field3168 = arg0;
    }

    @ObfuscatedName("gq.d()Lho;")
    public class211 method3572() {
        class211 var1 = this.field3142.field3169;
        if (this.field3142 == var1) {
            this.field3143 = null;
            return null;
        } else {
            this.field3143 = var1.field3169;
            return var1;
        }
    }

    @ObfuscatedName("gq.v()Lho;")
    public class211 method3573() {
        class211 var1 = this.field3143;
        if (this.field3142 == var1) {
            this.field3143 = null;
            return null;
        } else {
            this.field3143 = var1.field3169;
            return var1;
        }
    }
}
