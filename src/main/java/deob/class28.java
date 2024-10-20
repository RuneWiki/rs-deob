package deob;

@ObfuscatedName("aa")
public class class28 {

    @ObfuscatedName("aa.d")
    public class36[] field672 = new class36[100];

    @ObfuscatedName("aa.g")
    public int field666;

    @ObfuscatedName("aa.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laf;")
    public class36 method618(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field672[99];
        for (int var6 = this.field666; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field672[var6] = this.field672[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3588();
            var5.method3561();
            var5.method710(arg0, arg1, arg3, arg2);
        }
        this.field672[0] = var5;
        if (this.field666 < 100) {
            this.field666++;
        }
        return var5;
    }

    @ObfuscatedName("aa.d(II)Laf;")
    public class36 method624(int arg0) {
        return arg0 >= 0 && arg0 < this.field666 ? this.field672[arg0] : null;
    }

    @ObfuscatedName("aa.g(I)I")
    public int method621() {
        return this.field666;
    }
}
