package deob;

@ObfuscatedName("an")
public class class28 {

    @ObfuscatedName("an.q")
    public class36[] field655 = new class36[100];

    @ObfuscatedName("an.k")
    public int field658;

    @ObfuscatedName("an.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Laj;")
    public class36 method604(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field655[99];
        for (int var6 = this.field658; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field655[var6] = this.field655[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3583();
            var5.method3565();
            var5.method693(arg0, arg1, arg3, arg2);
        }
        this.field655[0] = var5;
        if (this.field658 < 100) {
            this.field658++;
        }
        return var5;
    }

    @ObfuscatedName("an.q(II)Laj;")
    public class36 method605(int arg0) {
        return arg0 >= 0 && arg0 < this.field658 ? this.field655[arg0] : null;
    }

    @ObfuscatedName("an.k(I)I")
    public int method614() {
        return this.field658;
    }
}
