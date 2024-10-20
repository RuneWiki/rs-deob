package deob;

@ObfuscatedName("gz")
public final class class207 {

    @ObfuscatedName("gz.g")
    public class219 field2630 = new class219();

    public class207() {
        this.field2630.field2664 = this.field2630;
        this.field2630.field2665 = this.field2630;
    }

    @ObfuscatedName("gz.g(Lhf;)V")
    public void method3653(class219 arg0) {
        if (arg0.field2665 != null) {
            arg0.method3840();
        }
        arg0.field2665 = this.field2630.field2665;
        arg0.field2664 = this.field2630;
        arg0.field2665.field2664 = arg0;
        arg0.field2664.field2665 = arg0;
    }

    @ObfuscatedName("gz.e(Lhf;)V")
    public void method3654(class219 arg0) {
        if (arg0.field2665 != null) {
            arg0.method3840();
        }
        arg0.field2665 = this.field2630;
        arg0.field2664 = this.field2630.field2664;
        arg0.field2665.field2664 = arg0;
        arg0.field2664.field2665 = arg0;
    }

    @ObfuscatedName("gz.b(Lhf;Lhf;)V")
    public static void method3659(class219 arg0, class219 arg1) {
        if (arg0.field2665 != null) {
            arg0.method3840();
        }
        arg0.field2665 = arg1;
        arg0.field2664 = arg1.field2664;
        arg0.field2665.field2664 = arg0;
        arg0.field2664.field2665 = arg0;
    }

    @ObfuscatedName("gz.z()Lhf;")
    public class219 method3656() {
        class219 var1 = this.field2630.field2664;
        if (this.field2630 == var1) {
            return null;
        } else {
            var1.method3840();
            return var1;
        }
    }

    @ObfuscatedName("gz.n()Lhf;")
    public class219 method3660() {
        class219 var1 = this.field2630.field2664;
        return this.field2630 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.l()V")
    public void method3658() {
        while (true) {
            class219 var1 = this.field2630.field2664;
            if (this.field2630 == var1) {
                return;
            }
            var1.method3840();
        }
    }
}
