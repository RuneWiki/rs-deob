package deob;

@ObfuscatedName("cg")
public class class95 {

    @ObfuscatedName("cg.j")
    public class65[] field1279 = new class65[100];

    @ObfuscatedName("cg.i")
    public int field1280;

    @ObfuscatedName("cg.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbi;")
    public class65 method2032(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1279[99];
        for (int var6 = this.field1280; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1279[var6] = this.field1279[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3304();
            var5.method3297();
            var5.method1019(arg0, arg1, arg3, arg2);
        }
        this.field1279[0] = var5;
        if (this.field1280 < 100) {
            this.field1280++;
        }
        return var5;
    }

    @ObfuscatedName("cg.j(II)Lbi;")
    public class65 method2031(int arg0) {
        return arg0 >= 0 && arg0 < this.field1280 ? this.field1279[arg0] : null;
    }

    @ObfuscatedName("cg.i(B)I")
    public int method2034() {
        return this.field1280;
    }
}
