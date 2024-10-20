package deob;

@ObfuscatedName("km")
public class class312 {

    @ObfuscatedName("km.l")
    public class364 field3831 = new class364();

    @ObfuscatedName("km.q")
    public class364 field3832;

    public class312() {
        this.field3831.field4067 = this.field3831;
        this.field3831.field4066 = this.field3831;
    }

    @ObfuscatedName("km.l(Lmq;)V")
    public void method5144(class364 arg0) {
        if (arg0.field4066 != null) {
            arg0.method5769();
        }
        arg0.field4066 = this.field3831.field4066;
        arg0.field4067 = this.field3831;
        arg0.field4066.field4067 = arg0;
        arg0.field4067.field4066 = arg0;
    }

    @ObfuscatedName("km.q()Lmq;")
    public class364 method5143() {
        class364 var1 = this.field3831.field4067;
        if (this.field3831 == var1) {
            this.field3832 = null;
            return null;
        } else {
            this.field3832 = var1.field4067;
            return var1;
        }
    }

    @ObfuscatedName("km.f()Lmq;")
    public class364 method5146() {
        class364 var1 = this.field3832;
        if (this.field3831 == var1) {
            this.field3832 = null;
            return null;
        } else {
            this.field3832 = var1.field4067;
            return var1;
        }
    }
}
