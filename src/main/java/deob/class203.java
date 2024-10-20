package deob;

@ObfuscatedName("gg")
public final class class203 {

    @ObfuscatedName("gg.l")
    public class204 field3094 = new class204();

    public class203() {
        this.field3094.field3096 = this.field3094;
        this.field3094.field3095 = this.field3094;
    }

    @ObfuscatedName("gg.l(Lgz;)V")
    public void method3598(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3603();
        }
        arg0.field3095 = this.field3094.field3095;
        arg0.field3096 = this.field3094;
        arg0.field3095.field3096 = arg0;
        arg0.field3096.field3095 = arg0;
    }

    @ObfuscatedName("gg.e(Lgz;)V")
    public void method3588(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3603();
        }
        arg0.field3095 = this.field3094;
        arg0.field3096 = this.field3094.field3096;
        arg0.field3095.field3096 = arg0;
        arg0.field3096.field3095 = arg0;
    }

    @ObfuscatedName("gg.q()Lgz;")
    public class204 method3586() {
        class204 var1 = this.field3094.field3096;
        if (this.field3094 == var1) {
            return null;
        } else {
            var1.method3603();
            return var1;
        }
    }

    @ObfuscatedName("gg.o()Lgz;")
    public class204 method3599() {
        class204 var1 = this.field3094.field3096;
        return this.field3094 == var1 ? null : var1;
    }

    @ObfuscatedName("gg.g()V")
    public void method3591() {
        while (true) {
            class204 var1 = this.field3094.field3096;
            if (this.field3094 == var1) {
                return;
            }
            var1.method3603();
        }
    }
}
