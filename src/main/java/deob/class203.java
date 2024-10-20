package deob;

@ObfuscatedName("gw")
public final class class203 {

    @ObfuscatedName("gw.f")
    public class204 field3094 = new class204();

    public class203() {
        this.field3094.field3096 = this.field3094;
        this.field3094.field3095 = this.field3094;
    }

    @ObfuscatedName("gw.f(Lgj;)V")
    public void method3621(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3636();
        }
        arg0.field3095 = this.field3094.field3095;
        arg0.field3096 = this.field3094;
        arg0.field3095.field3096 = arg0;
        arg0.field3096.field3095 = arg0;
    }

    @ObfuscatedName("gw.s(Lgj;)V")
    public void method3622(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3636();
        }
        arg0.field3095 = this.field3094;
        arg0.field3096 = this.field3094.field3096;
        arg0.field3095.field3096 = arg0;
        arg0.field3096.field3095 = arg0;
    }

    @ObfuscatedName("gw.q()Lgj;")
    public class204 method3623() {
        class204 var1 = this.field3094.field3096;
        if (this.field3094 == var1) {
            return null;
        } else {
            var1.method3636();
            return var1;
        }
    }

    @ObfuscatedName("gw.g()Lgj;")
    public class204 method3624() {
        class204 var1 = this.field3094.field3096;
        return this.field3094 == var1 ? null : var1;
    }

    @ObfuscatedName("gw.m()V")
    public void method3625() {
        while (true) {
            class204 var1 = this.field3094.field3096;
            if (this.field3094 == var1) {
                return;
            }
            var1.method3636();
        }
    }
}
