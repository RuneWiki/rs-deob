package deob;

@ObfuscatedName("ad")
public class class28 {

    @ObfuscatedName("ad.j")
    public class36[] field674 = new class36[100];

    @ObfuscatedName("ad.p")
    public int field668;

    @ObfuscatedName("ad.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lai;")
    public class36 method616(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field674[99];
        for (int var6 = this.field668; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field674[var6] = this.field674[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3639();
            var5.method3617();
            var5.method696(arg0, arg1, arg3, arg2);
        }
        this.field674[0] = var5;
        if (this.field668 < 100) {
            this.field668++;
        }
        return var5;
    }

    @ObfuscatedName("ad.j(II)Lai;")
    public class36 method626(int arg0) {
        return arg0 >= 0 && arg0 < this.field668 ? this.field674[arg0] : null;
    }

    @ObfuscatedName("ad.p(S)I")
    public int method618() {
        return this.field668;
    }
}
