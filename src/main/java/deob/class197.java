package deob;

@ObfuscatedName("gf")
public final class class197 {

    @ObfuscatedName("gf.g")
    public class209 field2468 = new class209();

    public class197() {
        this.field2468.field2501 = this.field2468;
        this.field2468.field2503 = this.field2468;
    }

    @ObfuscatedName("gf.g(Lhy;)V")
    public void method3827(class209 arg0) {
        if (arg0.field2503 != null) {
            arg0.method3989();
        }
        arg0.field2503 = this.field2468.field2503;
        arg0.field2501 = this.field2468;
        arg0.field2503.field2501 = arg0;
        arg0.field2501.field2503 = arg0;
    }

    @ObfuscatedName("gf.r(Lhy;)V")
    public void method3828(class209 arg0) {
        if (arg0.field2503 != null) {
            arg0.method3989();
        }
        arg0.field2503 = this.field2468;
        arg0.field2501 = this.field2468.field2501;
        arg0.field2503.field2501 = arg0;
        arg0.field2501.field2503 = arg0;
    }

    @ObfuscatedName("gf.e(Lhy;Lhy;)V")
    public static void method3832(class209 arg0, class209 arg1) {
        if (arg0.field2503 != null) {
            arg0.method3989();
        }
        arg0.field2503 = arg1;
        arg0.field2501 = arg1.field2501;
        arg0.field2503.field2501 = arg0;
        arg0.field2501.field2503 = arg0;
    }

    @ObfuscatedName("gf.q()Lhy;")
    public class209 method3830() {
        class209 var1 = this.field2468.field2501;
        if (this.field2468 == var1) {
            return null;
        } else {
            var1.method3989();
            return var1;
        }
    }

    @ObfuscatedName("gf.c()Lhy;")
    public class209 method3837() {
        class209 var1 = this.field2468.field2501;
        return this.field2468 == var1 ? null : var1;
    }

    @ObfuscatedName("gf.i()V")
    public void method3826() {
        while (true) {
            class209 var1 = this.field2468.field2501;
            if (this.field2468 == var1) {
                return;
            }
            var1.method3989();
        }
    }
}
