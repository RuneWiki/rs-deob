package deob;

@ObfuscatedName("gd")
public final class class194 {

    @ObfuscatedName("gd.n")
    public class195 field2996 = new class195();

    public class194() {
        this.field2996.field2997 = this.field2996;
        this.field2996.field2998 = this.field2996;
    }

    @ObfuscatedName("gd.n(Lgb;)V")
    public void method3526(class195 arg0) {
        if (arg0.field2998 != null) {
            arg0.method3541();
        }
        arg0.field2998 = this.field2996.field2998;
        arg0.field2997 = this.field2996;
        arg0.field2998.field2997 = arg0;
        arg0.field2997.field2998 = arg0;
    }

    @ObfuscatedName("gd.d(Lgb;)V")
    public void method3527(class195 arg0) {
        if (arg0.field2998 != null) {
            arg0.method3541();
        }
        arg0.field2998 = this.field2996;
        arg0.field2997 = this.field2996.field2997;
        arg0.field2998.field2997 = arg0;
        arg0.field2997.field2998 = arg0;
    }

    @ObfuscatedName("gd.z()Lgb;")
    public class195 method3528() {
        class195 var1 = this.field2996.field2997;
        if (this.field2996 == var1) {
            return null;
        } else {
            var1.method3541();
            return var1;
        }
    }

    @ObfuscatedName("gd.y()Lgb;")
    public class195 method3529() {
        class195 var1 = this.field2996.field2997;
        return this.field2996 == var1 ? null : var1;
    }

    @ObfuscatedName("gd.e()V")
    public void method3530() {
        while (true) {
            class195 var1 = this.field2996.field2997;
            if (this.field2996 == var1) {
                return;
            }
            var1.method3541();
        }
    }
}
