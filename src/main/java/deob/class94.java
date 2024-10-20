package deob;

@ObfuscatedName("cr")
public class class94 {

    @ObfuscatedName("cr.s")
    public class65[] field1297 = new class65[100];

    @ObfuscatedName("cr.g")
    public int field1298;

    @ObfuscatedName("cr.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbl;")
    public class65 method2082(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1297[99];
        for (int var6 = this.field1298; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1297[var6] = this.field1297[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3960();
            var5.method3997();
            var5.method1074(arg0, arg1, arg3, arg2);
        }
        this.field1297[0] = var5;
        if (this.field1298 < 100) {
            this.field1298++;
        }
        return var5;
    }

    @ObfuscatedName("cr.s(II)Lbl;")
    public class65 method2085(int arg0) {
        return arg0 >= 0 && arg0 < this.field1298 ? this.field1297[arg0] : null;
    }

    @ObfuscatedName("cr.g(I)I")
    public int method2084() {
        return this.field1298;
    }
}
