package deob;

@ObfuscatedName("gm")
public final class class207 {

    @ObfuscatedName("gm.i")
    public class208 field3163 = new class208();

    public class207() {
        this.field3163.field3164 = this.field3163;
        this.field3163.field3165 = this.field3163;
    }

    @ObfuscatedName("gm.i(Lgw;)V")
    public void method3655(class208 arg0) {
        if (arg0.field3165 != null) {
            arg0.method3676();
        }
        arg0.field3165 = this.field3163.field3165;
        arg0.field3164 = this.field3163;
        arg0.field3165.field3164 = arg0;
        arg0.field3164.field3165 = arg0;
    }

    @ObfuscatedName("gm.h(Lgw;)V")
    public void method3656(class208 arg0) {
        if (arg0.field3165 != null) {
            arg0.method3676();
        }
        arg0.field3165 = this.field3163;
        arg0.field3164 = this.field3163.field3164;
        arg0.field3165.field3164 = arg0;
        arg0.field3164.field3165 = arg0;
    }

    @ObfuscatedName("gm.e()Lgw;")
    public class208 method3661() {
        class208 var1 = this.field3163.field3164;
        if (this.field3163 == var1) {
            return null;
        } else {
            var1.method3676();
            return var1;
        }
    }

    @ObfuscatedName("gm.g()Lgw;")
    public class208 method3659() {
        class208 var1 = this.field3163.field3164;
        return this.field3163 == var1 ? null : var1;
    }

    @ObfuscatedName("gm.n()V")
    public void method3660() {
        while (true) {
            class208 var1 = this.field3163.field3164;
            if (this.field3163 == var1) {
                return;
            }
            var1.method3676();
        }
    }
}
