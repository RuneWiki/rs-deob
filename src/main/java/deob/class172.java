package deob;

@ObfuscatedName("fc")
public final class class172 {

    @ObfuscatedName("fc.a")
    public class174 field2800 = new class174();

    public class172() {
        this.field2800.field2804 = this.field2800;
        this.field2800.field2803 = this.field2800;
    }

    @ObfuscatedName("fc.a(Lfd;)V")
    public void method3211(class174 arg0) {
        if (arg0.field2803 != null) {
            arg0.method3227();
        }
        arg0.field2803 = this.field2800.field2803;
        arg0.field2804 = this.field2800;
        arg0.field2803.field2804 = arg0;
        arg0.field2804.field2803 = arg0;
    }

    @ObfuscatedName("fc.x(Lfd;)V")
    public void method3205(class174 arg0) {
        if (arg0.field2803 != null) {
            arg0.method3227();
        }
        arg0.field2803 = this.field2800;
        arg0.field2804 = this.field2800.field2804;
        arg0.field2803.field2804 = arg0;
        arg0.field2804.field2803 = arg0;
    }

    @ObfuscatedName("fc.e()Lfd;")
    public class174 method3206() {
        class174 var1 = this.field2800.field2804;
        if (this.field2800 == var1) {
            return null;
        } else {
            var1.method3227();
            return var1;
        }
    }

    @ObfuscatedName("fc.r()Lfd;")
    public class174 method3203() {
        class174 var1 = this.field2800.field2804;
        return this.field2800 == var1 ? null : var1;
    }

    @ObfuscatedName("fc.p()V")
    public void method3207() {
        while (true) {
            class174 var1 = this.field2800.field2804;
            if (this.field2800 == var1) {
                return;
            }
            var1.method3227();
        }
    }
}
