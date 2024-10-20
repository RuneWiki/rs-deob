package deob;

@ObfuscatedName("as")
public class class28 {

    @ObfuscatedName("as.f")
    public class36[] field676 = new class36[100];

    @ObfuscatedName("as.i")
    public int field677;

    @ObfuscatedName("as.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lag;")
    public class36 method617(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field676[99];
        for (int var6 = this.field677; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field676[var6] = this.field676[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3605();
            var5.method3580();
            var5.method717(arg0, arg1, arg3, arg2);
        }
        this.field676[0] = var5;
        if (this.field677 < 100) {
            this.field677++;
        }
        return var5;
    }

    @ObfuscatedName("as.f(II)Lag;")
    public class36 method616(int arg0) {
        return arg0 >= 0 && arg0 < this.field677 ? this.field676[arg0] : null;
    }

    @ObfuscatedName("as.i(I)I")
    public int method619() {
        return this.field677;
    }
}
