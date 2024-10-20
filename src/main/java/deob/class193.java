package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class193 implements Iterable {

    @ObfuscatedName("gk.y")
    public class199 field3012 = new class199();

    public class193() {
        this.field3012.field3025 = this.field3012;
        this.field3012.field3026 = this.field3012;
    }

    @ObfuscatedName("gk.y(Lgb;)V")
    public void method3434(class199 arg0) {
        if (arg0.field3026 != null) {
            arg0.method3482();
        }
        arg0.field3026 = this.field3012.field3026;
        arg0.field3025 = this.field3012;
        arg0.field3026.field3025 = arg0;
        arg0.field3025.field3026 = arg0;
    }

    @ObfuscatedName("gk.k()Lgb;")
    public class199 method3442() {
        return this.method3436((class199) null);
    }

    @ObfuscatedName("gk.g(Lgb;)Lgb;")
    public class199 method3436(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field3012.field3025;
        } else {
            var2 = arg0;
        }
        return this.field3012 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
