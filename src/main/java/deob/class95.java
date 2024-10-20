package deob;

@ObfuscatedName("cp")
public class class95 {

    @ObfuscatedName("cp.f")
    public class65[] field1279 = new class65[100];

    @ObfuscatedName("cp.q")
    public int field1282;

    @ObfuscatedName("cp.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbm;")
    public class65 method2043(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1279[99];
        for (int var6 = this.field1282; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1279[var6] = this.field1279[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3306();
            var5.method3294();
            var5.method1076(arg0, arg1, arg3, arg2);
        }
        this.field1279[0] = var5;
        if (this.field1282 < 100) {
            this.field1282++;
        }
        return var5;
    }

    @ObfuscatedName("cp.f(II)Lbm;")
    public class65 method2040(int arg0) {
        return arg0 >= 0 && arg0 < this.field1282 ? this.field1279[arg0] : null;
    }

    @ObfuscatedName("cp.q(I)I")
    public int method2041() {
        return this.field1282;
    }
}
