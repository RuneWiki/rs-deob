package deob;

@ObfuscatedName("ad")
public class class28 {

    @ObfuscatedName("ad.f")
    public class36[] field676 = new class36[100];

    @ObfuscatedName("ad.i")
    public int field683;

    @ObfuscatedName("ad.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laj;")
    public class36 method621(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field676[99];
        for (int var6 = this.field683; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field676[var6] = this.field676[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3645();
            var5.method3623();
            var5.method722(arg0, arg1, arg3, arg2);
        }
        this.field676[0] = var5;
        if (this.field683 < 100) {
            this.field683++;
        }
        return var5;
    }

    @ObfuscatedName("ad.f(II)Laj;")
    public class36 method624(int arg0) {
        return arg0 >= 0 && arg0 < this.field683 ? this.field676[arg0] : null;
    }

    @ObfuscatedName("ad.i(I)I")
    public int method622() {
        return this.field683;
    }
}
