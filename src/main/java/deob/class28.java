package deob;

@ObfuscatedName("az")
public class class28 {

    @ObfuscatedName("az.d")
    public class36[] field643 = new class36[100];

    @ObfuscatedName("az.s")
    public int field651;

    @ObfuscatedName("az.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lau;")
    public class36 method627(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field643[99];
        for (int var6 = this.field651; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field643[var6] = this.field643[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3651();
            var5.method3627();
            var5.method715(arg0, arg1, arg3, arg2);
        }
        this.field643[0] = var5;
        if (this.field651 < 100) {
            this.field651++;
        }
        return var5;
    }

    @ObfuscatedName("az.d(IB)Lau;")
    public class36 method628(int arg0) {
        return arg0 >= 0 && arg0 < this.field651 ? this.field643[arg0] : null;
    }

    @ObfuscatedName("az.s(I)I")
    public int method629() {
        return this.field651;
    }
}
