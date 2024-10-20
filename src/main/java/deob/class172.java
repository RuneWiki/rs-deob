package deob;

@ObfuscatedName("fk")
public final class class172 {

    @ObfuscatedName("fk.t")
    public class174 field2804 = new class174();

    public class172() {
        this.field2804.field2807 = this.field2804;
        this.field2804.field2808 = this.field2804;
    }

    @ObfuscatedName("fk.t(Lfj;)V")
    public void method3273(class174 arg0) {
        if (arg0.field2808 != null) {
            arg0.method3297();
        }
        arg0.field2808 = this.field2804.field2808;
        arg0.field2807 = this.field2804;
        arg0.field2808.field2807 = arg0;
        arg0.field2807.field2808 = arg0;
    }

    @ObfuscatedName("fk.l(Lfj;)V")
    public void method3283(class174 arg0) {
        if (arg0.field2808 != null) {
            arg0.method3297();
        }
        arg0.field2808 = this.field2804;
        arg0.field2807 = this.field2804.field2807;
        arg0.field2808.field2807 = arg0;
        arg0.field2807.field2808 = arg0;
    }

    @ObfuscatedName("fk.c()Lfj;")
    public class174 method3275() {
        class174 var1 = this.field2804.field2807;
        if (this.field2804 == var1) {
            return null;
        } else {
            var1.method3297();
            return var1;
        }
    }

    @ObfuscatedName("fk.d()Lfj;")
    public class174 method3276() {
        class174 var1 = this.field2804.field2807;
        return this.field2804 == var1 ? null : var1;
    }

    @ObfuscatedName("fk.b()V")
    public void method3277() {
        while (true) {
            class174 var1 = this.field2804.field2807;
            if (this.field2804 == var1) {
                return;
            }
            var1.method3297();
        }
    }
}
