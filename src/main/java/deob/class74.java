package deob;

@ObfuscatedName("bj")
public class class74 {

    @ObfuscatedName("bj.l")
    public class58[] field988 = new class58[100];

    @ObfuscatedName("bj.s")
    public int field989;

    @ObfuscatedName("bj.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbd;")
    public class58 method1904(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field988[99];
        for (int var6 = this.field989; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field988[var6] = this.field988[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method6167();
            var5.method6163();
            var5.method1008(arg0, arg1, arg3, arg2);
        }
        this.field988[0] = var5;
        if (this.field989 < 100) {
            this.field989++;
        }
        return var5;
    }

    @ObfuscatedName("bj.l(II)Lbd;")
    public class58 method1903(int arg0) {
        return arg0 >= 0 && arg0 < this.field989 ? this.field988[arg0] : null;
    }

    @ObfuscatedName("bj.s(I)I")
    public int method1905() {
        return this.field989;
    }
}
