package deob;

@ObfuscatedName("aq")
public class class28 {

    @ObfuscatedName("aq.e")
    public class36[] field677 = new class36[100];

    @ObfuscatedName("aq.q")
    public int field678;

    @ObfuscatedName("aq.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lae;")
    public class36 method644(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field677[99];
        for (int var6 = this.field678; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field677[var6] = this.field677[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3620();
            var5.method3603();
            var5.method726(arg0, arg1, arg3, arg2);
        }
        this.field677[0] = var5;
        if (this.field678 < 100) {
            this.field678++;
        }
        return var5;
    }

    @ObfuscatedName("aq.e(IB)Lae;")
    public class36 method653(int arg0) {
        return arg0 >= 0 && arg0 < this.field678 ? this.field677[arg0] : null;
    }

    @ObfuscatedName("aq.q(I)I")
    public int method647() {
        return this.field678;
    }
}
