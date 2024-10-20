package deob;

@ObfuscatedName("cw")
public class class87 {

    @ObfuscatedName("cw.w")
    public class59[] field1210 = new class59[100];

    @ObfuscatedName("cw.s")
    public int field1211;

    @ObfuscatedName("cw.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbh;")
    public class59 method1831(int arg0, String arg1, String arg2, String arg3) {
        class59 var5 = this.field1210[99];
        for (int var6 = this.field1211; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1210[var6] = this.field1210[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class59(arg0, arg1, arg3, arg2);
        } else {
            var5.method3756();
            var5.method3793();
            var5.method991(arg0, arg1, arg3, arg2);
        }
        this.field1210[0] = var5;
        if (this.field1211 < 100) {
            this.field1211++;
        }
        return var5;
    }

    @ObfuscatedName("cw.w(IB)Lbh;")
    public class59 method1832(int arg0) {
        return arg0 >= 0 && arg0 < this.field1211 ? this.field1210[arg0] : null;
    }

    @ObfuscatedName("cw.s(I)I")
    public int method1843() {
        return this.field1211;
    }
}
