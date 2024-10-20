package deob;

@ObfuscatedName("ar")
public class class28 {

    @ObfuscatedName("ar.w")
    public class36[] field682 = new class36[100];

    @ObfuscatedName("ar.d")
    public int field683;

    @ObfuscatedName("ar.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lac;")
    public class36 method716(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field682[99];
        for (int var6 = this.field683; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field682[var6] = this.field682[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3737();
            var5.method3718();
            var5.method804(arg0, arg1, arg3, arg2);
        }
        this.field682[0] = var5;
        if (this.field683 < 100) {
            this.field683++;
        }
        return var5;
    }

    @ObfuscatedName("ar.w(II)Lac;")
    public class36 method717(int arg0) {
        return arg0 >= 0 && arg0 < this.field683 ? this.field682[arg0] : null;
    }

    @ObfuscatedName("ar.d(I)I")
    public int method722() {
        return this.field683;
    }
}
