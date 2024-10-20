package deob;

@ObfuscatedName("cs")
public class class95 {

    @ObfuscatedName("cs.w")
    public class65[] field1304 = new class65[100];

    @ObfuscatedName("cs.e")
    public int field1305;

    @ObfuscatedName("cs.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbj;")
    public class65 method2006(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1304[99];
        for (int var6 = this.field1305; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1304[var6] = this.field1304[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3286();
            var5.method3276();
            var5.method1005(arg0, arg1, arg3, arg2);
        }
        this.field1304[0] = var5;
        if (this.field1305 < 100) {
            this.field1305++;
        }
        return var5;
    }

    @ObfuscatedName("cs.w(II)Lbj;")
    public class65 method2007(int arg0) {
        return arg0 >= 0 && arg0 < this.field1305 ? this.field1304[arg0] : null;
    }

    @ObfuscatedName("cs.e(I)I")
    public int method2008() {
        return this.field1305;
    }
}
