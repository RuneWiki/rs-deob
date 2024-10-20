package deob;

@ObfuscatedName("gp")
public final class class203 {

    @ObfuscatedName("gp.h")
    public class204 field3082 = new class204();

    public class203() {
        this.field3082.field3084 = this.field3082;
        this.field3082.field3083 = this.field3082;
    }

    @ObfuscatedName("gp.h(Lgo;)V")
    public void method3668(class204 arg0) {
        if (arg0.field3083 != null) {
            arg0.method3689();
        }
        arg0.field3083 = this.field3082.field3083;
        arg0.field3084 = this.field3082;
        arg0.field3083.field3084 = arg0;
        arg0.field3084.field3083 = arg0;
    }

    @ObfuscatedName("gp.q(Lgo;)V")
    public void method3669(class204 arg0) {
        if (arg0.field3083 != null) {
            arg0.method3689();
        }
        arg0.field3083 = this.field3082;
        arg0.field3084 = this.field3082.field3084;
        arg0.field3083.field3084 = arg0;
        arg0.field3084.field3083 = arg0;
    }

    @ObfuscatedName("gp.v()Lgo;")
    public class204 method3670() {
        class204 var1 = this.field3082.field3084;
        if (this.field3082 == var1) {
            return null;
        } else {
            var1.method3689();
            return var1;
        }
    }

    @ObfuscatedName("gp.n()Lgo;")
    public class204 method3671() {
        class204 var1 = this.field3082.field3084;
        return this.field3082 == var1 ? null : var1;
    }

    @ObfuscatedName("gp.f()V")
    public void method3678() {
        while (true) {
            class204 var1 = this.field3082.field3084;
            if (this.field3082 == var1) {
                return;
            }
            var1.method3689();
        }
    }
}
