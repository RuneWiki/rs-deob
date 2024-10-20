package deob;

@ObfuscatedName("gg")
public final class class203 {

    @ObfuscatedName("gg.h")
    public class204 field3089 = new class204();

    public class203() {
        this.field3089.field3090 = this.field3089;
        this.field3089.field3091 = this.field3089;
    }

    @ObfuscatedName("gg.h(Lgh;)V")
    public void method3592(class204 arg0) {
        if (arg0.field3091 != null) {
            arg0.method3605();
        }
        arg0.field3091 = this.field3089.field3091;
        arg0.field3090 = this.field3089;
        arg0.field3091.field3090 = arg0;
        arg0.field3090.field3091 = arg0;
    }

    @ObfuscatedName("gg.m(Lgh;)V")
    public void method3593(class204 arg0) {
        if (arg0.field3091 != null) {
            arg0.method3605();
        }
        arg0.field3091 = this.field3089;
        arg0.field3090 = this.field3089.field3090;
        arg0.field3091.field3090 = arg0;
        arg0.field3090.field3091 = arg0;
    }

    @ObfuscatedName("gg.i()Lgh;")
    public class204 method3594() {
        class204 var1 = this.field3089.field3090;
        if (this.field3089 == var1) {
            return null;
        } else {
            var1.method3605();
            return var1;
        }
    }

    @ObfuscatedName("gg.q()Lgh;")
    public class204 method3595() {
        class204 var1 = this.field3089.field3090;
        return this.field3089 == var1 ? null : var1;
    }

    @ObfuscatedName("gg.p()V")
    public void method3596() {
        while (true) {
            class204 var1 = this.field3089.field3090;
            if (this.field3089 == var1) {
                return;
            }
            var1.method3605();
        }
    }
}
