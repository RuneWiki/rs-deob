package deob;

@ObfuscatedName("as")
public class class28 {

    @ObfuscatedName("as.i")
    public class36[] field665 = new class36[100];

    @ObfuscatedName("as.g")
    public int field666;

    @ObfuscatedName("as.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lan;")
    public class36 method609(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field665[99];
        for (int var6 = this.field666; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field665[var6] = this.field665[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3607();
            var5.method3581();
            var5.method691(arg0, arg1, arg3, arg2);
        }
        this.field665[0] = var5;
        if (this.field666 < 100) {
            this.field666++;
        }
        return var5;
    }

    @ObfuscatedName("as.i(II)Lan;")
    public class36 method621(int arg0) {
        return arg0 >= 0 && arg0 < this.field666 ? this.field665[arg0] : null;
    }

    @ObfuscatedName("as.g(I)I")
    public int method611() {
        return this.field666;
    }
}
