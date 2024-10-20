package deob;

@ObfuscatedName("gl")
public final class class207 {

    @ObfuscatedName("gl.l")
    public class208 field3163 = new class208();

    public class207() {
        this.field3163.field3165 = this.field3163;
        this.field3163.field3164 = this.field3163;
    }

    @ObfuscatedName("gl.l(Lgm;)V")
    public void method3781(class208 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3793();
        }
        arg0.field3164 = this.field3163.field3164;
        arg0.field3165 = this.field3163;
        arg0.field3164.field3165 = arg0;
        arg0.field3165.field3164 = arg0;
    }

    @ObfuscatedName("gl.g(Lgm;)V")
    public void method3791(class208 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3793();
        }
        arg0.field3164 = this.field3163;
        arg0.field3165 = this.field3163.field3165;
        arg0.field3164.field3165 = arg0;
        arg0.field3165.field3164 = arg0;
    }

    @ObfuscatedName("gl.r()Lgm;")
    public class208 method3780() {
        class208 var1 = this.field3163.field3165;
        if (this.field3163 == var1) {
            return null;
        } else {
            var1.method3793();
            return var1;
        }
    }

    @ObfuscatedName("gl.e()Lgm;")
    public class208 method3777() {
        class208 var1 = this.field3163.field3165;
        return this.field3163 == var1 ? null : var1;
    }

    @ObfuscatedName("gl.h()V")
    public void method3782() {
        while (true) {
            class208 var1 = this.field3163.field3165;
            if (this.field3163 == var1) {
                return;
            }
            var1.method3793();
        }
    }
}
