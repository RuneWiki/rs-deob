package deob;

@ObfuscatedName("gj")
public final class class193 {

    @ObfuscatedName("gj.e")
    public class194 field2951 = new class194();

    public class193() {
        this.field2951.field2952 = this.field2951;
        this.field2951.field2953 = this.field2951;
    }

    @ObfuscatedName("gj.e(Lgd;)V")
    public void method3429(class194 arg0) {
        if (arg0.field2953 != null) {
            arg0.method3440();
        }
        arg0.field2953 = this.field2951.field2953;
        arg0.field2952 = this.field2951;
        arg0.field2953.field2952 = arg0;
        arg0.field2952.field2953 = arg0;
    }

    @ObfuscatedName("gj.a(Lgd;)V")
    public void method3422(class194 arg0) {
        if (arg0.field2953 != null) {
            arg0.method3440();
        }
        arg0.field2953 = this.field2951;
        arg0.field2952 = this.field2951.field2952;
        arg0.field2953.field2952 = arg0;
        arg0.field2952.field2953 = arg0;
    }

    @ObfuscatedName("gj.l()Lgd;")
    public class194 method3424() {
        class194 var1 = this.field2951.field2952;
        if (this.field2951 == var1) {
            return null;
        } else {
            var1.method3440();
            return var1;
        }
    }

    @ObfuscatedName("gj.c()Lgd;")
    public class194 method3425() {
        class194 var1 = this.field2951.field2952;
        return this.field2951 == var1 ? null : var1;
    }

    @ObfuscatedName("gj.u()V")
    public void method3426() {
        while (true) {
            class194 var1 = this.field2951.field2952;
            if (this.field2951 == var1) {
                return;
            }
            var1.method3440();
        }
    }
}
