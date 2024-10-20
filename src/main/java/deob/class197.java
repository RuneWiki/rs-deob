package deob;

@ObfuscatedName("gc")
public final class class197 {

    @ObfuscatedName("gc.y")
    public class209 field2442 = new class209();

    public class197() {
        this.field2442.field2476 = this.field2442;
        this.field2442.field2477 = this.field2442;
    }

    @ObfuscatedName("gc.y(Lhn;)V")
    public void method3624(class209 arg0) {
        if (arg0.field2477 != null) {
            arg0.method3809();
        }
        arg0.field2477 = this.field2442.field2477;
        arg0.field2476 = this.field2442;
        arg0.field2477.field2476 = arg0;
        arg0.field2476.field2477 = arg0;
    }

    @ObfuscatedName("gc.c(Lhn;)V")
    public void method3634(class209 arg0) {
        if (arg0.field2477 != null) {
            arg0.method3809();
        }
        arg0.field2477 = this.field2442;
        arg0.field2476 = this.field2442.field2476;
        arg0.field2477.field2476 = arg0;
        arg0.field2476.field2477 = arg0;
    }

    @ObfuscatedName("gc.n(Lhn;Lhn;)V")
    public static void method3625(class209 arg0, class209 arg1) {
        if (arg0.field2477 != null) {
            arg0.method3809();
        }
        arg0.field2477 = arg1;
        arg0.field2476 = arg1.field2476;
        arg0.field2477.field2476 = arg0;
        arg0.field2476.field2477 = arg0;
    }

    @ObfuscatedName("gc.u()Lhn;")
    public class209 method3626() {
        class209 var1 = this.field2442.field2476;
        if (this.field2442 == var1) {
            return null;
        } else {
            var1.method3809();
            return var1;
        }
    }

    @ObfuscatedName("gc.i()Lhn;")
    public class209 method3627() {
        class209 var1 = this.field2442.field2476;
        return this.field2442 == var1 ? null : var1;
    }

    @ObfuscatedName("gc.p()V")
    public void method3632() {
        while (true) {
            class209 var1 = this.field2442.field2476;
            if (this.field2442 == var1) {
                return;
            }
            var1.method3809();
        }
    }
}
