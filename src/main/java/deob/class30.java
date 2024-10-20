package deob;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.h")
    public class38[] field709 = new class38[100];

    @ObfuscatedName("af.e")
    public int field704;

    @ObfuscatedName("af.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Law;")
    public class38 method626(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field709[99];
        for (int var6 = this.field704; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field709[var6] = this.field709[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3706();
            var5.method3676();
            var5.method736(arg0, arg1, arg3, arg2);
        }
        this.field709[0] = var5;
        if (this.field704 < 100) {
            this.field704++;
        }
        return var5;
    }

    @ObfuscatedName("af.h(IB)Law;")
    public class38 method627(int arg0) {
        return arg0 >= 0 && arg0 < this.field704 ? this.field709[arg0] : null;
    }

    @ObfuscatedName("af.e(I)I")
    public int method628() {
        return this.field704;
    }
}
