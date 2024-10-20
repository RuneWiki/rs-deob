package deob;

@ObfuscatedName("gx")
public final class class196 {

    @ObfuscatedName("gx.a")
    public class206 field2566 = new class206();

    public class196() {
        this.field2566.field2595 = this.field2566;
        this.field2566.field2594 = this.field2566;
    }

    @ObfuscatedName("gx.a(Lgi;)V")
    public void method3326(class206 arg0) {
        if (arg0.field2594 != null) {
            arg0.method3474();
        }
        arg0.field2594 = this.field2566.field2594;
        arg0.field2595 = this.field2566;
        arg0.field2594.field2595 = arg0;
        arg0.field2595.field2594 = arg0;
    }

    @ObfuscatedName("gx.w(Lgi;)V")
    public void method3327(class206 arg0) {
        if (arg0.field2594 != null) {
            arg0.method3474();
        }
        arg0.field2594 = this.field2566;
        arg0.field2595 = this.field2566.field2595;
        arg0.field2594.field2595 = arg0;
        arg0.field2595.field2594 = arg0;
    }

    @ObfuscatedName("gx.e()Lgi;")
    public class206 method3329() {
        class206 var1 = this.field2566.field2595;
        if (this.field2566 == var1) {
            return null;
        } else {
            var1.method3474();
            return var1;
        }
    }

    @ObfuscatedName("gx.k()Lgi;")
    public class206 method3325() {
        class206 var1 = this.field2566.field2595;
        return this.field2566 == var1 ? null : var1;
    }

    @ObfuscatedName("gx.u()V")
    public void method3330() {
        while (true) {
            class206 var1 = this.field2566.field2595;
            if (this.field2566 == var1) {
                return;
            }
            var1.method3474();
        }
    }
}
