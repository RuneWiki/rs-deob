package deob;

@ObfuscatedName("ap")
public class class28 {

    @ObfuscatedName("ap.v")
    public class36[] field666 = new class36[100];

    @ObfuscatedName("ap.f")
    public int field667;

    @ObfuscatedName("ap.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laz;")
    public class36 method590(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field666[99];
        for (int var6 = this.field667; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field666[var6] = this.field666[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3624();
            var5.method3605();
            var5.method682(arg0, arg1, arg3, arg2);
        }
        this.field666[0] = var5;
        if (this.field667 < 100) {
            this.field667++;
        }
        return var5;
    }

    @ObfuscatedName("ap.v(II)Laz;")
    public class36 method591(int arg0) {
        return arg0 >= 0 && arg0 < this.field667 ? this.field666[arg0] : null;
    }

    @ObfuscatedName("ap.f(I)I")
    public int method592() {
        return this.field667;
    }
}
