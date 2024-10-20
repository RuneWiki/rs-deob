package deob;

@ObfuscatedName("ah")
public class class30 {

    @ObfuscatedName("ah.g")
    public class38[] field701 = new class38[100];

    @ObfuscatedName("ah.r")
    public int field702;

    @ObfuscatedName("ah.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lap;")
    public class38 method667(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field701[99];
        for (int var6 = this.field702; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field701[var6] = this.field701[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3815();
            var5.method3793();
            var5.method758(arg0, arg1, arg3, arg2);
        }
        this.field701[0] = var5;
        if (this.field702 < 100) {
            this.field702++;
        }
        return var5;
    }

    @ObfuscatedName("ah.g(II)Lap;")
    public class38 method663(int arg0) {
        return arg0 >= 0 && arg0 < this.field702 ? this.field701[arg0] : null;
    }

    @ObfuscatedName("ah.r(B)I")
    public int method662() {
        return this.field702;
    }
}
