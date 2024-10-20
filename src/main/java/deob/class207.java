package deob;

@ObfuscatedName("ga")
public final class class207 {

    @ObfuscatedName("ga.a")
    public class208 field3159 = new class208();

    public class207() {
        this.field3159.field3160 = this.field3159;
        this.field3159.field3161 = this.field3159;
    }

    @ObfuscatedName("ga.a(Lgb;)V")
    public void method3688(class208 arg0) {
        if (arg0.field3161 != null) {
            arg0.method3701();
        }
        arg0.field3161 = this.field3159.field3161;
        arg0.field3160 = this.field3159;
        arg0.field3161.field3160 = arg0;
        arg0.field3160.field3161 = arg0;
    }

    @ObfuscatedName("ga.d(Lgb;)V")
    public void method3689(class208 arg0) {
        if (arg0.field3161 != null) {
            arg0.method3701();
        }
        arg0.field3161 = this.field3159;
        arg0.field3160 = this.field3159.field3160;
        arg0.field3161.field3160 = arg0;
        arg0.field3160.field3161 = arg0;
    }

    @ObfuscatedName("ga.v()Lgb;")
    public class208 method3690() {
        class208 var1 = this.field3159.field3160;
        if (this.field3159 == var1) {
            return null;
        } else {
            var1.method3701();
            return var1;
        }
    }

    @ObfuscatedName("ga.r()Lgb;")
    public class208 method3692() {
        class208 var1 = this.field3159.field3160;
        return this.field3159 == var1 ? null : var1;
    }

    @ObfuscatedName("ga.z()V")
    public void method3697() {
        while (true) {
            class208 var1 = this.field3159.field3160;
            if (this.field3159 == var1) {
                return;
            }
            var1.method3701();
        }
    }
}
