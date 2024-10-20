package deob;

@ObfuscatedName("bn")
public class class74 {

    @ObfuscatedName("bn.q")
    public class58[] field971 = new class58[100];

    @ObfuscatedName("bn.f")
    public int field972;

    @ObfuscatedName("bn.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbo;")
    public class58 method1883(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field971[99];
        for (int var6 = this.field972; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field971[var6] = this.field971[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method5775();
            var5.method5771();
            var5.method1009(arg0, arg1, arg3, arg2);
        }
        this.field971[0] = var5;
        if (this.field972 < 100) {
            this.field972++;
        }
        return var5;
    }

    @ObfuscatedName("bn.q(II)Lbo;")
    public class58 method1884(int arg0) {
        return arg0 >= 0 && arg0 < this.field972 ? this.field971[arg0] : null;
    }

    @ObfuscatedName("bn.f(B)I")
    public int method1885() {
        return this.field972;
    }
}
