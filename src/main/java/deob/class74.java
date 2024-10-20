package deob;

@ObfuscatedName("bv")
public class class74 {

    @ObfuscatedName("bv.c")
    public class58[] field965 = new class58[100];

    @ObfuscatedName("bv.m")
    public int field971;

    @ObfuscatedName("bv.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbc;")
    public class58 method1859(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field965[99];
        for (int var6 = this.field971; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field965[var6] = this.field965[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method5732();
            var5.method5728();
            var5.method1015(arg0, arg1, arg3, arg2);
        }
        this.field965[0] = var5;
        if (this.field971 < 100) {
            this.field971++;
        }
        return var5;
    }

    @ObfuscatedName("bv.c(II)Lbc;")
    public class58 method1855(int arg0) {
        return arg0 >= 0 && arg0 < this.field971 ? this.field965[arg0] : null;
    }

    @ObfuscatedName("bv.m(I)I")
    public int method1856() {
        return this.field971;
    }
}
