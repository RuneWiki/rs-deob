package deob;

@ObfuscatedName("bn")
public class class74 {

    @ObfuscatedName("bn.p")
    public class58[] field996 = new class58[100];

    @ObfuscatedName("bn.f")
    public int field992;

    @ObfuscatedName("bn.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbj;")
    public class58 method2042(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field996[99];
        for (int var6 = this.field992; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field996[var6] = this.field996[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method6657();
            var5.method6653();
            var5.method1070(arg0, arg1, arg3, arg2);
        }
        this.field996[0] = var5;
        if (this.field992 < 100) {
            this.field992++;
        }
        return var5;
    }

    @ObfuscatedName("bn.p(II)Lbj;")
    public class58 method2043(int arg0) {
        return arg0 >= 0 && arg0 < this.field992 ? this.field996[arg0] : null;
    }

    @ObfuscatedName("bn.f(B)I")
    public int method2041() {
        return this.field992;
    }
}
