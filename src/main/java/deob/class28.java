package deob;

@ObfuscatedName("ap")
public class class28 {

    @ObfuscatedName("ap.e")
    public class36[] field672 = new class36[100];

    @ObfuscatedName("ap.u")
    public int field671;

    @ObfuscatedName("ap.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lam;")
    public class36 method650(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field672[99];
        for (int var6 = this.field671; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field672[var6] = this.field672[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3670();
            var5.method3645();
            var5.method728(arg0, arg1, arg3, arg2);
        }
        this.field672[0] = var5;
        if (this.field671 < 100) {
            this.field671++;
        }
        return var5;
    }

    @ObfuscatedName("ap.e(II)Lam;")
    public class36 method651(int arg0) {
        return arg0 >= 0 && arg0 < this.field671 ? this.field672[arg0] : null;
    }

    @ObfuscatedName("ap.u(B)I")
    public int method653() {
        return this.field671;
    }
}
