package deob;

@ObfuscatedName("cs")
public class class95 {

    @ObfuscatedName("cs.x")
    public class65[] field1274 = new class65[100];

    @ObfuscatedName("cs.t")
    public int field1272;

    @ObfuscatedName("cs.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbj;")
    public class65 method2060(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1274[99];
        for (int var6 = this.field1272; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1274[var6] = this.field1274[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3326();
            var5.method3320();
            var5.method1040(arg0, arg1, arg3, arg2);
        }
        this.field1274[0] = var5;
        if (this.field1272 < 100) {
            this.field1272++;
        }
        return var5;
    }

    @ObfuscatedName("cs.x(II)Lbj;")
    public class65 method2071(int arg0) {
        return arg0 >= 0 && arg0 < this.field1272 ? this.field1274[arg0] : null;
    }

    @ObfuscatedName("cs.t(S)I")
    public int method2062() {
        return this.field1272;
    }
}
