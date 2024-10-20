package deob;

@ObfuscatedName("cg")
public class class89 {

    @ObfuscatedName("cg.e")
    public class73[] field1090 = new class73[100];

    @ObfuscatedName("cg.v")
    public int field1092;

    @ObfuscatedName("cg.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbl;")
    public class73 method1843(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1090[99];
        for (int var6 = this.field1092; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1090[var6] = this.field1090[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method5407();
            var5.method5404();
            var5.method1032(arg0, arg1, arg3, arg2);
        }
        this.field1090[0] = var5;
        if (this.field1092 < 100) {
            this.field1092++;
        }
        return var5;
    }

    @ObfuscatedName("cg.e(IB)Lbl;")
    public class73 method1845(int arg0) {
        return arg0 >= 0 && arg0 < this.field1092 ? this.field1090[arg0] : null;
    }

    @ObfuscatedName("cg.v(I)I")
    public int method1846() {
        return this.field1092;
    }
}
