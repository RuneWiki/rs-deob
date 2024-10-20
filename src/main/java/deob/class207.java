package deob;

@ObfuscatedName("gw")
public final class class207 {

    @ObfuscatedName("gw.e")
    public class208 field3151 = new class208();

    public class207() {
        this.field3151.field3153 = this.field3151;
        this.field3151.field3152 = this.field3151;
    }

    @ObfuscatedName("gw.e(Lgf;)V")
    public void method3718(class208 arg0) {
        if (arg0.field3152 != null) {
            arg0.method3733();
        }
        arg0.field3152 = this.field3151.field3152;
        arg0.field3153 = this.field3151;
        arg0.field3152.field3153 = arg0;
        arg0.field3153.field3152 = arg0;
    }

    @ObfuscatedName("gw.l(Lgf;)V")
    public void method3728(class208 arg0) {
        if (arg0.field3152 != null) {
            arg0.method3733();
        }
        arg0.field3152 = this.field3151;
        arg0.field3153 = this.field3151.field3153;
        arg0.field3152.field3153 = arg0;
        arg0.field3153.field3152 = arg0;
    }

    @ObfuscatedName("gw.c()Lgf;")
    public class208 method3724() {
        class208 var1 = this.field3151.field3153;
        if (this.field3151 == var1) {
            return null;
        } else {
            var1.method3733();
            return var1;
        }
    }

    @ObfuscatedName("gw.h()Lgf;")
    public class208 method3720() {
        class208 var1 = this.field3151.field3153;
        return this.field3151 == var1 ? null : var1;
    }

    @ObfuscatedName("gw.r()V")
    public void method3721() {
        while (true) {
            class208 var1 = this.field3151.field3153;
            if (this.field3151 == var1) {
                return;
            }
            var1.method3733();
        }
    }
}
