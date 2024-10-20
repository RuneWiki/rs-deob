package deob;

@ObfuscatedName("au")
public class class51 {

    @ObfuscatedName("au.e")
    public class22[] field971 = new class22[100];

    @ObfuscatedName("au.f")
    public int field972;

    @ObfuscatedName("au.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ls;")
    public class22 method851(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field971[99];
        for (int var6 = this.field972; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field971[var6] = this.field971[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2200();
            var5.method2238();
            var5.method200(arg0, arg1, arg3, arg2);
        }
        this.field971[0] = var5;
        if (this.field972 < 100) {
            this.field972++;
        }
        return var5;
    }

    @ObfuscatedName("au.e(II)Ls;")
    public class22 method852(int arg0) {
        return arg0 >= 0 && arg0 < this.field972 ? this.field971[arg0] : null;
    }

    @ObfuscatedName("au.f(I)I")
    public int method860() {
        return this.field972;
    }
}
