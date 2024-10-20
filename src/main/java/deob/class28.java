package deob;

@ObfuscatedName("ap")
public class class28 {

    @ObfuscatedName("ap.w")
    public class36[] field652 = new class36[100];

    @ObfuscatedName("ap.f")
    public int field654;

    @ObfuscatedName("ap.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lay;")
    public class36 method629(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field652[99];
        for (int var6 = this.field654; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field652[var6] = this.field652[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3632();
            var5.method3610();
            var5.method706(arg0, arg1, arg3, arg2);
        }
        this.field652[0] = var5;
        if (this.field654 < 100) {
            this.field654++;
        }
        return var5;
    }

    @ObfuscatedName("ap.w(II)Lay;")
    public class36 method630(int arg0) {
        return arg0 >= 0 && arg0 < this.field654 ? this.field652[arg0] : null;
    }

    @ObfuscatedName("ap.f(I)I")
    public int method631() {
        return this.field654;
    }
}
