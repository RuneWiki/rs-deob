package deob;

@ObfuscatedName("ak")
public class class28 {

    @ObfuscatedName("ak.b")
    public class36[] field688 = new class36[100];

    @ObfuscatedName("ak.w")
    public int field684;

    @ObfuscatedName("ak.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Law;")
    public class36 method646(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field688[99];
        for (int var6 = this.field684; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field688[var6] = this.field688[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3693();
            var5.method3671();
            var5.method737(arg0, arg1, arg3, arg2);
        }
        this.field688[0] = var5;
        if (this.field684 < 100) {
            this.field684++;
        }
        return var5;
    }

    @ObfuscatedName("ak.b(II)Law;")
    public class36 method647(int arg0) {
        return arg0 >= 0 && arg0 < this.field684 ? this.field688[arg0] : null;
    }

    @ObfuscatedName("ak.w(B)I")
    public int method655() {
        return this.field684;
    }
}
