package deob;

@ObfuscatedName("ad")
public class class51 {

    @ObfuscatedName("ad.j")
    public class22[] field981 = new class22[100];

    @ObfuscatedName("ad.c")
    public int field982;

    @ObfuscatedName("ad.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lz;")
    public class22 method953(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field981[99];
        for (int var6 = this.field982; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field981[var6] = this.field981[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2278();
            var5.method2318();
            var5.method225(arg0, arg1, arg3, arg2);
        }
        this.field981[0] = var5;
        if (this.field982 < 100) {
            this.field982++;
        }
        return var5;
    }

    @ObfuscatedName("ad.j(II)Lz;")
    public class22 method954(int arg0) {
        return arg0 >= 0 && arg0 < this.field982 ? this.field981[arg0] : null;
    }

    @ObfuscatedName("ad.c(B)I")
    public int method955() {
        return this.field982;
    }
}
