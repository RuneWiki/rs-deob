package deob;

@ObfuscatedName("go")
public final class class195 {

    @ObfuscatedName("go.z")
    public class207 field2394 = new class207();

    public class195() {
        this.field2394.field2427 = this.field2394;
        this.field2394.field2428 = this.field2394;
    }

    @ObfuscatedName("go.z(Lgw;)V")
    public void method3602(class207 arg0) {
        if (arg0.field2428 != null) {
            arg0.method3793();
        }
        arg0.field2428 = this.field2394.field2428;
        arg0.field2427 = this.field2394;
        arg0.field2428.field2427 = arg0;
        arg0.field2427.field2428 = arg0;
    }

    @ObfuscatedName("go.w(Lgw;)V")
    public void method3600(class207 arg0) {
        if (arg0.field2428 != null) {
            arg0.method3793();
        }
        arg0.field2428 = this.field2394;
        arg0.field2427 = this.field2394.field2427;
        arg0.field2428.field2427 = arg0;
        arg0.field2427.field2428 = arg0;
    }

    @ObfuscatedName("go.s(Lgw;Lgw;)V")
    public static void method3601(class207 arg0, class207 arg1) {
        if (arg0.field2428 != null) {
            arg0.method3793();
        }
        arg0.field2428 = arg1;
        arg0.field2427 = arg1.field2427;
        arg0.field2428.field2427 = arg0;
        arg0.field2427.field2428 = arg0;
    }

    @ObfuscatedName("go.l()Lgw;")
    public class207 method3614() {
        class207 var1 = this.field2394.field2427;
        if (this.field2394 == var1) {
            return null;
        } else {
            var1.method3793();
            return var1;
        }
    }

    @ObfuscatedName("go.u()Lgw;")
    public class207 method3624() {
        class207 var1 = this.field2394.field2427;
        return this.field2394 == var1 ? null : var1;
    }

    @ObfuscatedName("go.q()V")
    public void method3604() {
        while (true) {
            class207 var1 = this.field2394.field2427;
            if (this.field2394 == var1) {
                return;
            }
            var1.method3793();
        }
    }
}
