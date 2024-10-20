package deob;

@ObfuscatedName("gq")
public final class class207 {

    @ObfuscatedName("gq.k")
    public class208 field3155 = new class208();

    public class207() {
        this.field3155.field3156 = this.field3155;
        this.field3155.field3157 = this.field3155;
    }

    @ObfuscatedName("gq.k(Lgv;)V")
    public void method3672(class208 arg0) {
        if (arg0.field3157 != null) {
            arg0.method3684();
        }
        arg0.field3157 = this.field3155.field3157;
        arg0.field3156 = this.field3155;
        arg0.field3157.field3156 = arg0;
        arg0.field3156.field3157 = arg0;
    }

    @ObfuscatedName("gq.q(Lgv;)V")
    public void method3668(class208 arg0) {
        if (arg0.field3157 != null) {
            arg0.method3684();
        }
        arg0.field3157 = this.field3155;
        arg0.field3156 = this.field3155.field3156;
        arg0.field3157.field3156 = arg0;
        arg0.field3156.field3157 = arg0;
    }

    @ObfuscatedName("gq.f()Lgv;")
    public class208 method3669() {
        class208 var1 = this.field3155.field3156;
        if (this.field3155 == var1) {
            return null;
        } else {
            var1.method3684();
            return var1;
        }
    }

    @ObfuscatedName("gq.c()Lgv;")
    public class208 method3666() {
        class208 var1 = this.field3155.field3156;
        return this.field3155 == var1 ? null : var1;
    }

    @ObfuscatedName("gq.v()V")
    public void method3671() {
        while (true) {
            class208 var1 = this.field3155.field3156;
            if (this.field3155 == var1) {
                return;
            }
            var1.method3684();
        }
    }
}
