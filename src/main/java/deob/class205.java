package deob;

@ObfuscatedName("gk")
public final class class205 {

    @ObfuscatedName("gk.b")
    public class215 field2588 = new class215();

    public class205() {
        this.field2588.field2616 = this.field2588;
        this.field2588.field2617 = this.field2588;
    }

    @ObfuscatedName("gk.b(Lht;)V")
    public void method3618(class215 arg0) {
        if (arg0.field2617 != null) {
            arg0.method3766();
        }
        arg0.field2617 = this.field2588.field2617;
        arg0.field2616 = this.field2588;
        arg0.field2617.field2616 = arg0;
        arg0.field2616.field2617 = arg0;
    }

    @ObfuscatedName("gk.q(Lht;)V")
    public void method3619(class215 arg0) {
        if (arg0.field2617 != null) {
            arg0.method3766();
        }
        arg0.field2617 = this.field2588;
        arg0.field2616 = this.field2588.field2616;
        arg0.field2617.field2616 = arg0;
        arg0.field2616.field2617 = arg0;
    }

    @ObfuscatedName("gk.o()Lht;")
    public class215 method3622() {
        class215 var1 = this.field2588.field2616;
        if (this.field2588 == var1) {
            return null;
        } else {
            var1.method3766();
            return var1;
        }
    }

    @ObfuscatedName("gk.p()Lht;")
    public class215 method3621() {
        class215 var1 = this.field2588.field2616;
        return this.field2588 == var1 ? null : var1;
    }

    @ObfuscatedName("gk.a()V")
    public void method3620() {
        while (true) {
            class215 var1 = this.field2588.field2616;
            if (this.field2588 == var1) {
                return;
            }
            var1.method3766();
        }
    }
}
