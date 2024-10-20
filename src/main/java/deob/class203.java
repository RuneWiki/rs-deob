package deob;

@ObfuscatedName("gz")
public final class class203 {

    @ObfuscatedName("gz.a")
    public class204 field3099 = new class204();

    public class203() {
        this.field3099.field3101 = this.field3099;
        this.field3099.field3100 = this.field3099;
    }

    @ObfuscatedName("gz.a(Lgq;)V")
    public void method3623(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3635();
        }
        arg0.field3100 = this.field3099.field3100;
        arg0.field3101 = this.field3099;
        arg0.field3100.field3101 = arg0;
        arg0.field3101.field3100 = arg0;
    }

    @ObfuscatedName("gz.r(Lgq;)V")
    public void method3624(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3635();
        }
        arg0.field3100 = this.field3099;
        arg0.field3101 = this.field3099.field3101;
        arg0.field3100.field3101 = arg0;
        arg0.field3101.field3100 = arg0;
    }

    @ObfuscatedName("gz.f()Lgq;")
    public class204 method3625() {
        class204 var1 = this.field3099.field3101;
        if (this.field3099 == var1) {
            return null;
        } else {
            var1.method3635();
            return var1;
        }
    }

    @ObfuscatedName("gz.s()Lgq;")
    public class204 method3627() {
        class204 var1 = this.field3099.field3101;
        return this.field3099 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.y()V")
    public void method3632() {
        while (true) {
            class204 var1 = this.field3099.field3101;
            if (this.field3099 == var1) {
                return;
            }
            var1.method3635();
        }
    }
}
