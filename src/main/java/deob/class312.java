package deob;

@ObfuscatedName("ky")
public class class312 {

    @ObfuscatedName("ky.i")
    public class364 field3818 = new class364();

    @ObfuscatedName("ky.w")
    public class364 field3819;

    public class312() {
        this.field3818.field4065 = this.field3818;
        this.field3818.field4066 = this.field3818;
    }

    @ObfuscatedName("ky.i(Lmk;)V")
    public void method5111(class364 arg0) {
        if (arg0.field4066 != null) {
            arg0.method5746();
        }
        arg0.field4066 = this.field3818.field4066;
        arg0.field4065 = this.field3818;
        arg0.field4066.field4065 = arg0;
        arg0.field4065.field4066 = arg0;
    }

    @ObfuscatedName("ky.w()Lmk;")
    public class364 method5110() {
        class364 var1 = this.field3818.field4065;
        if (this.field3818 == var1) {
            this.field3819 = null;
            return null;
        } else {
            this.field3819 = var1.field4065;
            return var1;
        }
    }

    @ObfuscatedName("ky.s()Lmk;")
    public class364 method5109() {
        class364 var1 = this.field3819;
        if (this.field3818 == var1) {
            this.field3819 = null;
            return null;
        } else {
            this.field3819 = var1.field4065;
            return var1;
        }
    }
}
