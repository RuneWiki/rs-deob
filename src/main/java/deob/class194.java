package deob;

@ObfuscatedName("gp")
public final class class194 {

    @ObfuscatedName("gp.t")
    public class195 field3003 = new class195();

    public class194() {
        this.field3003.field3005 = this.field3003;
        this.field3003.field3004 = this.field3003;
    }

    @ObfuscatedName("gp.t(Lgl;)V")
    public void method3472(class195 arg0) {
        if (arg0.field3004 != null) {
            arg0.method3484();
        }
        arg0.field3004 = this.field3003.field3004;
        arg0.field3005 = this.field3003;
        arg0.field3004.field3005 = arg0;
        arg0.field3005.field3004 = arg0;
    }

    @ObfuscatedName("gp.b(Lgl;)V")
    public void method3470(class195 arg0) {
        if (arg0.field3004 != null) {
            arg0.method3484();
        }
        arg0.field3004 = this.field3003;
        arg0.field3005 = this.field3003.field3005;
        arg0.field3004.field3005 = arg0;
        arg0.field3005.field3004 = arg0;
    }

    @ObfuscatedName("gp.p()Lgl;")
    public class195 method3471() {
        class195 var1 = this.field3003.field3005;
        if (this.field3003 == var1) {
            return null;
        } else {
            var1.method3484();
            return var1;
        }
    }

    @ObfuscatedName("gp.e()Lgl;")
    public class195 method3468() {
        class195 var1 = this.field3003.field3005;
        return this.field3003 == var1 ? null : var1;
    }

    @ObfuscatedName("gp.i()V")
    public void method3473() {
        while (true) {
            class195 var1 = this.field3003.field3005;
            if (this.field3003 == var1) {
                return;
            }
            var1.method3484();
        }
    }
}
