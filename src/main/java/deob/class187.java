package deob;

@ObfuscatedName("gk")
public final class class187 {

    @ObfuscatedName("gk.j")
    public class198 field3007 = new class198();

    @ObfuscatedName("gk.y")
    public int field3011;

    @ObfuscatedName("gk.z")
    public int field3009;

    @ObfuscatedName("gk.l")
    public class190 field3010;

    @ObfuscatedName("gk.w")
    public class197 field3008 = new class197();

    public class187(int arg0) {
        this.field3011 = arg0;
        this.field3009 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3010 = new class190(var2);
    }

    @ObfuscatedName("gk.j(J)Lgt;")
    public class198 method3432(long arg0) {
        class198 var3 = (class198) this.field3010.method3459(arg0);
        if (var3 != null) {
            this.field3008.method3535(var3);
        }
        return var3;
    }

    @ObfuscatedName("gk.y(J)V")
    public void method3439(long arg0) {
        class198 var3 = (class198) this.field3010.method3459(arg0);
        if (var3 != null) {
            var3.method3563();
            var3.method3552();
            this.field3009++;
        }
    }

    @ObfuscatedName("gk.z(Lgt;J)V")
    public void method3434(class198 arg0, long arg1) {
        if (this.field3009 == 0) {
            class198 var4 = this.field3008.method3533();
            var4.method3563();
            var4.method3552();
            if (this.field3007 == var4) {
                class198 var5 = this.field3008.method3533();
                var5.method3563();
                var5.method3552();
            }
        } else {
            this.field3009--;
        }
        this.field3010.method3463(arg0, arg1);
        this.field3008.method3535(arg0);
    }

    @ObfuscatedName("gk.l()V")
    public void method3435() {
        this.field3008.method3541();
        this.field3010.method3461();
        this.field3007 = new class198();
        this.field3009 = this.field3011;
    }
}
