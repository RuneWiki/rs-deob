package deob;

@ObfuscatedName("ak")
public class class28 {

    @ObfuscatedName("ak.l")
    public class36[] field666 = new class36[100];

    @ObfuscatedName("ak.a")
    public int field669;

    @ObfuscatedName("ak.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laa;")
    public class36 method636(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field666[99];
        for (int var6 = this.field669; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field666[var6] = this.field666[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3608();
            var5.method3590();
            var5.method725(arg0, arg1, arg3, arg2);
        }
        this.field666[0] = var5;
        if (this.field669 < 100) {
            this.field669++;
        }
        return var5;
    }

    @ObfuscatedName("ak.l(II)Laa;")
    public class36 method640(int arg0) {
        return arg0 >= 0 && arg0 < this.field669 ? this.field666[arg0] : null;
    }

    @ObfuscatedName("ak.a(I)I")
    public int method637() {
        return this.field669;
    }
}
