package deob;

@ObfuscatedName("bp")
public class class74 {

    @ObfuscatedName("bp.c")
    public class58[] field981 = new class58[100];

    @ObfuscatedName("bp.i")
    public int field980;

    @ObfuscatedName("bp.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbe;")
    public class58 method1913(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field981[99];
        for (int var6 = this.field980; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field981[var6] = this.field981[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method6503();
            var5.method6500();
            var5.method1024(arg0, arg1, arg3, arg2);
        }
        this.field981[0] = var5;
        if (this.field980 < 100) {
            this.field980++;
        }
        return var5;
    }

    @ObfuscatedName("bp.c(IB)Lbe;")
    public class58 method1914(int arg0) {
        return arg0 >= 0 && arg0 < this.field980 ? this.field981[arg0] : null;
    }

    @ObfuscatedName("bp.i(B)I")
    public int method1915() {
        return this.field980;
    }
}
