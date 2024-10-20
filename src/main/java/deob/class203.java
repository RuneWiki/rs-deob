package deob;

@ObfuscatedName("gx")
public final class class203 {

    @ObfuscatedName("gx.m")
    public class204 field3082 = new class204();

    public class203() {
        this.field3082.field3083 = this.field3082;
        this.field3082.field3084 = this.field3082;
    }

    @ObfuscatedName("gx.m(Lgb;)V")
    public void method3670(class204 arg0) {
        if (arg0.field3084 != null) {
            arg0.method3685();
        }
        arg0.field3084 = this.field3082.field3084;
        arg0.field3083 = this.field3082;
        arg0.field3084.field3083 = arg0;
        arg0.field3083.field3084 = arg0;
    }

    @ObfuscatedName("gx.l(Lgb;)V")
    public void method3671(class204 arg0) {
        if (arg0.field3084 != null) {
            arg0.method3685();
        }
        arg0.field3084 = this.field3082;
        arg0.field3083 = this.field3082.field3083;
        arg0.field3084.field3083 = arg0;
        arg0.field3083.field3084 = arg0;
    }

    @ObfuscatedName("gx.y()Lgb;")
    public class204 method3672() {
        class204 var1 = this.field3082.field3083;
        if (this.field3082 == var1) {
            return null;
        } else {
            var1.method3685();
            return var1;
        }
    }

    @ObfuscatedName("gx.u()Lgb;")
    public class204 method3669() {
        class204 var1 = this.field3082.field3083;
        return this.field3082 == var1 ? null : var1;
    }

    @ObfuscatedName("gx.k()V")
    public void method3675() {
        while (true) {
            class204 var1 = this.field3082.field3083;
            if (this.field3082 == var1) {
                return;
            }
            var1.method3685();
        }
    }
}
