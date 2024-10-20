package deob;

@ObfuscatedName("gz")
public final class class203 {

    @ObfuscatedName("gz.n")
    public class204 field3099 = new class204();

    public class203() {
        this.field3099.field3101 = this.field3099;
        this.field3099.field3100 = this.field3099;
    }

    @ObfuscatedName("gz.n(Lgg;)V")
    public void method3600(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3618();
        }
        arg0.field3100 = this.field3099.field3100;
        arg0.field3101 = this.field3099;
        arg0.field3100.field3101 = arg0;
        arg0.field3101.field3100 = arg0;
    }

    @ObfuscatedName("gz.q(Lgg;)V")
    public void method3604(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3618();
        }
        arg0.field3100 = this.field3099;
        arg0.field3101 = this.field3099.field3101;
        arg0.field3100.field3101 = arg0;
        arg0.field3101.field3100 = arg0;
    }

    @ObfuscatedName("gz.c()Lgg;")
    public class204 method3612() {
        class204 var1 = this.field3099.field3101;
        if (this.field3099 == var1) {
            return null;
        } else {
            var1.method3618();
            return var1;
        }
    }

    @ObfuscatedName("gz.l()Lgg;")
    public class204 method3603() {
        class204 var1 = this.field3099.field3101;
        return this.field3099 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.r()V")
    public void method3606() {
        while (true) {
            class204 var1 = this.field3099.field3101;
            if (this.field3099 == var1) {
                return;
            }
            var1.method3618();
        }
    }
}
