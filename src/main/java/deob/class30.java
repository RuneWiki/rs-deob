package deob;

@ObfuscatedName("ax")
public class class30 {

    @ObfuscatedName("ax.e")
    public class38[] field684 = new class38[100];

    @ObfuscatedName("ax.n")
    public int field685;

    @ObfuscatedName("ax.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Laa;")
    public class38 method663(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field684[99];
        for (int var6 = this.field685; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field684[var6] = this.field684[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3744();
            var5.method3724();
            var5.method734(arg0, arg1, arg3, arg2);
        }
        this.field684[0] = var5;
        if (this.field685 < 100) {
            this.field685++;
        }
        return var5;
    }

    @ObfuscatedName("ax.e(II)Laa;")
    public class38 method652(int arg0) {
        return arg0 >= 0 && arg0 < this.field685 ? this.field684[arg0] : null;
    }

    @ObfuscatedName("ax.n(I)I")
    public int method654() {
        return this.field685;
    }
}
