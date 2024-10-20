package deob;

@ObfuscatedName("ae")
public class class28 {

    @ObfuscatedName("ae.h")
    public class36[] field656 = new class36[100];

    @ObfuscatedName("ae.o")
    public int field654;

    @ObfuscatedName("ae.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Law;")
    public class36 method597(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field656[99];
        for (int var6 = this.field654; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field656[var6] = this.field656[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3679();
            var5.method3649();
            var5.method679(arg0, arg1, arg3, arg2);
        }
        this.field656[0] = var5;
        if (this.field654 < 100) {
            this.field654++;
        }
        return var5;
    }

    @ObfuscatedName("ae.h(IB)Law;")
    public class36 method598(int arg0) {
        return arg0 >= 0 && arg0 < this.field654 ? this.field656[arg0] : null;
    }

    @ObfuscatedName("ae.o(I)I")
    public int method600() {
        return this.field654;
    }
}
