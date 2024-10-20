package deob;

@ObfuscatedName("as")
public class class30 {

    @ObfuscatedName("as.r")
    public class38[] field686 = new class38[100];

    @ObfuscatedName("as.j")
    public int field691;

    @ObfuscatedName("as.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lab;")
    public class38 method637(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field686[99];
        for (int var6 = this.field691; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field686[var6] = this.field686[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3695();
            var5.method3675();
            var5.method707(arg0, arg1, arg3, arg2);
        }
        this.field686[0] = var5;
        if (this.field691 < 100) {
            this.field691++;
        }
        return var5;
    }

    @ObfuscatedName("as.r(II)Lab;")
    public class38 method627(int arg0) {
        return arg0 >= 0 && arg0 < this.field691 ? this.field686[arg0] : null;
    }

    @ObfuscatedName("as.j(B)I")
    public int method628() {
        return this.field691;
    }
}
