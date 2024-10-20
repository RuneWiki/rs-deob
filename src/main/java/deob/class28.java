package deob;

@ObfuscatedName("an")
public class class28 {

    @ObfuscatedName("an.g")
    public class36[] field667 = new class36[100];

    @ObfuscatedName("an.j")
    public int field668;

    @ObfuscatedName("an.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lac;")
    public class36 method636(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field667[99];
        for (int var6 = this.field668; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field667[var6] = this.field667[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3647();
            var5.method3620();
            var5.method724(arg0, arg1, arg3, arg2);
        }
        this.field667[0] = var5;
        if (this.field668 < 100) {
            this.field668++;
        }
        return var5;
    }

    @ObfuscatedName("an.g(IB)Lac;")
    public class36 method637(int arg0) {
        return arg0 >= 0 && arg0 < this.field668 ? this.field667[arg0] : null;
    }

    @ObfuscatedName("an.j(I)I")
    public int method638() {
        return this.field668;
    }
}
