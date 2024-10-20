package deob;

@ObfuscatedName("t")
public class class25 {

    @ObfuscatedName("t.y")
    public class32[] field590 = new class32[100];

    @ObfuscatedName("t.d")
    public int field591;

    @ObfuscatedName("t.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lav;")
    public class32 method533(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field590[99];
        for (int var6 = this.field591; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field590[var6] = this.field590[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3358();
            var5.method3331();
            var5.method605(arg0, arg1, arg3, arg2);
        }
        this.field590[0] = var5;
        if (this.field591 < 100) {
            this.field591++;
        }
        return var5;
    }

    @ObfuscatedName("t.y(II)Lav;")
    public class32 method534(int arg0) {
        return arg0 >= 0 && arg0 < this.field591 ? this.field590[arg0] : null;
    }

    @ObfuscatedName("t.d(S)I")
    public int method535() {
        return this.field591;
    }
}
